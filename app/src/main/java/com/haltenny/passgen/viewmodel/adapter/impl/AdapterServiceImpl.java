package com.haltenny.passgen.viewmodel.adapter.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.haltenny.passgen.R;
import com.haltenny.passgen.viewmodel.adapter.AdapterService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdapterServiceImpl extends RecyclerView.Adapter<AdapterServiceImpl.PasswordViewHolder> {

    final int numberItems;
    static int viewHolderCount;

    public AdapterServiceImpl(int numberOfItems) {
        numberItems = numberOfItems;
        viewHolderCount = 0;
    }

    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public PasswordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem, parent, false);

        PasswordViewHolder viewHolder = new PasswordViewHolder(view);
        viewHolder.viewHolderIndex.setText("index: " + viewHolderCount);
        viewHolderCount++;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PasswordViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numberItems;
    }

    static class PasswordViewHolder extends RecyclerView.ViewHolder implements AdapterService {
        TextView listView;
        TextView viewHolderIndex;

        public PasswordViewHolder(@NonNull View itemView) {
            super(itemView);

            listView = itemView.findViewById(R.id.item);
            viewHolderIndex = itemView.findViewById(R.id.holder_number);

        }

        @Override
        public void bind(int listIndex) {
            listView.setText(String.valueOf(listIndex));
        }
    }
}