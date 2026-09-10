package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smart.refresh.layout.api.RefreshComponent;
import com.scwang.smart.refresh.layout.api.RefreshContent;
import com.scwang.smart.refresh.layout.api.RefreshFooter;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.DimensionStatus;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.scwang.smart.refresh.layout.kernel.R;
import com.scwang.smart.refresh.layout.listener.DefaultRefreshFooterCreator;
import com.scwang.smart.refresh.layout.listener.DefaultRefreshHeaderCreator;
import com.scwang.smart.refresh.layout.listener.DefaultRefreshInitializer;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnMultiListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.ScrollBoundaryDecider;
import com.scwang.smart.refresh.layout.util.SmartUtil;
import com.scwang.smart.refresh.layout.wrapper.RefreshContentWrapper;
import com.scwang.smart.refresh.layout.wrapper.RefreshFooterWrapper;
import com.scwang.smart.refresh.layout.wrapper.RefreshHeaderWrapper;

/* JADX INFO: loaded from: classes5.dex */
public class SmartRefreshLayout extends ViewGroup implements RefreshLayout, NestedScrollingParent {
    public static DefaultRefreshFooterCreator P1;
    public static DefaultRefreshHeaderCreator Q1;
    public static DefaultRefreshInitializer R1;
    public static final ViewGroup.MarginLayoutParams S1 = new ViewGroup.MarginLayoutParams(-1, -1);
    public int A0;
    public final Handler A1;
    public final Scroller B0;
    public final RefreshKernelImpl B1;
    public final VelocityTracker C0;
    public RefreshState C1;
    public Interpolator D0;
    public RefreshState D1;
    public int[] E0;
    public long E1;
    public boolean F0;
    public int F1;
    public boolean G0;
    public int G1;
    public boolean H0;
    public boolean H1;
    public boolean I0;
    public boolean I1;
    public boolean J0;
    public boolean J1;
    public boolean K0;
    public boolean K1;
    public boolean L0;
    public boolean L1;
    public final boolean M0;
    public MotionEvent M1;
    public boolean N0;
    public Runnable N1;
    public boolean O0;
    public ValueAnimator O1;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public OnRefreshListener c1;
    public OnLoadMoreListener d1;
    public final int e0;
    public OnMultiListener e1;
    public int f0;
    public ScrollBoundaryDecider f1;
    public int g0;
    public int g1;
    public int h0;
    public boolean h1;
    public int i0;
    public final int[] i1;
    public int j0;
    public final NestedScrollingChildHelper j1;
    public final int k0;
    public final NestedScrollingParentHelper k1;
    public float l0;
    public int l1;
    public float m0;
    public DimensionStatus m1;
    public float n0;
    public int n1;
    public float o0;
    public DimensionStatus o1;
    public float p0;
    public int p1;
    public char q0;
    public int q1;
    public boolean r0;
    public float r1;
    public boolean s0;
    public float s1;
    public boolean t0;
    public float t1;
    public int u0;
    public float u1;
    public int v0;
    public float v1;
    public int w0;
    public RefreshHeader w1;
    public int x0;
    public RefreshFooter x1;
    public final int y0;
    public RefreshContentWrapper y1;
    public final int z0;
    public Paint z1;

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$10, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass10 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33526a;

