package p0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.a0;
import com.unity3d.services.UnityAdsConstants;
import p.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47887r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f47889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f47890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f47891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f47892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f47893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f47895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f47896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f47897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float[] f47898k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f47902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1 f47903q;

    public c(n1 n1Var) {
        a aVar = new a();
        aVar.f47882e = Long.MIN_VALUE;
        aVar.f47884g = -1L;
        aVar.f47883f = 0L;
        this.f47888a = aVar;
        this.f47889b = new AccelerateInterpolator();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f47892e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f47893f = fArr2;
        float[] fArr3 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f47896i = fArr3;
        float[] fArr4 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        this.f47897j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f47898k = fArr5;
        this.f47890c = n1Var;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f47894g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f47895h = f47887r;
        aVar.f47878a = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        aVar.f47879b = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.f47903q = n1Var;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i10, float f10, float f11, float f12) {
        float fB;
        float interpolation;
        float fB2 = b(this.f47892e[i10] * f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f47893f[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f47889b;
        if (fC >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (fC > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f13 = this.f47896i[i10];
            float f14 = this.f47897j[i10];
            float f15 = this.f47898k[i10];
            float f16 = f13 * f12;
            return fB > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f17 = this.f47896i[i10];
        float f18 = this.f47897j[i10];
        float f19 = this.f47898k[i10];
        float f110 = f17 * f12;
        if (fB > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i10 = this.f47894g;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f47901o && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return f10 / (-f11);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d() {
        int i10 = 0;
        if (this.f47899m) {
            this.f47901o = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f47888a;
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f47882e);
        int i12 = aVar.f47879b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f47886i = i10;
        aVar.f47885h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f47884g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        n1 n1Var;
        int count;
        a aVar = this.f47888a;
        float f10 = aVar.f47881d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f47880c);
        if (iAbs != 0 && (count = (n1Var = this.f47903q).getCount()) != 0) {
            int childCount = n1Var.getChildCount();
            int firstVisiblePosition = n1Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && n1Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && n1Var.getChildAt(childCount - 1).getBottom() <= n1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f47902p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f47900n = r2
            r7.l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            p.n1 r4 = r7.f47890c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            p0.a r9 = r7.f47888a
            r9.f47880c = r0
            r9.f47881d = r8
            boolean r8 = r7.f47901o
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            androidx.lifecycle.a0 r8 = r7.f47891d
            if (r8 != 0) goto L62
            androidx.lifecycle.a0 r8 = new androidx.lifecycle.a0
            r9 = 29
            r8.<init>(r7, r9)
            r7.f47891d = r8
        L62:
            r7.f47901o = r2
            r7.f47899m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L77
            int r8 = r7.f47895h
            if (r8 <= 0) goto L77
            androidx.lifecycle.a0 r9 = r7.f47891d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = m0.s0.f45746a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            androidx.lifecycle.a0 r8 = r7.f47891d
            r8.run()
        L7c:
            r7.l = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
