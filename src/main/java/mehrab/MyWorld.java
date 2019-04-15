package mehrab;

class MyWorld 
{

 public String output;
 public String world;

 public MyWorld(String output)
 {
  this.output = output;
 }

 public String toString()
 {
  return output;
 }

 public static void main(String args[])
 {
  MyWorld mw = new MyWorld(args[0]);
  mw.InAndOut();
 }

 public void InAndOut()
 {
  System.out.println("Input something please");
  world = System.console().readLine();
  System.out.println(output + " is my world!");
  System.out.println(world + " is your world!");
 }

}

