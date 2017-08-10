package shoaibhassan.custom_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int[] IMAGES = {R.drawable.doo, R.drawable.googreen, R.drawable.jpg, R.drawable.lion, R.drawable.mini,
            R.drawable.moon, R.drawable.rio, R.drawable.wolef};
    String[] NAMES = {"Doo", "GOoGREEN", "J.P.G", "LION", "MINI", "MOON", "RIO", "WoLEF"};

    String[] DESCRIPTION = {"Burning Ball", "Nature", "Image", "King of Forest", "Carton", "Light", "Trailer", "Animal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ListView = (ListView) findViewById(R.id.ListView);

        CustomAdapter customAdapter = new CustomAdapter();

        ListView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter {

        public int getCount() {
            return IMAGES.length;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(null, android.R.layout.);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTION[i]);

            return view;
        }

    }
}
