package android.huangsz.com.weather;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ListView mListView;

    private String[] items = new String[] {"Monday", "Tuesday"};

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),
                R.layout.list_item_forcast, R.id.list_item_forecast_textview, items);
        mListView = (ListView) view.findViewById(R.id.listview_forecast);
        mListView.setAdapter(arrayAdapter);
        return view;
    }


}
