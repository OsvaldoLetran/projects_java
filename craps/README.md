## Getting Started

Welcome to the Java world. Here is a guideline to help you get started to write Java code.

A player rolls two dice. Once they both stop moving, the sum of the black dots on the top 
faces is calculated. If the sum is 7 or 11 on the first roll, the player wins. If the sum is 2, 3, o 12 
on the first roll, the player loses. If the sum is 4, 5, 6, 8, 9 or 10 on the first roll 
this sum becomes player's point. To win, the player must keep rolling the dice until their point 
comes up again, but loses if they roll a 7 before their point comes up again.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources

You can create a `lib` folder to add libraries.
Meanwhile, the compiled output files will be generated in the `bin` folder by default.

Commands to compile and execute:
```sh
javac -d bin/ src/craps2021/Craps2021.java
java -cp bin/ craps2021.Craps2021
```

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).