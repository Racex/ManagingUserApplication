$(document).ready(function () {
    $("#submit").click(function () {
        var login = $("#userLoginInput").val();
        var name = $("#userNameInput").val();
        var surrname = $("#userSurrnameInput").val();
        var password = $("#userPasswordInput").val();
        var birthday = $("#birthdayInput").val();
        var groupId = $("#selectGroupName").val();

        if (name == '' || surrname == '' || password == '' || birthday == '') {
            alert("Wypełnij wszystkie pola");
        }
        else {
            var temp = {};
            var id = window.location.hash.substring(1);
            temp["username"] = login;
            temp["name"] = name;
            temp["surrname"] = surrname;
            temp["password"] = password;
            temp["birthday"] = birthday;
            temp["userGroupName"] = groupId;
            var dataJson = JSON.stringify(temp);
            console.log(temp);
// AJAX Code To Submit Form.
            $.ajax({
                type: "POST",
                url: ("/api/editUser/" + id),
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