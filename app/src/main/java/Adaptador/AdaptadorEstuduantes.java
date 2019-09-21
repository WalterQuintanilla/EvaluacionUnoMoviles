package Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.evaluacionunomoviles.R;
import java.util.List;

import Entidad.Estudiante;

public class AdaptadorEstuduantes extends BaseAdapter {

    //Declaracion de varianles
    private List<Estudiante> datasourse;
    private Context cntx;
    private int IdLayoutPlantilla;

    public List<Estudiante> GetData() {
        return this.datasourse;
    }

    public AdaptadorEstuduantes(Context context, int IdPlantilla, List<Estudiante> sourse) {
        this.cntx = context;
        this.IdLayoutPlantilla = IdPlantilla;
        this.datasourse = sourse;
    }

    @Override
    public int getCount() {
        return this.datasourse.size();
    }

    @Override
    public Estudiante getItem(int position) {
        return this.datasourse.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview == null) {
            LayoutInflater inflater = (LayoutInflater) this.cntx.getSystemService(this.cntx.LAYOUT_INFLATER_SERVICE);
            convertview = inflater.inflate(IdLayoutPlantilla,null);

            TextView txvCodigo = convertview.findViewById(R.id.txvCodigo);
            TextView txtId= convertview.findViewById(R.id.txtId);
            TextView txtNombre=convertview.findViewById(R.id.txtNombre);
            TextView txtMateria=convertview.findViewById(R.id.txtMateria);
            TextView txtNota=convertview.findViewById(R.id.txtNota);

            String id = Integer.toString(this.datasourse.get(position).getId());
            txtId.setText(id);
            String pro = Double.toString(this.datasourse.get(position).getPromedio());
            txtNota.setText(pro);
            txvCodigo.setText(this.datasourse.get(position).getCodigo());
            txtMateria.setText(this.datasourse.get(position).getMateria());
            txtNombre.setText(this.datasourse.get(position).getNombre());

        }

        return  convertview;
    }

}
