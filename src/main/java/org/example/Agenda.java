package org.example;

/**
 * Metodo Agenda
 * @author Anouar
 * @version 1.1
 * @since 08/03/2024
 * @see org.example.Contacto
 */

import java.util.*;

public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getPersona().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getPersona().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getPersona().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    public List<Contacto> getContacts() {
        return this.contacts;
    }
}