package com.example.controlfreaksapp.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.controlfreaksapp.R;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<ControllerDataType> {
    /**
     * The class extends to a data type as an array adapter.
     * @param context
     * @param items - holds an array of Strings in the ControllerDataType.
     */
    public CustomListViewAdapter(@NonNull Context context, ArrayList<ControllerDataType> items) {
        super(context, 0, items);
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.custom_listview_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.controllerName);
        name.setText(getItem(position).getName());
        TextView description = convertView.findViewById(R.id.controllerDesc);
        description.setText(getItem(position).getName());
        return convertView;
    }
}
