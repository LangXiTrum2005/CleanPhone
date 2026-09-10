package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    public View e0;
    public OnRefreshListener f0;
    public boolean g0;
    public float h0;
    public float i0;
    public boolean j0;
    public int k0;
    public Animation l0;
    public int m0;
    public OnChildScrollUpCallback n0;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1, reason: invalid class name */
    public class AnonymousClass1 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2, reason: invalid class name */
    class AnonymousClass2 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4, reason: invalid class name */
    class AnonymousClass4 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5, reason: invalid class name */
    class AnonymousClass5 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$6, reason: invalid class name */
    public class AnonymousClass6 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7, reason: invalid class name */
    public class AnonymousClass7 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8, reason: invalid class name */
    class AnonymousClass8 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    public interface OnChildScrollUpCallback {
        boolean a();
    }

    public interface OnRefreshListener {
    }

    private void setColorViewAlpha(int i2) {
        throw null;
    }

    public final void a() {
        if (this.e0 == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(null)) {
                    this.e0 = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        if (i3 == i2 - 1) {
            return 0;
        }
        return i3 >= 0 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public int getProgressCircleDiameter() {
        return this.m0;
    }

    public int getProgressViewEndOffset() {
        return 0;
    }

    public int getProgressViewStartOffset() {
        return 0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollList;
        a();
        motionEvent.getActionMasked();
        if (!isEnabled()) {
            return false;
        }
        OnChildScrollUpCallback onChildScrollUpCallback = this.n0;
        if (onChildScrollUpCallback != null) {
            zCanScrollList = onChildScrollUpCallback.a();
        } else {
            View view = this.e0;
            zCanScrollList = view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
        }
        if (zCanScrollList || this.g0) {
            return false;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.e0 == null) {
            a();
        }
        View view = this.e0;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.e0 == null) {
            a();
        }
        View view = this.e0;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        View.MeasureSpec.makeMeasureSpec(this.m0, 1073741824);
        View.MeasureSpec.makeMeasureSpec(this.m0, 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f = this.i0;
            if (f > 0.0f) {
                float f2 = i3;
                if (f2 > f) {
                    iArr[1] = i3 - ((int) f);
                    this.i0 = 0.0f;
                    throw null;
                }
                this.i0 = f - f2;
                iArr[1] = i3;
                throw null;
            }
        }
        int i4 = iArr[0];
        int i5 = iArr[1];
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return (!isEnabled() || this.g0 || (i2 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollList;
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            OnChildScrollUpCallback onChildScrollUpCallback = this.n0;
            if (onChildScrollUpCallback != null) {
                zCanScrollList = onChildScrollUpCallback.a();
            } else {
                View view = this.e0;
                zCanScrollList = view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
            }
            if (!zCanScrollList && !this.g0) {
                if (actionMasked == 0) {
                    this.k0 = motionEvent.getPointerId(0);
                    this.j0 = false;
                    return true;
                }
                if (actionMasked == 1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.k0);
                    if (iFindPointerIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.j0) {
                        float y = (motionEvent.getY(iFindPointerIndex) - 0.0f) * 0.5f;
                        this.j0 = false;
                        if (y <= this.h0) {
                            this.g0 = false;
                            throw null;
                        }
                        if (!this.g0) {
                            a();
                            this.g0 = true;
                            throw null;
                        }
                    }
                    this.k0 = -1;
                    return false;
                }
                if (actionMasked == 2) {
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.k0);
                    if (iFindPointerIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    motionEvent.getY(iFindPointerIndex2);
                    throw null;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.k0) {
                                this.k0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            }
                        }
                        return true;
                    }
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (actionIndex2 < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.k0 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = this.e0;
        if (view == null || ViewCompat.r(view)) {
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public void setAnimationProgress(float f) {
        throw null;
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        a();
        throw null;
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.getColor(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.h0 = i2;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            throw null;
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        throw null;
    }

    public void setOnChildScrollUpCallback(OnChildScrollUpCallback onChildScrollUpCallback) {
        this.n0 = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.f0 = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        throw null;
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i2));
    }

    public void setRefreshing(boolean z2) {
        if (z2 && this.g0 != z2) {
            this.g0 = z2;
            throw null;
        }
        if (this.g0 != z2) {
            a();
            this.g0 = z2;
            if (z2) {
                throw null;
            }
            Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
                }
            };
            this.l0 = animation;
            animation.setDuration(150L);
            throw null;
        }
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.m0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.m0 = (int) (displayMetrics.density * 40.0f);
            }
            throw null;
        }
    }

    public void setSlingshotDistance(int i2) {
    }

    public void setTargetOffsetTopAndBottom(int i2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        throw null;
    }
}
