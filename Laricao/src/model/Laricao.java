package model;

import javax.swing.JFrame;
import view.ViewEstabelecimento;
import view.janelaEdicao;

/**
 *
 * @author 182220040
 */
public class Laricao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame i = new ViewEstabelecimento();
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        i.setVisible(true);
        i.setSize(650, 750);    
        
        
    }
    
}
