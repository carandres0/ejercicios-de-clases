import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner teclado=new Scanner(System.in);
        int x = 0,par=0,impar=0;
        for (int i = 1; i <= 100; i++) { //el for permite conseguir de forma aleatoria los 100 numeros
            x = ale.nextInt((200 - 1) + 1) + 1;// se define el rango que van a tener los numeros 1-200
            System.out.println(x);
            if (x%2==0){ //permite separar los numero spares e impares para posteriormente sumarlos
                par=x+par;
            } else {
                impar=x+impar;
            }
        }
        System.out.println("la suma de todos los numeros aleaotrios cuando son pares es: "+par);
        System.out.println("la suma de todos los numeros aleaotrios caundo son impares es: "+impar);


        //apartir de este punto es un ejercicio difernte.
        int n1,n2,suma;
        System.out.println("digite 1er valor");
        n1=teclado.nextInt();
        System.out.println("digite 2do valor");
        n2=teclado.nextInt();
        suma=n1+n2;
        System.out.println("la suma es:"+suma);

        Random ale2=new Random();
        int R1,R2,Suma;
        R1=ale2.nextInt(51);
        System.out.println("el primer numero aleatorio es:"+R1);
        R2=ale2.nextInt((10-1)+1)+1;
        System.out.println("el segundo numero aleatorio es:"+R2);
        Suma=R1+R2;
        System.out.println("la suma de los numeros aleatorios es: "+Suma);
    }
}
