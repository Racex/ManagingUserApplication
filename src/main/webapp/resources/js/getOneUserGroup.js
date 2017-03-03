

$(document).ready(function() {
        var id = window.location.hash.substring(1);
             $.ajax({
                 url: ("http://localhost:8080/api/getUserGroupForUser/"+id)
             }).then(function(userList) {
                 console.log(userList)
                  var arrayLength = parseInt(userList.length);

                  for (i=0; i<=arrayLength; i++) {
                      var dateAfterFormated = "";
                      if (userList[i].birthday != null) {

                          dateAfterFormated = new Date(userList[i].birthday).toLocaleDateString('en-GB');
                        }else dateAfterFormated= "brak danych";
                    $("#oneUserTable table") .append(
                        '<tbody>' +
                        '<tr class="active">' +
                            '<td>'+userList[i].id+'</td>' +
                            '<td>'+userList[i].username+'</td>' +
                            '<td>'+userList[i].surrname+'</td>' +
                            '<td>'+userList[i].password+'</td>' +
                            '<td>'+dateAfterFormated+'</td>'+
                            '<td>' +
                                '<a type="button" href = "/editUser.html#'+userList[i].id+'">Edytuj</a> ' +
                                '<button class="btn btn-link" onClick="deleteuser('+userList[i].id+')"> Usuń </button>' +
                            '</td> ' +
                        '</tr>' +
                        '</tbody>')
                                     }
             });

         }
    );