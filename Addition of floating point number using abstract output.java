abstract class abstractadd
{
  abstract void add();
}
public class addusingabstract extends abstractadd
{
  public void add()
  {
     float a = 11.7977f;
     float b = 3.4531f;
     System.out.println(a+b);
  }
  public static void main(String args[])
  {
    addusingabstract 0 = new addusingabstract();
    0.add();
  }
}  
