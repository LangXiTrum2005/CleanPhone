package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f47776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1 f47777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p1 f47778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f47781i = new int[2];

    public q1(View view) {
        this.f47776d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f47773a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f47774b = tapTimeout;
        this.f47775c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        p1 p1Var = this.f47778f;
        View view = this.f47776d;
        if (p1Var != null) {
            view.removeCallbacks(p1Var);
        }
        p1 p1Var2 = this.f47777e;
        if (p1Var2 != null) {
            view.removeCallbacks(p1Var2);
        }
    }

    public abstract o.c0 b();

    public abstract boolean c();

    public boolean d() {
        o.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.a()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        n1 n1VarL;
        boolean z11 = this.f47779g;
        View view2 = this.f47776d;
        if (z11) {
            o.c0 c0VarB = b();
            if (c0VarB != null && c0VarB.a() && (n1VarL = c0VarB.l()) != null && n1VarL.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f47781i;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                n1VarL.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = n1VarL.b(this.f47780h, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z12) {
                    z10 = true;
                } else if (d()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (d()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f47780h = motionEvent.getPointerId(0);
                    if (this.f47777e == null) {
                        this.f47777e = new p1(this, 0);
                    }
                    view2.postDelayed(this.f47777e, this.f47774b);
                    if (this.f47778f == null) {
                        this.f47778f = new p1(this, 1);
                    }
                    view2.postDelayed(this.f47778f, this.f47775c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f47780h);
                    if (iFindPointerIndex >= 0) {
                        float x10 = motionEvent.getX(iFindPointerIndex);
                        float y10 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f47773a;
                        float f11 = -f10;
                        if (x10 < f11 || y10 < f11 || x10 >= (view2.getRight() - view2.getLeft()) + f10 || y10 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f47779g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f47779g = false;
        this.f47780h = -1;
        p1 p1Var = this.f47777e;
        if (p1Var != null) {
            this.f47776d.removeCallbacks(p1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
