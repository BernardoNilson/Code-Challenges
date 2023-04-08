/**
 * Problema: Elaborar um sistema em Java que forneça parametros de saúde, 
 * como o Índice de Massa Corporal, a Taxa Metabólica Basal, o Índice de Gordura Corporal,
 * o Peso Ideal e o Nível de Atividade física recomendada, apenas com informações básicas.
 * Sinta-se a vontade para deixar alguma dica ou incremendar o programa
 * 
 * @author: Bernardo Nilson
 * @version: 06.04.2023
 * 
 */

 import java.util.*;

 public class SistemaSaude {

   public static void main (String [] args){
      
      String nome, sexo;
      double altura, idade, peso;

      Scanner in = new Scanner(System.in);

      //Aqui, vamos apresentar o programa e receber as informações iniciais.
      System.out.println("\nOpa, tudo bem? Espero que sim! Este programa tem a finalidade de fornecer estimativas e parâmetros de saúde com base em informações básicas.\n");
      System.out.println("Importante: as informações fornecidas não precisas, apenas estimativas!\n");

      System.out.println("Insira o seu nome: ");
      nome = in.next();

      System.out.println("Insira o seu sexo (FEM/MASC): ");
      sexo = in.next();

      System.out.println("Insira o seu peso (kg): ");
      peso = in.nextDouble();

      System.out.println("Insira a sua altura (em cm): ");
      altura = in.nextDouble();

      System.out.println("Insira a sua idade: ");
      idade = in.nextDouble();

      in.close();
      
      //Agora que recebemos todas as informações, vamos calcular o IMC:
      double imc = calcularImc(peso, altura);

      //Calculo da TMB:
      double tmb = calcularTmb(peso, altura, idade, sexo);

      //Cálculo do IGC:
      double igc = calcularIgc(imc, idade, sexo);

      //Cálculo do Peso Ideal.
      double pesoIdeal = calcularPesoIdeal(altura, sexo);

      //Por último, mas não menos importante, o Nível de Atividade recomendada.
      String nivelAtividade = calcularNivelAtividade(idade);

      //Exibo tudo ao usuário:
      System.out.println(nome + ", aqui vão os seus resultados: ");
      System.out.printf("Índice de Massa Corporal (IMC) calculado foi %.2f kg/m² %n ", imc);
      System.out.printf("Taxa Metabólica Basal (TMB) calculada foi %.2f kcal %n ", tmb);
      System.out.printf("Índice de Gordural Corporal (IGC) calculado foi %.2f %% %n ", igc);
      System.out.printf("Peso Ideal calculado foi %.2f kg %n ", pesoIdeal);
      System.out.println("Nível de atividade recomendada: " + nivelAtividade);
      System.out.println("Lembre-se, são apenas dados primitivos. Obrigado!");

   }

   public static double calcularImc(double peso, double altura){
      return peso / ((altura*0.01)*(altura*0.01));
   }

   public static double calcularTmb(double peso, double altura, double idade, String sexo){
      double tmb = 0;
      if ("MASC".equals(sexo)){
         tmb = 10*peso + 6.25*altura - 5*idade + 5;
      } else {
         if("FEM".equals(sexo)){
            tmb = 10*peso + 6.25*altura - 5*idade - 161;
         } else {
            System.out.println("Sexo inválido, não foi possível calcular TMB...");
         }
      }
      return tmb;
   }
   
   public static double calcularIgc(double imc, double idade, String sexo){
      double igc = 0;
      if ("MASC".equals(sexo)){
         igc = 1.2*imc + 0.23*idade - 16.2;
      } else {
         if("FEM".equals(sexo)){
            igc = 1.2*imc + 0.23*idade - 5.4;
         } else {
            System.out.println("Sexo inválido, não foi possível calcular IGC...");
         }
      }
      return igc;
   }

   public static double calcularPesoIdeal(double altura, String sexo){
      double pesoIdeal = 0;
      if ("MASC".equals(sexo)){
         pesoIdeal = 50 + 0.91*(altura - 152.4);
      } else {
         if("FEM".equals(sexo)){
            pesoIdeal = 45.5 + 0.91*(altura - 152.4);
         } else {
            System.out.println("Sexo inválido, não foi possível calcular o Peso Ideal...");
         }
      }
      return pesoIdeal;
   }

   public static String calcularNivelAtividade(double idade){
      String nivelAtividade = "";

      if (idade > 64){
         nivelAtividade = "É recomendado pelo menos 150 minutos de atividade física moderada por semana";
      } else {
         if (idade >= 18){
            nivelAtividade = "É recomendado pelo menos 150 a 300 minutos de atividade física moderada a intensa por semana";
         } else {
            nivelAtividade = "É recomendado cerca de 60 minutos por dia de atividade física moderada";
         }
      }

      return nivelAtividade;
   }
}

