package com.example.amigo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] titles = {"S Purushothaman",
            "Ushita Sree",
            "Mehul Gautam",
            "Aniruddh Suresh Pillai"};

    private String[] details = {"Passion + Perseverance == Persistence + Perfection",
            "Embrace reality even if it burns you :)", "Smart. Strong. Silly. Straight up class act.",
            "I speak less because I know there are very few who likes to listen "};

    private int[] images = { R.drawable.purush,
            R.drawable.ushita,
            R.drawable.mehul,
            R.drawable.aniruddh};

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage =
                    (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle =
                    (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =
                    (TextView)itemView.findViewById(R.id.item_detail);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
