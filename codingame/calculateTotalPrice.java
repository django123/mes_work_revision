package codingame;

import java.util.Arrays;

public class calculateTotalPrice {

        /**
     * C'est bientôt les soldes d'été !
     * Vous travaillez pour un magasin qui souhaite offrir une réduction de
     * discount% sur le produit le plus
     * cher acheté par un client donné pendant la période des soldes.Un seul produit
     * peut bénéficier de la
     * réduction.
     * Le responsable du magasin vous demande de développer la méthode
     * calculateTotalPrice .
     * Cette méthode :
     * prend en paramètres la liste de prix des produits achetés par le client et le
     * pourcentage de réduction
     * discount . retourne le prix de vente total (arrondi à l'entier inférieur si
     * le total ne tombe pas rond).
     * Contraintes:
     * 0 ≤ discount ≤ 100 0 < prix d'un produit < 100000 0 < nombre de produits <100
     * 
     * @param prices
     * @param discount
     * @return
     */

    public static int calculateTotalPrice(int[] prices, int discount) {

        int total1 = 0;
        int len = prices.length;
        Arrays.sort(prices);
        for (int i = 0; i < len - 1; i++) {
            total1 = total1 + prices[i];
        }
        return (int) Math.floor(total1 + (((float) prices[len - 1]) - (prices[len - 1]) * discount / 100f));
    }
    
}
