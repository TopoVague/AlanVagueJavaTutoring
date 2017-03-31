package alanProject02_interface;

import java.util.ArrayList;

public class Tester
{
   
  double mpg;

  
  


   public static void main(String[] args)
   {
      truck mitsos=new truck();
      motorcycle dolly = new motorcycle();
      

      
      ArrayList <vehicle> allVehicles= new ArrayList<vehicle>();

      for (int i=0; i< 10; i++){
         allVehicles.add(dolly);
         
      }

      allVehicles.add(mitsos);
      
      
      // go through all objects in vehicles
      //test what type of vehicle
      //call wheelie which is 
      for (vehicle v: allVehicles){
         int value =v.getVehicleMPG() ;
         if (value == 20){
            //it is a truck
            v.wheelie(value);          
         }else if(value == 50){
            //it is a motorcycle
            v.wheelie(value);     
         }else{
            //i do not know what type of vehicle it is
            value =0;
            System.out.println("i do not know what type of vehicle it is");
            v.wheelie(value);     
         }

         }
      

         
         
      }

   }
   
   
   

