$(document).ready(function() {
             $.ajax({
                 url: "http://localhost:8080/api/getUserGroup/all"
             }).then(function(userGroupList) {
                  var arrayLength = parseInt(userGroupList.length);
                  var templateGroup;
                 if(userGroupList.hasOwnProperty("name") || userGroupList.hasOwnProperty("0"))
                  for (i=0; i<=arrayLength; i++) {

                   templateGroup =[
                  ' <div class="panel panel-default">'
                   +    '  <div class="panel-heading"> '
                   +    '   <a class="panel-title" data-toggle="collapse" data-parent="#prepareGroupTable" href="#panel-element-42650'+String(i)+'">'+userGroupList[i].name+'</a>'
                   +    '    </div> '
                   +    '   <div id="#panel-element-42650'+String(i)+'" class="panel-collapse collapse "> '
                       +    '    <div class="panel-body"> '
                   ];

                   var templateUser ="";
                   var userListArray = userGroupList[i].usersList;
                   console.log(userListArray)
                   for(j=0; j == userListArray.length ;j++ )
                   {
                         templateUser +=[
                                     +    '<tbody>' +
                                            '<tr class="active">' +
                                     '          <td>'+userListArray[j].id+'</td>' +
                                     '          <td>'+userListArray[j].username+'</td>' +
                                     '          <td>'+userListArray[j].surrname+'</td>' +
                                     '          <td>'+userListArray[j].password+'</td>' +
                                     '          <td>'+new Date(Number(+userListArray[j].birthdaydate)).toLocaleString() +
                                     '         <td>'+userListArray[j].userGroupName+'</td>' +
                                     '      </tr>' +
                                     '  </tbody> '
                         ];

                   }
                   var close =[
                       +    '   </div> '
                       +    ' </div> '+
                       +   "</div>"
                   ];

                      $('#prepareGroupTable').append(templateGroup+templateUser+close);//+tamplateUser+'</div>');
                  }
                 return false;
             });
         });