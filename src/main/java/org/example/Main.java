package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        initAgenda();
    }

    private static void initAgenda() {
        Agenda aggenda = new Agenda();

        // Añadir contactos a la agenda.
        aggenda.addContact("John Doe", "1234567890");
        aggenda.addContact("Jane Doe", "9876543210");
        aggenda.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : aggenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        aggenda.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        aggenda.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        aggenda.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : aggenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}