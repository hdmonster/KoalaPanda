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
 * Created by IZZAH_PC on 10/29/2017.
 */

public class page27 extends Fragment {
    Context context;
    ImageView p27;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.koala27, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();

        p27 = (ImageView) getView().findViewById(R.id.img27);
        p27.setImageResource(R.drawable.a27);
    }
}
