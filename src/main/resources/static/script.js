        var $tbody = $("#brand-list-table").empty();

        $.getJSON("/brand/all", function(brands) {
            for(let brand of brands) {

                var $row = $('<tr>')
                    .append($('<td>').text(brand.fullName))
                    .append($('<td>').text(brand.companyname))
                    .append($('<td>').text(brand.companyUrl))
                    .append($('<td>').append($('<a href="localhost:8090/brand/all">').text("More of " + brand.companyname)))
                $tbody.append($row);
            }
        });

        /*function callInfo() {

        var $tuser = $('#individual-brand-list-table');

        var xhr = new XmlHttpRequest();

        $.ajax({
            url: "http://localhost:8090/brands/2000",

            data: {
                id: 2000
            },

            type: "GET",

            dataType: "json",

            success: function(json ) {
                    $("<h1>").text(json.fullName).appendTo("#individual-brand-list-table");
                    $("<div>").html(json.html).appendTo("#individual-brand-list-table");
            },

            error: function(xhr, status, errorThrown) {
                alert("Sorry, there was a problem!");
                console.log("Error: " + errorThrown);
            }

            complete: function(xhr, status) {
                console.log("The request is complete")
            }
        });
     }*/

/*<table>

    <thead>
        <tr>
            <th>User</th>
            <th>Interests</th>
            <th>Device Use</th>
        </tr>
    </thead>

    <tbody id="user-list-table">
        <td>CN</td>
        <td>CW</td>
        <td>CS</td>
    </tbody>
</table>*/