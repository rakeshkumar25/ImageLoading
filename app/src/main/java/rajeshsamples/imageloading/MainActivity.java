package rajeshsamples.imageloading;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private final String android_image_urls[] = {
            "https://scontent-sin1-1.xx.fbcdn.net/v/t1.0-9/13626440_1228026303884020_9196299579377198120_n.jpg?oh=680254acc58d9a393ffca6cbe113bc11&oe=582B8BBB",
            "https://4.bp.blogspot.com/-RruwcNbB1hY/Vybmw1pWJ2I/AAAAAAAAASM/7QqUHdIY3Q0s-h4R7lEfwm-xJkTjGFJPACLcB/s1600/Rajnikanth%2527s%2B%2527Kabali%2527.jpg",
            "http://www.kabalithemovie.in/wp-content/gallery/kabali-posters/Kabali-Posters-02.jpg",
            "http://media2.intoday.in/indiatoday/images/stories/music_647_061216105825.jpg",
            "http://liveagle.in/wp-content/uploads/2016/06/Kabali-Hd-images-wallpapers-2.jpg",
            "http://wallpapers.filmibeat.com/ph-1024x768/2016/03/kabali_145734125810.jpg",
            "http://liveagle.in/wp-content/uploads/2016/05/kabali-hd-images-12.jpg",
            "http://liveagle.in/wp-content/uploads/2016/05/kabali-hd-images-11.jpg",
            "https://pbs.twimg.com/media/CS0jGRMUsAIu3p5.jpg",
            "http://liveagle.in/wp-content/uploads/2016/05/kabali-hd-images-3.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<ImageNames> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(),androidVersions);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList<ImageNames> prepareData(){

        ArrayList<ImageNames> android_version = new ArrayList<>();
        for(int i=0;i<android_image_urls.length;i++){
            ImageNames androidVersion = new ImageNames();
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}
