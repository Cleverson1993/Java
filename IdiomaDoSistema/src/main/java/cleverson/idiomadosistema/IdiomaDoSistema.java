/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cleverson.idiomadosistema;

import java.util.Locale;

/**
 *
 * @author cleve
 */
public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma do sistema:" + idioma.getDisplayLanguage());
        System.out.println("Código do idioma:" + idioma.getLanguage());
        
    }
}
