package genius.koalapanda.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.izzah_pc.lashbookmark.R;

/**
 * Created by IZZAH_PC on 10/29/2017.
 */

public class page65 extends Fragment {
    ImageView pg65;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hal65, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg65 = (ImageView) getView().findViewById(R.id.a65);
        pg65.setImageResource(R.drawable.a65);
        }

}
