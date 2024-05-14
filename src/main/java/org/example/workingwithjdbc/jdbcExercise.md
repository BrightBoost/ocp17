
### Exercise: Manage a Library System

Let's create a basic library management system that handles information about books. Each book in the library has a title, author, ISBN, and status (whether it is available or checked out).

#### Tasks
1. **Define the Book Java Class**
    - Create a `Book` class with the following fields:
        - `id` (int)
        - `title` (String)
        - `author` (String)
        - `isbn` (String)
        - `status` (String)
    - Include constructors, getters, setters, and a `toString` method to represent the book object.

2. **Create an SQL Table for Books**
    - Write an SQL statement to create a table named `books` with columns that correspond to the `Book` class fields.
    - Ensure `id` is set as a primary key and auto-incremented.

3. **Implement JDBC CRUD Operations**
    - Develop methods in a class named `LibraryDb` for each CRUD operation:
        - **Create**: Add a new book to the database.
        - **Read**: Fetch all books from the database.
        - **Update**: Update a book’s details (e.g., status when a book is checked out or returned).
        - **Delete**: Remove a book from the database.
    - Handle exceptions appropriately and ensure the database connection is closed after operations.

4. **Write a Main Method to Test Functionality**
    - In a `Main` class, write a `main` method that:
        - Adds at least three books to the database.
        - Prints all books.
        - Updates one book's status to "Checked Out".
        - Deletes a book.
        - Prints all books after each operation to show the updates.

#### Deliverables
Students should submit:
- The `Book` and `LibraryDb` Java classes.
- The SQL script for creating the `books` table.
- A `Main` class that demonstrates the CRUD operations.

#### Bonus part
As an extension, challenge students to implement additional features, such as:
- Searching for books by title or author.
- Implementing a system to handle due dates for checked-out books.
- Adding a user interface using a simple Java framework like Swing or JavaFX.
