(function () {
    'use strict';

    angular
        .module('app')
        .factory('EmployeeService', EmployeeService);

    EmployeeService.$inject = ['$timeout', '$filter', '$q'];
    function EmployeeService($timeout, $filter, $q) {

        var service = {};


        service.GetAll = GetAll;
        service.GetById = GetById;
        service.GetByFirstname = GetByFirstname;
        service.Create = Create;
        service.Update = Update;
        service.Delete = Delete;

        return service;


        function GetAll() {
            var deferred = $q.defer();
            deferred.resolve(getEmployees() );
            return deferred.promise;
        }

        function GetById(id) {
            var deferred = $q.defer();
            var filtered = $filter('filter')(getEmployees(), { id: id });
            var employee = filtered.length ? filtered[0] : null;
            deferred.resolve(employee);
            return deferred.promise;
        }

        function GetByFirstname(firstname) {
            var deferred = $q.defer();
            var filtered = $filter('filter')(getEmployees(), { firstname: firstname });
            var employee = filtered.length ? filtered[0] : null;
            deferred.resolve(employee);
            return deferred.promise;
        }

        function Create(employee) {
            var deferred = $q.defer();

            // simulate api call with $timeout
            $timeout(function () {
                GetByFirstname(employee.firstname)
                    .then(function (duplicateEmployee) {
                        if (duplicateEmployee !== null) {
                            deferred.resolve({ success: false, message: 'Firstname"' + employee.firstname + '" is already taken' });
                        } else {
                            var employees = getEmployees();
                            // assign fresh id
                            var lastEmployee = employees[employees.length - 1] || { id: 0 };
                            employee.id = lastEmployee.id + 1;

                            // save to local storage
                            employees.push(employee);
                            setEmployees(employees);

                            deferred.resolve({ success: true });
                        }
                    });
            }, 1000);

            return deferred.promise;   // a promise is returned
        }


        function Update(employee) {
            var deferred = $q.defer();

            var employees = getEmployees();
            for (var i = 0; i < employees.length; i++) {
                if (employees[i].id === employee.id) {
                    employees[i] = employee;
                    break;
                }
            }
            setEmployees(employees);
            deferred.resolve();

            return deferred.promise;    // a promise is returned
        }



        function Delete(id) {
            var deferred = $q.defer();

            var employees = getEmployees();
            for (var i = 0; i < employees.length; i++) {
                var employee = employees[i];
                if (employee.id === id) {
                    employees.splice(i, 1);
                    break;
                }
            }
            setEmployees(employees);
            deferred.resolve();

            return deferred.promise;    // a promise is returned
        }



        // private functions DATABASE SIMULATION

        function getEmployees() {
            if(!localStorage.employees){
                localStorage.employees = JSON.stringify([]);
            }

            return JSON.parse(localStorage.employees);
        }

        function setEmployees(employees) {
            localStorage.employees = JSON.stringify(employees);
        }
    }
})();