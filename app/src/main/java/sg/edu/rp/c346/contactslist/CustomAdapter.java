package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16039009 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ContactItem> contactItems;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.contactItems = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id, parent, false);
        } else{
            rowView = convertView;
        }
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCon);
        TextView tvNum = rowView.findViewById(R.id.textViewNum);
        ContactItem currentItem = contactItems.get(position);
        String name = currentItem.getName();
        String code = currentItem.getCode();
        int num = currentItem.getNum();
        tvName.setText(name);
        tvCode.setText(code);
        tvNum.setText(String.valueOf(num));
        return rowView;
    }
}
