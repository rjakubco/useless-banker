angular.module('core.user').factory('User', ['$resource',
    function($resource) {
        return $resource('', {}, {
            query: {
                method: 'GET',
                url: 'rest/service1/userService/getUsers/',
                isArray: true
            },
            save: {
                method: 'POST',
                url: 'rest/service1/userService/saveUser/'
            },
			getUserById: {
                method: 'GET',
                url: 'rest/service1/userService/getUser/:userId'
            },
 			getUserByName: {
                 method: 'GET',
                 url: 'rest/service1/userService/getUserByName/:username'
             },
 			remove: {
                 method: 'DELETE',
                 url: 'rest/service1/userService/removeUser'
             },
 			removeById: {
                 method: 'DELETE',
                 url: 'rest/service1/userService/removeUser/:userId'
             },
 			update: {
                 method: 'POST',
                 url: 'rest/service1/userService/updateUser'
             }
        });
    }
]);
