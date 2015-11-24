package com.galleri5.userfeed.Activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.galleri5.userfeed.Adapters.UserFeedRecyclerAdapter;
import com.galleri5.userfeed.Model.UserFeed;
import com.galleri5.userfeed.Model.UserPost;
import com.galleri5.userfeed.R;
import com.galleri5.userfeed.UiHelper.CustomAppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends CustomAppCompatActivity {

    RecyclerView recyclerView;
    UserFeedRecyclerAdapter userFeedRecyclerAdapter;
    String[] beautifulImagese = {"http://www.viralnovelty.net/wp-content/uploads/2014/01/beauty.png", "http://www.fubiz.net/wp-content/uploads/2015/04/Hands-Free-Headstands-In-Beautiful-Places_3.jpg", "https://s-media-cache-ak0.pinimg.com/736x/0e/0e/44/0e0e4425b3b68a7c24f85a39cfe75191.jpg", "http://greenweddingshoes.com/wp-content/uploads/2014/09/craterlake-elopement-30.jpg", "http://www.aluxurytravelblog.com/wp-content/uploads/2014/01/grand_cayman.jpg", "http://whereintheworldisnina.com/wp-content/uploads/2015/04/sagada-eco-valley-hanging-coffins.png", "http://41.media.tumblr.com/2d78ef3f832338f174c09fd288282646/tumblr_mn914tevaA1rnkaw5o2_500.jpg", "http://slodive.com/wp-content/uploads/2012/07/real-pictures-of-jesus/jesus-loves-you.jpg", "http://cdn4.dailyinspiration.nl/wp-content/uploads/2012/09/162.jpg", "http://gdj.gdj.netdna-cdn.com/wp-content/uploads/2011/02/creative-photos-50.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar("My Feed");
        initStatusBar();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setClickable(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        userFeedRecyclerAdapter = new UserFeedRecyclerAdapter(MainActivity.this);
        ArrayList<String> listImages = new ArrayList<>(Arrays.asList(beautifulImagese));
        for ( int i = 0; i < 10; i++ ) {
            ArrayList<UserPost> userPosts = new ArrayList<>();
            Collections.shuffle(listImages);
            for ( int j = 0; j < listImages.size(); j++ ) {
                userPosts.add(new UserPost(listImages.get(j), "Beauty at best", (i + 1) * j * j * 23 + 120, j * 14 * (i + 1) + 92, i));
            }
            userFeedRecyclerAdapter.addSingleRow(new UserFeed("David Gilmour", "http://assets.rollingstone.com/assets/images/story/pink-floyd-to-issue-extravagant-division-bell-anniversary-box-set-20140520/david-gilmour306final-1400609744.jpg", i * 4, i * 5, userPosts));
        }
        recyclerView.setAdapter(userFeedRecyclerAdapter);
    }
}
