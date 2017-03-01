$(document).ready(function () {
    $("#submit").click(function () {
        var userGroupName = $("#userGroupNameInput").val();


        if (userGroupName == '' ) {
            alert("Wypełnij wszystkie pola");
        }
        else {
            var temp = {};
            temp["name"] = userGroupName;
            var dataJson = JSON.stringify(temp);
            $.ajax({
                type: "POST",
                url: "/api/addUserGroup/",
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