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

public class page79  extends Fragment {
    ImageView pg79;
    Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.hal79, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
        pg79 = (ImageView) getView().findViewById(R.id.a79);
        pg79.setImageResource(R.drawable.a79);
        }

}
