package se.liu.ida.josfa969.tddd80.fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import se.liu.ida.josfa969.tddd80.R;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 *
 */
public class PostIdea extends Fragment {


    public PostIdea() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_idea, container, false);
    }


}
