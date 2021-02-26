package com.example.instaapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instaapp.databinding.BodyItemBinding;
import com.example.instaapp.model.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private final MainActivity mActivity;
    private List<Post> posts;

    public PostAdapter(MainActivity mainActivity) {
        this.mActivity = mainActivity;
        this.posts = mainActivity.posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        BodyItemBinding bodyItemBinding = BodyItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new PostViewHolder(bodyItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.bodyItemBinding.setPost(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {

        private BodyItemBinding bodyItemBinding;

        public PostViewHolder(@NonNull BodyItemBinding bodyItemBinding) {
            super(bodyItemBinding.getRoot());
            this.bodyItemBinding = bodyItemBinding;
        }
    }
}
