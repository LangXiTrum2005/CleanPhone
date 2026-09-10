package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.ironsource.InterfaceC0341fe;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends o0 implements v0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final l B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f4858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f4859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f4862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f4863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4866k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4868n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4870p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f4873s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f4880z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4871q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4872r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4874t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4875u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4876v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4877w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f4878x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f4879y = new int[2];

    public p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f4880z = valueAnimatorOfFloat;
        this.A = 0;
        l lVar = new l(this, 0);
        this.B = lVar;
        m mVar = new m(this);
        this.f4858c = stateListDrawable;
        this.f4859d = drawable;
        this.f4862g = stateListDrawable2;
        this.f4863h = drawable2;
        this.f4860e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f4861f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f4864i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f4865j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f4856a = i11;
        this.f4857b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new n(this));
        valueAnimatorOfFloat.addUpdateListener(new o(this));
        RecyclerView recyclerView2 = this.f4873s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f4873s.removeOnItemTouchListener(this);
            this.f4873s.removeOnScrollListener(mVar);
            this.f4873s.removeCallbacks(lVar);
        }
        this.f4873s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f4873s.addOnItemTouchListener(this);
        this.f4873s.addOnScrollListener(mVar);
    }

    public static int d(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    public final boolean a(float f10, float f11) {
        if (f11 < this.f4872r - this.f4864i) {
            return false;
        }
        int i10 = this.f4869o;
        int i11 = this.f4868n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean b(float f10, float f11) {
        WeakHashMap weakHashMap = m0.s0.f45746a;
        int layoutDirection = this.f4873s.getLayoutDirection();
        int i10 = this.f4860e;
        if (layoutDirection == 1) {
            if (f10 > i10 / 2) {
                return false;
            }
        } else if (f10 < this.f4871q - i10) {
            return false;
        }
        int i11 = this.l;
        int i12 = this.f4866k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i10 = this.f4876v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        boolean zA = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zB && !zA) {
            return false;
        }
        if (zA) {
            this.f4877w = 1;
            this.f4870p = (int) motionEvent.getX();
        } else if (zB) {
            this.f4877w = 2;
            this.f4867m = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i10) {
        l lVar = this.B;
        StateListDrawable stateListDrawable = this.f4858c;
        if (i10 == 2 && this.f4876v != 2) {
            stateListDrawable.setState(C);
            this.f4873s.removeCallbacks(lVar);
        }
        if (i10 == 0) {
            this.f4873s.invalidate();
        } else {
            f();
        }
        if (this.f4876v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f4873s.removeCallbacks(lVar);
            this.f4873s.postDelayed(lVar, InterfaceC0341fe.c.f28694d);
        } else if (i10 == 1) {
            this.f4873s.removeCallbacks(lVar);
            this.f4873s.postDelayed(lVar, 1500);
        }
        this.f4876v = i10;
    }

    public final void f() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f4880z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
