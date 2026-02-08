#!/usr/bin/env python3
"""
Simple Hello World program with functions
"""

def greet(name):
    """Greet a person by name"""
    return f"Hello, {name}! Welcome to Python."

def add_numbers(a, b):
    """Add two numbers and return result"""
    return a + b

def main():
    """Main function"""
    print(greet("Nanda"))
    print(f"2 + 3 = {add_numbers(2, 3)}")
    
    # Loop example
    print("\nCounting to 5:")
    for i in range(1, 6):
        print(f"  {i}")

if __name__ == "__main__":
    main()
