package com.example.contato.view;

import com.example.contato.controller.ContatoService;
import com.example.contato.model.Contato;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FormularioContatoController {

    @FXML private TextField txtNome;
    @FXML private TextField txtSobrenome;
    @FXML private TextField txtEmail;
    @FXML private TextField txtTelefone;
    @FXML private TextField txtAssunto;
    @FXML private TextArea txtMensagem;
    @FXML private Label lblStatus;

    private ContatoService contatoService = new ContatoService();

    @FXML
    private void onEnviarClick() {
        Contato contato = new Contato(
                txtNome.getText(),
                txtSobrenome.getText(),
                txtEmail.getText(),
                txtTelefone.getText(),
                txtAssunto.getText(),
                txtMensagem.getText()
        );

        if (contatoService.salvarContato(contato)) {
            lblStatus.setText("Contato salvo com sucesso!");
            limparCampos();
        } else {
            lblStatus.setText("Erro: Verifique os dados do formulário.");
        }
    }

    private void limparCampos() {
        txtNome.clear();
        txtSobrenome.clear();
        txtEmail.clear();
        txtTelefone.clear();
        txtAssunto.clear();
        txtMensagem.clear();
    }
}
