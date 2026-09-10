package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: PagerSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely extends triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public taiyuan f13395attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public taiyuan f13396saneness;

    /* JADX INFO: compiled from: PagerSnapHelper.java */
    public class attabal extends competently {
        public attabal(Context context) {
            super(context);
        }

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
            cutely cutelyVar = cutely.this;
            int[] iArrCalculateDistanceToFinalSnap = cutelyVar.calculateDistanceToFinalSnap(cutelyVar.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                attabalVar.wireman(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public final int attabal(View view, taiyuan taiyuanVar) {
        return (taiyuanVar.competently(view) + (taiyuanVar.marial(view) / 2)) - (taiyuanVar.triweekly() + (taiyuanVar.kowloon() / 2));
    }

    public final boolean beachfront(RecyclerView.kowloon kowloonVar, int i, int i2) {
        if (kowloonVar.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public int[] calculateDistanceToFinalSnap(RecyclerView.kowloon kowloonVar, View view) {
        int[] iArr = new int[2];
        if (kowloonVar.canScrollHorizontally()) {
            iArr[0] = attabal(view, dern(kowloonVar));
        } else {
            iArr[0] = 0;
        }
        if (kowloonVar.canScrollVertically()) {
            iArr[1] = attabal(view, marial(kowloonVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean competently(RecyclerView.kowloon kowloonVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = kowloonVar.getItemCount();
        if (!(kowloonVar instanceof RecyclerView.gintrap.saneness) || (pointFComputeScrollVectorForPosition = ((RecyclerView.gintrap.saneness) kowloonVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFComputeScrollVectorForPosition.y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public RecyclerView.gintrap createScroller(RecyclerView.kowloon kowloonVar) {
        if (kowloonVar instanceof RecyclerView.gintrap.saneness) {
            return new attabal(this.mRecyclerView.getContext());
        }
        return null;
    }

    public final taiyuan dern(RecyclerView.kowloon kowloonVar) {
        taiyuan taiyuanVar = this.f13396saneness;
        if (taiyuanVar == null || taiyuanVar.f13480attabal != kowloonVar) {
            this.f13396saneness = taiyuan.attabal(kowloonVar);
        }
        return this.f13396saneness;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public View findSnapView(RecyclerView.kowloon kowloonVar) {
        if (kowloonVar.canScrollVertically()) {
            return saneness(kowloonVar, marial(kowloonVar));
        }
        if (kowloonVar.canScrollHorizontally()) {
            return saneness(kowloonVar, dern(kowloonVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.triweekly
    public int findTargetSnapPosition(RecyclerView.kowloon kowloonVar, int i, int i2) {
        taiyuan taiyuanVarWireman;
        int itemCount = kowloonVar.getItemCount();
        if (itemCount == 0 || (taiyuanVarWireman = wireman(kowloonVar)) == null) {
            return -1;
        }
        int childCount = kowloonVar.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = kowloonVar.getChildAt(i5);
            if (childAt != null) {
                int iAttabal = attabal(childAt, taiyuanVarWireman);
                if (iAttabal <= 0 && iAttabal > i4) {
                    view2 = childAt;
                    i4 = iAttabal;
                }
                if (iAttabal >= 0 && iAttabal < i3) {
                    view = childAt;
                    i3 = iAttabal;
                }
            }
        }
        boolean zBeachfront = beachfront(kowloonVar, i, i2);
        if (zBeachfront && view != null) {
            return kowloonVar.getPosition(view);
        }
        if (!zBeachfront && view2 != null) {
            return kowloonVar.getPosition(view2);
        }
        if (zBeachfront) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = kowloonVar.getPosition(view) + (competently(kowloonVar) == zBeachfront ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final taiyuan marial(RecyclerView.kowloon kowloonVar) {
        taiyuan taiyuanVar = this.f13395attabal;
        if (taiyuanVar == null || taiyuanVar.f13480attabal != kowloonVar) {
            this.f13395attabal = taiyuan.dern(kowloonVar);
        }
        return this.f13395attabal;
    }

    public final View saneness(RecyclerView.kowloon kowloonVar, taiyuan taiyuanVar) {
        int childCount = kowloonVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iTriweekly = taiyuanVar.triweekly() + (taiyuanVar.kowloon() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = kowloonVar.getChildAt(i2);
            int iAbs = Math.abs((taiyuanVar.competently(childAt) + (taiyuanVar.marial(childAt) / 2)) - iTriweekly);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public final taiyuan wireman(RecyclerView.kowloon kowloonVar) {
        if (kowloonVar.canScrollVertically()) {
            return marial(kowloonVar);
        }
        if (kowloonVar.canScrollHorizontally()) {
            return dern(kowloonVar);
        }
        return null;
    }
}
