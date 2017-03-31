angular.module('app').controller('FormController', function ($scope, User) {
    $scope.submit = function() {
        console.log("SAVE")
        User.save($scope.user)
    };
});


