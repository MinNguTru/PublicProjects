TOTAL_COUNT = 0
ROW_ONE = "   |   |   "
ROW_TWO = "   |   |   "
ROW_THREE = "   |   |   "
xList = [False, False, False, False, False, False, False, False, False]
oList = [False, False, False, False, False, False, False, False, False]

# Prints the board for the game
def board():
    print(ROW_ONE)
    print("-----------")
    print(ROW_TWO)
    print("-----------")
    print(ROW_THREE)


# Gets user input for numpad position
def keypadValue():
    valueInput = int(input())
    print()
    print(str(valueInput) + " numpad was picked")
    checkSpot(valueInput)


# Check if spot is used and valid for placement
def checkSpot(numpad):
    #
    # Change if statement for total count to be first
    #
    global xList
    global oList
    if TOTAL_COUNT % 2 == 0:
        xList[numpad - 1] = True
        if xList[numpad - 1] == oList[numpad - 1]:
            xList[numpad - 1] = False
            print("O is already on numpad " + str(numpad))
            main()
            return

    if TOTAL_COUNT % 2 == 1:
        oList[numpad - 1] = True
        if xList[numpad - 1] == oList[numpad - 1]:
            oList[numpad - 1] = False
            print("X is already on numpad " + str(numpad))
            main()
            return

    markingPosition(numpad)


# Mark the user's input on board
def markingPosition(numpad):
    global ROW_ONE
    global ROW_TWO
    global ROW_THREE
    global TOTAL_COUNT
    # Bug here; deleting previous strings
    if numpad >= 7 and numpad < 10:
        numpad = numpad - 6
        ROW_ONE = ROW_ONE[:characterPosition(numpad) - 1] + markRightCharacter() + ROW_ONE[characterPosition(numpad):]

    elif numpad >= 4 and numpad < 7:
        numpad = numpad - 3
        ROW_TWO = ROW_TWO[:characterPosition(numpad) - 1] + markRightCharacter() + ROW_TWO[characterPosition(numpad):]

    elif numpad >= 1 and numpad < 4:
        ROW_THREE = ROW_THREE[:characterPosition(numpad) - 1] + markRightCharacter() + ROW_THREE[
                                                                                       characterPosition(numpad):]
    # Check if match is complete
    forwardGame()


# Determines position of replaced character based on keypad
def characterPosition(position):
    if position == 1:
        return 2

    if position == 2:
        return 6

    if position == 3:
        return 10


# Determine x or o mark
def markRightCharacter():
    if TOTAL_COUNT % 2 == 0:
        return "X"

    if TOTAL_COUNT % 2 == 1:
        return "O"


# Check for win condition
def winCondition():
    winCheck = False
    # For loop later with array in array
    # Horizontal win conditions
    if ROW_ONE[1] != " " and ROW_ONE[1] == ROW_ONE[5] and ROW_ONE[9] == ROW_ONE[5]:
        winCheck = True
    if ROW_TWO[1] != " " and ROW_TWO[1] == ROW_TWO[5] and ROW_TWO[9] == ROW_TWO[5]:
        winCheck = True
    if ROW_THREE[1] != " " and ROW_THREE[1] == ROW_THREE[5] and ROW_THREE[9] == ROW_THREE[5]:
        winCheck = True
    # For loop later arrays
    # Vertical win conditions
    if ROW_ONE[1] != " " and ROW_ONE[1] == ROW_TWO[1] and ROW_THREE[1] == ROW_TWO[1]:
        winCheck = True
    if ROW_ONE[5] != " " and ROW_ONE[5] == ROW_TWO[5] and ROW_THREE[5] == ROW_TWO[5]:
        winCheck = True
    if ROW_ONE[9] != " " and ROW_ONE[9] == ROW_TWO[9] and ROW_THREE[9] == ROW_TWO[9]:
        winCheck = True
    # Diagonal win conditions
    if ROW_ONE[1] != " " and ROW_ONE[1] == ROW_TWO[5] and ROW_TWO[5] == ROW_THREE[9]:
        winCheck = True
    if ROW_ONE[9] != " " and ROW_ONE[9] == ROW_TWO[5] and ROW_TWO[5] == ROW_THREE[1]:
        winCheck = True

    if winCheck == True:
        print("Player " + markRightCharacter() + " has won!")
        return True
    else:
        return False


# Cycle game forward if it is incomplete
def forwardGame():
    global TOTAL_COUNT
    if winCondition() == False:
        TOTAL_COUNT = TOTAL_COUNT + 1
        blackout()
        board()
        keypadValue()
    else:
        board()
        print("Game is complete.")
        print("Do you wish to play again? Y or N")
        response = str(input())
        if response == "Y":
            resetGame()
            main()
        elif response == "N":
            quit()
        else:
            print("Please type in Y or N")


# Reset game to original state
def resetGame():
    global ROW_ONE
    global ROW_TWO
    global ROW_THREE
    global TOTAL_COUNT
    global xList
    global oList
    ROW_ONE = "   |   |   "
    ROW_TWO = "   |   |   "
    ROW_THREE = "   |   |   "
    TOTAL_COUNT = 0
    xList = [False, False, False, False, False, False, False, False, False]
    oList = [False, False, False, False, False, False, False, False, False]


# Blackout reset
def blackout():
    if TOTAL_COUNT >= 9:
        print("The game has been reset due to blackout")
        resetGame()


def main():
    print("Enter numpad value to mark your place")
    board()
    keypadValue()


main()