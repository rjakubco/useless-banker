angular.module('core.history').factory('History', ['$resource',
    function($resource) {
        return $resource('', {}, {
            query: {
                method: 'GET',
                url: 'rest/service1/historyService/getMerchants',
                isArray: true
            },
            save: {
                method: 'POST',
                url: 'rest/service1/historyService/createHistory'
            },
			get: {
                method: 'GET',
                url: 'rest/service1/historyService/getHistory/:historyId'
            },
			getByUser: {
                method: 'GET',
                url: 'rest/service1/historyService/getHistoryByUser/:userId'
            },
 			remove: {
                 method: 'DELETE',
                 url: 'rest/service1/historyService/deleteHistory'
             },
 			update: {
                 method: 'POST',
                 url: 'rest/service1/historyService/updateHistory'
             }
        });
    }
]);
