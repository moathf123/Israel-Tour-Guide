package com.example.israeltourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BeachesFragment extends Fragment {
    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recycle_list, container, false);
        ButterKnife.bind(this, view);

        ArrayList<AttractionsDetails> attractionsDetails = new ArrayList<>();
        attractionsDetails.add(new AttractionsDetails(R.drawable.sea, getString(R.string.beach_time_info), getString(R.string.dead_sae), getString(R.string.beach_location)));

        AttractionsAdapter detailsAdapter = new AttractionsAdapter(attractionsDetails);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(detailsAdapter);

        return view;
    }
}