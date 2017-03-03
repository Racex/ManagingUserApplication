function deleteuserGroup(id) {
            $.ajax({
                type: 'DELETE',
                url: ("/api/deleteUserGroup/"+id),
                cache: false,
            });
    location.reload();
        return false;

};