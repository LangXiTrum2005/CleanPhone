package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Interpolator f4737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4739g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f4736d;
        if (i10 >= 0) {
            this.f4736d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i10);
            this.f4738f = false;
            return;
        }
        if (!this.f4738f) {
            this.f4739g = 0;
            return;
        }
        Interpolator interpolator = this.f4737e;
        if (interpolator != null && this.f4735c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f4735c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        if (interpolator != null) {
            recyclerView.mViewFlinger.c(this.f4733a, this.f4734b, i11, interpolator);
        } else if (i11 == Integer.MIN_VALUE) {
            g1 g1Var = recyclerView.mViewFlinger;
            int i12 = this.f4733a;
            int i13 = this.f4734b;
            g1Var.c(i12, i13, g1Var.a(i12, i13), RecyclerView.sQuinticInterpolator);
        } else {
            g1 g1Var2 = recyclerView.mViewFlinger;
            int i14 = this.f4733a;
            int i15 = this.f4734b;
            g1Var2.getClass();
            g1Var2.c(i14, i15, i11, RecyclerView.sQuinticInterpolator);
        }
        int i16 = this.f4739g + 1;
        this.f4739g = i16;
        if (i16 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f4738f = false;
    }
}
