# Java Task: Library Book Manager

This task will introduce you to ArrayLists and CRUD operations by building a simple library book manager. You’ll learn to add, view, update, and delete books from a library collection.

---

## Task Overview

Create a Java program to manage a library’s collection of books using an ArrayList. The program should allow users to add, view, update, and delete books with a text-based menu for interaction.

### Objectives
1. **Learn ArrayList basics** – adding, accessing, and removing items.
2. **Practice CRUD operations** – Create, Read, Update, Delete.
3. **Build with OOP** – Create and use a `Book` class.

---

### Step-by-Step Instructions

1. **Define a `Book` Class:**
   - Create a `Book` class with the following attributes:
     - `String title`
     - `String author`
     - `String isbn`
   - Add a constructor to initialize these attributes.
   - Override the `toString()` method to display book details.

2. **Create a `LibraryManager` Class:**
   - This class should contain an `ArrayList` of `Book` objects.
   - Implement CRUD operations for managing books in the library.

3. **Implement CRUD Methods:**
   - **Add a book** to the library.
   - **View all books** in the library.
   - **Update a book's details** based on its ISBN.
   - **Delete a book** from the library based on its ISBN.

4. **Build a Simple Menu:**
   - Create a text-based menu to interact with the library manager.
   - Allow users to select options to add, view, update, or delete books.
   - Provide an option to exit the program.
