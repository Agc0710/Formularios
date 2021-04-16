package com.agc.loginformscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity<n1> extends AppCompatActivity {
    //VARIABLES
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button bcoma;
    private Button bdividir;
    private Button bsumar;
    private Button brestar;
    private Button bmultiplicar;
    private Button bigual;
    private Button bporcentaje;
    private Button bAC;
    //VARIABLES PARA HACER LA OPERACION EN LOS METODOS
    private TextView resultado;
    private double n1=0.0;
    private double n2=0.0;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        resultado=findViewById(R.id.Resultado);
        bAC=findViewById(R.id.btnAC);
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("");
            }
        });

        //llamando ID DE LAS  VARIABLES
        btn1=findViewById(R.id.btnuno);
        btn1.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"1");});

        btn2=findViewById(R.id.btndos);
        btn2.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"2");});

        btn3=findViewById(R.id.btntres);
        btn3.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"3");});

        btn4=findViewById(R.id.btncuatro);
        btn4.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"4");});

        btn5=findViewById(R.id.btncinco);
        btn5.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"5");});

        btn6=findViewById(R.id.btnseis);
        btn6.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"6");});

        btn7=findViewById(R.id.btnsiete);
        btn7.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"7");});

        btn8=findViewById(R.id.btnocho);
        btn8.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"8");});

        btn9=findViewById(R.id.btnnueve);
        btn9.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"9");});

        btn0=findViewById(R.id.btncero);
        btn0.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"0");});

        bcoma=findViewById(R.id.btncoma);
        bcoma.setOnClickListener((v) ->{resultado.setText(resultado.getText()+",");});

        bdividir=findViewById(R.id.btndivision);
        bdividir.setOnClickListener((v) ->{operation= "÷";
            n1=Integer.parseInt(resultado.getText().toString());
            resultado.setText("");});

        bsumar=findViewById(R.id.btnsuma);
        bsumar.setOnClickListener((v) ->{
            operation= "+";
            n1=Integer.parseInt(resultado.getText().toString());
            resultado.setText("");});

        brestar=findViewById(R.id.btnresta);
        brestar.setOnClickListener((v) ->{
            operation= "-";
            n1=Integer.parseInt(resultado.getText().toString());
            resultado.setText("");

        });

        bmultiplicar=findViewById(R.id.btnmultiplicacion);
        bmultiplicar.setOnClickListener((v) ->{
            operation= "*";
            n1=Integer.parseInt(resultado.getText().toString());
            resultado.setText("");});

        bporcentaje=findViewById(R.id.btnporcentaje);
        bporcentaje.setOnClickListener((v) ->{resultado.setText(resultado.getText()+"%");});

        bigual=findViewById(R.id.btnigual);
        bigual.setOnClickListener((v) ->{
            n2= Integer.parseInt((resultado.getText().toString()));
            double op1;
            if (operation== "+"){
                op1= Suma((n1),(n2));
                resultado.setText(op1+"");
            }
            else if (operation== "-") {
                op1 = Resta((n1), (n2));
                resultado.setText(op1 + "");
            }
            else if(operation== "÷") {
                op1 = Division((n1), (n2));
                resultado.setText(op1 + "");
            }
            else if(operation== "*") {
                op1 = Multiplicacion((n1), (n2));
                resultado.setText(op1 + "");
            }

        });



    }
    public double Suma(double n1, double n2){
        Double e;
        e=  n1+n2;
        return e;
    }
    public double Resta(double n1, double n2){
        Double e;
        e=  n1-n2;
        return e;
    }
    public double Division(double n1, double n2){
        Double e;
        e=  n1/n2;
        return e;
    }
    public double Multiplicacion(double n1, double n2){
            Double e;
            e=  n1*n2;
            return e; }







}