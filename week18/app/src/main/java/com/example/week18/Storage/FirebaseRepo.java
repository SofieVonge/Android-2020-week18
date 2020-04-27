package com.example.week18.Storage;

import androidx.annotation.Nullable;

import com.example.week18.Model.CoronaMarker;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

public class FirebaseRepo{

    FirebaseFirestore fb = FirebaseFirestore.getInstance();
    private final static String colectionRef = "pins";
    public static List<CoronaMarker> list = new ArrayList<>();

    public void loadMarker(){
        fb.collection(colectionRef).addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                list.clear();
                for (DocumentSnapshot snapshot : queryDocumentSnapshots.getDocuments()) {
                    String title = snapshot.get("title").toString();
                    String status = snapshot.get("status").toString();
                    double lon = Double.valueOf(snapshot.get("lon").toString());
                    double lat = Double.valueOf(snapshot.get("lat").toString());

                    list.add(new CoronaMarker(title, lat, lon, status));
                }
            }
        });
    }

}
