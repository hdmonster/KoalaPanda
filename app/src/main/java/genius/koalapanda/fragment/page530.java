package genius.koalapanda.fragment;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import genius.koalapanda.R;

/**
 * Created by IZZAH_PC on 10/29/2017.
 */

public class page530 extends Fragment {
    ImageView pg30;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.koala530, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg30 = (ImageView) getView().findViewById(R.id.img530);
        pg30.setImageResource(R.mipmap.a531);
    }
}
