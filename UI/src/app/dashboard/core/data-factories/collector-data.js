/**
 * Collector and collector item data
 */
(function () {
    'use strict';

    angular
        .module(HygieiaConfig.module + '.core')
        .factory('collectorData', collectorData);

    function collectorData($http) {
        var itemRoute = '/api/collector/item';
        var itemsByTypeRoute = '/api/collector/item/type/';
        var collectorsByTypeRoute = '/api/collector/type/';

        return {
            itemsByType: itemsByType,
            createCollectorItem: createCollectorItem,
            collectorsByType: collectorsByType
        };

        function itemsByType(type) {
            return $http.get(itemsByTypeRoute + type).then(function (response) {
                return response.data;
            });
        }

        function createCollectorItem(collectorItem) {
            return $http.post(itemRoute, collectorItem);
        }

        function collectorsByType(type) {
            return $http.get(collectorsByTypeRoute + type).then(function (response) {
                return response.data;
            });
        }
    }
})();