import javax.swing.JOptionPane;
// pacote padrão: java.lang: importado automáticamente
public class SomaDoisNumeros {
    public static void main(String [] args){
    //declaração de variáveis

    double primeiroOperando;
    double segundoOperando;
    double resultado;

    // entrada
    primeiroOperando = Double.parseDouble (JOptionPane.showInputDialog ("Digite o primeiro operando"));
    
    segundoOperando = Double.parseDouble (JOptionPane.showInputDialog ("Digite o segundo operando"));
    // processamento
    resultado = primeiroOperando + segundoOperando;

    // saída
    JOptionPane.showMessageDialog(null, resultado);
    }
}