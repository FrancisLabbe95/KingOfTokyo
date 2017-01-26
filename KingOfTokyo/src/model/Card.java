/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-4b1954c modeling language!*/

package model;

// line 11 "../../../../ump/tmp594826/model.ump"
// line 34 "../../../../ump/tmp594826/model.ump"
public class Card
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Card Attributes
  private String name;
  private int cost;
  private boolean type;
  private String ability;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Card(String aName, int aCost, boolean aType, String aAbility)
  {
    name = aName;
    cost = aCost;
    type = aType;
    ability = aAbility;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setCost(int aCost)
  {
    boolean wasSet = false;
    cost = aCost;
    wasSet = true;
    return wasSet;
  }

  public boolean setType(boolean aType)
  {
    boolean wasSet = false;
    type = aType;
    wasSet = true;
    return wasSet;
  }

  public boolean setAbility(String aAbility)
  {
    boolean wasSet = false;
    ability = aAbility;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getCost()
  {
    return cost;
  }

  public boolean getType()
  {
    return type;
  }

  public String getAbility()
  {
    return ability;
  }

  public void delete()
  {}


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "cost" + ":" + getCost()+ "," +
            "type" + ":" + getType()+ "," +
            "ability" + ":" + getAbility()+ "]"
     + outputString;
  }
}