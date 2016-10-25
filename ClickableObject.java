/** 
* The ClickableObject abstract class allows objects on screen 
* to be checked if they have been clicked, and then remvoed 
* from the screen. 
*
*@author Alex Addeo
*@version 1.0
*@since 2016-10-25
*/
public abstract class ClickableObject{


	//Checks to see if object has been clicked. 
	public boolean clicked;


	/**
	* This method is used to removed the clicked object
	* from the screen. Checks to see if an object has been
	* clicked, and if so, removes it.
	*
	*@param None used.
	*@return None.
	*/
	public abstract void removeFromScreen(){

		//removes the clicked object from the screen.
	}
}
