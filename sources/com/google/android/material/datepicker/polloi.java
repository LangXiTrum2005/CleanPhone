package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class polloi extends LinearLayoutManager {

    /* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
    public class attabal extends androidx.recyclerview.widget.competently {
        public attabal(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.competently
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public polloi(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.kowloon
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.rotuma rotumaVar, int i) {
        attabal attabalVar = new attabal(recyclerView.getContext());
        attabalVar.setTargetPosition(i);
        startSmoothScroll(attabalVar);
    }
}
