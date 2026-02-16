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

import java.util.Arrays;

public class BeerExpert {
    
    public void getBrands(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String type = String.valueOf(color.getSelectedItem());
        String[] values;

        switch (type) {
            case "light":
                values = getResources().getStringArray(R.array.light_values);
                break;
            case "amber":
                values = getResources().getStringArray(R.array.amber_values);
                break;
            case "brown":
                values = getResources().getStringArray(R.array.brown_values);
                break;
            case "dark":
                values = getResources().getStringArray(R.array.dark_values);
                break;
            default:
                brands.setText("No color selected");
                return;
        }

        String result = String.join("\n", values);
        brands.setText(result);

    }
}
