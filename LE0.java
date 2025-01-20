/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{    
    int speed;
    String name;
    
    public void set(int x,String s)
    {
         speed=x;
         name=s;    
       }
       
       
      public  void get()
      {
          System.out.println(speed);
          System.out.println(name);
      }
    
    
    
	public static void main(String[] args) {
	    
	    Main c=new Main();
	    c.set(80,"tiago");
	    c.get();
	}
}