 $(document).ready(function() {
     var id = window.location.hash.substring(1);
     $.ajax({
         url: ("http://localhost:8080/api/getUserGroup/" + id)
     }).then(function (userListData) {
         console.log(userListData);
         $("#userGroupNameInput").val(userListData.name);
     });
 });