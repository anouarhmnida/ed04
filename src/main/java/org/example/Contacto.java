package org.example;

/**
 * Metodo Contacto
 * @author Anouar
 * @version 1.0
 * @since 08/03/2024
 * @see org.example.Agenda
 */

import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String Persona;
    private List<String> phones;

    public Contacto(String Persona, String phone) {
        this.setPersona(Persona);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    public String getPersona() {
        return this.Persona;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPersona(String persona) {
        this.Persona = persona;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}