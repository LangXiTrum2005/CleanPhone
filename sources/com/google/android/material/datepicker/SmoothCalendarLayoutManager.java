package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: com.google.android.material.datepicker.SmoothCalendarLayoutManager$1, reason: invalid class name */
    class AnonymousClass1 extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(recyclerView.getContext());
        anonymousClass1.setTargetPosition(i2);
        startSmoothScroll(anonymousClass1);
    }
}
