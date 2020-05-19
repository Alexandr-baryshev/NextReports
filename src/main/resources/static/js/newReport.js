

$(document).ready(function () {
    // +++ Добавление в базу +++
    $('#save_id').on('click', function () {

        let rdParam = {
            reportNum: null,
            reportDate: null,
            descriptWork: null,
            resultWork: null
        }

        rdParam.reportNum = $ ('#reportNum_id').val()
        rdParam.reportDate = $ ('#reportDate_id').val()
        rdParam.descriptWork = $ ('#descriptWork_id').val()
        rdParam.resultWork = $ ('#resultWork_id').val()


        $.ajax({
            type: "POST",
            url: "/ProfRab",
            data: JSON.stringify(rdParam, null, 2),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(dataX){

                // $('#outTxt_id').val(dataX.outTxt);

            },
            failure: function(errMsg) {
                alert(errMsg);
            }
        });
    })

    // ^^^ Вывод из базы ^^^
    $.ajax({
        type: "GET",
        url: "/getProfRab",
        data: null,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(dataX){

            $('#list_id').empty()

            for (let i = 0; i < dataX.length; i++) {
                let e = dataX[i];
                let repDt = new Date(e.reportDate);

                let ne = $("<li class='list' onclick='elementClick(event)'>" + e.reportNum + " &nbsp - &nbsp " + repDt.toLocaleDateString() + " &nbsp &nbsp" + repDt.toLocaleTimeString() + "</li>")
                ne.data("val", JSON.stringify(e, null , 2))
                $( "#list_id" ).append(ne)
            }
            // $('#historyOut_id').val();
        },
        failure: function(errMsg) {
            alert(errMsg);
        }
    });

})

function elementClick(paramX) {
    document.location.href = "newProfRab-mob";

    //******************************************
    // *****  и где-то тут настал п-ц.. ********

    let li = paramX.currentTarget
    let f = $(li).data("val")
    // $('#descriptWork_id').val(f)
    $('#descriptWork_id').val("TEST - OK")
}