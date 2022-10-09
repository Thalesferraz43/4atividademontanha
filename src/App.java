import java.util.Scanner;
import javax.print.attribute.standard.Media;
public class App {
 public static void main(String []args){
 double nota1,nota2,nota3,nota4;
 Scanner sc = new Scanner (System.in); 
 System.out.print("digite a primeira nota:");
 nota1 = sc.nextDouble();
 System.out.print("digite a segunda nota:");
 nota2 = sc.nextDouble();
 System.out.print("digite a terceira nota:");
 nota3 = sc.nextDouble();
 System.out.print("digite a quarta nota:");
 nota4 = sc.nextDouble();
 double media = (nota1+nota2+nota3+nota4)/4;
System.out.printf("A média anual é: %.2f",media);
  }
 }
