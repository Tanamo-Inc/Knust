package com.tanamo.knust.frag;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tanamo.knust.R;
import com.tanamo.knust.adaptor.Fragment_Adapter;
import com.tanamo.knust.model.Details;
import com.tanamo.knust.model.Mod;

import java.util.ArrayList;

// This my Main Fragment Class.

public class Fragment_Main extends Fragment {

    ArrayList<Mod> myList;
    ArrayList<String> myTitle = new ArrayList<>();
    RecyclerView recycler;
    Fragment_Adapter adapter;

    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        ArrayTitle();
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);

        myList = new ArrayList<>();


        myInfo();

        recycler = view.findViewById(R.id.recycler);
        adapter = new Fragment_Adapter(getActivity(), myList);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recycler.setAdapter(adapter);
        return view;
    }


    @SuppressLint("ResourceType")
    public void myInfo() {


        for (int i = 0; i < myTitle.size(); i++) {
            Mod md = new Mod();

            md.setMyTitle(myTitle.get(i));

            ArrayList<Details> deta = new ArrayList<>();

            for (int j = 1; j <= myTitle.size(); j++) {
                deta.add(new Details("Dept " + j, "link" + j));
            }
            md.setMyContents(deta);
            myList.add(md);

        }
    }


    // Colleges Title.
    private void ArrayTitle() {
        myTitle.add(getString(R.string.coa));
        myTitle.add(getString(R.string.cos));
        myTitle.add(getString(R.string.coag));
        myTitle.add(getString(R.string.coe));
        myTitle.add(getString(R.string.coh));
        myTitle.add(getString(R.string.coss));

    }


}
