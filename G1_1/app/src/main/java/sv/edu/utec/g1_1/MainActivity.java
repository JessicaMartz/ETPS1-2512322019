package sv.edu.utec.g1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNombres;
    Button btnIngreso;
    TextView etinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombres=findViewById(R.id.txtNombre);
        etinfo=findViewById(R.id.etInfor);
    }
    public void Nom(View view){
        String nomb;
        nomb=txtNombres.getText().toString();
        etinfo.setText("Bienvenido"+" "+ nomb);
    }
}

