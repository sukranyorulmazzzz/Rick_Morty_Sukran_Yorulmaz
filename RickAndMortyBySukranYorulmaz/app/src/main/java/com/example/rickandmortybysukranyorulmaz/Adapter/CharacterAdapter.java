package com.example.rickandmortybysukranyorulmaz.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rickandmortybysukranyorulmaz.Model.Character;
import com.example.rickandmortybysukranyorulmaz.Model.Location;
import com.example.rickandmortybysukranyorulmaz.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {
    private List<Character> characterList;
    private List<Location> locationList;
    private ItemClickListener mItemClickListener;

    public CharacterAdapter(List<Character> characterList,List<Location> locationList, ItemClickListener itemClickListener) {
        this.characterList = characterList;
        this.locationList = locationList;
        this.mItemClickListener=itemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Picasso.get().load(characterList.get(position).getImage()).into(holder.image);
        holder.bodytv.setText(characterList.get(position).getName());
        holder.itemView.setOnClickListener(view -> {
            mItemClickListener.onItemClick(characterList.get(position),locationList.get(position));

        });

    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public interface ItemClickListener{
        void onItemClick(Character character, Location location);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView bodytv;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bodytv=itemView.findViewById(R.id.name);
            image=itemView.findViewById(R.id.iconimage);
        }
    }

}
