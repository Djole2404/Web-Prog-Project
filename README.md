The application is used for registering movie tickets.

It retrieves information from input boxes, stores it in a database located on the server, and displays it back.

What we used JavaScript for was to create different functions that ensure the data is saved to the server.

The first function, registrerBillett(), does several things: it retrieves information from the input boxes, calls two other functions, and sends the information to the server using the $.post jQuery function.

The second function, hentBilletter(), retrieves data from the server by calling the /hentBilletter endpoint and displays it in the form of a table.

The third function, slettBilletter(), clears the array and deletes all information from the server.

The fourth function, sjekkInput(), checks if the user has entered something in the input boxes and displays a message indicating that something must be entered.

BilletterController is a controller that essentially controls the server and everything that happens there. I used @PostMapping to save information on the server and @GetMapping to retrieve information from the server.

BilletterRepository is a repository where the SQL part of the project is handled. Three functions are used to process the data in the database.

In schema.sql, I created a table where data from the website will be inserted.