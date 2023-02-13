package sv.edu.utec.controleslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spPais;
    EditText etNombres,etApellidos,etInfo;
    RadioButton rbFem,rbMas,rbOtr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombres=findViewById(R.id.edtNombres);
        etNombres=findViewById(R.id.edtApellidos);
        etInfo=findViewById(R.id.editTextTextMultiLine);
        spPais=findViewById(R.id.spnPais);

        String[]opciones={"Seleccione un pais","Guatemala","El Salvador","Honduras","Nicaragua","Costa Rica","Panama"};
        ArrayAdapter<String> adaptador=new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,opciones);
        spPais.setAdapter(adaptador);
    }

    public void Almacenar(View view){
        String datos="";
        String seleccion=spPais.getSelectedItem().toString();
        if (seleccion.equals("Seleccione un pais")){
            datos="No selecciono ningun pais";
        }else if (seleccion.equals("Guatemala")){
            datos="Guatemala";
        }else if (seleccion.equals("El Salvador")){
        datos="El Salvador";
        }else if (seleccion.equals("Honduras")){
        datos="Honduras";
        }else if (seleccion.equals("Nicaragua")){
            datos="Nicaragua";
        }else if (seleccion.equals("Costa Rica")){
            datos="Costa Rica";
        }else if (seleccion.equals("Panama")){
            datos="Panama";
        }
        etInfo.append(datos);
        }
}