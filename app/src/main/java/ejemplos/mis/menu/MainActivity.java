package ejemplos.mis.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter recyclerAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Mascota> datos = new ArrayList<Mascota>();



        datos.add(new Mascota("Toro",R.drawable.perro1,0xFF00FF00));
        datos.add(new Mascota("Darth Vader",R.drawable.perro2,0xFF10D94C));
        datos.add(new Mascota("Chewyr",R.drawable.perro12,0xFF45694C));
        datos.add(new Mascota("Akita",R.drawable.perro3,0xFF426989));
        datos.add(new Mascota("Goliat",R.drawable.perro4,0xFF7a355b));
        datos.add(new Mascota("Goku",R.drawable.perro5,0xFFd1c1fc));
        datos.add(new Mascota("Yeika",R.drawable.perro6,0xFFa8285c));
        datos.add(new Mascota("Akita",R.drawable.perro7,0xFF962489));
        datos.add(new Mascota("Florcita",R.drawable.perro8,0xFF37a55b));
        datos.add(new Mascota("Colita",R.drawable.perro9,0xFFd1f2cc));
        datos.add(new Mascota("Mancha",R.drawable.perro10,0xFF81285c));


        reciclador = (RecyclerView)findViewById(R.id.RecyclerView_reciclador);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        reciclador.setLayoutManager(layoutManager);

        recyclerAdaptador = new MascotaAdaptador(datos);
        reciclador.setAdapter(recyclerAdaptador);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mencionar que accion quieres realizar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
               // startActivity(new Intent(MainActivity.this , ActivityFavoritos.class));

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
           // Toast.makeText(this,"Este es el item: "+item.getTitle(),Toast.LENGTH_SHORT).show();

            return true;
        }
        if (id == R.id.action_favoritos) {
           // Toast.makeText(this,"Este es el item: "+item.getTitle(),Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this , ActivityFavoritos.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
