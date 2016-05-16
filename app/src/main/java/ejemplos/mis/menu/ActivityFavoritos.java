package ejemplos.mis.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityFavoritos extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdaptadorFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Favoritos");

        ArrayList<Mascota> datosFav = new ArrayList<Mascota>();


        datosFav.add(new Mascota("Akita",R.drawable.perro3,0xFF426989));
        datosFav.add(new Mascota("Goku",R.drawable.perro5,0xFFd1c1fc));
        datosFav.add(new Mascota("Colita",R.drawable.perro9,0xFFd1f2cc));
        datosFav.add(new Mascota("Mancha",R.drawable.perro10,0xFF81285c));
        datosFav.add(new Mascota("Goliat",R.drawable.perro4,0xFF7a355b));

        recicladorFav = (RecyclerView)findViewById(R.id.RecyclerView_RecicladorFavoritos);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdaptadorFav = new MascotaAdaptador(datosFav);
        recicladorFav.setAdapter(recyclerAdaptadorFav);


    }
}
