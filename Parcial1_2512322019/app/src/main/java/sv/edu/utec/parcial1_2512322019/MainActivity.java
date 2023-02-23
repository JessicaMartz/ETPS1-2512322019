package sv.edu.utec.parcial1_2512322019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnLoging);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( user.getText().toString().equals("parcialETps1") && pass.getText().toString().equals("p4rC14#tp$")){
                    //Intent intent = new Intent(MainActivity.this, Principal.class);
                    //startActivity(intent);
                    startActivity(new Intent(MainActivity.this, IMC.class));
                    Toast.makeText(MainActivity.this, "BIENVENIDO!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}