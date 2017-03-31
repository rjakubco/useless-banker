// Register `phoneList` component, along with its associated controller and template
angular.
  module('app').
  component('userGet', {
    template:
        '<h1>{{$ctrl.user.username}}</h1>',
    controller: function UserGetController(User) {
      this.user=User.get({username: 'Foo Bar'});
      }
  });