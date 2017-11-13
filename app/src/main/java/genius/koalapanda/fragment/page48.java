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

public class page48 extends Fragment {
    ImageView pg48;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.koala48, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg48 = (ImageView) getView().findViewById(R.id.img48);
        pg48.setImageResource(R.mipmap.a48);}
}
