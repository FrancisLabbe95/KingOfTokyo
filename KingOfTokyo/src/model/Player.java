/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-4b1954c modeling language!*/

package model;

import java.util.*;

// line 18 "../../../../ump/tmp594826/model.ump"
// line 39 "../../../../ump/tmp594826/model.ump"
public class Player
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Attributes
  private String name;
  private int token;
  private int life;
  private boolean inTokyo;
  private boolean alive;
  private int numberRolls;

  //Player Associations
  private List<Card> cards;
  private List<Dice> dices;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aName, int aToken, int aLife, boolean aInTokyo, boolean aAlive, int aNumberRolls)
  {
    name = aName;
    token = aToken;
    life = aLife;
    inTokyo = aInTokyo;
    alive = aAlive;
    numberRolls = aNumberRolls;
    cards = new ArrayList<Card>();
    dices = new ArrayList<Dice>();
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

  public boolean setToken(int aToken)
  {
    boolean wasSet = false;
    token = aToken;
    wasSet = true;
    return wasSet;
  }

  public boolean setLife(int aLife)
  {
    boolean wasSet = false;
    life = aLife;
    wasSet = true;
    return wasSet;
  }

  public boolean setInTokyo(boolean aInTokyo)
  {
    boolean wasSet = false;
    inTokyo = aInTokyo;
    wasSet = true;
    return wasSet;
  }

  public boolean setAlive(boolean aAlive)
  {
    boolean wasSet = false;
    alive = aAlive;
    wasSet = true;
    return wasSet;
  }

  public boolean setNumberRolls(int aNumberRolls)
  {
    boolean wasSet = false;
    numberRolls = aNumberRolls;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getToken()
  {
    return token;
  }

  public int getLife()
  {
    return life;
  }

  public boolean getInTokyo()
  {
    return inTokyo;
  }

  public boolean getAlive()
  {
    return alive;
  }

  public int getNumberRolls()
  {
    return numberRolls;
  }

  public Card getCard(int index)
  {
    Card aCard = cards.get(index);
    return aCard;
  }

  public List<Card> getCards()
  {
    List<Card> newCards = Collections.unmodifiableList(cards);
    return newCards;
  }

  public int numberOfCards()
  {
    int number = cards.size();
    return number;
  }

  public boolean hasCards()
  {
    boolean has = cards.size() > 0;
    return has;
  }

  public int indexOfCard(Card aCard)
  {
    int index = cards.indexOf(aCard);
    return index;
  }

  public Dice getDice(int index)
  {
    Dice aDice = dices.get(index);
    return aDice;
  }

  public List<Dice> getDices()
  {
    List<Dice> newDices = Collections.unmodifiableList(dices);
    return newDices;
  }

  public int numberOfDices()
  {
    int number = dices.size();
    return number;
  }

  public boolean hasDices()
  {
    boolean has = dices.size() > 0;
    return has;
  }

  public int indexOfDice(Dice aDice)
  {
    int index = dices.indexOf(aDice);
    return index;
  }

  public static int minimumNumberOfCards()
  {
    return 0;
  }

  public boolean addCard(Card aCard)
  {
    boolean wasAdded = false;
    if (cards.contains(aCard)) { return false; }
    cards.add(aCard);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCard(Card aCard)
  {
    boolean wasRemoved = false;
    if (cards.contains(aCard))
    {
      cards.remove(aCard);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addCardAt(Card aCard, int index)
  {  
    boolean wasAdded = false;
    if(addCard(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCardAt(Card aCard, int index)
  {
    boolean wasAdded = false;
    if(cards.contains(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCardAt(aCard, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfDices()
  {
    return 0;
  }

  public boolean addDice(Dice aDice)
  {
    boolean wasAdded = false;
    if (dices.contains(aDice)) { return false; }
    dices.add(aDice);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDice(Dice aDice)
  {
    boolean wasRemoved = false;
    if (dices.contains(aDice))
    {
      dices.remove(aDice);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addDiceAt(Dice aDice, int index)
  {  
    boolean wasAdded = false;
    if(addDice(aDice))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDices()) { index = numberOfDices() - 1; }
      dices.remove(aDice);
      dices.add(index, aDice);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDiceAt(Dice aDice, int index)
  {
    boolean wasAdded = false;
    if(dices.contains(aDice))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDices()) { index = numberOfDices() - 1; }
      dices.remove(aDice);
      dices.add(index, aDice);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDiceAt(aDice, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    cards.clear();
    dices.clear();
  }


  public String toString()
  {
    String outputString = "";
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "token" + ":" + getToken()+ "," +
            "life" + ":" + getLife()+ "," +
            "inTokyo" + ":" + getInTokyo()+ "," +
            "alive" + ":" + getAlive()+ "," +
            "numberRolls" + ":" + getNumberRolls()+ "]"
     + outputString;
  }
}