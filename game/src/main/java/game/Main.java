package game;

import service.BestScore;
import service.RandomNumberProvider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;
        int nbEssaies = 0;
        int reponse = -1;
        BestScore score = new BestScore();
        RandomNumberProvider rdm = new RandomNumberProvider(10);
        int chiffreRdm;
        Scanner sc = new Scanner(System.in);

        while (!stop) {
            chiffreRdm = rdm.getRdm();
            System.out.println("Choisissez un nombre entre 0 et 100.");
            do {
                System.out.print("Entrez votre nombre : ");
                reponse = sc.nextInt();
                if (reponse < chiffreRdm) System.out.println("PLUS");
                else System.out.println("MOINS");
                nbEssaies++;
            } while (chiffreRdm != reponse);
            score.update(nbEssaies);
            System.out.println("Vous avez trouvé en " + nbEssaies + " le nombre était " + reponse + " !");
            System.out.println(score.dispResult());
            System.out.println();
            nbEssaies = 0;
        }

    }
}
