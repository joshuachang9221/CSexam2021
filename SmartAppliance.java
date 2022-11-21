public class SmartAppliance{
    private boolean status=false,print;
    private String ID;
    private int people;

    public SmartAppliance(String ID,int people){
        this.ID=ID;
        this.people=people;
        
    }
    public void action(int totalNumberOfPeople){
        if(totalNumberOfPeople>people){
            if(status==true){
                print=false;
            }else{
                print=true;
                status=true;
            }           
        }else{
            if(status==false){
                print=false;
            }else{
                print=true;
                status=false;
            }
            
        }
        if(print==true){
            System.out.println("家電資訊更新");
            System.out.println("id:"+ID+"狀態:"+status);
        }
        
    }

}