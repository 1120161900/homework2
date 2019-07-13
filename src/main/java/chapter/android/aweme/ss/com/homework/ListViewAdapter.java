package chapter.android.aweme.ss.com.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.lang.String;

public class ListViewAdapter extends BaseAdapter {
    private int[] args = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13};
    private Context context;

    public ListViewAdapter(Context context) {
        this.context = context;
    }

    @Override public int getCount() {
        return 100;
    }

    @Override public Object getItem(int position) {
        return null;
    }

    @Override public long getItemId(int position) {
        return 0;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
       /* TextView textView;
            if(convertView == null)
            {
                textView = new TextView(context);
            }
            else
            {
                textView = (TextView)convertView;
            }*/
        View inflate = LayoutInflater.from(context).inflate(R.layout.list_item, null);
        return inflate;
    }
}
