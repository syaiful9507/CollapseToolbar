package syaiful.code.collapsetollbar;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;

    String  namaImage="Oy";
    int backgroundImage = R.drawable.ic_add_shopping_cart_black_24dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(namaImage);
        setSupportActionBar(toolbar);

        ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        imageView.setImageResource(backgroundImage);

    }
}
