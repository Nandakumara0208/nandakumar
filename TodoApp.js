/**
 * Simple Todo List Application
 */

const todoList = [];

// Add a new todo
function addTodo(task) {
    if (task.trim() === "") {
        console.log("Task cannot be empty!");
        return;
    }
    todoList.push({
        id: Date.now(),
        task: task,
        completed: false
    });
    console.log(`Added: ${task}`);
}

// Remove a todo by id
function removeTodo(id) {
    const index = todoList.findIndex(todo => todo.id === id);
    if (index > -1) {
        const removed = todoList.splice(index, 1);
        console.log(`Removed: ${removed[0].task}`);
    }
}

// Mark todo as completed
function completeTodo(id) {
    const todo = todoList.find(t => t.id === id);
    if (todo) {
        todo.completed = true;
        console.log(`Completed: ${todo.task}`);
    }
}

// Display all todos
function displayTodos() {
    console.log("\n=== Todo List ===");
    todoList.forEach(todo => {
        const status = todo.completed ? "✓" : "○";
        console.log(`${status} ${todo.task}`);
    });
    console.log("================\n");
}

// Example usage
addTodo("Learn JavaScript");
addTodo("Build a web app");
addTodo("Push to GitHub");
displayTodos();

completeTodo(todoList[0].id);
displayTodos();
