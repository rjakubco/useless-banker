angular.module('core.transaction').factory('Transaction', ['$resource',
    function($resource) {
        return $resource('', {}, {
 			update: {
                 method: 'POST',
                 url: 'rest/service1/transactionService/updateTransaction'
             }
        });
    }
]);