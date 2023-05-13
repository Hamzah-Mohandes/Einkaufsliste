# Einkaufsliste
Pseudo code for a Kotlin console shopping list app:

English:
1. Initialize an empty list called "shoppingList".
2. Display a welcome message and instructions to the user.
3. Enter a loop that continues until the user chooses to exit.
    a. Display a menu with options to add an item, remove an item, view the list, or exit.
    b. Prompt the user to enter their choice.
    c. If the choice is to add an item:
        i. Prompt the user to enter the name of the item.
        ii. Add the item to the shoppingList.
    d. If the choice is to remove an item:
        i. Prompt the user to enter the name of the item to be removed.
        ii. Remove the item from the shoppingList if it exists.
    e. If the choice is to view the list:
        i. Display the contents of the shoppingList.
    f. If the choice is to exit:
        i. Break out of the loop.
4. Display a farewell message.

Deutsch:
1. Erstelle eine leere Liste namens "shoppingList".
2. Zeige eine Begrüßungsnachricht und Anweisungen für den Benutzer an.
3. Betrete eine Schleife, die weiterläuft, bis der Benutzer wählt, das Programm zu beenden.
    a. Zeige ein Menü mit Optionen an, um einen Artikel hinzuzufügen, einen Artikel zu entfernen, die Liste anzuzeigen oder das Programm zu beenden.
    b. Aufforderung zur Eingabe der Auswahl des Benutzers.
    c. Wenn die Auswahl darin besteht, einen Artikel hinzuzufügen:
        i. Aufforderung zur Eingabe des Namens des Artikels.
        ii. Füge den Artikel zur shoppingList hinzu.
    d. Wenn die Auswahl darin besteht, einen Artikel zu entfernen:
        i. Aufforderung zur Eingabe des Namens des zu entfernenden Artikels.
        ii. Entferne den Artikel aus shoppingList, falls er existiert.
    e. Wenn die Auswahl darin besteht, die Liste anzuzeigen:
        i. Zeige den Inhalt von shoppingList an.
    f. Wenn die Auswahl darin besteht, das Programm zu beenden:
        i. Verlasse die Schleife.
4. Zeige eine Abschiedsnachricht an.


--------------------------------------------------------------------------------
# Shopping List Kotlin Console App

This is a simple console-based shopping list application written in Kotlin. It allows users to add items, remove items, view the list, and exit the program.

## Features

- Add items: Users can add items to the shopping list by entering the name of the item.
- Remove items: Users can remove items from the shopping list by entering the name of the item to be removed.
- View list: Users can view the current contents of the shopping list.
- Exit program: Users can choose to exit the program when they are done.

## Getting Started

1. Clone the repository to your local machine.
2. Ensure you have Kotlin installed on your machine.
3. Open a terminal and navigate to the project directory.
4. Compile the Kotlin code: `kotlinc -include-runtime -d shoppinglist.jar Main.kt`
5. Run the application: `java -jar shoppinglist.jar`

## Usage

1. When the application is launched, you will see a welcome message and a menu of options.
2. Use the number keys to select an option from the menu.
3. Follow the prompts to add items, remove items, or view the shopping list.
4. To exit the program, select the "Exit" option from the menu.

## Example

