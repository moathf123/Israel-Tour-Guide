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


public class OutdoorsFragment extends Fragment {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    public OutdoorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.recycle_list, container, false);
        ButterKnife.bind(this, view);

        ArrayList<AttractionsDetails> attractionsDetails = new ArrayList<>();
        attractionsDetails.add(new AttractionsDetails(R.drawable.camp, getString(R.string.all_day_around), getString(R.string.first_outdoors_name), getString(R.string.first_outdoor_location)));
        attractionsDetails.add(new AttractionsDetails(R.drawable.camp, getString(R.string.all_day_around), getString(R.string.second_outdoor_name), getString(R.string.beach_location)));

        AttractionsAdapter detailsAdapter = new AttractionsAdapter(attractionsDetails);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(detailsAdapter);

        return view;
    }
}