//********************************************************************
//  ParameterModifier.java       Author: Lewis/Loftus
//
//  Demonstrates the effects of changing parameter values.
//********************************************************************

public class ParameterModifier
{
//-----------------------------------------------------------------
//  Modifies the parameters, printing their values before and
//  after making the changes.
//-----------------------------------------------------------------
   public void changeValues(int f1, Num f2, Num f3)
   {
      System.out.println("Before changing the values:");
      System.out.println("f1\tf2\tf3");
      System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
   
      f1 = 99;
      f2.setValue(88);
      f3 = new Num(77);
   
      System.out.println("After changing the values:");
      System.out.println("f1\tf2\tf3");
      System.out.println(f1 + "\t" + f2 + "\t" + f3 + "\n");
   }
}
