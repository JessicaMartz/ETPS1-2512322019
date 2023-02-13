package sv.edu.utec.controles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtValor,edtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor =findViewById(R.id.edtTabla);
        edtResultado = findViewById(R.id.edtMtabla);
    }
    public void Tabla(View view){
        int valtabla=Integer.parseInt(edtValor.getText().toString());
        int Resultados;
        String Resultado="";
        /*pa limpiar asignamos el setText*/
        edtResultado.setText(Resultado);
        for(int i=0;i<=10;i++){
            Resultados= valtabla*i;
            Resultado=String.valueOf(Resultados);
            /*generaregistros adicionando en caja de texto*/
            edtResultado.append(valtabla+"X"+i+"="+Resultado+"\n");
        }

    }
}