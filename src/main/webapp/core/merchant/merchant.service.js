angular.module('core.merchant').factory('Merchant', ['$resource',
    function($resource) {
        return $resource('', {}, {
            query: {
                method: 'GET',
                url: 'rest/service1/merchantService/getMerchants',
                isArray: true
            },
            save: {
                method: 'POST',
                url: 'rest/service1/merchantService/createMerchant'
            },
			get: {
                method: 'GET',
                url: 'rest/service1/merchantService/getMerchant/:merchantId'
            },
 			remove: {
                 method: 'DELETE',
                 url: 'rest/service1/merchantService/deleteMerchant'
             },
 			update: {
                 method: 'POST',
                 url: 'rest/service1/merchantService/updateMerchant'
             }
        });
    }
]);

