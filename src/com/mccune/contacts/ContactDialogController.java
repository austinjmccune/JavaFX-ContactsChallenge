package com.mccune.contacts;
import com.mccune.contacts.datamodel.*;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ContactDialogController {
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField notesField;


    public Contact processResults(){
        String firstName = firstNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String phoneNumber = phoneNumberField.getText().trim();
        String notes = notesField.getText().trim();
        Contact newContact = new Contact(firstName,lastName,phoneNumber,notes);
        return newContact;

    }


}
