package sg.edu.np.mad.mad_recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView txt;

    public ViewHolder(View itemView) {
        super(itemView);
        txt = itemView.findViewById(android.R.id.text1);

    }
}
