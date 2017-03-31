package alanProject02_interface;

public class vehicle implements vehicleSkill
{
   
   public int MPG = 1;
   public String vehicleType ;
   
   vehicle(){
  
           
   }

   public int getVehicleMPG(){
      return MPG;  
   }
   
   public void setVehicleMPG(int MPG){
      this.MPG = MPG;      
   }
   public void setVehicleType(String vehicleType){
      this.vehicleType = vehicleType;
   }

   public String getVehicleType(){
      return vehicleType;
   }
   
   @Override
   public void wheelie(double _MPGvalue)
   {
     double MPGvalue = _MPGvalue;
     MPGvalue = this.getVehicleMPG();
     if (MPGvalue == 20){
        vehicleType = "truck";
     }else if (MPGvalue ==50){
        
        vehicleType = "motorcycle";
     }else{
        
     }
      
   }

}
