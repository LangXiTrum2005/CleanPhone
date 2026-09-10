package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.competently;
import androidx.recyclerview.widget.taiyuan;
import androidx.recyclerview.widget.triweekly;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends triweekly {
    private RecyclerView ik;
    private taiyuan lr;
    private taiyuan ri;

    private taiyuan lr(RecyclerView.kowloon kowloonVar) {
        taiyuan taiyuanVar = this.lr;
        if (taiyuanVar == null || taiyuanVar.apical() != kowloonVar) {
            this.lr = taiyuan.attabal(kowloonVar);
        }
        return this.lr;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.ik = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.triweekly
    public int[] calculateDistanceToFinalSnap(RecyclerView.kowloon kowloonVar, View view) {
        int[] iArr = {0, 0};
        if (kowloonVar.canScrollHorizontally()) {
            iArr[0] = ri(view, lr(kowloonVar));
            return iArr;
        }
        if (kowloonVar.canScrollVertically()) {
            iArr[1] = ri(view, ri(kowloonVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public RecyclerView.gintrap createScroller(RecyclerView.kowloon kowloonVar) {
        if (kowloonVar instanceof RecyclerView.gintrap.saneness) {
            return new competently(this.ik.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ri.1
                @Override // androidx.recyclerview.widget.competently
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.competently
                public int calculateTimeForScrolling(int i) {
                    return Math.min(100, super.calculateTimeForScrolling(i));
                }

                @Override // androidx.recyclerview.widget.competently, androidx.recyclerview.widget.RecyclerView.gintrap
                public void onTargetFound(View view, RecyclerView.rotuma rotumaVar, RecyclerView.gintrap.attabal attabalVar) {
                    ri riVar = ri.this;
                    int[] iArrCalculateDistanceToFinalSnap = riVar.calculateDistanceToFinalSnap(riVar.ik.getLayoutManager(), view);
                    int i = iArrCalculateDistanceToFinalSnap[0];
                    int i2 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iCalculateTimeForDeceleration > 0) {
                        attabalVar.wireman(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public View findSnapView(RecyclerView.kowloon kowloonVar) {
        int childCount = kowloonVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kowloonVar;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        taiyuan taiyuanVarRi = ri(kowloonVar);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayoutManager.getChildAt(i2);
            int iAbs = Math.abs(taiyuanVarRi.competently(childAt));
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public int findTargetSnapPosition(RecyclerView.kowloon kowloonVar, int i, int i2) {
        View viewFindSnapView = findSnapView(kowloonVar);
        int i3 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = kowloonVar.getPosition(viewFindSnapView);
        if (kowloonVar.canScrollVertically()) {
            i3 = i2 < 0 ? position - 1 : position + 1;
        }
        return Math.min(kowloonVar.getItemCount() - 1, Math.max(i3, 0));
    }

    private int ri(View view, taiyuan taiyuanVar) {
        int iCompetently = taiyuanVar.competently(view);
        return iCompetently >= taiyuanVar.triweekly() / 2 ? iCompetently - taiyuanVar.triweekly() : iCompetently;
    }

    private taiyuan ri(RecyclerView.kowloon kowloonVar) {
        taiyuan taiyuanVar = this.ri;
        if (taiyuanVar == null || taiyuanVar.apical() != kowloonVar) {
            this.ri = taiyuan.dern(kowloonVar);
        }
        return this.ri;
    }
}
