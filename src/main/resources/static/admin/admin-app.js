var app = angular.module("admin-app", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
        .when("/product", { //url
            templateUrl: "/admin/product/index.html",
            controller: "product-ctrl" //file js của product
        })
        .when("/authorize", {
            templateUrl: "/admin/authority/index.html",
            controller: "authority-ctrl"
        })
        .when("/unauthorize", {
            templateUrl: "/admin/authority/unauthorized.html",
            controller: "authority-ctrl"
        })
        .otherwise({
            template: "<h1 class='text-center'>FPT Polytechnic Administration</h1>"
        });
})