package pkg;

public class Gizmo
{ 
   String maker;
   boolean isE;
   double cost;
   Object Gizmo;
   
   
   public Gizmo(){
     maker = " ";
     isE = true;
     Gizmo = null;
   }
   public Gizmo(String maker,boolean isE){
      this.maker = maker;
      this.isE = isE;
   }
   public Gizmo(String maker, boolean isE,double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   public double getPrice(){
      return cost;
   }
   public String getMaker(){
      return maker;
   }
   public boolean isElectronic(){
      // if(isE){
      //    return true;
         
      // }
      // else{
      //    return false;
      // }
     return isE;
   }
   public boolean equals(Object other){
   if(!(other instanceof Gizmo)){
      return false;
   }   
   else{
      return this.maker.equals( ((Gizmo )other).getMaker());
      //return true;
   }
   }
   
   public String toString()                     
   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
