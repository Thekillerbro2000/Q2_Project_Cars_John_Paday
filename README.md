# Cars Moving

## Contributors


## Frame

In the frame class the very first thing that is found under the class header is the creation of objects and variables. The objects are created by calling upon other objects in the java project. One example is how the object bg is created by calling upon the Background constructor in the Background class. Also the fonts and variables that are specifically used in the Frame class. These objects will then be painted later in the paint method.

![image](https://user-images.githubusercontent.com/90801604/148460881-c05b63b1-1280-40cc-95dd-1b73a770555f.png)

The first lines of code that occur in the paint method is the painting of all the objects. The bg object is the first thing to be painted because the other object will be overlapping it or in front of it. 

![image](https://user-images.githubusercontent.com/90801604/148461120-d55bc665-3d04-4b0d-adea-57d6c72a9a81.png)

The next line of code in the paint method is for painting the score on the screen in the top right hand corner. It uses the bscore variable, which is a variable for the score, to show the score on to the screen. The f1 object is called upon to set up the font and colors it white. The drawRect is used to enclose the score in a rectangle to help the user see where the score is.

![image](https://user-images.githubusercontent.com/90801604/148461261-9e8104ba-68cc-4dd3-96ac-c4c5317ca0bc.png)

This code makes it so that the car does not leave the screen

![image](https://user-images.githubusercontent.com/90801604/148461297-65a09bb9-653f-410d-8837-39b02cdf2f18.png)

This code makes it so that the obstacles reset after leaving the screen. The blockade resets at regular intervals and the other two objects respawn at different y intervals between two set x locations.

![image](https://user-images.githubusercontent.com/90801604/148461672-accafe06-3a65-44f4-8c00-aafa369139b5.png)

This code is used for collision detection between the blue car and all the obstacles.

![image](https://user-images.githubusercontent.com/90801604/148461702-57495dce-1d94-40a4-8727-042deb938417.png)

And the final code for the paint method is for making the game more optimized.

![image](https://user-images.githubusercontent.com/90801604/148461735-48053858-45e0-4abe-bb19-775f779c1c16.png)

This code is used to print the score and stop all objects from moving

![image](https://user-images.githubusercontent.com/90801604/148461771-eca606a4-8cd5-49db-b23e-2f3aa720a4b7.png)

Used to make the game over screen if a collision were to occur

![image](https://user-images.githubusercontent.com/90801604/148461803-0bf0c750-1e1d-482f-a7c7-48cf285e6cc8.png)

Code for keys in order to make sure that the car moves when keys are pressed

![image](https://user-images.githubusercontent.com/90801604/148461833-10b44cf4-ff78-4500-80a7-efd3847280e9.png)

The code makes sure that the blue car does not move in a certain direction forever after the key is released.

![image](https://user-images.githubusercontent.com/90801604/148461862-c986d92e-3db1-4aa5-ad98-f230082f8b8f.png)


## Car

The car class has similar coding to the background class and all the obstacle classes in which its constructor is nearly the same.

![image](https://user-images.githubusercontent.com/90801604/148461895-4ee23d62-16e3-4da0-8a8c-58b1c517278d.png)

Variables include image related variables along with variables for position and speed. The vx and vy variables are set to zero since they will change when certains methods in the Car class are called into the Frame class.

![image](https://user-images.githubusercontent.com/90801604/148461915-5bd24c5c-c138-4b87-8155-7fb72d5e1cad.png)

This code is used to update the x and y variables in order to make the car move.

![image](https://user-images.githubusercontent.com/90801604/148461951-45f8c065-4698-49ba-bdc1-b1129d9141c8.png)

Its paint method is the same in Background and in the obstacle classes

![image](https://user-images.githubusercontent.com/90801604/148461967-c662febf-c16c-49e1-a2fb-0b4622c51c5d.png)


## Obstacles and Background

They have nearly the same code, except the speeds may be different and the size of the obstacles are different from each other. Their update methods are the same along with their paint methods. The code used to get the image is the same and the code used to make it to scale is the same. Their constructors also have the same code.

![image](https://user-images.githubusercontent.com/90801604/148462001-8ca21713-3e0d-4b5e-9bd0-f6a63ce4864e.png)

![image](https://user-images.githubusercontent.com/90801604/148462038-bef99c88-62db-4c83-8289-de4ffc86c5d3.png)

![image](https://user-images.githubusercontent.com/90801604/148462087-187f89aa-7da7-4247-9480-fbed87d146ff.png)

![image](https://user-images.githubusercontent.com/90801604/148462145-67e2dae6-ddde-472f-a258-ea60af43d660.png)

## Imgs
imgs the get called upon

![image](https://user-images.githubusercontent.com/90801604/148462444-6ee73415-1897-451f-983e-d6f705e00878.png)





















