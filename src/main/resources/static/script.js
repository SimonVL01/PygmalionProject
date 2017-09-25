
     let mainScript = (function() {

     function loadBrands() {

     $.getJSON('/brand/all', function() {

     //let $main = $('#brand-list-table').empty();

     let source = $('#brandTemplate').html();

     let template = Handlebars.compile(source);

     let context = {

        "brandlist": [
        {'fullname': 'Simon', 'companyname': 'Vanleeuw', 'companyUrl': 'simba.com'},
        {'fullname': 'Cymon', 'companyname': 'Cy-mon software', 'companyUrl': 'cymon.com'}
        ]
     };

     /*let data = {
         "brand.fullName": "Simon",
         "brand.companyname": "SimonScript",
         "brand.companyUrl": "simon.com"
     };*/


     var output = template(context);

     $('#brand-list-table').html(output);

         });

     };

     loadBrands();

     /*function loadGroentenLijstByPostcode(postcode) {

         $.getJSON('/api/plantensoort/byPostcode/'.concat(postcode), function(plantensoorten) {

         var $main = $("#mainBodyContent").empty();
         function loadGroentenLijstByPostcode(postcode) {
             $.getJSON('/api/plantensoort/byPostcode/'.concat(postcode), function (plantensoorten) {
                 var $main = $("#mainBodyContent").empty();

                 var source   = $("#groentenlijst-template").html();
                 var template = Handlebars.compile(source);
                 let output = template({plantensoorten});
                 $main.html(output);
             });*/

        /*var $tbody = $("#brand-list-table").empty();

        $.getJSON("/brand/all", function(brands) {
            for(let brand of brands) {

                let id = brand.id;
                console.log(id);

                let $row = $('<tr>');
                    //.append($('<td>').text(brand.fullName))
                    //.append($('<td>').text(brand.companyname))
                    //.append($('<td>').text(brand.companyUrl))*/

                    /*let fullname = {fullname: brand.fullname}
                    let fullnameScript = $("#fullname").html();
                    let fullnameTemplate = Handlebars.compile(fullNameScript);
                    $row.append(fullnameTemplate(fullname));

                    let companyname = {companyname: brand.companyname}
                    let companynameScript = $("#companyname").html();
                    let companynameTemplate = Handlebars.compile(companynameScript);
                    $row.append(companynameTemplate(companyname));

                    let companyUrl = {companyUrl: brand.companyUrl}
                    let companyUrlScript = $("#companyUrl").html();
                    let companyUrlTemplate = Handlebars.compile(companyUrl);
                    $row.append(companynameTemplate(companyUrl));

                    $row.append($('<td>').append($('<a href="branddetails.html?brandId=' + id + '">').text("More of " + brand.companyname)))*/

                    /*if (brand.targetAudience !== null) {
                        for(let customer of brand.targetAudience) {
                            let $rowCust = $('<tr>')
                            .append($('<td>').text(customer.targetAudience.firstname))
                            .append($('<td>').text(customer.targetAudience.lastname))
                            .append($('<td>').text(customer.targetAudience.age))
                            .append($('<td>').text(customer.targetAudience.interest.interest))
                        }
                    }*/

                /*    $('a').attr('id', id);

                    let $link = $('#' + id);

                $link.click(function(e) {
                     e.preventDefault();
                     callInfo();
                });

                $tbody.append($row);

            }
        });*/

        let $form = $('#ajaxform');

        $form.submit(function(e) {

            //alert('test');
            e.preventDefault();

            let b = {
                fullName: $(this.fullname).val(),
                companyname: $(this.companyname).val(),
                companyUrl: $(this.companyUrl).val(),
                //imagePost: $(this.image).val()
            }

            console.log(b);

            $.ajax({

                 url : "/brand/all",
                 method: "POST",
                 //dataType: 'json',
                contentType: 'application/json',
                 //data : brandPost,
                 data: JSON.stringify(b),

                 success:function(main) {

                    alert("kuykugkugku" + main);

                 },

                 error: function() {
                    alert('Error!');
                 }
            });


            /*let brandPost = {

                fullNamePost: $('this.fullname').val(),
                companynamePost: $('this.companyname').val(),
                companyUrlPost: $('brand.companyUrl').val(),
                companyLink: 'visit ' + '<a =href\"' + $('brand.companyUrl').val() + '\">' + $('brand.companyname').val() + '</a>'


            };
            $.ajax({

                     url : "/brand/all",
                     type: "POST",
                     dataType: 'json',

                     //data : brandPost,
                     data: $(this).serialize()

                     success:function(maindta)
                     {

                    alert(maindta);

                     },

                     error: function(jqXHR, textStatus, errorThrown) {}
                        }*/
        });


var myApp = angular.module('myApp',[]);


function MyCtrl($scope) {
    $scope.stepsModel = [];

    $scope.imageUpload = function(event){
         var files = event.target.files; //FileList object

         for (var i = 0; i < files.length; i++) {
             var file = files[i];
                 var reader = new FileReader();
                 reader.onload = $scope.imageIsLoaded;
                 reader.readAsDataURL(file);
         }
    }

    $scope.imageIsLoaded = function(e){
        $scope.$apply(function() {
            $scope.stepsModel.push(e.target.result);
        });
    }
}

}());