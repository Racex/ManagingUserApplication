                        $(document).ready(function() {
             $.ajax({
                 url: "http://localhost:8080/api/getUserGroup/all"
             }).then(function(userGroupList) {
                 console.log(userGroupList)
                  var arrayLength = parseInt(userGroupList.length);
                  for (i=0; i<=arrayLength; i++) {


                   var templateGroup =(
                  ' <div class="panel panel-default">'
                   +    '  <div class="panel-heading"> '
                   +    '   <a class="panel-title" data-toggle="collapse" data-parent="#panel-503269" href="#panel-element-432650">'+userGroupList[i].name+'</a>'
                   +    '    </div> '
                   );

                   var tamplateUser
                   for(j=0; j=userGroupList[i].usersList.length;j++ )
                   {
                        var tamplate =(
                                          '   <div id="panel-element-432650" class="panel-collapse collapse in"> '
                                     +    '    <div class="panel-body"> '
                                     +    '     <tbody><tr class="active"><td>'+userGroupList[i].usersList[j].id+'</td> <td>'+userGroupList[i].usersList[j].username+'</td> <td>'+userGroupList[i].usersList[j].surrname+'</td> <td>'+userGroupList[i].usersList[j].password+'</td> <td>'+new Date(Number(userGroupList[i].usersList[j].birthdaydate)).toLocaleString()
                                         +' <td>'+userList[j].userGroupName+'</td></tr></tbody> '
                                     +    '   </div> '
                                     +    ' </div> ');
                                     templateUser +=template;
                   }
                   console.log(templateGroup+tamplateUser+'</div>');
                  $('#prepareGroupTable div').append(templateGroup+tamplateUser+'</div>');
                   };


             });
         });