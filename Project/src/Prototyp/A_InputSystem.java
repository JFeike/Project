package Prototyp;

public interface A_InputSystem 
{
  // return User Input Object
  public UserInput getUserInput();
  
  public EnemyInput getEnemyInput();
  
  // interpret UserInput and tell the User Object what to do
  public void      command(A_GameObject userObject, UserInput userInput);
  
  public void      enemycommand(A_GameObject enemyObject, EnemyInput enemyInput);
}