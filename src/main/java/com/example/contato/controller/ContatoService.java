package com.example.contato.controller;

import com.example.contato.model.Contato;

public class ContatoService {

    public boolean salvarContato(Contato contato) {

        if (contato.getNome().isEmpty() || contato.getEmail().isEmpty()) {
            return false;
        }

        System.out.println("Contato salvo: " + contato.getNome());
        return true;
    }
}
