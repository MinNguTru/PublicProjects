import pygame
pygame.init()
backgroundColor = (20, 50, 90)
squareColor = (50, 70, 90)


#Changes window icon and title
pygame.display.set_caption("Tic-Tac-Toe")
icon = pygame.image.load("gameicon.png")
pygame.display.set_icon(icon)

def windowGame():
    # Creates the screen
    screen = pygame.display.set_mode((600, 600))
    # RGB background color
    screen.fill(backgroundColor)
    # Draw buttons
    pygame.draw.rect(screen, squareColor, (100, 100, 128, 128))

#Game is always looping so it does not close
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
    windowGame()
    #Game window constantly updating
    pygame.display.update()