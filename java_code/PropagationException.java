package java_code;

public class PropagationException {

    public static void main(String[] args) {
       

        try {
            String chemin="/Un/chemin/vers/une/classe/qui/n'existe/pas";
            Class.forName(chemin);//levée d'une ClassNotFoundException
            System.out.println("fin du programme");

        } catch (Exception e) {
            System.out.println("Une exception levée");
        }
    }
    
}