        static {
            int[] iArr = new int[RefreshState.values().length];
            f33526a = iArr;
            try {
                RefreshState refreshState = RefreshState.None;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f33526a;
                RefreshState refreshState2 = RefreshState.None;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f33526a;
                RefreshState refreshState3 = RefreshState.None;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f33526a;
                RefreshState refreshState4 = RefreshState.None;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f33526a;
                RefreshState refreshState5 = RefreshState.None;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f33526a;
                RefreshState refreshState6 = RefreshState.None;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f33526a;
                RefreshState refreshState7 = RefreshState.None;
                iArr7[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f33526a;
                RefreshState refreshState8 = RefreshState.None;
                iArr8[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f33526a;
                RefreshState refreshState9 = RefreshState.None;
                iArr9[9] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f33526a;
                RefreshState refreshState10 = RefreshState.None;
                iArr10[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f33526a;
                RefreshState refreshState11 = RefreshState.None;
                iArr11[11] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f33526a;
                RefreshState refreshState12 = RefreshState.None;
                iArr12[12] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$7, reason: invalid class name */
    class AnonymousClass7 implements Runnable {
        public int X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ int f33529Y;
        public final /* synthetic */ boolean Z;
        public final /* synthetic */ boolean e0;

        public AnonymousClass7(int i2, boolean z2, boolean z3) {
            this.f33529Y = i2;
            this.Z = z2;
            this.e0 = z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i2 = this.X;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            boolean z2 = this.Z;
            if (i2 == 0) {
                RefreshState refreshState = smartRefreshLayout.C1;
                RefreshState refreshState2 = RefreshState.None;
                if (refreshState == refreshState2 && smartRefreshLayout.D1 == RefreshState.Loading) {
                    smartRefreshLayout.D1 = refreshState2;
                } else {
                    ValueAnimator valueAnimator = smartRefreshLayout.O1;
                    if (valueAnimator != null && ((refreshState.e0 || refreshState == RefreshState.LoadReleased) && refreshState.f33544Y)) {
                        valueAnimator.setDuration(0L);
                        smartRefreshLayout.O1.cancel();
                        smartRefreshLayout.O1 = null;
                        if (smartRefreshLayout.B1.animSpinner(0) == null) {
                            smartRefreshLayout.r(refreshState2);
                        } else {
                            smartRefreshLayout.r(RefreshState.PullUpCanceled);
                        }
                    } else if (refreshState == RefreshState.Loading && smartRefreshLayout.x1 != null && smartRefreshLayout.y1 != null) {
                        this.X = i2 + 1;
                        smartRefreshLayout.A1.postDelayed(this, this.f33529Y);
                        smartRefreshLayout.r(RefreshState.LoadFinish);
                        return;
                    }
                }
                if (z2) {
                    smartRefreshLayout.setNoMoreData(true);
                    return;
                }
                return;
            }
            int iOnFinish = smartRefreshLayout.x1.onFinish(smartRefreshLayout, this.e0);
            OnMultiListener onMultiListener = smartRefreshLayout.e1;
            if (onMultiListener != null && smartRefreshLayout.x1 != null) {
                onMultiListener.getClass();
            }
            if (iOnFinish < Integer.MAX_VALUE) {
                boolean z3 = z2 && smartRefreshLayout.L0 && smartRefreshLayout.f0 < 0 && smartRefreshLayout.y1.canLoadMore();
                int i3 = smartRefreshLayout.f0;
                final int iMax = i3 - (z3 ? Math.max(i3, -smartRefreshLayout.n1) : 0);
                if (smartRefreshLayout.r0 || smartRefreshLayout.h1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (smartRefreshLayout.r0) {
                        float f = smartRefreshLayout.o0;
                        smartRefreshLayout.m0 = f;
                        smartRefreshLayout.h0 = smartRefreshLayout.f0 - iMax;
                        smartRefreshLayout.r0 = false;
                        float f2 = smartRefreshLayout.K0 ? iMax : 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.n0, f + f2 + (smartRefreshLayout.e0 * 2), 0));
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.n0, smartRefreshLayout.o0 + f2, 0));
                    }
                    if (smartRefreshLayout.h1) {
                        smartRefreshLayout.g1 = 0;
                        SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.n0, smartRefreshLayout.o0, 0));
                        smartRefreshLayout.h1 = false;
                        smartRefreshLayout.h0 = 0;
                    }
                }
                smartRefreshLayout.A1.postDelayed(new Runnable() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished;
                        ValueAnimator valueAnimatorAnimSpinner;
                        AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        if (!smartRefreshLayout2.R0 || iMax >= 0) {
                            animatorUpdateListenerScrollContentWhenFinished = null;
                        } else {
                            animatorUpdateListenerScrollContentWhenFinished = smartRefreshLayout2.y1.scrollContentWhenFinished(smartRefreshLayout2.f0);
                            if (animatorUpdateListenerScrollContentWhenFinished != null) {
                                animatorUpdateListenerScrollContentWhenFinished.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                            }
                        }
                        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.7.1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                if (animator == null || animator.getDuration() != 0) {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    AnonymousClass7 anonymousClass8 = AnonymousClass7.this;
                                    SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                                    smartRefreshLayout3.K1 = false;
                                    if (anonymousClass8.Z) {
                                        smartRefreshLayout3.setNoMoreData(true);
                                    }
                                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                                    if (smartRefreshLayout4.C1 == RefreshState.LoadFinish) {
                                        smartRefreshLayout4.r(RefreshState.None);
                                    }
                                }
                            }
                        };
                        int i4 = smartRefreshLayout2.f0;
                        if (i4 > 0) {
                            valueAnimatorAnimSpinner = smartRefreshLayout2.B1.animSpinner(0);
                        } else {
                            if (animatorUpdateListenerScrollContentWhenFinished != null || i4 == 0) {
                                ValueAnimator valueAnimator2 = smartRefreshLayout2.O1;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.setDuration(0L);
                                    smartRefreshLayout2.O1.cancel();
                                    smartRefreshLayout2.O1 = null;
                                }
                                smartRefreshLayout2.B1.moveSpinner(0, false);
                                smartRefreshLayout2.B1.setState(RefreshState.None);
                            } else if (anonymousClass7.Z && smartRefreshLayout2.L0) {
                                int i5 = -smartRefreshLayout2.n1;
                                if (i4 >= i5) {
                                    smartRefreshLayout2.r(RefreshState.None);
                                } else {
                                    valueAnimatorAnimSpinner = smartRefreshLayout2.B1.animSpinner(i5);
                                }
                            } else {
                                valueAnimatorAnimSpinner = smartRefreshLayout2.B1.animSpinner(0);
                            }
                            valueAnimatorAnimSpinner = null;
                        }
                        if (valueAnimatorAnimSpinner != null) {
                            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
                        } else {
                            animatorListenerAdapter.onAnimationEnd(null);
                        }
                    }
                }, smartRefreshLayout.f0 < 0 ? iOnFinish : 0L);
            }
        }
    }

    public class BounceRunnable implements Runnable {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f33533Y;
        public float f0;
        public int X = 0;
        public float e0 = 0.0f;
        public long Z = AnimationUtils.currentAnimationTimeMillis();

        public BounceRunnable(float f, int i2) {
            this.f0 = f;
            this.f33533Y = i2;
            SmartRefreshLayout.this.A1.postDelayed(this, 10);
            RefreshKernelImpl refreshKernelImpl = SmartRefreshLayout.this.B1;
            if (f > 0.0f) {
                refreshKernelImpl.setState(RefreshState.PullDownToRefresh);
            } else {
                refreshKernelImpl.setState(RefreshState.PullUpToLoad);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N1 != this || smartRefreshLayout.C1.g0) {
                return;
            }
            int iAbs = Math.abs(smartRefreshLayout.f0);
            int i2 = this.f33533Y;
            if (iAbs < Math.abs(i2)) {
                double d = this.f0;
                int i3 = this.X + 1;
                this.X = i3;
                this.f0 = (float) (Math.pow(0.949999988079071d, i3 * 2) * d);
            } else if (i2 != 0) {
                double d2 = this.f0;
                int i4 = this.X + 1;
                this.X = i4;
                this.f0 = (float) (Math.pow(0.44999998807907104d, i4 * 2) * d2);
            } else {
                double d3 = this.f0;
                int i5 = this.X + 1;
                this.X = i5;
                this.f0 = (float) (Math.pow(0.8500000238418579d, i5 * 2) * d3);
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = this.f0 * (((jCurrentAnimationTimeMillis - this.Z) * 1.0f) / 1000.0f);
            if (Math.abs(f) >= 1.0f) {
                this.Z = jCurrentAnimationTimeMillis;
                float f2 = this.e0 + f;
                this.e0 = f2;
                smartRefreshLayout.q(f2);
                smartRefreshLayout.A1.postDelayed(this, 10);
                return;
            }
            RefreshState refreshState = smartRefreshLayout.D1;
            boolean z2 = refreshState.e0;
            if (z2 && refreshState.X) {
                smartRefreshLayout.B1.setState(RefreshState.PullDownCanceled);
            } else if (z2 && refreshState.f33544Y) {
                smartRefreshLayout.B1.setState(RefreshState.PullUpCanceled);
            }
            smartRefreshLayout.N1 = null;
            if (Math.abs(smartRefreshLayout.f0) >= Math.abs(i2)) {
                smartRefreshLayout.g(i2, 0, smartRefreshLayout.D0, Math.min(Math.max((int) (Math.abs(smartRefreshLayout.f0 - i2) / SmartUtil.f33556a), 30), 100) * 10);
            }
        }
    }

    public class FlingRunnable implements Runnable {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public float f33534Y;
        public long Z = 0;
        public long e0 = AnimationUtils.currentAnimationTimeMillis();

        public FlingRunnable(float f) {
            this.f33534Y = f;
            this.X = SmartRefreshLayout.this.f0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.N1 != this || smartRefreshLayout.C1.g0) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = jCurrentAnimationTimeMillis - this.e0;
            float fPow = (float) (Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.Z) / (1000.0f / 10)) * ((double) this.f33534Y));
            this.f33534Y = fPow;
            float f = ((j * 1.0f) / 1000.0f) * fPow;
            if (Math.abs(f) <= 1.0f) {
                smartRefreshLayout.N1 = null;
                return;
            }
            this.e0 = jCurrentAnimationTimeMillis;
            int i2 = (int) (this.X + f);
            this.X = i2;
            if (smartRefreshLayout.f0 * i2 > 0) {
                smartRefreshLayout.B1.moveSpinner(i2, true);
                smartRefreshLayout.A1.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout.N1 = null;
            smartRefreshLayout.B1.moveSpinner(0, true);
            View view = smartRefreshLayout.y1.Z;
            int i3 = (int) (-this.f33534Y);
            float f2 = SmartUtil.f33556a;
            if (view instanceof ScrollView) {
                ((ScrollView) view).fling(i3);
            } else if (view instanceof AbsListView) {
                ((AbsListView) view).fling(i3);
            } else if (view instanceof WebView) {
                ((WebView) view).flingScroll(0, i3);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).e(i3);
            } else if (view instanceof RecyclerView) {
                ((RecyclerView) view).fling(0, i3);
            }
            if (!smartRefreshLayout.K1 || f <= 0.0f) {
                return;
            }
            smartRefreshLayout.K1 = false;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SpinnerStyle f33536b;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f33535a = 0;
            this.f33536b = null;
        }
    }

    public class RefreshKernelImpl implements RefreshKernel {
        public RefreshKernelImpl() {
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final ValueAnimator animSpinner(int i2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.g(i2, 0, smartRefreshLayout.D0, smartRefreshLayout.j0);
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel finishTwoLevel() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.C1 == RefreshState.TwoLevel) {
                smartRefreshLayout.B1.setState(RefreshState.TwoLevelFinish);
                if (smartRefreshLayout.f0 == 0) {
                    moveSpinner(0, false);
                    smartRefreshLayout.r(RefreshState.None);
                    return this;
                }
                animSpinner(0).setDuration(smartRefreshLayout.i0);
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshContent getRefreshContent() {
            return SmartRefreshLayout.this.y1;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshLayout getRefreshLayout() {
            return SmartRefreshLayout.this;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x009c  */
        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel moveSpinner(int i2, boolean z2) {
            OnMultiListener onMultiListener;
            OnMultiListener onMultiListener2;
            int i3;
            boolean z3;
            RefreshFooter refreshFooter;
            RefreshHeader refreshHeader;
            RefreshFooter refreshFooter2;
            RefreshHeader refreshHeader2;
            RefreshFooter refreshFooter3;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f0 != i2 || (((refreshHeader2 = smartRefreshLayout.w1) != null && refreshHeader2.isSupportHorizontalDrag()) || ((refreshFooter3 = smartRefreshLayout.x1) != null && refreshFooter3.isSupportHorizontalDrag()))) {
                int i4 = smartRefreshLayout.f0;
                smartRefreshLayout.f0 = i2;
                float f = 10.0f;
                if (z2) {
                    RefreshState refreshState = smartRefreshLayout.D1;
                    if (refreshState.e0 || refreshState.f0) {
                        float f2 = i2;
                        float f3 = smartRefreshLayout.t1;
                        if (f3 < 10.0f) {
                            f3 *= smartRefreshLayout.l1;
                        }
                        if (f2 <= f3) {
                            float f4 = -i2;
                            float f5 = smartRefreshLayout.u1;
                            if (f5 < 10.0f) {
                                f5 *= smartRefreshLayout.n1;
                            }
                            if (f4 > f5 && !smartRefreshLayout.X0) {
                                smartRefreshLayout.B1.setState(RefreshState.ReleaseToLoad);
                            } else if (i2 < 0 && !smartRefreshLayout.X0) {
                                smartRefreshLayout.B1.setState(RefreshState.PullUpToLoad);
                            } else if (i2 > 0) {
                                smartRefreshLayout.B1.setState(RefreshState.PullDownToRefresh);
                            }
                        } else if (smartRefreshLayout.C1 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout.B1.setState(RefreshState.ReleaseToRefresh);
                        }
                    }
                }
                RefreshContentWrapper refreshContentWrapper = smartRefreshLayout.y1;
                SpinnerStyle spinnerStyle = SpinnerStyle.d;
                if (refreshContentWrapper != null) {
                    if (i2 >= 0) {
                        if (smartRefreshLayout.p(smartRefreshLayout.w1, smartRefreshLayout.J0)) {
                            i3 = i2;
                        } else if (i4 < 0) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        i3 = 0;
                        z3 = false;
                    }
                    if (i2 <= 0) {
                        if (smartRefreshLayout.p(smartRefreshLayout.x1, smartRefreshLayout.K0)) {
                            i3 = i2;
                        } else if (i4 > 0) {
                            i3 = 0;
                        }
                        z3 = true;
                    }
                    if (z3) {
                        smartRefreshLayout.y1.moveSpinner(i3, smartRefreshLayout.w0, smartRefreshLayout.x0);
                        if (smartRefreshLayout.X0 && smartRefreshLayout.Y0 && smartRefreshLayout.L0 && (refreshFooter2 = smartRefreshLayout.x1) != null && refreshFooter2.getSpinnerStyle() == spinnerStyle && smartRefreshLayout.l(smartRefreshLayout.G0)) {
                            smartRefreshLayout.x1.getView().setTranslationY(Math.max(0, i3));
                        }
                        boolean z4 = smartRefreshLayout.H0;
                        SpinnerStyle spinnerStyle2 = SpinnerStyle.f33545e;
                        boolean z5 = (z4 && (refreshHeader = smartRefreshLayout.w1) != null && refreshHeader.getSpinnerStyle() == spinnerStyle2) || smartRefreshLayout.F1 != 0;
                        boolean z6 = (smartRefreshLayout.I0 && (refreshFooter = smartRefreshLayout.x1) != null && refreshFooter.getSpinnerStyle() == spinnerStyle2) || smartRefreshLayout.G1 != 0;
                        if ((z5 && (i3 >= 0 || i4 > 0)) || (z6 && (i3 <= 0 || i4 < 0))) {
                            smartRefreshLayout.invalidate();
                        }
                    }
                }
                float f6 = 1.0f;
                if ((i2 >= 0 || i4 > 0) && smartRefreshLayout.w1 != null) {
                    int iMax = Math.max(i2, 0);
                    int i5 = smartRefreshLayout.l1;
                    float f7 = smartRefreshLayout.r1;
                    if (f7 < 10.0f) {
                        f7 *= i5;
                    }
                    int i6 = (int) f7;
                    float f8 = iMax * 1.0f;
                    float f9 = smartRefreshLayout.t1;
                    if (f9 < 10.0f) {
                        f9 *= i5;
                    }
                    float f10 = f8 / f9;
                    if (smartRefreshLayout.l(smartRefreshLayout.F0) || (smartRefreshLayout.C1 == RefreshState.RefreshFinish && !z2)) {
                        if (i4 != smartRefreshLayout.f0) {
                            if (smartRefreshLayout.w1.getSpinnerStyle() == spinnerStyle) {
                                smartRefreshLayout.w1.getView().setTranslationY(smartRefreshLayout.f0);
                                if (smartRefreshLayout.F1 != 0 && smartRefreshLayout.z1 != null) {
                                    if (!smartRefreshLayout.p(smartRefreshLayout.w1, smartRefreshLayout.J0)) {
                                        smartRefreshLayout.invalidate();
                                    }
                                }
                            } else {
                                if (smartRefreshLayout.w1.getSpinnerStyle().f33549c) {
                                    View view = smartRefreshLayout.w1.getView();
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : SmartRefreshLayout.S1;
                                    view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((smartRefreshLayout.f0 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                                    int i7 = marginLayoutParams.leftMargin;
                                    int i8 = marginLayoutParams.topMargin + smartRefreshLayout.p1;
                                    view.layout(i7, i8, view.getMeasuredWidth() + i7, view.getMeasuredHeight() + i8);
                                }
                                smartRefreshLayout.w1.onMoving(z2, f10, iMax, i5, i6);
                            }
                            smartRefreshLayout.w1.onMoving(z2, f10, iMax, i5, i6);
                        } else {
                            f = 10.0f;
                            f6 = 1.0f;
                        }
                        if (z2 && smartRefreshLayout.w1.isSupportHorizontalDrag()) {
                            int i9 = (int) smartRefreshLayout.n0;
                            int width = smartRefreshLayout.getWidth();
                            smartRefreshLayout.w1.onHorizontalDrag(smartRefreshLayout.n0 / (width == 0 ? 1 : width), i9, width);
                        }
                    } else {
                        f = 10.0f;
                        f6 = 1.0f;
                    }
                    if (i4 != smartRefreshLayout.f0 && (onMultiListener = smartRefreshLayout.e1) != null && smartRefreshLayout.w1 != null) {
                        onMultiListener.getClass();
                    }
                } else {
                    f = 10.0f;
                    f6 = 1.0f;
                }
                if ((i2 <= 0 || i4 < 0) && smartRefreshLayout.x1 != null) {
                    int i10 = -Math.min(i2, 0);
                    int i11 = smartRefreshLayout.n1;
                    float f11 = smartRefreshLayout.s1;
                    if (f11 < f) {
                        f11 *= i11;
                    }
                    int i12 = (int) f11;
                    float f12 = i10 * f6;
                    float f13 = smartRefreshLayout.u1;
                    if (f13 < f) {
                        f13 *= i11;
                    }
                    float f14 = f12 / f13;
                    if (smartRefreshLayout.l(smartRefreshLayout.G0) || (smartRefreshLayout.C1 == RefreshState.LoadFinish && !z2)) {
                        if (i4 != smartRefreshLayout.f0) {
                            if (smartRefreshLayout.x1.getSpinnerStyle() == spinnerStyle) {
                                smartRefreshLayout.x1.getView().setTranslationY(smartRefreshLayout.f0);
                                if (smartRefreshLayout.G1 != 0 && smartRefreshLayout.z1 != null) {
                                    if (!smartRefreshLayout.p(smartRefreshLayout.x1, smartRefreshLayout.K0)) {
                                        smartRefreshLayout.invalidate();
                                    }
                                }
                            } else if (smartRefreshLayout.x1.getSpinnerStyle().f33549c) {
                                View view2 = smartRefreshLayout.x1.getView();
                                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : SmartRefreshLayout.S1;
                                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(((-smartRefreshLayout.f0) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0), 1073741824));
                                int i13 = marginLayoutParams2.leftMargin;
                                int measuredHeight = (smartRefreshLayout.getMeasuredHeight() + marginLayoutParams2.topMargin) - smartRefreshLayout.q1;
                                view2.layout(i13, measuredHeight - view2.getMeasuredHeight(), view2.getMeasuredWidth() + i13, measuredHeight);
                            }
                            smartRefreshLayout.x1.onMoving(z2, f14, i10, i11, i12);
                        }
                        if (z2 && smartRefreshLayout.x1.isSupportHorizontalDrag()) {
                            int i14 = (int) smartRefreshLayout.n0;
                            int width2 = smartRefreshLayout.getWidth();
                            smartRefreshLayout.x1.onHorizontalDrag(smartRefreshLayout.n0 / (width2 == 0 ? 1 : width2), i14, width2);
                        }
                    }
                    if (i4 != smartRefreshLayout.f0 && (onMultiListener2 = smartRefreshLayout.e1) != null && smartRefreshLayout.x1 != null) {
                        onMultiListener2.getClass();
                    }
                }
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel onAutoLoadMoreAnimationEnd(Animator animator, boolean z2) {
            if (animator != null && animator.getDuration() == 0) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.O1 = null;
            if (smartRefreshLayout.x1 == null) {
                setState(RefreshState.None);
                return this;
            }
            RefreshState refreshState = smartRefreshLayout.C1;
            RefreshState refreshState2 = RefreshState.ReleaseToLoad;
            if (refreshState != refreshState2) {
                setState(refreshState2);
            }
            smartRefreshLayout.setStateLoading(!z2);
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel onAutoRefreshAnimationEnd(Animator animator, boolean z2) {
            if (animator != null && animator.getDuration() == 0) {
                return this;
            }
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            smartRefreshLayout.O1 = null;
            if (smartRefreshLayout.w1 == null) {
                setState(RefreshState.None);
                return this;
            }
            RefreshState refreshState = smartRefreshLayout.C1;
            RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
            if (refreshState != refreshState2) {
                setState(refreshState2);
            }
            smartRefreshLayout.setStateRefreshing(!z2);
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestDefaultTranslationContentFor(RefreshComponent refreshComponent, boolean z2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (refreshComponent.equals(smartRefreshLayout.w1)) {
                if (!smartRefreshLayout.a1) {
                    smartRefreshLayout.a1 = true;
                    smartRefreshLayout.J0 = z2;
                    return this;
                }
            } else if (refreshComponent.equals(smartRefreshLayout.x1) && !smartRefreshLayout.b1) {
                smartRefreshLayout.b1 = true;
                smartRefreshLayout.K0 = z2;
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestDrawBackgroundFor(RefreshComponent refreshComponent, int i2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.z1 == null && i2 != 0) {
                smartRefreshLayout.z1 = new Paint();
            }
            if (refreshComponent.equals(smartRefreshLayout.w1)) {
                smartRefreshLayout.F1 = i2;
                return this;
            }
            if (refreshComponent.equals(smartRefreshLayout.x1)) {
                smartRefreshLayout.G1 = i2;
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestFloorBottomPullUpToCloseRate(float f) {
            SmartRefreshLayout.this.v1 = f;
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestFloorDuration(int i2) {
            SmartRefreshLayout.this.i0 = i2;
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestNeedTouchEventFor(RefreshComponent refreshComponent, boolean z2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (refreshComponent.equals(smartRefreshLayout.w1)) {
                smartRefreshLayout.H1 = z2;
                return this;
            }
            if (refreshComponent.equals(smartRefreshLayout.x1)) {
                smartRefreshLayout.I1 = z2;
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel requestRemeasureHeightFor(RefreshComponent refreshComponent) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (refreshComponent.equals(smartRefreshLayout.w1)) {
                DimensionStatus dimensionStatus = smartRefreshLayout.m1;
                if (dimensionStatus.f33543b) {
                    smartRefreshLayout.m1 = dimensionStatus.b();
                    return this;
                }
            } else if (refreshComponent.equals(smartRefreshLayout.x1)) {
                DimensionStatus dimensionStatus2 = smartRefreshLayout.o1;
                if (dimensionStatus2.f33543b) {
                    smartRefreshLayout.o1 = dimensionStatus2.b();
                }
            }
            return this;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel setState(RefreshState refreshState) {
            int iOrdinal = refreshState.ordinal();
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            switch (iOrdinal) {
                case 0:
                    RefreshState refreshState2 = smartRefreshLayout.C1;
                    RefreshState refreshState3 = RefreshState.None;
                    if (refreshState2 != refreshState3 && smartRefreshLayout.f0 == 0) {
                        smartRefreshLayout.r(refreshState3);
                    } else if (smartRefreshLayout.f0 != 0) {
                        animSpinner(0);
                    }
                    break;
                case 1:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.F0)) {
                        smartRefreshLayout.r(RefreshState.PullDownToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 2:
                    if (smartRefreshLayout.l(smartRefreshLayout.G0)) {
                        RefreshState refreshState4 = smartRefreshLayout.C1;
                        if (!refreshState4.f0 && !refreshState4.g0 && (!smartRefreshLayout.X0 || !smartRefreshLayout.L0 || !smartRefreshLayout.Y0)) {
                            smartRefreshLayout.r(RefreshState.PullUpToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 3:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.F0)) {
                        smartRefreshLayout.r(RefreshState.PullDownCanceled);
                        setState(RefreshState.None);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 4:
                    if (!smartRefreshLayout.l(smartRefreshLayout.G0) || smartRefreshLayout.C1.f0 || (smartRefreshLayout.X0 && smartRefreshLayout.L0 && smartRefreshLayout.Y0)) {
                        smartRefreshLayout.setViceState(RefreshState.PullUpCanceled);
                    } else {
                        smartRefreshLayout.r(RefreshState.PullUpCanceled);
                        setState(RefreshState.None);
                    }
                    break;
                case 5:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.F0)) {
                        smartRefreshLayout.r(RefreshState.ReleaseToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 6:
                    if (smartRefreshLayout.l(smartRefreshLayout.G0)) {
                        RefreshState refreshState5 = smartRefreshLayout.C1;
                        if (!refreshState5.f0 && !refreshState5.g0 && (!smartRefreshLayout.X0 || !smartRefreshLayout.L0 || !smartRefreshLayout.Y0)) {
                            smartRefreshLayout.r(RefreshState.ReleaseToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 7:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.F0)) {
                        smartRefreshLayout.r(RefreshState.ReleaseToTwoLevel);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 8:
                default:
                    smartRefreshLayout.r(refreshState);
                    break;
                case 9:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.F0)) {
                        smartRefreshLayout.r(RefreshState.RefreshReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    if (!smartRefreshLayout.C1.f0 && smartRefreshLayout.l(smartRefreshLayout.G0)) {
                        smartRefreshLayout.r(RefreshState.LoadReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    smartRefreshLayout.setStateRefreshing(true);
                    break;
                case 12:
                    smartRefreshLayout.setStateLoading(true);
                    break;
            }
            return null;
        }

        @Override // com.scwang.smart.refresh.layout.api.RefreshKernel
        public final RefreshKernel startTwoLevel(boolean z2) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (!z2) {
                if (animSpinner(0) == null) {
                    smartRefreshLayout.r(RefreshState.None);
                }
                return this;
            }
            AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.RefreshKernelImpl.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (animator == null || animator.getDuration() != 0) {
                        SmartRefreshLayout.this.B1.setState(RefreshState.TwoLevel);
                    }
                }
            };
            ValueAnimator valueAnimatorAnimSpinner = animSpinner(smartRefreshLayout.getMeasuredHeight());
            if (valueAnimatorAnimSpinner == null || valueAnimatorAnimSpinner != smartRefreshLayout.O1) {
                animatorListenerAdapter.onAnimationEnd(null);
                return this;
            }
            valueAnimatorAnimSpinner.setDuration(smartRefreshLayout.i0);
            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
            return this;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i0 = 300;
        this.j0 = 300;
        this.p0 = 0.5f;
        this.q0 = 'n';
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.F0 = true;
        this.G0 = false;
        this.H0 = true;
        this.I0 = true;
        this.J0 = true;
        this.K0 = true;
        this.L0 = false;
        this.M0 = true;
        this.N0 = true;
        this.O0 = false;
        this.P0 = true;
        this.Q0 = false;
        this.R0 = true;
        this.S0 = true;
        this.T0 = true;
        this.U0 = true;
        this.V0 = false;
        this.W0 = false;
        this.X0 = false;
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = false;
        this.b1 = false;
        this.i1 = new int[2];
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(this);
        this.j1 = nestedScrollingChildHelper;
        this.k1 = new NestedScrollingParentHelper();
        DimensionStatus dimensionStatus = DimensionStatus.f33538c;
        this.m1 = dimensionStatus;
        this.o1 = dimensionStatus;
        this.r1 = 2.5f;
        this.s1 = 2.5f;
        this.t1 = 1.0f;
        this.u1 = 1.0f;
        this.v1 = 0.16666667f;
        this.B1 = new RefreshKernelImpl();
        RefreshState refreshState = RefreshState.None;
        this.C1 = refreshState;
        this.D1 = refreshState;
        this.E1 = 0L;
        this.F1 = 0;
        this.G1 = 0;
        this.K1 = false;
        this.L1 = false;
        this.M1 = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A1 = new Handler(Looper.getMainLooper());
        this.B0 = new Scroller(context);
        this.C0 = VelocityTracker.obtain();
        this.k0 = context.getResources().getDisplayMetrics().heightPixels;
        this.D0 = new SmartUtil();
        this.e0 = viewConfiguration.getScaledTouchSlop();
        this.y0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.z0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n1 = SmartUtil.c(60.0f);
        this.l1 = SmartUtil.c(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f33550a);
        if (!typedArrayObtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        DefaultRefreshInitializer defaultRefreshInitializer = R1;
        if (defaultRefreshInitializer != null) {
            defaultRefreshInitializer.initialize();
        }
        this.p0 = typedArrayObtainStyledAttributes.getFloat(5, this.p0);
        this.r1 = typedArrayObtainStyledAttributes.getFloat(32, this.r1);
        this.s1 = typedArrayObtainStyledAttributes.getFloat(27, this.s1);
        this.t1 = typedArrayObtainStyledAttributes.getFloat(34, this.t1);
        this.u1 = typedArrayObtainStyledAttributes.getFloat(29, this.u1);
        this.F0 = typedArrayObtainStyledAttributes.getBoolean(20, this.F0);
        this.j0 = typedArrayObtainStyledAttributes.getInt(36, this.j0);
        this.G0 = typedArrayObtainStyledAttributes.getBoolean(13, this.G0);
        this.l1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(30, this.l1);
        this.n1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(25, this.n1);
        this.p1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(31, this.p1);
        this.q1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(26, this.q1);
        this.V0 = typedArrayObtainStyledAttributes.getBoolean(4, this.V0);
        this.W0 = typedArrayObtainStyledAttributes.getBoolean(3, this.W0);
        this.J0 = typedArrayObtainStyledAttributes.getBoolean(12, this.J0);
        this.K0 = typedArrayObtainStyledAttributes.getBoolean(11, this.K0);
        this.M0 = typedArrayObtainStyledAttributes.getBoolean(18, true);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(6, this.P0);
        this.N0 = typedArrayObtainStyledAttributes.getBoolean(16, this.N0);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(19, this.Q0);
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(21, this.R0);
        this.S0 = typedArrayObtainStyledAttributes.getBoolean(22, this.S0);
        this.T0 = typedArrayObtainStyledAttributes.getBoolean(14, this.T0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(9, this.L0);
        this.L0 = z2;
        this.L0 = typedArrayObtainStyledAttributes.getBoolean(10, z2);
        this.H0 = typedArrayObtainStyledAttributes.getBoolean(8, this.H0);
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(7, this.I0);
        this.O0 = typedArrayObtainStyledAttributes.getBoolean(17, this.O0);
        this.u0 = typedArrayObtainStyledAttributes.getResourceId(24, this.u0);
        this.v0 = typedArrayObtainStyledAttributes.getResourceId(23, this.v0);
        this.w0 = typedArrayObtainStyledAttributes.getResourceId(33, this.w0);
        this.x0 = typedArrayObtainStyledAttributes.getResourceId(28, this.x0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(15, this.U0);
        this.U0 = z3;
        nestedScrollingChildHelper.g(z3);
        this.Z0 = this.Z0 || typedArrayObtainStyledAttributes.hasValue(13);
        this.a1 = this.a1 || typedArrayObtainStyledAttributes.hasValue(12);
        this.b1 = this.b1 || typedArrayObtainStyledAttributes.hasValue(11);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(30);
        DimensionStatus dimensionStatus2 = DimensionStatus.f;
        this.m1 = zHasValue ? dimensionStatus2 : this.m1;
        this.o1 = typedArrayObtainStyledAttributes.hasValue(25) ? dimensionStatus2 : this.o1;
        int color = typedArrayObtainStyledAttributes.getColor(2, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(35, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.E0 = new int[]{color2, color};
            } else {
                this.E0 = new int[]{color2};
            }
        } else if (color != 0) {
            this.E0 = new int[]{0, color};
        }
        if (this.Q0 && !this.Z0 && !this.G0) {
            this.G0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setDefaultRefreshFooterCreator(DefaultRefreshFooterCreator defaultRefreshFooterCreator) {
        P1 = defaultRefreshFooterCreator;
    }

    public static void setDefaultRefreshHeaderCreator(DefaultRefreshHeaderCreator defaultRefreshHeaderCreator) {
        Q1 = defaultRefreshHeaderCreator;
    }

    public static void setDefaultRefreshInitializer(DefaultRefreshInitializer defaultRefreshInitializer) {
        R1 = defaultRefreshInitializer;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoLoadMore() {
        return autoLoadMore(0, this.j0, (this.s1 + this.u1) / 2.0f, false);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoLoadMoreAnimationOnly() {
        return autoLoadMore(0, this.j0, (this.s1 + this.u1) / 2.0f, true);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoRefresh() {
        return autoRefresh(this.J1 ? 0 : 400, this.j0, (this.r1 + this.t1) / 2.0f, false);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoRefreshAnimationOnly() {
        return autoRefresh(this.J1 ? 0 : 400, this.j0, (this.r1 + this.t1) / 2.0f, true);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout closeHeaderOrFooter() {
        RefreshState refreshState;
        RefreshState refreshState2 = this.C1;
        RefreshState refreshState3 = RefreshState.None;
        if (refreshState2 == refreshState3 && ((refreshState = this.D1) == RefreshState.Refreshing || refreshState == RefreshState.Loading)) {
            this.D1 = refreshState3;
        }
        if (refreshState2 == RefreshState.Refreshing) {
            finishRefresh(true);
            return this;
        }
        if (refreshState2 == RefreshState.Loading) {
            finishLoadMore(true);
            return this;
        }
        if (this.B1.animSpinner(0) == null) {
            r(refreshState3);
            return this;
        }
        if (this.C1.X) {
            r(RefreshState.PullDownCanceled);
            return this;
        }
        r(RefreshState.PullUpCanceled);
        return this;
    }

    @Override // android.view.View
    public final void computeScroll() {
        RefreshState refreshState;
        Scroller scroller = this.B0;
        scroller.getCurrY();
        if (scroller.computeScrollOffset()) {
            int finalY = scroller.getFinalY();
            if ((finalY >= 0 || !((this.F0 || this.O0) && this.y1.canRefresh())) && (finalY <= 0 || !((this.G0 || this.O0) && this.y1.canLoadMore()))) {
                this.L1 = true;
                invalidate();
                return;
            }
            if (this.L1) {
                float currVelocity = finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity();
                if (this.O1 == null) {
                    if (currVelocity > 0.0f && ((refreshState = this.C1) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                        this.N1 = new BounceRunnable(currVelocity, this.l1);
                    } else if (currVelocity < 0.0f && (this.C1 == RefreshState.Loading || ((this.L0 && this.X0 && this.Y0 && l(this.G0)) || (this.P0 && !this.X0 && l(this.G0) && this.C1 != RefreshState.Refreshing)))) {
                        this.N1 = new BounceRunnable(currVelocity, -this.n1);
                    } else if (this.f0 == 0 && this.N0) {
                        this.N1 = new BounceRunnable(currVelocity, 0);
                    }
                }
            }
            scroller.forceFinished(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0161  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:132:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:165:0x01df  */
    /* JADX WARN: Code duplicated, block: B:177:0x0203  */
    /* JADX WARN: Code duplicated, block: B:180:0x0234  */
    /* JADX WARN: Code duplicated, block: B:186:0x0241  */
    /* JADX WARN: Code duplicated, block: B:193:0x025d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:201:0x027b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x0284  */
    /* JADX WARN: Code duplicated, block: B:210:0x028e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0296  */
    /* JADX WARN: Code duplicated, block: B:218:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:225:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:231:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:235:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:237:0x0323  */
    /* JADX WARN: Code duplicated, block: B:239:0x0334  */
    /* JADX WARN: Code duplicated, block: B:243:0x033d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dc, code lost:
    
        if (r2.f33544Y != false) goto L246;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Paint paint;
        Paint paint2;
        RefreshContentWrapper refreshContentWrapper = this.y1;
        View view2 = refreshContentWrapper != null ? refreshContentWrapper.X : null;
        RefreshHeader refreshHeader = this.w1;
        SpinnerStyle spinnerStyle = SpinnerStyle.f33545e;
        SpinnerStyle spinnerStyle2 = SpinnerStyle.d;
        boolean z2 = this.M0;
        if (refreshHeader != null && refreshHeader.getView() == view) {
            if (!l(this.F0)) {
                return true;
            }
            if (!z2 && isInEditMode()) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f0, view.getTop());
                int i2 = this.F1;
                if (i2 != 0 && (paint2 = this.z1) != null) {
                    paint2.setColor(i2);
                    if (this.w1.getSpinnerStyle().f33549c) {
                        iMax = view.getBottom();
                    } else if (this.w1.getSpinnerStyle() == spinnerStyle2) {
                        iMax = view.getBottom() + this.f0;
                    }
                    int i3 = iMax;
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), i3, this.z1);
                    iMax = i3;
                }
                if ((this.H0 && this.w1.getSpinnerStyle() == spinnerStyle) || this.w1.getSpinnerStyle().f33549c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null && refreshFooter.getView() == view) {
            if (!l(this.G0)) {
                return true;
            }
            if (!z2 && isInEditMode()) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f0, view.getBottom());
                int i4 = this.G1;
                if (i4 != 0 && (paint = this.z1) != null) {
                    paint.setColor(i4);
                    if (this.x1.getSpinnerStyle().f33549c) {
                        iMin = view.getTop();
                    } else if (this.x1.getSpinnerStyle() == spinnerStyle2) {
                        iMin = view.getTop() + this.f0;
                    }
                    int i5 = iMin;
                    canvas.drawRect(0.0f, i5, getWidth(), view.getBottom(), this.z1);
                    iMin = i5;
                }
                if ((this.I0 && this.x1.getSpinnerStyle() == spinnerStyle) || this.x1.getSpinnerStyle().f33549c) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishLoadMore() {
        finishLoadMore(true);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishLoadMoreWithNoMoreData() {
        finishLoadMore(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E1))), 300) << 16, true, true);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishRefresh() {
        finishRefresh(true);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishRefreshWithNoMoreData() {
        finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E1))), 300) << 16, true, Boolean.TRUE);
        return this;
    }

    public final ValueAnimator g(int i2, int i3, Interpolator interpolator, int i4) {
        if (this.f0 == i2) {
            return null;
        }
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.O1.cancel();
            this.O1 = null;
        }
        this.N1 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f0, i2);
        this.O1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i4);
        this.O1.setInterpolator(interpolator);
        this.O1.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                RefreshState refreshState;
                RefreshState refreshState2;
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.O1 = null;
                    if (smartRefreshLayout.f0 == 0 && (refreshState = smartRefreshLayout.C1) != (refreshState2 = RefreshState.None) && !refreshState.f0 && !refreshState.e0) {
                        smartRefreshLayout.r(refreshState2);
                        return;
                    }
                    RefreshState refreshState3 = smartRefreshLayout.C1;
                    if (refreshState3 != smartRefreshLayout.D1) {
                        smartRefreshLayout.setViceState(refreshState3);
                    }
                }
            }
        });
        this.O1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SmartRefreshLayout.this.B1.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), false);
            }
        });
        this.O1.setStartDelay(i3);
        this.O1.start();
        return this.O1;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f33535a = 0;
        layoutParams.f33536b = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f33551b);
        layoutParams.f33535a = typedArrayObtainStyledAttributes.getColor(0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            layoutParams.f33536b = SpinnerStyle.f33546h[typedArrayObtainStyledAttributes.getInt(1, 0)];
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public ViewGroup getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.k1;
        return nestedScrollingParentHelper.f4454b | nestedScrollingParentHelper.f4453a;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public RefreshFooter getRefreshFooter() {
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null) {
            return refreshFooter;
        }
        return null;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public RefreshHeader getRefreshHeader() {
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader != null) {
            return refreshHeader;
        }
        return null;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public RefreshState getState() {
        return this.C1;
    }

    public final boolean h(int i2) {
        if (i2 == 0) {
            if (this.O1 != null) {
                RefreshState refreshState = this.C1;
                if (refreshState.g0 || refreshState == RefreshState.TwoLevelReleased || refreshState == RefreshState.RefreshReleased || refreshState == RefreshState.LoadReleased) {
                    return true;
                }
                RefreshState refreshState2 = RefreshState.PullDownCanceled;
                RefreshKernelImpl refreshKernelImpl = this.B1;
                if (refreshState == refreshState2) {
                    refreshKernelImpl.setState(RefreshState.PullDownToRefresh);
                } else if (refreshState == RefreshState.PullUpCanceled) {
                    refreshKernelImpl.setState(RefreshState.PullUpToLoad);
                }
                this.O1.setDuration(0L);
                this.O1.cancel();
                this.O1 = null;
            }
            this.N1 = null;
        }
        return this.O1 != null;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean isLoading() {
        return this.C1 == RefreshState.Loading;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        if (this.U0) {
            return this.O0 || this.F0 || this.G0;
        }
        return false;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean isRefreshing() {
        return this.C1 == RefreshState.Refreshing;
    }

    public final boolean l(boolean z2) {
        return z2 && !this.Q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        RefreshFooter refreshFooter;
        DefaultRefreshHeaderCreator defaultRefreshHeaderCreator;
        super.onAttachedToWindow();
        boolean z2 = true;
        this.J1 = true;
        if (!isInEditMode()) {
            if (this.w1 == null && (defaultRefreshHeaderCreator = Q1) != null) {
                getContext();
                RefreshHeader refreshHeaderA = defaultRefreshHeaderCreator.a();
                if (refreshHeaderA == null) {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
                setRefreshHeader(refreshHeaderA, 0, 0);
            }
            if (this.x1 == null) {
                DefaultRefreshFooterCreator defaultRefreshFooterCreator = P1;
                if (defaultRefreshFooterCreator != null) {
                    getContext();
                    RefreshFooter refreshFooterA = defaultRefreshFooterCreator.a();
                    if (refreshFooterA == null) {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                    setRefreshFooter(refreshFooterA, 0, 0);
                }
            } else {
                if (!this.G0 && this.Z0) {
                    z2 = false;
                }
                this.G0 = z2;
            }
            if (this.y1 == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    RefreshHeader refreshHeader = this.w1;
                    if ((refreshHeader == null || childAt != refreshHeader.getView()) && ((refreshFooter = this.x1) == null || childAt != refreshFooter.getView())) {
                        this.y1 = new RefreshContentWrapper(childAt);
                    }
                }
            }
            if (this.y1 == null) {
                int iC = SmartUtil.c(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(com.charging.screenshow.battery.animations.themes.R.string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                this.y1 = new RefreshContentWrapper(textView);
                textView.setPadding(iC, iC, iC, iC);
            }
            View viewFindViewById = findViewById(this.u0);
            View viewFindViewById2 = findViewById(this.v0);
            this.y1.setScrollBoundaryDecider(this.f1);
            RefreshContentWrapper refreshContentWrapper = this.y1;
            refreshContentWrapper.j0.f33554c = this.T0;
            refreshContentWrapper.setUpComponent(this.B1, viewFindViewById, viewFindViewById2);
            if (this.f0 != 0) {
                r(RefreshState.None);
                RefreshContentWrapper refreshContentWrapper2 = this.y1;
                this.f0 = 0;
                refreshContentWrapper2.moveSpinner(0, this.w0, this.x0);
            }
        }
        int[] iArr = this.E0;
        if (iArr != null) {
            RefreshHeader refreshHeader2 = this.w1;
            if (refreshHeader2 != null) {
                refreshHeader2.setPrimaryColors(iArr);
            }
            RefreshFooter refreshFooter2 = this.x1;
            if (refreshFooter2 != null) {
                refreshFooter2.setPrimaryColors(this.E0);
            }
        }
        RefreshContentWrapper refreshContentWrapper3 = this.y1;
        if (refreshContentWrapper3 != null) {
            super.bringChildToFront(refreshContentWrapper3.X);
        }
        RefreshHeader refreshHeader3 = this.w1;
        if (refreshHeader3 != null && refreshHeader3.getSpinnerStyle().f33548b) {
            super.bringChildToFront(this.w1.getView());
        }
        RefreshFooter refreshFooter3 = this.x1;
        if (refreshFooter3 == null || !refreshFooter3.getSpinnerStyle().f33548b) {
            return;
        }
        super.bringChildToFront(this.x1.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J1 = false;
        this.Z0 = true;
        this.N1 = null;
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.O1.removeAllUpdateListeners();
            this.O1.setDuration(0L);
            this.O1.cancel();
            this.O1 = null;
        }
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader != null && this.C1 == RefreshState.Refreshing) {
            refreshHeader.onFinish(this, false);
        }
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null && this.C1 == RefreshState.Loading) {
            refreshFooter.onFinish(this, false);
        }
        if (this.f0 != 0) {
            this.B1.moveSpinner(0, true);
        }
        RefreshState refreshState = this.C1;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2) {
            r(refreshState2);
        }
        Handler handler = this.A1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.K1 = false;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        int i2;
        int i3;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i4 = -1;
        int i5 = 0;
        char c2 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i5);
            if (SmartUtil.d(childAt) && (c2 < 2 || i5 == 1)) {
                i4 = i5;
                c2 = 2;
            } else if (!(childAt instanceof RefreshComponent) && c2 < 1) {
                c2 = i5 > 0 ? (char) 1 : (char) 0;
                i4 = i5;
            }
            i5++;
        }
        if (i4 >= 0) {
            this.y1 = new RefreshContentWrapper(super.getChildAt(i4));
            if (i4 == 1) {
                i3 = childCount != 3 ? -1 : 2;
                i2 = 0;
            } else if (childCount == 2) {
                i2 = -1;
                i3 = 1;
            } else {
                i2 = -1;
                i3 = -1;
            }
        } else {
            i2 = -1;
            i3 = -1;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = super.getChildAt(i6);
            if (i6 == i2 || (i6 != i3 && i2 == -1 && this.w1 == null && (childAt2 instanceof RefreshHeader))) {
                this.w1 = childAt2 instanceof RefreshHeader ? (RefreshHeader) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i6 == i3 || (i3 == -1 && (childAt2 instanceof RefreshFooter))) {
                this.G0 = this.G0 || !this.Z0;
                this.x1 = childAt2 instanceof RefreshFooter ? (RefreshFooter) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = super.getChildAt(i6);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(com.charging.screenshow.battery.animations.themes.R.id.srl_tag))) {
                RefreshContentWrapper refreshContentWrapper = this.y1;
                ViewGroup.MarginLayoutParams marginLayoutParams = S1;
                boolean z3 = this.M0;
                if (refreshContentWrapper != null && refreshContentWrapper.X == childAt) {
                    boolean z4 = isInEditMode() && z3 && l(this.F0) && this.w1 != null;
                    View view = this.y1.X;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams;
                    int i7 = marginLayoutParams2.leftMargin + paddingLeft;
                    int i8 = marginLayoutParams2.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i7;
                    int measuredHeight = view.getMeasuredHeight() + i8;
                    if (z4) {
                        if (p(this.w1, this.J0)) {
                            int i9 = this.l1;
                            i8 += i9;
                            measuredHeight += i9;
                        }
                    }
                    view.layout(i7, i8, measuredWidth, measuredHeight);
                }
                RefreshHeader refreshHeader = this.w1;
                SpinnerStyle spinnerStyle = SpinnerStyle.d;
                if (refreshHeader != null && refreshHeader.getView() == childAt) {
                    boolean z5 = isInEditMode() && z3 && l(this.F0);
                    View view2 = this.w1.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                    int i10 = marginLayoutParams3.leftMargin;
                    int i11 = marginLayoutParams3.topMargin + this.p1;
                    int measuredWidth2 = view2.getMeasuredWidth() + i10;
                    int measuredHeight2 = view2.getMeasuredHeight() + i11;
                    if (!z5 && this.w1.getSpinnerStyle() == spinnerStyle) {
                        int i12 = this.l1;
                        i11 -= i12;
                        measuredHeight2 -= i12;
                    }
                    view2.layout(i10, i11, measuredWidth2, measuredHeight2);
                }
                RefreshFooter refreshFooter = this.x1;
                if (refreshFooter != null && refreshFooter.getView() == childAt) {
                    boolean z6 = isInEditMode() && z3 && l(this.G0);
                    View view3 = this.x1.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    }
                    SpinnerStyle spinnerStyle2 = this.x1.getSpinnerStyle();
                    int i13 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (getMeasuredHeight() + marginLayoutParams.topMargin) - this.q1;
                    if (this.X0 && this.Y0 && this.L0 && this.y1 != null && this.x1.getSpinnerStyle() == spinnerStyle && l(this.G0)) {
                        View view4 = this.y1.X;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        measuredHeight3 = paddingTop + paddingTop + (layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0) + view4.getMeasuredHeight();
                    }
                    if (spinnerStyle2 == SpinnerStyle.g) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.q1;
                    } else {
                        if (z6 || spinnerStyle2 == SpinnerStyle.f || spinnerStyle2 == SpinnerStyle.f33545e) {
                            iMax = this.n1;
                        } else if (spinnerStyle2.f33549c && this.f0 < 0) {
                            iMax = Math.max(l(this.G0) ? -this.f0 : 0, 0);
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i13, measuredHeight3, view3.getMeasuredWidth() + i13, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02da  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:175:0x034f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int i5;
        int measuredWidth;
        int i6;
        int i7;
        int measuredWidth2;
        int measuredHeight;
        RefreshFooter refreshFooter;
        int i8;
        int i9;
        int i10;
        RefreshContentWrapper refreshContentWrapper;
        View view;
        int i11;
        int i12;
        int iMax;
        int i13;
        int iMax2;
        int i14;
        int i15;
        boolean z3 = isInEditMode() && this.M0;
        int childCount = super.getChildCount();
        int i16 = 0;
        int i17 = 0;
        int measuredHeight2 = 0;
        while (i16 < childCount) {
            View childAt = super.getChildAt(i16);
            if (childAt.getVisibility() == 8 || "GONE".equals(childAt.getTag(com.charging.screenshow.battery.animations.themes.R.id.srl_tag))) {
                z2 = z3;
                i4 = childCount;
                i5 = i16;
                measuredWidth = i17;
                measuredHeight2 = measuredHeight2;
            } else {
                RefreshHeader refreshHeader = this.w1;
                RefreshKernelImpl refreshKernelImpl = this.B1;
                DimensionStatus dimensionStatus = DimensionStatus.d;
                DimensionStatus dimensionStatus2 = DimensionStatus.f33539e;
                ViewGroup.MarginLayoutParams marginLayoutParams = S1;
                SpinnerStyle spinnerStyle = SpinnerStyle.g;
                DimensionStatus[] dimensionStatusArr = DimensionStatus.f33541i;
                if (refreshHeader == null || refreshHeader.getView() != childAt) {
                    z2 = z3;
                    i4 = childCount;
                    i5 = i16;
                    i6 = i17;
                    i7 = measuredHeight2;
                } else {
                    View view2 = this.w1.getView();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    z2 = z3;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : marginLayoutParams;
                    i4 = childCount;
                    i5 = i16;
                    int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, layoutParams.width);
                    int i18 = this.l1;
                    DimensionStatus dimensionStatus3 = this.m1;
                    i6 = i17;
                    i7 = measuredHeight2;
                    if (dimensionStatus3.f33542a >= 6) {
                        iMax2 = i18;
                    } else {
                        int i19 = layoutParams.height;
                        if (i19 > 0) {
                            iMax2 = i19 + marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin;
                            if (dimensionStatus3.a(dimensionStatus2)) {
                                this.l1 = layoutParams.height + marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin;
                                this.m1 = dimensionStatus2;
                            }
                        } else if (i19 != -2 || (this.w1.getSpinnerStyle() == spinnerStyle && this.m1.f33543b)) {
                            iMax2 = i18;
                        } else {
                            int iMax3 = Math.max((View.MeasureSpec.getSize(i3) - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, 0);
                            view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMax3, Integer.MIN_VALUE));
                            int measuredHeight3 = view2.getMeasuredHeight();
                            if (measuredHeight3 > 0) {
                                if (measuredHeight3 != iMax3 && this.m1.a(dimensionStatus)) {
                                    this.l1 = measuredHeight3 + marginLayoutParams2.bottomMargin + marginLayoutParams2.topMargin;
                                    this.m1 = dimensionStatus;
                                }
                                iMax2 = -1;
                            } else {
                                iMax2 = i18;
                            }
                        }
                    }
                    if (this.w1.getSpinnerStyle() == spinnerStyle) {
                        iMax2 = View.MeasureSpec.getSize(i3);
                        i15 = -1;
                        i14 = 0;
                    } else {
                        if (!this.w1.getSpinnerStyle().f33549c || z2) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            iMax2 = Math.max(0, l(this.F0) ? this.f0 : 0);
                        }
                        i15 = -1;
                    }
                    if (iMax2 != i15) {
                        view2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((iMax2 - marginLayoutParams2.bottomMargin) - marginLayoutParams2.topMargin, i14), 1073741824));
                    }
                    DimensionStatus dimensionStatus4 = this.m1;
                    boolean z4 = dimensionStatus4.f33543b;
                    if (!z4) {
                        float f = this.r1;
                        if (f < 10.0f) {
                            f *= this.l1;
                        }
                        if (!z4) {
                            dimensionStatus4 = dimensionStatusArr[dimensionStatus4.f33542a + 1];
                        }
                        this.m1 = dimensionStatus4;
                        this.w1.onInitialized(refreshKernelImpl, this.l1, (int) f);
                    }
                    if (z2 && l(this.F0)) {
                        measuredWidth2 = view2.getMeasuredWidth() + i6;
                        measuredHeight = view2.getMeasuredHeight() + i7;
                    }
                    refreshFooter = this.x1;
                    if (refreshFooter == null && refreshFooter.getView() == childAt) {
                        View view3 = this.x1.getView();
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : marginLayoutParams;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin, layoutParams2.width);
                        int i20 = this.n1;
                        i8 = measuredWidth2;
                        DimensionStatus dimensionStatus5 = this.o1;
                        i9 = measuredHeight;
                        if (dimensionStatus5.f33542a >= 6) {
                            iMax = i20;
                        } else {
                            int i21 = layoutParams2.height;
                            if (i21 > 0) {
                                int i22 = i21 + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                                if (dimensionStatus5.a(dimensionStatus2)) {
                                    this.n1 = layoutParams2.height + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                                    this.o1 = dimensionStatus2;
                                }
                                iMax = i22;
                            } else if (i21 != -2 || (this.x1.getSpinnerStyle() == spinnerStyle && this.o1.f33543b)) {
                                iMax = i20;
                            } else {
                                int iMax4 = Math.max((View.MeasureSpec.getSize(i3) - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, 0);
                                view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(iMax4, Integer.MIN_VALUE));
                                int measuredHeight4 = view3.getMeasuredHeight();
                                if (measuredHeight4 > 0) {
                                    if (measuredHeight4 != iMax4 && this.o1.a(dimensionStatus)) {
                                        this.n1 = measuredHeight4 + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                                        this.o1 = dimensionStatus;
                                    }
                                    iMax = -1;
                                } else {
                                    iMax = i20;
                                }
                            }
                        }
                        if (this.x1.getSpinnerStyle() == spinnerStyle) {
                            iMax = View.MeasureSpec.getSize(i3);
                            i13 = -1;
                            i10 = 0;
                        } else {
                            if (!this.x1.getSpinnerStyle().f33549c || z2) {
                                i10 = 0;
                            } else {
                                i10 = 0;
                                iMax = Math.max(0, l(this.G0) ? -this.f0 : 0);
                            }
                            i13 = -1;
                        }
                        if (iMax != i13) {
                            view3.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((iMax - marginLayoutParams3.bottomMargin) - marginLayoutParams3.topMargin, i10), 1073741824));
                        }
                        DimensionStatus dimensionStatus6 = this.o1;
                        boolean z5 = dimensionStatus6.f33543b;
                        if (!z5) {
                            float f2 = this.s1;
                            if (f2 < 10.0f) {
                                f2 *= this.n1;
                            }
                            if (!z5) {
                                dimensionStatus6 = dimensionStatusArr[dimensionStatus6.f33542a + 1];
                            }
                            this.o1 = dimensionStatus6;
                            this.x1.onInitialized(refreshKernelImpl, this.n1, (int) f2);
                        }
                        if (z2 && l(this.G0)) {
                            measuredWidth = view3.getMeasuredWidth() + i8;
                            measuredHeight2 = view3.getMeasuredHeight() + i9;
                        }
                        refreshContentWrapper = this.y1;
                        if (refreshContentWrapper == null && (view = refreshContentWrapper.X) == childAt) {
                            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                            }
                            if (this.w1 == null || !l(this.F0)) {
                                i11 = i10;
                            } else if (p(this.w1, this.J0)) {
                                i11 = 1;
                            } else {
                                i11 = i10;
                            }
                            if (this.x1 == null || !l(this.G0)) {
                                i12 = i10;
                            } else if (p(this.x1, this.K0)) {
                                i12 = 1;
                            } else {
                                i12 = i10;
                            }
                            view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, layoutParams3.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + ((!z2 || i11 == 0) ? i10 : this.l1) + ((!z2 || i12 == 0) ? i10 : this.n1), layoutParams3.height));
                            measuredWidth += view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                            measuredHeight2 += view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        }
                    } else {
                        i8 = measuredWidth2;
                        i9 = measuredHeight;
                        i10 = 0;
                    }
                    measuredWidth = i8;
                    measuredHeight2 = i9;
                    refreshContentWrapper = this.y1;
                    if (refreshContentWrapper == null) {
                    }
                }
                measuredWidth2 = i6;
                measuredHeight = i7;
                refreshFooter = this.x1;
                if (refreshFooter == null) {
                    i8 = measuredWidth2;
                    i9 = measuredHeight;
                    i10 = 0;
                    measuredWidth = i8;
                    measuredHeight2 = i9;
                } else {
                    i8 = measuredWidth2;
                    i9 = measuredHeight;
                    i10 = 0;
                    measuredWidth = i8;
                    measuredHeight2 = i9;
                }
                refreshContentWrapper = this.y1;
                if (refreshContentWrapper == null) {
                }
            }
            i16 = i5 + 1;
            i17 = measuredWidth;
            z3 = z2;
            childCount = i4;
        }
        super.setMeasuredDimension(View.resolveSize(Math.max(getPaddingRight() + getPaddingLeft() + i17, super.getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(getPaddingBottom() + getPaddingTop() + measuredHeight2, super.getSuggestedMinimumHeight()), i3));
        this.n0 = getMeasuredWidth() / 2.0f;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        return this.j1.a(f, f2, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return (this.K1 && f2 > 0.0f) || t(-f2) || this.j1.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        int i4 = this.g1;
        int i5 = 0;
        if (i3 * i4 > 0) {
            if (Math.abs(i3) > Math.abs(this.g1)) {
                int i6 = this.g1;
                this.g1 = 0;
                i5 = i6;
            } else {
                this.g1 -= i3;
                i5 = i3;
            }
            q(this.g1);
        } else if (i3 > 0 && this.K1) {
            int i7 = i4 - i3;
            this.g1 = i7;
            q(i7);
            i5 = i3;
        }
        this.j1.c(i2, i3 - i5, iArr, null, 0);
        iArr[1] = iArr[1] + i5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        ScrollBoundaryDecider scrollBoundaryDecider;
        ViewParent parent;
        ScrollBoundaryDecider scrollBoundaryDecider2;
        boolean zD = this.j1.d(i2, i3, i4, i5, this.i1, 0, null);
        int i6 = i5 + this.i1[1];
        if ((i6 < 0 && ((this.F0 || this.O0) && (this.g1 != 0 || (scrollBoundaryDecider2 = this.f1) == null || scrollBoundaryDecider2.a(this.y1.X)))) || (i6 > 0 && ((this.G0 || this.O0) && (this.g1 != 0 || (scrollBoundaryDecider = this.f1) == null || scrollBoundaryDecider.b(this.y1.X))))) {
            RefreshState refreshState = this.D1;
            if (refreshState == RefreshState.None || refreshState.f0) {
                this.B1.setState(i6 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                if (!zD && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i7 = this.g1 - i6;
            this.g1 = i7;
            q(i7);
        }
        if (!this.K1 || i3 >= 0) {
            return;
        }
        this.K1 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        this.k1.f4453a = i2;
        this.j1.h(i2 & 2, 0);
        this.g1 = this.f0;
        this.h1 = true;
        h(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if (isEnabled() && isNestedScrollingEnabled() && (i2 & 2) != 0) {
            return this.O0 || this.F0 || this.G0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.k1.f4453a = 0;
        this.h1 = false;
        this.g1 = 0;
        s();
        this.j1.i(0);
    }

    public final boolean p(RefreshComponent refreshComponent, boolean z2) {
        return z2 || this.Q0 || refreshComponent == null || refreshComponent.getSpinnerStyle() == SpinnerStyle.f33545e;
    }

    public final void q(float f) {
        RefreshState refreshState;
        float f2 = (!this.h1 || this.T0 || f >= 0.0f || this.y1.canLoadMore()) ? f : 0.0f;
        int i2 = this.k0;
        if (f2 > i2 * 5 && getTag() == null && getTag(com.charging.screenshow.battery.animations.themes.R.id.srl_tag) == null) {
            float f3 = i2;
            if (this.o0 < f3 / 6.0f && this.n0 < f3 / 16.0f) {
                Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                setTag(com.charging.screenshow.battery.animations.themes.R.id.srl_tag, "你这么死拉，臣妾做不到啊！");
            }
        }
        RefreshState refreshState2 = this.C1;
        RefreshState refreshState3 = RefreshState.TwoLevel;
        RefreshKernelImpl refreshKernelImpl = this.B1;
        if (refreshState2 == refreshState3 && f2 > 0.0f) {
            refreshKernelImpl.moveSpinner(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (refreshState2 == RefreshState.Refreshing && f2 >= 0.0f) {
            float f4 = this.l1;
            if (f2 < f4) {
                refreshKernelImpl.moveSpinner((int) f2, true);
            } else {
                float f5 = this.r1;
                if (f5 < 10.0f) {
                    f5 *= f4;
                }
                double d = f5 - f4;
                int iMax = Math.max((i2 * 4) / 3, getHeight());
                int i3 = this.l1;
                double d2 = iMax - i3;
                double dMax = Math.max(0.0f, (f2 - i3) * this.p0);
                double d3 = -dMax;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                refreshKernelImpl.moveSpinner(((int) Math.min((1.0d - Math.pow(100.0d, d3 / d2)) * d, dMax)) + this.l1, true);
            }
        } else if (f2 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.L0 && this.X0 && this.Y0 && l(this.G0)) || (this.P0 && !this.X0 && l(this.G0))))) {
            int i4 = this.n1;
            if (f2 > (-i4)) {
                refreshKernelImpl.moveSpinner((int) f2, true);
            } else {
                float f6 = this.s1;
                if (f6 < 10.0f) {
                    f6 *= i4;
                }
                double d4 = f6 - i4;
                int iMax2 = Math.max((i2 * 4) / 3, getHeight());
                int i5 = this.n1;
                double d5 = iMax2 - i5;
                double d6 = -Math.min(0.0f, (i5 + f2) * this.p0);
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                refreshKernelImpl.moveSpinner(((int) (-Math.min((1.0d - Math.pow(100.0d, d7 / d5)) * d4, d6))) - this.n1, true);
            }
        } else if (f2 >= 0.0f) {
            float f7 = this.r1;
            double d8 = f7 < 10.0f ? this.l1 * f7 : f7;
            double dMax2 = Math.max(i2 / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.p0 * f2);
            double d9 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            refreshKernelImpl.moveSpinner((int) Math.min((1.0d - Math.pow(100.0d, d9 / dMax2)) * d8, dMax3), true);
        } else {
            float f8 = this.s1;
            double d10 = f8 < 10.0f ? this.n1 * f8 : f8;
            double dMax4 = Math.max(i2 / 2, getHeight());
            double d11 = -Math.min(0.0f, this.p0 * f2);
            double d12 = -d11;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            refreshKernelImpl.moveSpinner((int) (-Math.min((1.0d - Math.pow(100.0d, d12 / dMax4)) * d10, d11)), true);
        }
        if (!this.P0 || this.X0 || !l(this.G0) || f2 >= 0.0f || (refreshState = this.C1) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        if (this.W0) {
            this.N1 = null;
            refreshKernelImpl.animSpinner(-this.n1);
        }
        setStateDirectLoading(false);
        this.A1.postDelayed(new Runnable() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.5
            @Override // java.lang.Runnable
            public final void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                OnLoadMoreListener onLoadMoreListener = smartRefreshLayout.d1;
                if (onLoadMoreListener != null) {
                    onLoadMoreListener.b(smartRefreshLayout);
                } else if (smartRefreshLayout.e1 == null) {
                    smartRefreshLayout.finishLoadMore(2000);
                }
                OnMultiListener onMultiListener = smartRefreshLayout.e1;
                if (onMultiListener != null) {
                    onMultiListener.b(smartRefreshLayout);
                }
            }
        }, this.j0);
    }

    public final void r(RefreshState refreshState) {
        RefreshState refreshState2 = this.C1;
        if (refreshState2 == refreshState) {
            if (this.D1 != refreshState2) {
                this.D1 = refreshState2;
                return;
            }
            return;
        }
        this.C1 = refreshState;
        this.D1 = refreshState;
        RefreshHeader refreshHeader = this.w1;
        RefreshFooter refreshFooter = this.x1;
        OnMultiListener onMultiListener = this.e1;
        if (refreshHeader != null) {
            refreshHeader.onStateChanged(this, refreshState2, refreshState);
        }
        if (refreshFooter != null) {
            refreshFooter.onStateChanged(this, refreshState2, refreshState);
        }
        if (onMultiListener != null) {
            onMultiListener.onStateChanged(this, refreshState2, refreshState);
        }
        if (refreshState == RefreshState.LoadFinish) {
            this.K1 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        if (ViewCompat.r(this.y1.Z)) {
            this.t0 = z2;
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout resetNoMoreData() {
        setNoMoreData(false);
        return this;
    }

    public final void s() {
        RefreshState refreshState = this.C1;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        RefreshKernelImpl refreshKernelImpl = this.B1;
        if (refreshState == refreshState2) {
            if (this.A0 <= -1000 || this.f0 <= getHeight() / 2) {
                if (this.r0) {
                    refreshKernelImpl.finishTwoLevel();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorAnimSpinner = refreshKernelImpl.animSpinner(getHeight());
                if (valueAnimatorAnimSpinner != null) {
                    valueAnimatorAnimSpinner.setDuration(this.i0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = RefreshState.Loading;
        if (refreshState == refreshState3 || (this.L0 && this.X0 && this.Y0 && this.f0 < 0 && l(this.G0))) {
            int i2 = this.f0;
            int i3 = -this.n1;
            if (i2 < i3) {
                refreshKernelImpl.animSpinner(i3);
                return;
            } else {
                if (i2 > 0) {
                    refreshKernelImpl.animSpinner(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState4 = this.C1;
        RefreshState refreshState5 = RefreshState.Refreshing;
        if (refreshState4 == refreshState5) {
            int i4 = this.f0;
            int i5 = this.l1;
            if (i4 > i5) {
                refreshKernelImpl.animSpinner(i5);
                return;
            } else {
                if (i4 < 0) {
                    refreshKernelImpl.animSpinner(0);
                    return;
                }
                return;
            }
        }
        if (refreshState4 == RefreshState.PullDownToRefresh) {
            refreshKernelImpl.setState(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState4 == RefreshState.PullUpToLoad) {
            refreshKernelImpl.setState(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToRefresh) {
            refreshKernelImpl.setState(refreshState5);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToLoad) {
            refreshKernelImpl.setState(refreshState3);
            return;
        }
        if (refreshState4 == RefreshState.ReleaseToTwoLevel) {
            refreshKernelImpl.setState(RefreshState.TwoLevelReleased);
            return;
        }
        if (refreshState4 == RefreshState.RefreshReleased) {
            if (this.O1 == null) {
                refreshKernelImpl.animSpinner(this.l1);
            }
        } else if (refreshState4 == RefreshState.LoadReleased) {
            if (this.O1 == null) {
                refreshKernelImpl.animSpinner(-this.n1);
            }
        } else {
            if (refreshState4 == RefreshState.LoadFinish || this.f0 == 0) {
                return;
            }
            refreshKernelImpl.animSpinner(0);
        }
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setDisableContentWhenLoading(boolean z2) {
        this.W0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setDisableContentWhenRefresh(boolean z2) {
        this.V0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setDragRate(float f) {
        this.p0 = f;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableAutoLoadMore(boolean z2) {
        this.P0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableClipFooterWhenFixedBehind(boolean z2) {
        this.I0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z2) {
        this.H0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableFooterFollowWhenNoMoreData(boolean z2) {
        this.L0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableFooterTranslationContent(boolean z2) {
        this.K0 = z2;
        this.b1 = true;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableHeaderTranslationContent(boolean z2) {
        this.J0 = z2;
        this.a1 = true;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableLoadMore(boolean z2) {
        this.Z0 = true;
        this.G0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z2) {
        this.T0 = z2;
        RefreshContentWrapper refreshContentWrapper = this.y1;
        if (refreshContentWrapper != null) {
            refreshContentWrapper.j0.f33554c = z2;
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableNestedScroll(boolean z2) {
        setNestedScrollingEnabled(z2);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableOverScrollBounce(boolean z2) {
        this.N0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableOverScrollDrag(boolean z2) {
        this.O0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnablePureScrollMode(boolean z2) {
        this.Q0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableRefresh(boolean z2) {
        this.F0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableScrollContentWhenLoaded(boolean z2) {
        this.R0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setEnableScrollContentWhenRefreshed(boolean z2) {
        this.S0 = z2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFixedFooterViewId(int i2) {
        this.v0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFixedHeaderViewId(int i2) {
        this.u0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterHeight(float f) {
        setFooterHeightPx(SmartUtil.c(f));
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterHeightPx(int i2) {
        if (i2 != this.n1) {
            DimensionStatus dimensionStatus = this.o1;
            DimensionStatus dimensionStatus2 = DimensionStatus.f33540h;
            if (dimensionStatus.a(dimensionStatus2)) {
                this.n1 = i2;
                RefreshFooter refreshFooter = this.x1;
                if (refreshFooter != null && this.J1 && this.o1.f33543b) {
                    SpinnerStyle spinnerStyle = refreshFooter.getSpinnerStyle();
                    if (spinnerStyle != SpinnerStyle.g && !spinnerStyle.f33549c) {
                        View view = this.x1.getView();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : S1;
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.n1 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                        int i3 = marginLayoutParams.leftMargin;
                        int measuredHeight = ((getMeasuredHeight() + marginLayoutParams.topMargin) - this.q1) - (spinnerStyle != SpinnerStyle.d ? this.n1 : 0);
                        view.layout(i3, measuredHeight, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + measuredHeight);
                    }
                    float f = this.s1;
                    if (f < 10.0f) {
                        f *= this.n1;
                    }
                    this.o1 = dimensionStatus2;
                    this.x1.onInitialized(this.B1, this.n1, (int) f);
                    return this;
                }
                this.o1 = DimensionStatus.g;
            }
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterInsetStart(float f) {
        this.q1 = SmartUtil.c(f);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterInsetStartPx(int i2) {
        this.q1 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterMaxDragRate(float f) {
        this.s1 = f;
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter == null || !this.J1) {
            this.o1 = this.o1.b();
            return this;
        }
        if (f < 10.0f) {
            f *= this.n1;
        }
        refreshFooter.onInitialized(this.B1, this.n1, (int) f);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterTranslationViewId(int i2) {
        this.x0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setFooterTriggerRate(float f) {
        this.u1 = f;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderHeight(float f) {
        setHeaderHeightPx(SmartUtil.c(f));
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderHeightPx(int i2) {
        if (i2 != this.l1) {
            DimensionStatus dimensionStatus = this.m1;
            DimensionStatus dimensionStatus2 = DimensionStatus.f33540h;
            if (dimensionStatus.a(dimensionStatus2)) {
                this.l1 = i2;
                RefreshHeader refreshHeader = this.w1;
                if (refreshHeader != null && this.J1 && this.m1.f33543b) {
                    SpinnerStyle spinnerStyle = refreshHeader.getSpinnerStyle();
                    if (spinnerStyle != SpinnerStyle.g && !spinnerStyle.f33549c) {
                        View view = this.w1.getView();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : S1;
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max((this.l1 - marginLayoutParams.bottomMargin) - marginLayoutParams.topMargin, 0), 1073741824));
                        int i3 = marginLayoutParams.leftMargin;
                        int i4 = (marginLayoutParams.topMargin + this.p1) - (spinnerStyle == SpinnerStyle.d ? this.l1 : 0);
                        view.layout(i3, i4, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i4);
                    }
                    float f = this.r1;
                    if (f < 10.0f) {
                        f *= this.l1;
                    }
                    this.m1 = dimensionStatus2;
                    this.w1.onInitialized(this.B1, this.l1, (int) f);
                    return this;
                }
                this.m1 = DimensionStatus.g;
            }
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderInsetStart(float f) {
        this.p1 = SmartUtil.c(f);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderInsetStartPx(int i2) {
        this.p1 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderMaxDragRate(float f) {
        this.r1 = f;
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader == null || !this.J1) {
            this.m1 = this.m1.b();
            return this;
        }
        if (f < 10.0f) {
            f *= this.l1;
        }
        refreshHeader.onInitialized(this.B1, this.l1, (int) f);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderTranslationViewId(int i2) {
        this.w0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setHeaderTriggerRate(float f) {
        this.t1 = f;
        return this;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.U0 = z2;
        this.j1.g(z2);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setNoMoreData(boolean z2) {
        RefreshState refreshState = this.C1;
        if (refreshState == RefreshState.Refreshing && z2) {
            finishRefreshWithNoMoreData();
            return this;
        }
        if (refreshState == RefreshState.Loading && z2) {
            finishLoadMoreWithNoMoreData();
            return this;
        }
        if (this.X0 != z2) {
            this.X0 = z2;
            RefreshFooter refreshFooter = this.x1;
            if (refreshFooter != null) {
                if (refreshFooter.setNoMoreData(z2)) {
                    this.Y0 = true;
                    if (this.X0 && this.L0 && this.f0 > 0 && this.x1.getSpinnerStyle() == SpinnerStyle.d && l(this.G0)) {
                        if (p(this.w1, this.F0)) {
                            this.x1.getView().setTranslationY(this.f0);
                            return this;
                        }
                    }
                } else {
                    this.Y0 = false;
                    new RuntimeException("Footer:" + this.x1 + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.d1 = onLoadMoreListener;
        this.G0 = this.G0 || !(this.Z0 || onLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setOnMultiListener(OnMultiListener onMultiListener) {
        this.e1 = onMultiListener;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.c1 = onRefreshListener;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setOnRefreshLoadMoreListener(OnRefreshLoadMoreListener onRefreshLoadMoreListener) {
        this.c1 = onRefreshLoadMoreListener;
        this.d1 = onRefreshLoadMoreListener;
        this.G0 = this.G0 || !(this.Z0 || onRefreshLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setPrimaryColors(int... iArr) {
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader != null) {
            refreshHeader.setPrimaryColors(iArr);
        }
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null) {
            refreshFooter.setPrimaryColors(iArr);
        }
        this.E0 = iArr;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setPrimaryColorsId(int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.getColor(getContext(), iArr[i2]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setReboundDuration(int i2) {
        this.j0 = i2;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setReboundInterpolator(Interpolator interpolator) {
        this.D0 = interpolator;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshContent(View view) {
        setRefreshContent(view, 0, 0);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshFooter(RefreshFooter refreshFooter) {
        setRefreshFooter(refreshFooter, 0, 0);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshHeader(RefreshHeader refreshHeader) {
        setRefreshHeader(refreshHeader, 0, 0);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        this.f1 = scrollBoundaryDecider;
        RefreshContentWrapper refreshContentWrapper = this.y1;
        if (refreshContentWrapper != null) {
            refreshContentWrapper.setScrollBoundaryDecider(scrollBoundaryDecider);
        }
        return this;
    }

    public void setStateDirectLoading(boolean z2) {
        RefreshState refreshState = this.C1;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.E1 = System.currentTimeMillis();
            this.K1 = true;
            r(refreshState2);
            OnLoadMoreListener onLoadMoreListener = this.d1;
            if (onLoadMoreListener != null) {
                if (z2) {
                    onLoadMoreListener.b(this);
                }
            } else if (this.e1 == null) {
                finishLoadMore(2000);
            }
            RefreshFooter refreshFooter = this.x1;
            if (refreshFooter != null) {
                float f = this.s1;
                if (f < 10.0f) {
                    f *= this.n1;
                }
                refreshFooter.onStartAnimator(this, this.n1, (int) f);
            }
            OnMultiListener onMultiListener = this.e1;
            if (onMultiListener == null || this.x1 == null) {
                return;
            }
            if (z2) {
                onMultiListener.b(this);
            }
            this.e1.getClass();
        }
    }

    public void setStateLoading(final boolean z2) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.setStateDirectLoading(z2);
                }
            }
        };
        r(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.B1.animSpinner(-this.n1);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
        }
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null) {
            float f = this.s1;
            if (f < 10.0f) {
                f *= this.n1;
            }
            refreshFooter.onReleased(this, this.n1, (int) f);
        }
        OnMultiListener onMultiListener = this.e1;
        if (onMultiListener != null && this.x1 != null) {
            onMultiListener.getClass();
        }
        if (valueAnimatorAnimSpinner == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(final boolean z2) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.E1 = jCurrentTimeMillis;
                    smartRefreshLayout.r(RefreshState.Refreshing);
                    OnRefreshListener onRefreshListener = smartRefreshLayout.c1;
                    boolean z3 = z2;
                    if (onRefreshListener != null) {
                        if (z3) {
                            onRefreshListener.a(smartRefreshLayout);
                        }
                    } else if (smartRefreshLayout.e1 == null) {
                        smartRefreshLayout.finishRefresh(3000);
                    }
                    RefreshHeader refreshHeader = smartRefreshLayout.w1;
                    if (refreshHeader != null) {
                        float f = smartRefreshLayout.r1;
                        if (f < 10.0f) {
                            f *= smartRefreshLayout.l1;
                        }
                        refreshHeader.onStartAnimator(smartRefreshLayout, smartRefreshLayout.l1, (int) f);
                    }
                    OnMultiListener onMultiListener = smartRefreshLayout.e1;
                    if (onMultiListener == null || smartRefreshLayout.w1 == null) {
                        return;
                    }
                    if (z3) {
                        onMultiListener.a(smartRefreshLayout);
                    }
                    smartRefreshLayout.e1.getClass();
                }
            }
        };
        r(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.B1.animSpinner(this.l1);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(animatorListenerAdapter);
        }
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader != null) {
            float f = this.r1;
            if (f < 10.0f) {
                f *= this.l1;
            }
            refreshHeader.onReleased(this, this.l1, (int) f);
        }
        OnMultiListener onMultiListener = this.e1;
        if (onMultiListener != null && this.w1 != null) {
            onMultiListener.getClass();
        }
        if (valueAnimatorAnimSpinner == null) {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.C1;
        if (refreshState2.e0 && refreshState2.X != refreshState.X) {
            r(RefreshState.None);
        }
        if (this.D1 != refreshState) {
            this.D1 = refreshState;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    public final boolean t(float f) {
        RefreshState refreshState;
        if (f == 0.0f) {
            f = this.A0;
        }
        int i2 = 0;
        if (Math.abs(f) > this.y0) {
            int i3 = this.f0;
            if (i3 * f < 0.0f) {
                RefreshState refreshState2 = this.C1;
                RefreshState refreshState3 = RefreshState.Refreshing;
                if (refreshState2 == refreshState3 || refreshState2 == RefreshState.Loading || (i3 < 0 && this.X0)) {
                    FlingRunnable flingRunnable = new FlingRunnable(f);
                    RefreshState refreshState4 = this.C1;
                    if (refreshState4.g0) {
                        flingRunnable = null;
                    } else {
                        if (this.f0 != 0 && ((!refreshState4.f0 && (!this.X0 || !this.L0 || !this.Y0 || !l(this.G0))) || (((this.C1 == RefreshState.Loading || (this.X0 && this.L0 && this.Y0 && l(this.G0))) && this.f0 < (-this.n1)) || (this.C1 == refreshState3 && this.f0 > this.l1)))) {
                            int i4 = this.f0;
                            float fPow = flingRunnable.f33534Y;
                            int i5 = i4;
                            while (true) {
                                if (i4 * i5 > 0) {
                                    i2++;
                                    fPow = (float) (Math.pow(0.98f, (i2 * 10) / 10.0f) * ((double) fPow));
                                    float f2 = ((10 * 1.0f) / 1000.0f) * fPow;
                                    if (Math.abs(f2) < 1.0f) {
                                        RefreshState refreshState5 = this.C1;
                                        if (!refreshState5.f0 || ((refreshState5 == (refreshState = RefreshState.Refreshing) && i5 > this.l1) || (refreshState5 != refreshState && i5 < (-this.n1)))) {
                                            flingRunnable = null;
                                        }
                                    } else {
                                        i5 = (int) (i5 + f2);
                                    }
                                }
                            }
                        }
                        flingRunnable.Z = AnimationUtils.currentAnimationTimeMillis();
                        this.A1.postDelayed(flingRunnable, 10);
                    }
                    this.N1 = flingRunnable;
                    return true;
                }
                if (refreshState2.h0) {
                    return true;
                }
            }
            if ((f < 0.0f && ((this.N0 && (this.G0 || this.O0)) || ((this.C1 == RefreshState.Loading && i3 >= 0) || (this.P0 && l(this.G0))))) || (f > 0.0f && ((this.N0 && this.F0) || this.O0 || (this.C1 == RefreshState.Refreshing && this.f0 <= 0)))) {
                this.L1 = false;
                Scroller scroller = this.B0;
                scroller.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                scroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoLoadMore(int i2) {
        return autoLoadMore(i2, this.j0, (this.s1 + this.u1) / 2.0f, false);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoRefresh(int i2) {
        return autoRefresh(i2, this.j0, (this.r1 + this.t1) / 2.0f, false);
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishLoadMore(int i2) {
        finishLoadMore(i2, true, false);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishRefresh(int i2) {
        finishRefresh(i2, true, Boolean.FALSE);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshContent(View view, int i2, int i3) {
        RefreshContentWrapper refreshContentWrapper = this.y1;
        if (refreshContentWrapper != null) {
            super.removeView(refreshContentWrapper.X);
        }
        if (i2 == 0) {
            i2 = -1;
        }
        if (i3 == 0) {
            i3 = -1;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i3);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        super.addView(view, getChildCount(), layoutParams);
        this.y1 = new RefreshContentWrapper(view);
        if (this.J1) {
            View viewFindViewById = findViewById(this.u0);
            View viewFindViewById2 = findViewById(this.v0);
            this.y1.setScrollBoundaryDecider(this.f1);
            RefreshContentWrapper refreshContentWrapper2 = this.y1;
            refreshContentWrapper2.j0.f33554c = this.T0;
            refreshContentWrapper2.setUpComponent(this.B1, viewFindViewById, viewFindViewById2);
        }
        RefreshHeader refreshHeader = this.w1;
        if (refreshHeader != null && refreshHeader.getSpinnerStyle().f33548b) {
            super.bringChildToFront(this.w1.getView());
        }
        RefreshFooter refreshFooter = this.x1;
        if (refreshFooter != null && refreshFooter.getSpinnerStyle().f33548b) {
            super.bringChildToFront(this.x1.getView());
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshFooter(RefreshFooter refreshFooter, int i2, int i3) {
        RefreshFooter refreshFooter2;
        RefreshFooter refreshFooter3 = this.x1;
        if (refreshFooter3 != null) {
            super.removeView(refreshFooter3.getView());
        }
        this.x1 = refreshFooter;
        this.K1 = false;
        this.G1 = 0;
        this.Y0 = false;
        this.I1 = false;
        this.o1 = DimensionStatus.f33538c;
        this.G0 = !this.Z0 || this.G0;
        if (i2 == 0) {
            i2 = -1;
        }
        if (i3 == 0) {
            i3 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i3);
        ViewGroup.LayoutParams layoutParams2 = refreshFooter.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.x1.getSpinnerStyle().f33548b) {
            super.addView(this.x1.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.x1.getView(), 0, layoutParams);
        }
        int[] iArr = this.E0;
        if (iArr != null && (refreshFooter2 = this.x1) != null) {
            refreshFooter2.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout setRefreshHeader(RefreshHeader refreshHeader, int i2, int i3) {
        RefreshHeader refreshHeader2;
        RefreshHeader refreshHeader3 = this.w1;
        if (refreshHeader3 != null) {
            super.removeView(refreshHeader3.getView());
        }
        this.w1 = refreshHeader;
        this.F1 = 0;
        this.H1 = false;
        this.m1 = DimensionStatus.f33538c;
        if (i2 == 0) {
            i2 = -1;
        }
        if (i3 == 0) {
            i3 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i2, i3);
        ViewGroup.LayoutParams layoutParams2 = refreshHeader.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.w1.getSpinnerStyle().f33548b) {
            super.addView(this.w1.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.w1.getView(), 0, layoutParams);
        }
        int[] iArr = this.E0;
        if (iArr != null && (refreshHeader2 = this.w1) != null) {
            refreshHeader2.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoLoadMore(int i2, final int i3, final float f, final boolean z2) {
        if (this.C1 != RefreshState.None || !l(this.G0) || this.X0) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.9
            @Override // java.lang.Runnable
            public final void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.D1 != RefreshState.Loading) {
                    return;
                }
                ValueAnimator valueAnimator = smartRefreshLayout.O1;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    smartRefreshLayout.O1.cancel();
                    smartRefreshLayout.O1 = null;
                }
                smartRefreshLayout.n0 = smartRefreshLayout.getMeasuredWidth() / 2.0f;
                smartRefreshLayout.B1.setState(RefreshState.PullUpToLoad);
                RefreshFooter refreshFooter = smartRefreshLayout.x1;
                float f2 = f;
                int i4 = i3;
                if (refreshFooter == null || !refreshFooter.autoOpen(i4, f2, z2)) {
                    int i5 = smartRefreshLayout.n1;
                    float f3 = i5 == 0 ? smartRefreshLayout.u1 : i5;
                    if (f2 < 10.0f) {
                        f2 *= f3;
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f0, -((int) f2));
                    smartRefreshLayout.O1 = valueAnimatorOfInt;
                    valueAnimatorOfInt.setDuration(i4);
                    smartRefreshLayout.O1.setInterpolator(new SmartUtil());
                    smartRefreshLayout.O1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.9.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            if (smartRefreshLayout2.O1 == null || smartRefreshLayout2.x1 == null) {
                                return;
                            }
                            smartRefreshLayout2.B1.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                        }
                    });
                    smartRefreshLayout.O1.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.9.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                            SmartRefreshLayout.this.B1.onAutoLoadMoreAnimationEnd(animator, z2);
                        }
                    });
                    smartRefreshLayout.O1.start();
                }
            }
        };
        setViceState(RefreshState.Loading);
        if (i2 > 0) {
            this.A1.postDelayed(runnable, i2);
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final boolean autoRefresh(int i2, final int i3, final float f, final boolean z2) {
        if (this.C1 != RefreshState.None || !l(this.F0)) {
            return false;
        }
        Runnable runnable = new Runnable() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.8
            @Override // java.lang.Runnable
            public final void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (smartRefreshLayout.D1 != RefreshState.Refreshing) {
                    return;
                }
                ValueAnimator valueAnimator = smartRefreshLayout.O1;
                if (valueAnimator != null) {
                    valueAnimator.setDuration(0L);
                    smartRefreshLayout.O1.cancel();
                    smartRefreshLayout.O1 = null;
                }
                smartRefreshLayout.n0 = smartRefreshLayout.getMeasuredWidth() / 2.0f;
                smartRefreshLayout.B1.setState(RefreshState.PullDownToRefresh);
                RefreshHeader refreshHeader = smartRefreshLayout.w1;
                float f2 = f;
                int i4 = i3;
                if (refreshHeader == null || !refreshHeader.autoOpen(i4, f2, z2)) {
                    int i5 = smartRefreshLayout.l1;
                    float f3 = i5 == 0 ? smartRefreshLayout.t1 : i5;
                    if (f2 < 10.0f) {
                        f2 *= f3;
                    }
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(smartRefreshLayout.f0, (int) f2);
                    smartRefreshLayout.O1 = valueAnimatorOfInt;
                    valueAnimatorOfInt.setDuration(i4);
                    smartRefreshLayout.O1.setInterpolator(new SmartUtil());
                    smartRefreshLayout.O1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.8.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            if (smartRefreshLayout2.O1 == null || smartRefreshLayout2.w1 == null) {
                                return;
                            }
                            smartRefreshLayout2.B1.moveSpinner(((Integer) valueAnimator2.getAnimatedValue()).intValue(), true);
                        }
                    });
                    smartRefreshLayout.O1.addListener(new AnimatorListenerAdapter() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.8.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                            SmartRefreshLayout.this.B1.onAutoRefreshAnimationEnd(animator, z2);
                        }
                    });
                    smartRefreshLayout.O1.start();
                }
            }
        };
        setViceState(RefreshState.Refreshing);
        if (i2 > 0) {
            this.A1.postDelayed(runnable, i2);
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishLoadMore(boolean z2) {
        finishLoadMore(z2 ? Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E1))), 300) << 16 : 0, z2, false);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishRefresh(boolean z2) {
        if (z2) {
            finishRefresh(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.E1))), 300) << 16, true, Boolean.FALSE);
            return this;
        }
        finishRefresh(0, false, null);
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishLoadMore(int i2, boolean z2, boolean z3) {
        int i3 = i2 >> 16;
        int i4 = (i2 << 16) >> 16;
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(i3, z3, z2);
        if (i4 > 0) {
            this.A1.postDelayed(anonymousClass7, i4);
            return this;
        }
        anonymousClass7.run();
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.api.RefreshLayout
    public final RefreshLayout finishRefresh(int i2, final boolean z2, final Boolean bool) {
        final int i3 = i2 >> 16;
        int i4 = (i2 << 16) >> 16;
        Runnable runnable = new Runnable() { // from class: com.scwang.smart.refresh.layout.SmartRefreshLayout.6
            public int X = 0;

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = this.X;
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                if (i5 == 0) {
                    RefreshState refreshState = smartRefreshLayout.C1;
                    RefreshState refreshState2 = RefreshState.None;
                    Boolean bool2 = bool;
                    if (refreshState == refreshState2 && smartRefreshLayout.D1 == RefreshState.Refreshing) {
                        smartRefreshLayout.D1 = refreshState2;
                    } else {
                        ValueAnimator valueAnimator = smartRefreshLayout.O1;
                        if (valueAnimator != null && refreshState.X && (refreshState.e0 || refreshState == RefreshState.RefreshReleased)) {
                            valueAnimator.setDuration(0L);
                            smartRefreshLayout.O1.cancel();
                            smartRefreshLayout.O1 = null;
                            if (smartRefreshLayout.B1.animSpinner(0) == null) {
                                smartRefreshLayout.r(refreshState2);
                            } else {
                                smartRefreshLayout.r(RefreshState.PullDownCanceled);
                            }
                        } else if (refreshState == RefreshState.Refreshing && smartRefreshLayout.w1 != null && smartRefreshLayout.y1 != null) {
                            this.X = i5 + 1;
                            smartRefreshLayout.A1.postDelayed(this, i3);
                            smartRefreshLayout.r(RefreshState.RefreshFinish);
                            if (bool2 == Boolean.FALSE) {
                                smartRefreshLayout.setNoMoreData(false);
                            }
                        }
                    }
                    if (bool2 == Boolean.TRUE) {
                        smartRefreshLayout.setNoMoreData(true);
                        return;
                    }
                    return;
                }
                int iOnFinish = smartRefreshLayout.w1.onFinish(smartRefreshLayout, z2);
                OnMultiListener onMultiListener = smartRefreshLayout.e1;
                if (onMultiListener != null && smartRefreshLayout.w1 != null) {
                    onMultiListener.getClass();
                }
                if (iOnFinish < Integer.MAX_VALUE) {
                    if (smartRefreshLayout.r0 || smartRefreshLayout.h1) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (smartRefreshLayout.r0) {
                            float f = smartRefreshLayout.o0;
                            smartRefreshLayout.m0 = f;
                            smartRefreshLayout.h0 = 0;
                            smartRefreshLayout.r0 = false;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, smartRefreshLayout.n0, (f + smartRefreshLayout.f0) - (smartRefreshLayout.e0 * 2), 0));
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, smartRefreshLayout.n0, smartRefreshLayout.o0 + smartRefreshLayout.f0, 0));
                        }
                        if (smartRefreshLayout.h1) {
                            smartRefreshLayout.g1 = 0;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, smartRefreshLayout.n0, smartRefreshLayout.o0, 0));
                            smartRefreshLayout.h1 = false;
                            smartRefreshLayout.h0 = 0;
                        }
                    }
                    int i6 = smartRefreshLayout.f0;
                    if (i6 <= 0) {
                        if (i6 < 0) {
                            smartRefreshLayout.g(0, iOnFinish, smartRefreshLayout.D0, smartRefreshLayout.j0);
                            return;
                        } else {
                            smartRefreshLayout.B1.moveSpinner(0, false);
                            smartRefreshLayout.B1.setState(RefreshState.None);
                            return;
                        }
                    }
                    ValueAnimator valueAnimatorG = smartRefreshLayout.g(0, iOnFinish, smartRefreshLayout.D0, smartRefreshLayout.j0);
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished = smartRefreshLayout.S0 ? smartRefreshLayout.y1.scrollContentWhenFinished(smartRefreshLayout.f0) : null;
                    if (valueAnimatorG == null || animatorUpdateListenerScrollContentWhenFinished == null) {
                        return;
                    }
                    valueAnimatorG.addUpdateListener(animatorUpdateListenerScrollContentWhenFinished);
                }
            }
        };
        if (i4 > 0) {
            this.A1.postDelayed(runnable, i4);
            return this;
        }
        runnable.run();
        return this;
    }
}
