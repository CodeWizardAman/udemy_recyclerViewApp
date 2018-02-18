package Adapter;

import android.app.LauncherActivity;
import android.content.ContentUris;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.recyclerviewapp.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by UFO_24 on 17-02-2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItem){

        this.context = context;
        this.listItems = listItem;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        ListItem item = listItems.get(position);

        holder.name.setText(item.getTitle());
        holder.description.setText(item.getDescription());
        holder.rating.setText(item.getRating());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView description;
        public TextView rating;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.title_id);
            description = itemView.findViewById(R.id.description_id);
            rating = itemView.findViewById(R.id.rating_id);
        }
    }
}
