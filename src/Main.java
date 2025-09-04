//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int opc,op1,op2,op3,op4;


        int votja = 0;
        int votAn = 0;
        int votMa = 0;
        int votBl = 0;
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;
        int suma6 = 0;
        int suma7 = 0;
        int suma8 = 0;
        int suma9 = 0;

        Scanner in  = new Scanner(System.in);
        do {


                System.out.println("VOTAR POR UN CANDIDATO  ");
                System.out.println("LOS CANDIDATOS SON");
                System.out.println("1:Andres");
                System.out.println("2:Javier");
                System.out.println("3:Maria");
                System.out.println("4:Blanco ");
                System.out.println("5 FINALIZAR ");

                opc = in.nextInt();

                switch (opc) {
                    case 1:
                        votAn++;
                        System.out.println("¿porque medio te enteraste?");
                        System.out.println("1:internet");
                        System.out.println("2:radio");
                        System.out.println("3:television");
                        op1 = in.nextInt();
                        if (op1 == 1) {
                            suma1++;
                        } else if (op1 == 2) {
                            suma2++;


                        } else if (op1 == 3) {
                            suma3++;

                        }
                        break;

                    case 2:
                        votja++;
                        System.out.println("¿porque medio te enteraste?");
                        System.out.println("1:internet");
                        System.out.println("2:radio");
                        System.out.println("3:television");
                        op2 = in.nextInt();
                        if (op2 == 1) {
                            suma4++;

                        } else if (op2 == 2) {
                            suma5++;
                        } else if (op2 == 3) {
                            suma6++;
                        }

                        break;

                    case 3:

                        votMa++;
                        System.out.println("¿porque medio te enteraste?");
                        System.out.println("1:internet");
                        System.out.println("2:radio");
                        System.out.println("3:television");
                        op3 = in.nextInt();
                        if (op3 == 1) {
                            suma7++;

                        } else if (op3 == 2) {
                            suma8++;

                        } else if (op3 == 3) {
                            suma9++;

                        }

                        break;

                    case 4:

                        votBl++;

                        System.out.println("resultado" + votBl);
                        break;

                    case 5:
                        System.out.println("Votación finalizada.");
                        System.out.println("Resultado es :");
                        System.out.println("Andres tuvo: " + votAn + " votos");
                        System.out.println("valor internet andres :" + suma1 + "suman: "+(suma1*700000));
                        System.out.println("valor radio andres :" + (suma2*6000000));
                        System.out.println("valor television andres :" + (suma3*200000));
                        System.out.println("Javier tuvo : " + votja + " votos");
                        System.out.println("valor internet JAVIER :" + suma4 + "suman: "+(suma4*700000));
                        System.out.println("valor radio JAVIER :" + (suma5*6000000));
                        System.out.println("valor television JAVIER :" + (suma6*200000));
                        System.out.println("Maria tuvo: " + votMa + " votos");
                        System.out.println("valor internet MARIA :" + suma7 + "suman: "+(suma7*700000));
                        System.out.println("valor radio MARIA :" + (suma8*6000000));
                        System.out.println("valor television MARIA :" + (suma9*200000));
                        System.out.println("Voto en blanco: " + votBl + " votos");
                        System.out.println("valor internet MARIA :" +  votBl + "suman: "+(suma7));
                        System.exit(0);
                        break;

                    default:
                        System.out.println("opcion incorrecta");

                }
        }while (opc != 5);



    }
}

