# Java Password Generator 🔐

A simple console-based password generator written in Java.
This program allows the user to generate secure random passwords of a chosen length using letters and symbols.

---

## Features

* Generates random passwords
* User chooses the password length
* Uses Java's `SecureRandom` for stronger randomness
* Allows generating multiple passwords in one session
* Simple console interface

---

## Technologies Used

* Java
* SecureRandom (from `java.security`)
* Scanner (from `java.util`)

---

## How It Works

1. The program asks the user for the desired password length.
2. It randomly selects characters from a predefined character set containing:

   * lowercase letters
   * uppercase letters
   * symbols
3. The program builds the password character by character.
4. The generated password is displayed to the user.
5. The user can choose to generate another password or exit the program.

---

## Example Run

```
How long do you want your password length to be?
10

Your new password: A$gT!kP@qZ

Do you want to create another password? (y or n)
y
```

---

## Character Set Used

```
abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+[]{}|;:,.<>?/~ 
```

---

## How to Run

1. Clone the repository or download the source file.

2. Compile the program:

```
javac Main.java
```

3. Run the program:

```
java Main
```

---

## License

This project is free to use for learning and educational purposes.
