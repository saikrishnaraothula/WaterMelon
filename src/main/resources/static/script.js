$(document).ready(function() {
    $('#userForm').on('submit', function(event) {
        event.preventDefault();  // Prevent form submission
        let value = $(this).val();
        var name = $('#name').val();
        var color = $('#color').val();
       // var bolVal = $('#ismilkyWay').val() === 'true';

        // Validate input
        if (name === '' || color === '' ) {
            alert('Please fill out all fields.');
            return;
        }
if(value === "s"){
        // AJAX call to backend
     /*   $.ajax({
             url: 'http://localhost:8082/api/users/tryingHard', 
            method : "POST",
            contentType: 'application/json',
            data: JSON.stringify({
                planets: name,
                planetColor: color,
                milkywayGalaxy: bolVal
            }),
            success: function(response) {
                $('#response').text(response);  // Display success message
                $('#userForm')[0].reset();  // Reset the form
            },
            error: function(error) {
                $('#response').text('Error saving user!');
            }
        });*/
        }
        if(value === "d"){
	 $.ajax({
             url: 'http://localhost:8082/api/users/delete', 
            method : "POST",
            contentType: 'application/json',
            data: JSON.stringify({
                planets: name,
                planetColor: color,
                milkywayGalaxy: bolVal
            }),
            success: function(response) {
                $('#response').text(response);  // Display success message
                $('#userForm')[0].reset();  // Reset the form
            },
            error: function(error) {
                $('#response').text('Error saving user!');
            }
        });
}
    });
    
});
