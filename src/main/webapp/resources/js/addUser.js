$(document).ready(function () {
    $("#submit").click(function () {
        var login = $("#userLoginInput").val();
        var name = $("#userNameInput").val();
        var surrname = $("#userSurrnameInput").val();
        var password = $("#userPasswordInput").val();
        var birthday = $("#birthdayInput").val();
        var groupName = $("#selectGroupName").val();

        if (name == '' || surrname == '' || password == '' || birthday == '') {
            alert("Wypełnij wszystkie pola");
        }
        else {
            var temp = {};
            temp["username"] = login;
            temp["name"] = name;
            temp["surrname"] = surrname;
            temp["password"] = password;
            temp["birthday"] = birthday;
            temp["userGroupName"] = groupName;
            var dataJson = JSON.stringify(temp);
            console.log(temp);
            $.ajax({
                type: "POST",
                url: "/api/addUser/",
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