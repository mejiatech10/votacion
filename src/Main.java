//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int opc,op1,op2,op3;



        Scanner in  = new Scanner(System.in);
        System.out.println("votar por un candidato ");
        System.out.println("1:andres");
        System.out.println("2:javier");
        System.out.println("3:maria");
        System.out.println("4:blanco ");
        System.out.println("5 FINALIZAR ");

        opc = in.nextInt();

        switch (opc)
        {
            case 1:
                int sum = 0;
                int sum1 ;
                int num;
                int sumIn=0;
                int votAn = 0;
                votAn++;

                System.out.println("¿porque medio te enteraste?");
                System.out.println("1:internet");
                System.out.println("2:radio");
                System.out.println("3:television");
                op1= in.nextInt();
                if(op1 == 1)
                {

                    sum1 = votAn * 700000;
                    System.out.println("resultado:"+sum1);



                } else if (op1 == 2)
                {


                    sum1 = votAn * 200000;
                    System.out.println("resultado:"+sum1);


                } else if (op1 == 3)
                {

                    sum1 = votAn * 600000;
                    System.out.println("resultado:"+sum1);


                }
                break;



            case 2:

                int sum = 0;
                int sum2;
                int votja = 0;
                votja++;
                op2= in.nextInt();

                System.out.println("¿porque medio te enteraste?");
                System.out.println("1:internet");
                System.out.println("2:radio");
                System.out.println("3:television");
                if(op2 == 1)
                {


                    sum2 = votja * 700000;
                    System.out.println("resultado"+ sum2);


                } else if (op2 == 2)
                {


                    sum2 = votja * 200000;
                    System.out.println("resultado"+ sum2);


                } else if (op2 == 3)
                {


                    sum2 = votja * 600000;
                    System.out.println("resultado"+ sum2);


                }


                break;

            case 3 :

                int sum = 0;
                int sum3;
                int votma = 0;
                votma++;
                op3= in.nextInt();

                System.out.println("¿porque medio te enteraste?");
                System.out.println("1:internet");
                System.out.println("2:radio");
                System.out.println("3:television");
                if(op3 == 1)
                {


                    sum3 = votma * 700000;
                    System.out.println("resultado"+ sum3);


                } else if (op3 == 2)
                {


                    sum3 = votma * 200000;
                    System.out.println("resultado"+ sum3);


                } else if (op3 == 3)
                {


                    sum3 = votma * 600000;
                    System.out.println("resultado"+ sum3);


                }


                break;

            case 4 :
                int sum = 0;
                int sum1 ;
                int votbl=0;
                votbl++;
                int num = sc.nextInt();


                sum1 = sum * 600000;
                System.out.println("resultado"+sum1);





                break;

            case 5 :
                System.exit(0);
            default:
                System.out.println("opcion incorrecta");
        }



    }
}
}
