package mehrab;

class CallMyWorld
{
 public static void main(String[] args)
 {
  System.out.println("This is a package.");
  MyWorld mw = new MyWorld(args[0]);
  System.out.println(mw.toString());
  mw.InAndOut();
 }
}


