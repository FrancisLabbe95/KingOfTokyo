/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.25.0-4b1954c modeling language!*/

package model;

import java.util.*;

// line 4 "../../../../ump/tmp594826/model.ump"
// line 50 "../../../../ump/tmp594826/model.ump"
public class GameManager
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static GameManager theInstance = null;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GameManager Associations
  private List<Card> cards;
  private List<Player> players;
  private List<Dice> dices;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  private GameManager()
  {
    cards = new ArrayList<Card>();
    players = new ArrayList<Player>();
    dices = new ArrayList<Dice>();
  }

  public static GameManager getInstance()
  {
    if(theInstance == null)
    {
      theInstance = new GameManager();
    }
    return theInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

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

  public Player getPlayer(int index)
  {
    Player aPlayer = players.get(index);
    return aPlayer;
  }

  public List<Player> getPlayers()
  {
    List<Player> newPlayers = Collections.unmodifiableList(players);
    return newPlayers;
  }

  public int numberOfPlayers()
  {
    int number = players.size();
    return number;
  }

  public boolean hasPlayers()
  {
    boolean has = players.size() > 0;
    return has;
  }

  public int indexOfPlayer(Player aPlayer)
  {
    int index = players.indexOf(aPlayer);
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

  public static int minimumNumberOfPlayers()
  {
    return 0;
  }

  public boolean addPlayer(Player aPlayer)
  {
    boolean wasAdded = false;
    if (players.contains(aPlayer)) { return false; }
    players.add(aPlayer);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePlayer(Player aPlayer)
  {
    boolean wasRemoved = false;
    if (players.contains(aPlayer))
    {
      players.remove(aPlayer);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addPlayerAt(Player aPlayer, int index)
  {  
    boolean wasAdded = false;
    if(addPlayer(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePlayerAt(Player aPlayer, int index)
  {
    boolean wasAdded = false;
    if(players.contains(aPlayer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPlayers()) { index = numberOfPlayers() - 1; }
      players.remove(aPlayer);
      players.add(index, aPlayer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPlayerAt(aPlayer, index);
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
    players.clear();
    dices.clear();
  }

}