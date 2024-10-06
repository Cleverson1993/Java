/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cleverson.resolucaodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author cleve
 */
public class ResolucaoDoSistema {

    public static void main(String[] args) {
        //obtem a resolução da tela
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        
        //Exibe a resolução da tela
        System.out.println("Resolução da Tela:" + resolucao.width + "x" + resolucao.height);
    }
}
