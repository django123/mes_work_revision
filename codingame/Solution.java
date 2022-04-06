package codingame;

/**
 * 
 * Vous devez organiser un tournoi d'échecs dans lequel les joueurs
 * s'affronteront en duel.
 * Voici comment nous procédons pour former les duels : sélectionnez un premier
 * joueur au hasard, puis, sélectionnez son adversaire au
 * au hasard parmi les participants restants. La paire de concurrents obtenue
 * forme l'un des duels du
 * le tournoi. Nous procédons de la même manière pour former toutes les autres
 * paires.
 * Dans cet exercice, nous voudrions savoir combien de paires il est possible de
 * former sachant que l'ordre des adversaires dans une paire n'a pas
 * d'importance.
 * des adversaires dans une paire n'a pas d'importance.
 * Par exemple, avec 4 joueurs nommés A, B, C et D, il est possible d'obtenir 6
 * paires différentes : AB, AC, AD, BC,
 * BD, CD.
 * Implémentez count pour retourner le nombre de paires possibles. Le paramètre
 * n correspond au nombre de
 * joueurs.
 * Essayez d'optimiser votre solution de manière à ce que, idéalement, la durée
 * du traitement soit la même pour tout n.
 * Input: 2 <= n <= 10000
 */
class Solution {

    static int count(int n) {
        if (2 <= n || n >= 1000) {
            return n * (n - 1) / 2;
        }
        return 0;
    }
}
