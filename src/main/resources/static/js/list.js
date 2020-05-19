

$(document).ready(function () {

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

                let ne = $("<li class='list' onclick='elementClick2(event)'>" + e.reportNum + " &nbsp - &nbsp " + repDt.toLocaleDateString() + " &nbsp &nbsp" + repDt.toLocaleTimeString() + "</li>")
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
    let li = paramX.currentTarget
    let f = $(li).data("val")
    let id = JSON.parse(f).id
    // nextPage(id)
    document.location.href = "newProfRab-mob?id=" + id;
}

function elementClick2(paramX) {
    let li = paramX.currentTarget
    let f = $(li).data("val")
    let id = JSON.parse(f).id
    sessionStorage.setItem("idReport", id)
    document.location.href = "newProfRab-mob";
}

