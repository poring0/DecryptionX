/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AS
 */
public class Cipher {

    private String cipherText;

    public Cipher() {
        cipherText = "";
    }
    
    /*Caesar cipher method*/
    public String CaesarCipher(int shift, String plainText) {
        int convertForm = 0;
        for (int i = 0; i < plainText.length(); i++) {
            convertForm = ((plainText.charAt(i) + 256) - shift) % 256;
            cipherText = cipherText + (char) (convertForm);
        }
        return cipherText;
    }

    /*Vigenere cipher method*/
    public String VigenereCipher(String keyText, String plainText) {
        int convertForm = 0;
        for (int i = 0; i < plainText.length() && i < keyText.length(); i++) {
            convertForm = ((plainText.charAt(i) + 256) - keyText.charAt(i)) % 256;
            cipherText = cipherText + (char) (convertForm);
        }
        return cipherText;
    }
}
