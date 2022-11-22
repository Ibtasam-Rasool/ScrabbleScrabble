# scrabblescrabble
SYSC 3110 Group Project (Fall 2022)

- Authors:
	- Ahmad Alkawasmeh - 101108706
	- James Grieder - 101177911
	- Daniel Kuchanski - 101182041
	- Ibtasam Rasool - 101186050


# Introduction

scrabblescrabble is a mock "Scrabble" game played on a 15 x 15 grid.  In its current iteration, the game supports 2 - 4 players.  The game also supports basic AI functionalities.  This third iteration accepts user input via the mouse, using a graphical user interface.

Each of the players has a tray with 7 letters drawn from a bag of pre-set letters.  Points are awarded based on the words placed, determined by the score of each letter used, and any "special squares" that are point multipliers based on the word or the letter placed.  The game also features blank tiles which award 0 points, but can be used as any letter of the alphabet.

# Game Instructions

Upon opening the game, the game is already initialized for 2 players and begins with the first player's turn.  The players alternate taking turns.  On each turn the player chooses from the following options:

- Place a word on the game board by typing in the following format:
	- WORD COORDINATE
	- For example: "TREE 10H" to place horizontally, or "TREE H10" to place vertically
	- The direction is determined by the first coordinate
	- Coordinates range from 1 to 15 and A to O

- Pass their turn with no points

- Return one or more letters to the letterbag and draw new letters by typing the following format:
	- SWAP LETTERS
	- For example: "SWAP ABC" will swap the letters ABC if they are present in the tray

If a player attempts to place a word that is an invalid input, their turn is passed to the next player.  Invalid inputs include:
- A word that goes out of position on the board
- A word not present in the dictionary

This iteration of the game does not currently implement the game-ending conditions.  Future iterations will end the game upon the letterbag and the current player running out of letters, or upon the occurrence of 6 consecutive turns where no player earns a score.


# Included Files

- src folder
	- This folder contains all of the source code for the scrabblescrabble game.
- legalWordsList.txt
	-  This file contains the list of all legal words that may be played in the scrabblescrabble game.  Each line of this file contains one legal word.
- UMLDiagrams folder
	- UML Diagram M3 Submission FINAL.png
		- This UML diagram outlines the current class structure of the program
	- Sequence Diagram 1: gameInitializationSequence.png
		- Demonstrates how the scrabblescrabble Game class is initialized
	- Sequence Diagram 2: placeWord.png
		- Demonstrates how a Word object is placed on the board
	- Sequence Diagram 3: swapLetter.png
		- Demonstrates how a Player is able to swap a letter from their tray for a new letter from the shared LetterBag
	- Sequence Diagram 4: scoreCalculation.png
		- Demonstrates how the score is calculated for a Word placed on the board
	- Sequence Diagram 5: AIDecisionMaking.png
		- Demonstrates how the AI chooses to either place a word, swap, or pass to progress the game forward
- ChangeLog.PDF
	- This document outlines the rationale of design decisions for the current implementation of the program.


# New Updates

This iteration represents milestone 3 of 4.  Newly introduced features for this version include:

- "Special squares" that allow for boosting a player's score depending on which squares they place their letters/words on
	- Includes: Double Letter, Double Word, Triple Letter, and Triple Word score multipliers
- Blank tiles, earning the player zero points but allowing the player to select any letter from the alphabet to place on the board 
- AI functionality that allows an AI player to place a word, swap letters, or pass their turn
- The menu bar above the game currently includes functionality to start a new game, or to quit the current game


# Known Issues

- Letters on the board can currently be overwritten by other players

- Placing a word with shared letters is not functional (players can only currently use letters in their tray)

- Adjacent words do not currently need to be legal
	- Preliminary code and data structures are present, but not fully implemented

- If a player places a word unsuccessfully (i.e. using a word not valid in the dictionary) the turn is skipped to the next player

- Illegal coordinates can be used by the user
	- out of bound letter coordinates raise an exception
	- out of bound numerical coordinates cause the player to lose the letters used (points awarded, but the word is placed off of the board)


# Future Milestones

The project is currently in milestone 3 of 4.  Future milestones are scheduled to include the following features:
	
- Milestone 4: 
	- Undo/Redo buttons that work over multiple turns
	- The ability to save the game and reload it
	- Custom scrabblescrabble boards with different premium square layouts
