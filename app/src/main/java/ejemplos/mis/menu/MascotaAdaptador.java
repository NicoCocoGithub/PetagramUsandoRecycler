package ejemplos.mis.menu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nicopro on 16/5/16.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.mascotaViewHolder>{



    public MascotaAdaptador(ArrayList<Mascota> item) {
        this.item = item;
    }
    private ArrayList <Mascota> item;



    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        //tengo que inflar el layout que quiero mostrar
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        mascotaViewHolder producto = new mascotaViewHolder(v);
        return producto;
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder productoViewHolder, int i) {
        //trae la informacion uno a uno muestro cada item

        productoViewHolder.nombre.setText(item.get(i).getNombre());
        productoViewHolder.imagen.setImageResource(item.get(i).getImagen());
        productoViewHolder.imagen.setBackgroundColor(item.get(i).getColor());

    }

    @Override
    public int getItemCount() {
        return item.size();
        //cuanto va a ser el tamaño de los items
    }

    public class mascotaViewHolder extends RecyclerView.ViewHolder{

        TextView nombre;
        ImageView imagen;


        public mascotaViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView)itemView.findViewById(R.id.TextView_nombre);
            imagen = (ImageView)itemView.findViewById(R.id.ImageView_mascota);


        }
    }
}
