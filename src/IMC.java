import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        String sexo;
        Double altura;
        Double peso;
        Double IMC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor decime tu altura :");
        altura = scanner.nextDouble();
        System.out.println("Por favor decime tu peso :");
        peso = scanner.nextDouble();
        System.out.println("Por favor decime tu sexo :");
        sexo = scanner.next();
        IMC = peso/(altura*altura);

        if(IMC<16.00){
            System.out.println("Infrapeso: Delgadez Severa");
        }else if(IMC<=16.00 || IMC<=16.99){
            System.out.println("Infrapeso: Delgadez moderada");
        }else if(IMC<=17.00 ||IMC<=18.49){
            System.out.println("Infrapeso: Delgadez aceptable");
        }else if(IMC<=18.50 || IMC<=24.99){
            System.out.println("Peso Normal");
        }else if(IMC<=25.00 || IMC<=29.99){
            System.out.println("Sobrepeso");
        }else if(IMC<=30.00 || IMC<=34.99){
            System.out.println("Obeso: Tipo I");
        }else if(IMC<=35.00 || IMC<=40.00){
            System.out.println("Obeso: Tipo III");
        }else{
            System.out.println("no existe clasificacion");
        }


        //System.out.println(IMC);


    }
}
