package com.example.instaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.instaapp.model.HeaderUser;
import com.example.instaapp.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Post> posts;
    public List<HeaderUser> headerUsers;
    private PostAdapter postAdapter;
    private HeaderAdapter headerAdapter;
    private RecyclerView rvHeader, rvPost;
    private MainActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initAdapter();
    }

    private void init() {
        rvHeader = findViewById(R.id.rv_header);
        rvPost = findViewById(R.id.rv_post);
        mActivity = MainActivity.this;

        posts = new ArrayList<>();
        posts.add(new Post(1, "username1", R.drawable.profile4, 24));
        posts.add(new Post(2, "username2", R.drawable.profile1, 132));
        posts.add(new Post(3, "username3", R.drawable.profile3, 43));

        headerUsers = new ArrayList<>();
        headerUsers.add(new HeaderUser(1, "h_ggob", R.drawable.profile2));
        headerUsers.add(new HeaderUser(2, "h_ggob", R.drawable.profile2));
        headerUsers.add(new HeaderUser(3, "h_ggob", R.drawable.profile2));
        headerUsers.add(new HeaderUser(4, "h_ggob", R.drawable.profile2));
        headerUsers.add(new HeaderUser(5, "h_ggob", R.drawable.profile2));
        headerUsers.add(new HeaderUser(6, "h_ggob", R.drawable.profile2));
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManagerToHeader = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManagerToBody = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        headerAdapter = new HeaderAdapter(mActivity);
        postAdapter = new PostAdapter(mActivity);

        rvHeader.setLayoutManager(linearLayoutManagerToHeader);
        rvHeader.setAdapter(headerAdapter);

        rvPost.setLayoutManager(linearLayoutManagerToBody);
        rvPost.setAdapter(postAdapter);
    }
}