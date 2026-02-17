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

import java.util.ArrayList;
import java.util.Arrays;

public class BeerExpert {

    public String getBrands(String beer) {
        ArrayList<String> values = new ArrayList<>();

        switch (beer) {
            case "light":
                values.add("Club Colombia Trigo");
                values.add("Corona");
                break;
            case "amber":
                values.add("3 Coordilleras Mulata");
                values.add("Club Colombia Roja");
                break;
            case "brown":
                values.add("No conozco ni una");
                values.add("Para completar el arreglo");
                break;
            case "dark":
                values.add("Club Colombia Negra");
                values.add("Cerveza Leona");
                break;
            default:
                values.add("No color selected");
        }

        return String.join("\n", values);

    }
}
