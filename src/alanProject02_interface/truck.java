package alanProject02_interface;

public class truck extends vehicle implements vehicleSkill
{
   public double mpgTruck= 10;
   
   truck(){
      this.setVehicleMPG(20);
      mpgTruck = this.getVehicleMPG();
      System.out.println("I am a truck!!!!");
      
   }

   public void wheelie(double _MPGvalue)
   {
      //print something different
      System.out.println("miles per gallon for the truck is : " + mpgTruck);
      
      
   }

}
