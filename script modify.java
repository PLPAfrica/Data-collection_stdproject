 <script>
        function submitForm() {
            // Add your JavaScript code to handle form submission
            // You can use JavaScript to collect form data and perform actions (e.g., sending data to a server).
            // For simplicity, this example just logs the data to the console.
            const formData = {
                name: document.getElementById('name').value,
                age: document.getElementById('age').value,
                gender: document.getElementById('gender').value,
                // Add more fields as needed
            };

            console.log(formData);
        }
    </script>