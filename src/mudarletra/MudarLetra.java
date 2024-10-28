/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mudarletra;

/**
 *
 * @author Noa
 */
public class MudarLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // escrever uma palavra, e fazer programa alterar alguma das letras da palavra
        
        
        String palavra = Entrada.leiaString("Informe uma palavra: ");
        char letraSubstituir = Entrada.leiaChar("escolha qual letra deseja alterar: ");
        char letraNova = Entrada.leiaChar("escolha nova letra para substituir letra alterada: ");
        
        
        System.out.println("Palavra velha: " + palavra + "\nNova palavra: " + palavra.replace(letraSubstituir, letraNova));
        
        
        
    }
    
}
