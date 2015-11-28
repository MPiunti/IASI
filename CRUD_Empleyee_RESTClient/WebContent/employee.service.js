(function () {
    'use strict';

    angular
        .module('app')
        .factory('EmployeeService', EmployeeService);

    EmployeeService.$inject = ['$http'];
    function EmployeeService($http) {

		var SERVICE_ENDPOINT = 'http://localhost:8080/SpringMVC_JPA_REST/employee/';
        var service = {};

        service.GetAll = GetAll;
        service.GetById = GetById;
        service.GetByName = GetByName;
        service.Create = Create;
        service.Update = Update;
        service.Delete = Delete;

        return service;

        function GetAll() {
             return $http.get(SERVICE_ENDPOINT) ; /*.then(function(response){handleSuccess(response); }
			, function(response){handleError(response);});*/
        }

        function GetById(id) {
            return $http.get(SERVICE_ENDPOINT + id); /*.then(function(response){handleSuccess(response); }
			, function(response){handleError(response);});*/
        }

        function GetByName(name) {
            return $http.get(SERVICE_ENDPOINT + name); /*.then(handleSuccess(response), handleError(response));*/
        }

        function Create(employee) {
             return $http({method:"POST",
            	          url: SERVICE_ENDPOINT,
				          //headers:  {'Origin': 'localhost:8080'},
						  data:  employee
				 });
				//.then(handleSuccess, handleError('Error creating employee'));
        }

        function Update(employee) {
            return $http.put(SERVICE_ENDPOINT + user.id, employee) /*.then(handleSuccess(response), handleError(response));*/
        }

        function Delete(employee) {
        	 return $http({method:"DELETE",
   	              url: SERVICE_ENDPOINT,
		          //headers:  {'Origin': 'localhost:8080'},
				  data:  employee,
				  headers: {"Content-Type": "application/json;charset=utf-8"}
		 });
		 //.then(handleSuccess, handleError('Error deleing employee'));
        }

        /* private functions */

        function handleSuccess(res) {
            return res.data;
        }

        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }

})();
