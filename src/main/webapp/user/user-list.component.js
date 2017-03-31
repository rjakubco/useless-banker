// Register `phoneList` component, along with its associated controller and template
angular.
  module('app').
  component('userList', {
    template:
        '<ul>' +
                  '<li ng-repeat="user in $ctrl.users">' +
                    '<span>{{user.username}}</span>' +
                    '<p>{{user.password}}</p>' +
                  '</li>' +
        '</ul>',
    controller: function UserListController(User) {
      this.users=User.query();
      }
  });