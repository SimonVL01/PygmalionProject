        var $tbody = $("#brand-list-table").empty();

        $.getJSON("/api/brand/all", function(brands) {
            for(let brand of brands) {

                var $webaddress = '<a href=localhost:8090/api/brand/' + brand.id;
                var $row = $('<tr>')
                    .append($('<td>').text(brand.fullName))
                    .append($('<td>').text(brand.companyname))
                    .append($('<td>').text(brand.companyUrl))
                    //.append($($webaddress))
                    .append($('<td>').append($('<a href="localhost:8090/api/brand/all">').text("More of " + brand.companyname)))
                $tbody.append($row);
            }
        });