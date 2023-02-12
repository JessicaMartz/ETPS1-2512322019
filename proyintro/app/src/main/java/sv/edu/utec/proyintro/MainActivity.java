package sv.edu.utec.proyintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etval1,etval2;
Button btCalculo;
TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*asignacion de variables*/
        etval1=findViewById(R.id.edtValor1);
        etval2=findViewById(R.id.edtValor2);
        Resultado=findViewById(R.id.txvResultado);

    }
    //void sin retorno
    //int,string,double etc con retorno
    public void suma(View view){
        double dato1,dato2,resultado;

        dato1=Double.parseDouble(etval1.getText().toString());
        dato2=Double.parseDouble(etval2.getText().toString());
        resultado=dato1+dato2;
        Resultado.setText("El resultado es:"+String.valueOf(resultado));
    }
}