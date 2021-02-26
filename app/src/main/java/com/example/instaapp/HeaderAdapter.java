package com.example.instaapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instaapp.databinding.HeaderItemBinding;
import com.example.instaapp.model.HeaderUser;

import java.util.List;

public class HeaderAdapter extends RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder> {

    private final MainActivity mActivity;
    private List<HeaderUser> headerUsers;

    public HeaderAdapter(MainActivity mainActivity) {
        this.mActivity = mainActivity;
        this.headerUsers = mActivity.headerUsers;
    }

    @NonNull
    @Override
    public HeaderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HeaderItemBinding headerItemBinding = HeaderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new HeaderViewHolder(headerItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HeaderViewHolder holder, int position) {
        holder.headerItemBinding.setHeaderUser(headerUsers.get(position));
    }

    @Override
    public int getItemCount() {
        return headerUsers.size();
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {

        private HeaderItemBinding headerItemBinding;

        public HeaderViewHolder(@NonNull HeaderItemBinding headerItemBinding) {
            super(headerItemBinding.getRoot());
            this.headerItemBinding = headerItemBinding;
        }
    }
}
