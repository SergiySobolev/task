angular
    .module('cosi.task.app', [
    ]);

angular.module('cosi.task.app') 
    .controller('calcController', CalcController);

CalcController.$inject = ['$http'];

function CalcController($http) {
    var vm = this;
    vm.calc = calc;

    function calc() {
        if(vm.x1 == 0) {
            alert("X1 can't be 0");
        }
        $http({
            method: 'GET',
            url: '/calc',
            params: {
                x1: vm.x1,
                x2: vm.x2
            }
        }).success(function (data) {
           vm.result = data;
        }).error(function () {
           console.log("Error during calculation");
        });
    }
}
