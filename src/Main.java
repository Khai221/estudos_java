import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade = 21;
        var nome = "Júlio";
        byte idade2 = 22;
        boolean brasileiro = true;
        char letra = 'A'; // somente 1 letra
        double idade3 = 21;
        float salario = 1000.20F;

        // condicionais

        if(idade > 22){
            System.out.println("maior");
        } else if(idade == 21) {
            System.out.println("igual");
        } else {
            System.out.println("menor");
        }

        // vetores - arrays
        int[] idades = {2, 3, 4};
        idades[0] = 4;
        int[] idades2 = new int[10]; // ja pre-definindo o tamanho do array

        ArrayList<Integer> idades3 = new ArrayList<Integer>();
        idades3.add(30);
        idades3.remove(0);
        idades3.add(21);
        idades3.get(0);
        idades3.size();

        // loops
        for(var i = 0; i < idade; i++) {
            System.out.println("oi");
        }

        int i = 0;
        while(i < idade) {
           i++;
        }

        // casting
        int numero1 = 20;
        double numero2 = numero1;
        numero1 = (int) numero2;

        char letra1 = 'a';
        String letra2 = String.copyValueOf(letra1);
        letra1 = letra2.charAt(0);
    }
}