$(document).ready(function() {
             $.ajax({
                 url: "http://localhost:8080/api/getUser/all"
             }).then(function(userList) {
                 console.log(userList)
                  var arrayLength = parseInt(userList.length);

                  for (i=0; i<=arrayLength; i++) {
                    $("#test table") .append('<tbody><tr class="active"><td>'+userList[i].id+'</td> <td>'+userList[i].username+'</td> <td>'+userList[i].surrname+'</td> <td>'+userList[i].password+'</td> <td>'+new Date(Number(userList[i].birthdaydate)).toLocaleString()
      +' <td>'+userList[i].userGroupName+'</td> <td><a type="button" href = "/editUser.html#'+userList[i].id+'">Edytuj</a> <button class="btn btn-link" onClick="deleteuser('+userList[i].id+')"> Usuń </button></td> </tr></tbody>')
                                     }
             });

         }
    );