angular.module('core.category').factory('Category', ['$resource',
    function($resource) {
        return $resource('', {}, {
            query: {
                method: 'GET',
                url: 'rest/service1/categoryService/getCategories',
                isArray: true
            },
            save: {
                method: 'POST',
                url: 'rest/service1/categoryService/createCategory'
            },
			get: {
                method: 'GET',
                url: 'rest/service1/categoryService/getCategory/:historyId'
            },
 			remove: {
                 method: 'DELETE',
                 url: 'rest/service1/categoryService/deleteCategory'
             },
 			update: {
                 method: 'POST',
                 url: 'rest/service1/categoryService/updateCategory'
             }
        });
    }
]);
