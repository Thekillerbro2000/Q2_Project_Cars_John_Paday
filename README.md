# Cars Moving
Cars
Frame
In the frame class the very first thing that is found under the class header is the creation of objects and variables. The objects are created by calling upon other objects in the java project. One example is how the object bg is created by calling upon the Background constructor in the Background class. Also the fonts and variables that are specifically used in the Frame class. These objects will then be painted later in the paint method.
![image](https://user-images.githubusercontent.com/90801604/148460881-c05b63b1-1280-40cc-95dd-1b73a770555f.png)

The first lines of code that occur in the paint method is the painting of all the objects. The bg object is the first thing to be painted because the other object will be overlapping it or in front of it. 

The next line of code in the paint method is for painting the score on the screen in the top right hand corner. It uses the bscore variable, which is a variable for the score, to show the score on to the screen. The f1 object is called upon to set up the font and colors it white. The drawRect is used to enclose the score in a rectangle to help the user see where the score is.

This code makes it so that the car does not leave the screen

This code makes it so that the obstacles reset after leaving the screen. The blockade resets at regular intervals and the other two objects respawn at different y intervals between two set x locations.

This code is used for collision detection between the blue car and all the obstacles.

And the final code for the paint method is for making the game more optimized.

This code is used to print the score and stop all objects from moving

Used to make the game over screen if a collision were to occur

Code for keys in order to make sure that the car moves when keys are pressed

The code makes sure that the blue car does not move in a certain direction forever after the key is released.


Car

The car class has similar coding to the background class and all the obstacle classes in which its constructor is nearly the same.

Variables include image related variables along with variables for position and speed. The vx and vy variables are set to zero since they will change when certains methods in the Car class are called into the Frame class.

This code is used to update the x and y variables in order to make the car move.

Its paint method is the same in Background and in the obstacle classes


Obstacles and Background

They have nearly the same code, except the speeds may be different and the size of the obstacles are different from each other. Their update methods are the same along with their paint methods. The code used to get the image is the same and the code used to make it to scale is the same. Their constructors also have the same code.























