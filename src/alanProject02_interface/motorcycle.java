package alanProject02_interface;



public class motorcycle extends vehicle implements vehicleSkill {
   
   
 motorcycle(){
    this.setVehicleMPG(50);
    System.out.println("I am a motorcycle");
 }
 
 

@Override
public void wheelie(double _MPGvalue)
{
   //print something random that alan said
   System.out.println("WEEEEE!!!!!!");   
}


}
