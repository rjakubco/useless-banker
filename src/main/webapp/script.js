    angular.module('patternfly.navigation').controller('vertNavController', ['$scope',
      function ($scope) {
        $scope.navigationItems = [
          {
             title: "Dashboard",
             iconClass: "fa fa-dashboard",
             href: "#/dashboard"
          },
          {
             title: "Dolor",
             iconClass : "fa fa-shield",
             href: "#/dolor",
             badges: [
               {
                 count: 1283,
                 uibTooltip: "Total number of items"
               }
             ]
          },
          {
             title: "Ipsum",
             iconClass: "fa fa-space-shuttle",
             children: [
                {
                   title: "Intellegam",
                   children: [
                      {
                         title: "Recteque",
                         href: "#/ipsum/intellegam/recteque",
                         badges: [
                           {
                             count: 6,
                             uibTooltip: "Total number of error items",
                             badgeClass: 'example-error-background'
                           }
                         ]
                      },
                      {
                         title: "Suavitate",
                         href: "#/ipsum/intellegam/suavitate",
                         badges: [
                           {
                             count: 2,
                             uibTooltip: "Total number of items"
                           }
                         ]
                      },
                      {
                         title: "Vituperatoribus",
                         href: "#/ipsum/intellegam/vituperatoribus",
                         badges: [
                           {
                             count: 18,
                             uibTooltip: "Total number of warning items",
                             badgeClass: 'example-warning-background'
                           }
                         ]
                      }
                   ]
                },
                {
                   title: "Copiosae",
                   children: [
                      {
                         title: "Exerci",
                         href: "#/ipsum/copiosae/exerci",
                         badges: [
                           {
                             count: 2,
                             uibTooltip: "Total number of error items",
                             iconClass: 'pficon pficon-error-circle-o'
                           },
                           {
                             count: 6,
                             uibTooltip: "Total number warning error items",
                             iconClass: 'pficon pficon-warning-triangle-o'
                           }
                         ]
                      },
                      {
                         title: "Quaeque",
                         href: "#/ipsum/copiosae/quaeque",
                         badges: [
                           {
                             count: 0,
                             uibTooltip: "Total number of error items",
                             iconClass: 'pficon pficon-error-circle-o'
                           },
                           {
                             count: 4,
                             uibTooltip: "Total number warning error items",
                             iconClass: 'pficon pficon-warning-triangle-o'
                           }
                         ]
                      },
                      {
                         title: "Utroque",
                         href: "#/ipsum/copiosae/utroque",
                         badges: [
                           {
                             count: 1,
                             uibTooltip: "Total number of error items",
                             iconClass: 'pficon pficon-error-circle-o'
                           },
                           {
                             count: 2,
                             uibTooltip: "Total number warning error items",
                             iconClass: 'pficon pficon-warning-triangle-o'
                           }
                         ]
                      }
                   ]
                },
                {
                   title: "Patrioque",
                   children: [
                      {
                         title: "Novum",
                         href: "#/ipsum/patrioque/novum"
                      },
                      {
                         title: "Pericula",
                         href: "#/ipsum/patrioque/pericula"
                      },
                      {
                         title: "Gubergren",
                         href: "#/ipsum/patrioque/gubergren"
                      }
                   ]
                },
                {
                   title: "Accumsan",
                   href: "#/ipsum/Accumsan",
                   badges: [
                     {
                       count: 2,
                       uibTooltip: "Total number of error items",
                       iconClass: 'pficon pficon-error-circle-o'
                     },
                     {
                       count: 6,
                       uibTooltip: "Total number warning error items",
                       iconClass: 'pficon pficon-warning-triangle-o'
                     }
                   ]
                }
             ]
          },
          {
             title: "Amet",
             iconClass: "fa fa-paper-plane",
             children: [
                {
                   title: "Detracto",
                   children: [
                      {
                         title: "Delicatissimi",
                         href: "#/amet/detracto/delicatissimi"
                      },
                      {
                         title: "Aliquam",
                         href: "#/amet/detracto/aliquam"
                      },
                      {
                         title: "Principes",
                         href: "#/amet/detracto/principes"
                      }
                   ]
                },
                {
                   title: "Mediocrem",
                   children: [
                      {
                         title: "Convenire",
                         href: "#/amet/mediocrem/convenire"
                      },
                      {
                         title: "Nonumy",
                         href: "#/amet/mediocrem/nonumy"
                      },
                      {
                         title: "Deserunt",
                         href: "#/amet/mediocrem/deserunt"
                      }
                   ]
                },
                {
                   title: "Corrumpit",
                   children: [
                      {
                         title: "Aeque",
                         href: "#/amet/corrumpit/aeque"
                      },
                      {
                         title: "Delenit",
                         href: "#/amet/corrumpit/delenit"
                      },
                      {
                         title: "Qualisque",
                         href: "#/amet/corrumpit/qualisque"
                      }
                   ]
                },
                {
                   title: "urbanitas",
                   href: "#/amet/urbanitas"
                }
             ]
          },
          {
             title: "Adipscing",
             iconClass: "fa fa-graduation-cap",
             href: "#/adipscing"
          },
          {
             title: "Lorem",
             iconClass: "fa fa-gamepad",
             href: "#/lorem"
          },
          {
             title: "Exit Demo"
          }
        ];
        $scope.handleNavigateClick = function (item) {
          if (item.title === "Exit Demo") {
            angular.element(document.querySelector("#verticalNavLayout")).addClass("hidden");
          }
        };
      }
    ]);