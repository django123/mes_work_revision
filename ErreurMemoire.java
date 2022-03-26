public class ErreurMemoire{
    public static void main(String[] args){

    
        try {
            String [] tableau = new String[1000000000];
        
            
        } catch (Error e) {
            System.out.println("OUPS!!!");        
        }
        System.out.println("fin du programme");
    }

    
}