
$(document).ready(function () {

    var r = $('#main').attr("data-idEdit")
    if (r) {
        load(r)
    } else {
        r = sessionStorage.getItem("idReport")
        if (r) {
            load(r)
        }
    }

    // +++ Добавление в базу ++
    $('#save_id').on('click', function () {

        let rdParam = {
            reportNum: null,
            reportDate: null,
            descriptWork: null,
            resultWork: null
        }
        if (r){
            rdParam.id = r;
        }
        rdParam.reportNum = $ ('#reportNum_id').val()
        rdParam.reportDate = new Date($('#reportDate_id').val())
        rdParam.descriptWork = $ ('#descriptWork_id').val()
        rdParam.resultWork = $ ('#resultWork_id').val()


        $.ajax({
            type: "POST",
            url: "/ProfRab",
            data: JSON.stringify(rdParam, null, 2),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function(dataX){
                document.location.href = "list-profrab-mob"
            },
            failure: function(errMsg) {
                alert(errMsg);
            }
        });
    })
})


function load(idEdit) {
    $.ajax({
        type: "GET",
        url: "/getProfRabById?id=" + idEdit,
        data: null,
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function(dataX){
            $ ('#reportNum_id').val(dataX.reportNum)
            $ ('#reportDate_id').val(dataX.reportDate)
            $ ('#descriptWork_id').val(dataX.descriptWork)
            $ ('#resultWork_id').val(dataX.resultWork)
        },
        failure: function(errMsg) {
            alert(errMsg);
        }
    });
}