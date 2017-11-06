package genius.koalapanda.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.izzah_pc.lashbookmark.R;

/**
 * Created by IZZAH_PC on 10/29/2017.
 */

public class page42 extends Fragment {
    ImageView pg42;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hal42, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg42 = (ImageView) getView().findViewById(R.id.a42);
        pg42.setImageResource(R.drawable.a42);}
}
