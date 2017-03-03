 $(document).ready(function() {
     var id = window.location.hash.substring(1);
     console.log("http://localhost:8080/api/getUser/" + id)
     var url = ("http://localhost:8080/api/getUser/" + id)
     $.ajax({
         url: ("http://localhost:8080/api/getUser/" + id)
     }).then(function (userListData) {
         console.log(userListData);
         $("#userLoginInput").val(userListData.username);
         $("#userNameInput").val(userListData.name);
         $("#userSurrnameInput").val(userListData.surrname);
         $("#userPasswordInput").val(userListData.password);
         $("#birthdayInput").val(new Date(userList[i].birthday).toLocaleDateString('en-GB'));
         $("#selectGroupName").text(userListData.userGroupName);
     });
 });