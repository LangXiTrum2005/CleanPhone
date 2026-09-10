package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4705a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f4707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f4710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1 f4711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f4713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f4714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f4715k;
    public final float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4717n;

    public a0(Context context) {
        c1 c1Var = new c1();
        c1Var.f4736d = -1;
        c1Var.f4738f = false;
        c1Var.f4739g = 0;
        c1Var.f4733a = 0;
        c1Var.f4734b = 0;
        c1Var.f4735c = Integer.MIN_VALUE;
        c1Var.f4737e = null;
        this.f4711g = c1Var;
        this.f4713i = new LinearInterpolator();
        this.f4714j = new DecelerateInterpolator();
        this.f4716m = 0;
        this.f4717n = 0;
        this.l = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int a(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public final PointF b(int i10) {
        Object obj = this.f4707c;
        if (obj instanceof d1) {
            return ((d1) obj).a(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d1.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01db  */
    public final void c(int i10, int i11) {
        int i12;
        int iA;
        int iA2;
        PointF pointFB;
        RecyclerView recyclerView = this.f4706b;
        int i13 = -1;
        if (!this.f4709e || this.f4705a == -1 || recyclerView == null) {
            d();
        }
        if (this.f4708d && this.f4710f == null && this.f4707c != null && (pointFB = b(this.f4705a)) != null) {
            float f10 = pointFB.x;
            if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointFB.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFB.y), null);
            }
        }
        this.f4708d = false;
        View view = this.f4710f;
        float f11 = this.l;
        c1 c1Var = this.f4711g;
        if (view != null) {
            if (this.f4706b.getChildLayoutPosition(view) == this.f4705a) {
                View view2 = this.f4710f;
                e1 e1Var = recyclerView.mState;
                PointF pointF = this.f4715k;
                if (pointF != null) {
                    float f12 = pointF.x;
                    if (f12 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i12 = 0;
                    } else {
                        i12 = f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : -1;
                    }
                } else {
                    i12 = 0;
                }
                r0 r0Var = this.f4707c;
                if (r0Var == null || !r0Var.d()) {
                    iA = 0;
                } else {
                    s0 s0Var = (s0) view2.getLayoutParams();
                    iA = a((view2.getLeft() - ((s0) view2.getLayoutParams()).f4926b.left) - ((ViewGroup.MarginLayoutParams) s0Var).leftMargin, view2.getRight() + ((s0) view2.getLayoutParams()).f4926b.right + ((ViewGroup.MarginLayoutParams) s0Var).rightMargin, r0Var.z(), r0Var.f4917n - r0Var.A(), i12);
                }
                PointF pointF2 = this.f4715k;
                if (pointF2 != null) {
                    float f13 = pointF2.y;
                    if (f13 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i13 = 0;
                    } else if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i13 = 1;
                    }
                } else {
                    i13 = 0;
                }
                r0 r0Var2 = this.f4707c;
                if (r0Var2 == null || !r0Var2.e()) {
                    iA2 = 0;
                } else {
                    s0 s0Var2 = (s0) view2.getLayoutParams();
                    iA2 = a((view2.getTop() - ((s0) view2.getLayoutParams()).f4926b.top) - ((ViewGroup.MarginLayoutParams) s0Var2).topMargin, view2.getBottom() + ((s0) view2.getLayoutParams()).f4926b.bottom + ((ViewGroup.MarginLayoutParams) s0Var2).bottomMargin, r0Var2.B(), r0Var2.f4918o - r0Var2.y(), i13);
                }
                int iCeil = (int) Math.ceil(((double) ((int) Math.ceil(Math.abs((int) Math.sqrt((iA2 * iA2) + (iA * iA))) * f11))) / 0.3356d);
                if (iCeil > 0) {
                    c1Var.f4733a = -iA;
                    c1Var.f4734b = -iA2;
                    c1Var.f4735c = iCeil;
                    c1Var.f4737e = this.f4714j;
                    c1Var.f4738f = true;
                }
                c1Var.a(recyclerView);
                d();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f4710f = null;
            }
        }
        if (this.f4709e) {
            e1 e1Var2 = recyclerView.mState;
            if (this.f4706b.mLayout.v() == 0) {
                d();
            } else {
                int i14 = this.f4716m;
                int i15 = i14 - i10;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f4716m = i15;
                int i16 = this.f4717n;
                int i17 = i16 - i11;
                if (i16 * i17 <= 0) {
                    i17 = 0;
                }
                this.f4717n = i17;
                if (i15 == 0 && i17 == 0) {
                    PointF pointFB2 = b(this.f4705a);
                    if (pointFB2 != null) {
                        float f14 = pointFB2.x;
                        if (f14 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pointFB2.y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            c1Var.f4736d = this.f4705a;
                            d();
                        } else {
                            float f15 = pointFB2.y;
                            float fSqrt = (float) Math.sqrt((f15 * f15) + (f14 * f14));
                            float f16 = pointFB2.x / fSqrt;
                            pointFB2.x = f16;
                            float f17 = pointFB2.y / fSqrt;
                            pointFB2.y = f17;
                            this.f4715k = pointFB2;
                            this.f4716m = (int) (f16 * 10000.0f);
                            this.f4717n = (int) (f17 * 10000.0f);
                            int iCeil2 = (int) Math.ceil(Math.abs(10000) * f11);
                            int i18 = (int) (this.f4716m * 1.2f);
                            int i19 = (int) (this.f4717n * 1.2f);
                            c1Var.f4733a = i18;
                            c1Var.f4734b = i19;
                            c1Var.f4735c = (int) (iCeil2 * 1.2f);
                            c1Var.f4737e = this.f4713i;
                            c1Var.f4738f = true;
                        }
                    } else {
                        c1Var.f4736d = this.f4705a;
                        d();
                    }
                }
            }
            boolean z10 = c1Var.f4736d >= 0;
            c1Var.a(recyclerView);
            if (z10) {
                if (!this.f4709e) {
                    d();
                } else {
                    this.f4708d = true;
                    recyclerView.mViewFlinger.b();
                }
            }
        }
    }

    public final void d() {
        if (this.f4709e) {
            this.f4709e = false;
            this.f4717n = 0;
            this.f4716m = 0;
            this.f4715k = null;
            this.f4706b.mState.f4749a = -1;
            this.f4710f = null;
            this.f4705a = -1;
            this.f4708d = false;
            r0 r0Var = this.f4707c;
            if (r0Var.f4909e == this) {
                r0Var.f4909e = null;
            }
            this.f4707c = null;
            this.f4706b = null;
        }
    }
}
