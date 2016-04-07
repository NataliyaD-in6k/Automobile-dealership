angular
    .module('dealRegistraion', [])
    .controller('DealController', function ($scope, $rootScope, $http) {
        var vm = this;

        updateDealList();

        $http.get('/brands').then(function (response) {
            vm.brands = response.data;
        });

        vm.onBrandChange = function () {
            $http.get('/brands/' + vm.brandId + '/models').then(function (response) {
                vm.models = response.data;
            });
        };

        vm.createDeal= function () {
            $http.post('/deals', {model:{id: vm.modelId}})
                .then(function () {
                    updateDealList();
                });
        };

        function updateDealList() {
            $http.get('/deals').then(function (response) {
                vm.deals = response.data;
            });
        }
    });