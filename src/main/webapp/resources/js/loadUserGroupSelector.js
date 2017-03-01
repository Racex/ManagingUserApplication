$(document).ready(function() {
       $.ajax({
           url: "http://localhost:8080/api/getUserGroup/all"
       }).then(function(userGroupListData) {
            var arrayLength = parseInt(userGroupListData.length);
            var userGroupList = jQuery.parseJSON(JSON.stringify(userGroupListData));
            for (i=0; i<=arrayLength; i++) {
              $("#selectGroupName ") .append('<option >' + userGroupList[i].name+ '</option>');
            }
       });
   });