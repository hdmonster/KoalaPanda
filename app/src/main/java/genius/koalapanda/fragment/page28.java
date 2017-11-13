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

public class page28 extends Fragment {
    ImageView pg28;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mx28, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg28 = (ImageView) getView().findViewById(R.id.imsg28);
        pg28.setImageResource(R.mipmap.a28);
    }
}
