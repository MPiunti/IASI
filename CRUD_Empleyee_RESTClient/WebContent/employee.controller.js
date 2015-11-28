(function () {
    'use strict';

    angular
        .module('app')
        .controller('EmployeeController', EmployeeController);

    EmployeeController.$inject = ['EmployeeService', '$location', '$scope'];
    function EmployeeController(EmployeeService, $location, $scope) {
		
		
		var vm = this;


        $scope.submitForm = function(item, event) { 
           //EmployeeService.Create()
			   //.then(getAll());
		   vm.employee = $scope.employee;
		   $scope.employee_update ={}
		   create();
        }
        
        $scope.updateSubmit  = function(item, event) { 
			vm.employee = $scope.employee_update;
			update();
        }

		$scope.del = function(obj) { 
		   del(obj);
        }
		
		$scope.upd = function(obj) {  
			$scope.employee_update = {};
			$scope.employee_update.address = {};
			$scope.employee_update.id = obj.id;
			$scope.employee_update.firstName = obj.firstName;
			$scope.employee_update.lastName = obj.lastName;
			$scope.employee_update.address.id = obj.address.id;
			$scope.employee_update.salary = obj.salary;
	    }

      
        
		 vm.create = create;
		 vm.update = update;
		 vm.del = del;
		 vm.getById = getById;
		 vm.getAll = getAll;
		 getAll();

		function create() {
            EmployeeService.Create(vm.employee)
                .then(function (response) {
                	  //getAll();
                    }, function (response) {
                    	console.log('wrong response'); 
                    	console.log(response); 					
                })['finally'](function() {
                    getAll();
                    $scope.employee = {};
                });			
        }

		/** call delete service */
		function del(employee) {			
            EmployeeService.Delete(employee)
                .then(function (response) {
                	//getAll();
                   }, function (){
                	   console.log('wrong response'); 
                       console.log(response); 
                   })['finally'](function() {
                       getAll();                       
                   });
         }


		/** call update service */
		function update() {
            EmployeeService.Update(vm.employee)
                .then(function (response) {
                   	 //getAll();
                   }, function (){
                	   console.log('wrong response'); 
                       console.log(response); 
                })['finally'](function() {
                    getAll();
                    $scope.employee_update = {};
                });
        }
		

		/** call get all service */
        function getAll() {
            EmployeeService.GetAll()
                .then(function (response) {
                       //console.log(response);
					   $scope.employees = response.data;
                    }, function (response) {
                    	console.log('wrong response'); 
                        console.log(response);
                    });
        }

		/** call get all service */
        function getById() {
            EmployeeService.GetById(vm.employee.id)
                .then(function (response) {				    
                         if (response.success) {
                            //console.log(response);
						   }  else {
                            console.log('no response at all:'); 
						    console.log(response);
                         }
						 $scope.employee_update={};
						 $scope.employee_update.id = response.id;
                         $scope.employee_update.address = response.address; 
						 $scope.employee_update.firstname = response.firstname; 
						 $scope.employee_update.lastname = response.lastname; 

			        } , function (response) {
					   console.log('wrong response');
					   console.log(response); 
                });			
        }
	

    }// EmployeeController end

})();
