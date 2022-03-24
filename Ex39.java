import javax.swing.JOptionPane;
//veja um exemplo de import static
import static java.lang.Integer.parseInt;
public class Ex39 {
    public static void main(String[] args) {
        int n;
        do{
            //Agora usamos sem qualificar com Integer
            n = parseInt(JOptionPane.showInputDialog("Qual o valor de n? Digite um valor positivo"));
        }while (n <= 0);

        int cont = 1;
        while (cont <= n){
            int b, h;
            do{
                b = parseInt (JOptionPane.showInputDialog("Digite um valor de base positivo"));
            }while (b <= 0);
            do{
                h = parseInt(JOptionPane.showInputDialog("Digite um valor de altura positivo"));
            }while (h <= 0);
            JOptionPane.showMessageDialog(null, 
                String.format(
                    "Área: %dm x %dm = %dm\u00B2\n",
                    b,
                    h,
                    b * h
                )
            );
            cont++;
        }

    }   
}
