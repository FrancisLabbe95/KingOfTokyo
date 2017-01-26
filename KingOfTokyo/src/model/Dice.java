/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-4b1954c modeling language!*/

package model;

// line 29 "../../../../ump/tmp594826/model.ump"
// line 45 "../../../../ump/tmp594826/model.ump"
public class Dice
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Dice Attributes
  private enum roll{	  
  }
  private boolean reroll;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Dice(enum aRoll, boolean aReroll)
  {
    roll = aRoll;
    reroll = aReroll;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRoll(enum aRoll)
  {
    boolean wasSet = false;
    roll = aRoll;
    wasSet = true;
    return wasSet;
  }

  public boolean setReroll(boolean aReroll)
  {
    boolean wasSet = false;
    reroll = aReroll;
    wasSet = true;
    return wasSet;
  }

  public enum getRoll()
  {
    return roll;
  }

  public boolean getReroll()
  {
    return reroll;
  }

  public void delete()
  {}


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "reroll" + ":" + getReroll()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "roll" + "=" + (getRoll() != null ? !getRoll().equals(this)  ? getRoll().toString().replaceAll("  ","    ") : "this" : "null")
     + outputString;
  }
}