

$(document).ready(function() {
        $.ajax({
            url: "http://localhost:8080/api/getUserGroup/all"
        }).then(function(userList) {
            console.log(userList)
            var arrayLength = parseInt(userList.length);

            for (i=0; i<=arrayLength; i++) {
                $("#userGroupTable table") .append(
                    '<tbody>' +
                    '<tr class="active">' +
                    '<td>'+userList[i].id+'</td>' +
                    '<td>'+userList[i].name+'</td>' +
                    '<td>'+userList[i].usersList.length+'</td>' +
                    '<td>' +
                    '<a type="button" href = "/userGroupEdit.html#'+userList[i].id+'">Edytuj</a> ' +
                    '<button class="btn btn-link" onClick="deleteuserGroup('+userList[i].id+')"> Usuń </button>' +
                    '</td> ' +
                    '</tr>' +
                    '</tbody>')
            }
        });

    }
);