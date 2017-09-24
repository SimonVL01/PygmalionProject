
      /*  function createTable(urlPath, condition1, condition2, condition3, functionCall) {

                    let id = syntaxName.id;
                    console.log(id);

                        let $row = $('<tr>')
                            .append($('<td>').text(condition1))
                            .append($('<td>').text(condition2))
                            .append($('<td>').text(condition3))
                            .append($('<td>').append($(urlPath + id + '">').text("More of " + brand.companyname)))

                            $('a').attr('id', id);

                            let $link = $('#' + id);

                        $link.click(function(e) {
                             e.preventDefault();
                        });

                        $tbody.append($row);
                    }

        $.getJSON("/brand/all", function(brands) {
                    for(let brand of brands) {

        function createTable('<a href="branddetails.html?brandId=', brand.fullName, brand.companyname, brand.companyUrl);

        }
    }*/

        var $tbody = $("#brand-list-table").empty();

        $.getJSON("/brand/all", function(brands) {
            for(let brand of brands) {

                let id = brand.id;
                console.log(id);

                let $row = $('<tr>')
                    .append($('<td>').text(brand.fullName))
                    .append($('<td>').text(brand.companyname))
                    .append($('<td>').text(brand.companyUrl))
                    .append($('<td>').append($('<a href="branddetails.html?brandId=' + id + '">').text("More of " + brand.companyname)))

                    /*if (brand.targetAudience !== null) {
                        for(let customer of brand.targetAudience) {
                            let $rowCust = $('<tr>')
                            .append($('<td>').text(customer.targetAudience.firstname))
                            .append($('<td>').text(customer.targetAudience.lastname))
                            .append($('<td>').text(customer.targetAudience.age))
                            .append($('<td>').text(customer.targetAudience.interest.interest))
                        }
                    }*/

                    $('a').attr('id', id);

                    let $link = $('#' + id);

                $link.click(function(e) {
                     e.preventDefault();
                     callInfo();
                });

                $tbody.append($row);

            }
        });

        /*function callInfo() {

            $tbody.append($('<h1>').text('Your user info'))

            //Warning: duplicate code

            createTable("/brand/2000/users", "user", '<a href="branddetails.html?brandId=', user.firstname, user.lastname, user.age, emptyFunction)

            $.ajax({

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
                }
            }*/


            function emptyFunction() {
                //empty
            }



        $(document).ready(function(){
        $("#simplepost").click(function(e)
        {
        var MyForm = $("#ajaxform").serializeJSON();
        console.log(MyForm);
         $.ajax(
         {
         url : "localhost:8090/brand/all",
         type: "POST",
         data : {

            fullName: 'Simon Vanleeuw',
            companyname: 'Simon MC',
            companyUrl: 'simon.com'

         },
         success:function(maindta)
         {

        alert(maindta);

         },

         error: function(jqXHR, textStatus, errorThrown) {}
            });

         e.preventDefault();

            });
        });
