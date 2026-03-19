package org.lessons.java.security;

import java.util.Scanner;

// - Salvare in opportune variabili il nome, cognome, 
//  colore preferito e data di nascita di un utente suddivisa 
//  in giorno, mese e anno in numero
// - Generare (e stampare a video) una password concatenando nome, 
// cognome, colore preferito e somma di giorno, mese e 
// anno di nascita, separate dal carattere -


public class PasswordGenerator {
     public static void main(String[] args) {
        String nome;
        String cognome;
        String colore;
        int giorno;
        int mese;
        int anno;
        String password;

        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserire Nome: ");
        nome = in.nextLine();

        System.out.println("Inserire Cognome: ");
        cognome = in.nextLine();

        System.out.println("Inserire Colore Preferito: ");
        colore = in.nextLine();

        System.out.println("Inserire Anno di Nascita: ");
        anno = in.nextInt();

        System.out.println("Inserire Mese di Nascita: ");
        mese = in.nextInt();

        System.out.println("Inserire Numero del Mese di Nascita: ");
        giorno = in.nextInt();

        password = nome + "-" + cognome + "-" + colore + (giorno + mese + anno);
        System.out.println("Ecco a lei la sua password -> " + password);
    }
}
