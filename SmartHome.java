import java.util.*;
public class SmartHome{
    private ArrayList<SmartAppliance> appliances = new ArrayList<>();
    private int totalNumberOfPeople=0;
    public void addSmartAppliances(SmartAppliance appliance){
        appliances.add(appliance);
    }

    public void enter(int numberOfPeople){
        totalNumberOfPeople+=numberOfPeople;
        for(int i=0;i<appliances.size();i++){
            appliances.get(i).action(totalNumberOfPeople);          
        }
    }
    public void leave(int numberOfPeople){
        if(totalNumberOfPeople>=numberOfPeople){
            totalNumberOfPeople-=numberOfPeople;
            for(int i=0;i<appliances.size();i++){
                appliances.get(i).action(totalNumberOfPeople);
            }   
        }else{
            System.out.println("Error! \nreason: totalNumberOfPeople<numberOfPeople");
        }
             
    }
    
}