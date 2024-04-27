package com.example.sporterz_mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MatchesFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyMatchesAdapter adapter;
    private List<MatchesDataClass> matchesList;

    public MatchesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matches, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize your matches list
        matchesList = new ArrayList<>();

        // Populate the matches list with sample data
        populateMatchesList();

        // Initialize adapter with the matches list
        adapter = new MyMatchesAdapter(getContext(), matchesList);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void populateMatchesList() {
        // Sample data for demonstration
        matchesList.add(new MatchesDataClass("Tue. 09/04, 19:00", "Stade Santiago-Bernabéu", "Madrid, Espagne", "Real Madrid", "3", "https://s2.ezgif.com/tmp/ezgif-2-150ce314ca.png", "Manchester City", "3", "https://download.logo.wine/logo/Manchester_City_F.C./Manchester_City_F.C.-Logo.wine.png"));
        matchesList.add(new MatchesDataClass("Wed. 17/04, 20:00", "Stade Santiago-Bernabéu", "Madrid, Espagne", "Real Madrid", "0", "https://s2.ezgif.com/tmp/ezgif-2-150ce314ca.png", "Manchester City", "0", "https://download.logo.wine/logo/Manchester_City_F.C./Manchester_City_F.C.-Logo.wine.png"));
    }
}
