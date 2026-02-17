package co.edu.unipiloto.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FindBeerActivity extends AppCompatActivity {
    BeerExpert beerExpert = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_find_beer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onClickFindBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String type = String.valueOf(color.getSelectedItem());
        String results = beerExpert.getBrands(type);
        brands.setText(results);

    }

    public void onClickFindRegion(View view) {
        TextView stations = (TextView) findViewById(R.id.avaiable_stations);
        Spinner region = (Spinner) findViewById(R.id.region);
        String type = String.valueOf(region.getSelectedItem());
        String results = beerExpert.getStationService(type);
        stations.setText(results);

    }
}