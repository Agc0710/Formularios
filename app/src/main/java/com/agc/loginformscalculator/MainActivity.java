package com.agc.loginformscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //variables
    private Button buttonFace;
    private EditText txtUsernameFace;
    private EditText txtPasswordFace;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
        buttonFace.setOnClickListener(this);
        txtUsernameFace.setOnClickListener(this);
        txtPasswordFace.setOnClickListener(this);

    }
    //CARGAR TODOS LOS ELEMENTOS EN UN MISMO METODO DE CONTENIDO
    private void setContentView(){
        txtUsernameFace = findViewById(R.id.txtUsernameFacebook);
        txtPasswordFace = findViewById(R.id.txtPasswordFacebook);
        buttonFace = findViewById(R.id.btnloginFacebook);
    }

    @Override
    public void onClick(View v) {
        //SE VALIDA QUE VISTA TRAE PARA HACER LA OPERACIÓN DESEADA PARA DICHA VISTA
        if(v.getId() == R.id.btnloginFacebook){
            //LLAMADA A METODO DESEADO
            login();
        }
    }

    public void login(){
        //OBTENER VALOR DE CAJA DE TEXTO USUARIO
        String userText = txtUsernameFace.getText().toString();
        String passText = txtPasswordFace.getText().toString();


        if(userText.equals("Alexa") && passText.equals("1234")){
            Toast.makeText(this, "BIENVENIDO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Usuario y/o Contraseña Incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

}