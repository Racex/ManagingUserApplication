$(document).ready(function () {
    $("#submit").click(function () {
        var name = $("#userGroupNameInput").val();

        if (name == '') {
            alert("Wypełnij  pole nazwa");
        }
        else {
            var temp = {};
            var id = window.location.hash.substring(1);
            temp["name"] = name;
            var dataJson = JSON.stringify(temp);
            console.log(temp);
// AJAX Code To Submit Form.
            $.ajax({
                type: "POST",
                url: ("/api/editUserGroup/" + id),
                contentType: "application/json",
                data: dataJson,
                cache: false,
                success: function (result) {
                    alert(result);
                }
            });
        }
        return false;
    });
});