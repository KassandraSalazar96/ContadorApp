package contadorapp.kassandrasalazar.android.contadorapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by KASSANDRA-PC on 27/10/2017.
 */

public class ContadorFragment extends Fragment {
    EditText mCampoConteo;
    Button mBotonContar;
    Button mBotonReiniciar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_contador, container, false);
        mCampoConteo = (EditText) v.findViewById(R.id.etiqueta_conteo);
        mBotonContar = (Button) v.findViewById(R.id.boton_contar);
        mBotonReiniciar = (Button) v.findViewById(R.id.boton_reiniciar);
        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = mCampoConteo.getText().toString();
                int contar = Integer.parseInt(m);
                contar++;
                String resultadoConteo = Integer.toString(contar);
                mCampoConteo.setText(resultadoConteo);
            }
        });
        mBotonReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCampoConteo.setText("0");
            }
        });

        return v;
    }
}
