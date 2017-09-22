        var $tbody = $("#brand-list-table").empty();

        function createTable(jsonPath, arrayName, condition1, condition2, condition3, functionCall) {

        $.getJSON(jsonPath, function(arrayName) {
                    for(let item of arrayName) {

                    let id = item.id;
                    console.log(id);

                        let $row = $('<tr>')
                            .append($('<td>').text(condition1))
                            .append($('<td>').text(condition2))
                            .append($('<td>').text(condition3))
                            .append($('<td>').append($('<a href="localhost:8090/brand/all">').text("More of " + brand.companyname)))

                            $('a').attr('id', id);

                            let $link = $('#' + id);

                        $link.click(function(e) {
                             e.preventDefault();
                             functionCall();
                        });

                        $tbody.append($row);
                    }
             });
        }

        $.getJSON("/brand/all", function(brands) {
            for(let brand of brands) {

                let id = brand.id;
                console.log(id);
                let $row = $('<tr>')
                    .append($('<td>').text(brand.fullName))
                    .append($('<td>').text(brand.companyname))
                    .append($('<td>').text(brand.companyUrl))
                    .append($('<td>').append($('<a href="branddetails.html?brandId=' + id + ' ">').text("More of " + brand.companyname)))

                    $('a').attr('id', id);

                    let $link = $('#' + id);

                $link.click(function(e) {
                     e.preventDefault();
                     callInfo();
                });

                $tbody.append($row);

            }
        });

        function callInfo() {

            $tbody.append($('<h1>').text('Your user info'))

            //Warning: duplicate code

            createTable("/brand/2000/users", "user", user.firstname, user.lastname, user.age, emptyFunction)

            /*$.ajax({

                url: "localhost:8090/brand/6000",

                data: {
                    id: 6000
                },

                type: "GET",

                dataType: "json",

                success: function(json) {
                    $("<h1>").text(json.fullName).appendTo($tbody);
                },*/

                /*error: function(xhr, status, errorThrown) {
                    alert("We didn't find your brand");
                }*/
            }


            function emptyFunction() {
                //empty
            }


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