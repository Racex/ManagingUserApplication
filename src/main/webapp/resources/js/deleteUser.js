function deleteuser(id) {
            $.ajax({
                type: 'DELETE',
                url: ("/api/deleteUser/"+id),
                cache: false,
//              location.reload();
            });
        return false;

};