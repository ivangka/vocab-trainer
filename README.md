# Vocab Trainer

This project is a Java application designed to help users learn foreign words. Users can input pairs of words in any language, shuffle them, and test their knowledge by going through the words. 

The program sequentially displays the words added by the user in the file words.txt, without showing the translation. The user then indicates whether they know the translation of each word. After the user's response, the program shows the translation of the word. At the end of the session, the program displays the words for which the user did not remember the translation.

## Features

- **View Whole Dictionary:** Displays all the word pairs in the dictionary.
- **Show pairs of words with repetition:** Shuffles and displays all pairs of words or part of them, followed by repetition of words whose translation the user does not remember.
- **Persistent Storage:** Saves word pairs to a file and reads them back on subsequent runs.

## Project Structure

- **`WordPair` class:** Represents a word pair with its details and rating.
- **`DoSomethingWithWordPair` class:** Provides utility methods for operations on word pairs such as viewing, shuffling, and interacting with word pairs.
- **`Main` class:** The entry point of the application, handles file operations and user interactions.

## Installation

To use this project, you need to have the Java Development Kit (JDK) installed. You can compile and run the program using the following commands:

```bash
# Compile the program
javac -d bin src/ivangka/main/*.java

# Run the program
java -cp bin ivangka.main.Main
