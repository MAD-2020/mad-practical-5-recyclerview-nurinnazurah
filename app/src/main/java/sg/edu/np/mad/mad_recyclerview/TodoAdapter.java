package sg.edu.np.mad.mad_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class TodoAdapter extends RecyclerView.Adapter<ViewHolder> {
    ArrayList<String> data;

    public TodoAdapter(ArrayList<String> input) {
        data = input;
    }

    public ViewHolder onCreateViewHolder(
            ViewGroup parent,
            int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(
                android.R.layout.simple_list_item_1,
                parent,
                false);
        return new ViewHolder(item);
    }

    public void onBindViewHolder(
            ViewHolder holder,
            int position) {
        String s = data.get(position);
        holder.txt.setText(s);
    }

    public int getItemCount() {
        return data.size();
    }

}
