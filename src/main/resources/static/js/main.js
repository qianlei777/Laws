
$(function () {
    alert(123);
    $("#clause h3").click(function () {
        $(this).next().toggle();
        alert(123);
    })
})
