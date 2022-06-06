package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager 
{
   Object Gizmo;
   double price;
   double cost;
   boolean isE;
   String maker;
   private ArrayList<Gizmo> purchases;
   
public OnlinePurchaseManager(){
   Gizmo=null;
}
  public void add (String maker, boolean isE,double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
public double getPrice(){
   return cost;
}
   public Gizmo  getCheapestGizmoByMaker( String mkr )
   {
      // Gizmo a = null ;
      double price = 0.0;
      for(double x = 0; x< purchases.size();x++){
         if(price>getPrice()){
            price = cost;
         }
         else{
            price = cost;
         }
      }
      
   	return mkr;
   }
   public int countElectronicsByMaker(String mkr){
      int count = 0;
      for(int x = 0; x<purchases.size(); x++){
         if((x.getMaker().equals(mkr))&&(isElectronic())){
               count ++;
         }
        
      }
      return count;
   }
   public boolean hasAdjacentEqualPair(){
      for(Gizmo: purchases){
         if(purchases.get(0).equals(purchases.get(x))){
            return true;
         }
            else{
               return false;
               
            
         }
      }
      return isE;
      
   }
   
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
