package com;

 abstract class Button
{
	public void display() {
		
	}
}


 

public class LoginForm {
	private LoginForm() {}
		public static Button createbutton(String ButtonType) {
			Button button = null;
			try {
				Class clazz = Class.forName(ButtonType);
				button=(Button)clazz.newInstance();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			return button;
		}



				
		

	public static void main(String[] args) {
		Button button=LoginForm.createbutton("com.CircleButton");
		button.display();
		       button=LoginForm.createbutton("com.RectangleButton");
		button.display();
	}
		
	}

