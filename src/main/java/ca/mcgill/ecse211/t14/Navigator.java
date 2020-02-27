/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse211.t14;
import java.lang.Runnable;

/**
 * Main brain of the system. Contains a state machine and executes specific robot movements based on said states, which is basically the entire robot's visible behaviour
 * since moving is pretty much all it can do.
 * @author Edwin Pan
 *
 */
public class Navigator implements Runnable
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum MissionStatus { AwaitingMapParametres, LocalizingInitially, FindingAndCrossingBridge, LocatingVehicle, AttachingToVehicle, FindingAndCrossingBridgeAgain, NavigatingToFinalPosition }

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Navigator Attributes
  private MissionStatus missionStatus;

  //Navigator Associations
  private Map redMap;
  private Map greenMap;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Navigator(MissionStatus aMissionStatus, Map aRedMap, Map aGreenMap)
  {
    super();
    missionStatus = aMissionStatus;
    redMap = aRedMap;
    greenMap = aGreenMap;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setMissionStatus(MissionStatus aMissionStatus)
  {
    boolean wasSet = false;
    missionStatus = aMissionStatus;
    wasSet = true;
    return wasSet;
  }

  public MissionStatus getMissionStatus()
  {
    return missionStatus;
  }


  @Override
  public void run() {
    // TODO Auto-generated method stub
    
  }
}