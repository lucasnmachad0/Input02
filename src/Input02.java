import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, //cogido que abre uma caixa de mensagens.
                "não precisa digitar nada aqui, é apenas uma mensagem.",
                "caixa de mensagem",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null, //codigo que abre uma caixa de mensagens para digitar algo.
                "isso é uma pergunta?",
                "caixa de dialogo",
                2,
                null,
                null,
                "digite aqui.");
        
        
        String[] acceptableValues = {"escolha 1", "escolha 2", "escolha 3"}; //codigo que abre uma caixa para selecionarmos uma opção.
        String input2 = (String)JOptionPane.showInputDialog(null,
                "isso é uma pergunta?",
                "caixa de dialogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
