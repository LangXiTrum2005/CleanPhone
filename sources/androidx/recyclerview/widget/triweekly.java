package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: compiled from: SnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class triweekly extends RecyclerView.monoploid {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.OnScrollListener mScrollListener = new attabal();

    /* JADX INFO: compiled from: SnapHelper.java */
    public class attabal extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f13483attabal = false;

        public attabal() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f13483attabal) {
                this.f13483attabal = false;
                triweekly.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f13483attabal = true;
        }
    }

    /* JADX INFO: compiled from: SnapHelper.java */
    public class saneness extends competently {
        public saneness(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.competently
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.competently, androidx.recyclerview.widget.RecyclerView.gintrap
        public void onTargetFound(View view, RecyclerView.rotuma rotumaVar, RecyclerView.gintrap.attabal attabalVar) {
            triweekly triweeklyVar = triweekly.this;
            RecyclerView recyclerView = triweeklyVar.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = triweeklyVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                attabalVar.wireman(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(RecyclerView.kowloon kowloonVar, int i, int i2) {
        RecyclerView.gintrap gintrapVarCreateScroller;
        int iFindTargetSnapPosition;
        if (!(kowloonVar instanceof RecyclerView.gintrap.saneness) || (gintrapVarCreateScroller = createScroller(kowloonVar)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(kowloonVar, i, i2)) == -1) {
            return false;
        }
        gintrapVarCreateScroller.setTargetPosition(iFindTargetSnapPosition);
        kowloonVar.startSmoothScroll(gintrapVarCreateScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.kowloon kowloonVar, View view);

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public RecyclerView.gintrap createScroller(RecyclerView.kowloon kowloonVar) {
        return createSnapScroller(kowloonVar);
    }

    @Deprecated
    public competently createSnapScroller(RecyclerView.kowloon kowloonVar) {
        if (kowloonVar instanceof RecyclerView.gintrap.saneness) {
            return new saneness(this.mRecyclerView.getContext());
        }
        return null;
    }

    public abstract View findSnapView(RecyclerView.kowloon kowloonVar);

    public abstract int findTargetSnapPosition(RecyclerView.kowloon kowloonVar, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.monoploid
    public boolean onFling(int i, int i2) {
        RecyclerView.kowloon layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2);
    }

    public void snapToTargetExistingView() {
        RecyclerView.kowloon layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }
}
