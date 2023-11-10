package edu.dierison.anatomiadasclasses;
public class MinhaClasse {
    
    public static void main (String [] args) {
        String firstName = "Dierison";
        String lastName = "de Sousa";

        String fullName = fullName (firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName (String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
