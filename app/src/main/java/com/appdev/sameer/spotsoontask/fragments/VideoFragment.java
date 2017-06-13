package com.appdev.sameer.spotsoontask.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdev.sameer.spotsoontask.MyRecyclerViewAdapter;
import com.appdev.sameer.spotsoontask.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter adapter;
    View view;
    private List<String> feedsList;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_video, container, false);

        feedsList = new ArrayList<>();
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");
        feedsList.add("https://s-media-cache-ak0.pinimg.com/736x/3e/97/66/3e97662814ff3ade23d1c666ebbd374c.jpg");


        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyRecyclerViewAdapter(getActivity(), feedsList);
        mRecyclerView.setAdapter(adapter);
        return view;

    }

}
