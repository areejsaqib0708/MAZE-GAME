# The Great Rat Escape Game 🐁

# Features
Navigate a 12x12 maze filled with walls and food.
Avoid three moving enemies represented by cats.
Collect all the food before running out of warnings.
Simple keyboard controls for movement.
# Gameplay
In this game, you control a rat (🐁) that needs to collect all the food (🧀) in the maze while avoiding the enemies (🐈). You have 10 warnings at the start. If you hit a wall or get caught by an enemy, you lose a warning. The game ends when you either collect all the food, lose all warnings, or collide with an enemy.
# Controls
•W: Move up

•S: Move down

•A: Move left

•D: Move right

# Classes and Methods
--- GAME ---

main: Initializes the game, creates the maze and enemies, and handles user input for controlling the rat.

--- MAZE ---

MAZE: Constructor to initialize the maze.

MAZE_MAKER: Generates the maze layout.

getMazeState: Returns the current state of the maze.

--- ENEMY ---

ENEMY: Constructor to initialize enemy positions.

ENEMY1_MOVEMENT: Handles movement for the first enemy.

ENEMY2_MOVEMENT: Handles movement for the second enemy.

ENEMY3_MOVEMENT: Handles movement for the third enemy.

COLLISION_WITH_PACMAN: Checks if an enemy collides with the rat.

--- PAC_MAN ---

PAC_MAN: Constructor to initialize the rat's position and warnings.

PAC_MAN: Handles the rat's movement based on user input.

checkAllDotsEaten: Checks if all food has been collected.

collisionWithEnemy: Checks for collisions with enemies.

PAC_MAN_MOVEMET: Moves the rat within the maze.

#       Enjoy playing The Great Rat Escape Game! 🐁
