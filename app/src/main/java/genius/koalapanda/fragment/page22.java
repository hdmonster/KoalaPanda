package genius.koalapanda.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import genius.koalapanda.R;

/**
 * Created by DZAKY_PC on 10/21/2017.
 */

public class page22 extends Fragment {
    ImageView pg22;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hal22, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();

        pg22 = (ImageView) getView().findViewById(R.id.imgt22);
        pg22.setImageResource(R.drawable.a22);
    }
}