package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.FixContentFrameLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d<T extends View> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f46421b = 300;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f46422c = 500;
    public static int d = v.f46694e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f46423e = -188383023;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46424a;
    protected final Context f;
    protected sg.bigo.ads.ad.interstitial.multi_img.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f46425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f46426i;
    public final RoundedFrameLayout j;
    public final FixContentFrameLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T f46427l;
    public final AdImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46428n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bitmap f46429p;
    public int q;
    public a r;
    private ValueAnimator t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ValueAnimator f46430u;
    private long v = 0;
    public boolean s = false;

    public interface a {
        void a();

        void b();
    }

    public d(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f = context;
        this.f46424a = z2;
        this.f46426i = i3;
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) sg.bigo.ads.common.utils.a.a(context, i4, null, false);
        this.j = roundedFrameLayout;
        this.k = (FixContentFrameLayout) roundedFrameLayout.findViewById(i5);
        this.f46427l = (T) roundedFrameLayout.findViewById(i6);
        this.m = (AdImageView) roundedFrameLayout.findViewById(i7);
        a(cVar);
        a(i2);
        this.q = d;
        u.a(roundedFrameLayout, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.this.v = SystemClock.elapsedRealtime();
            }
        });
        roundedFrameLayout.setTag(f46423e, this);
    }

    public final boolean c(int i2) {
        if (this.s) {
            return i2 == 5;
        }
        return i2 == 4;
    }

    public final boolean d(int i2) {
        if (this.s) {
            return i2 == 4;
        }
        return i2 == 3;
    }

    public final void b(final int i2) {
        if (a()) {
            this.m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.5
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.m.setBackgroundColor(i2);
                }
            });
        }
    }

    public final void a(int i2) {
        int i3;
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 4) {
                if (i2 == 1) {
                    i3 = -1;
                } else if (i2 != 2) {
                    i2 = 3;
                } else {
                    i3 = -16777216;
                }
            }
            this.f46425h = i2;
        }
        i3 = 0;
        b(i3);
        this.f46425h = i2;
    }

    public final void b(Bitmap bitmap) {
        a aVar;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = ((this.v > 0L ? 1 : (this.v == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - this.v : 0L) > f46421b;
        if (c(this.f46426i) || c(this.f46425h)) {
            this.f46429p = sg.bigo.ads.common.utils.d.b(this.f, bitmap);
            if (c(this.f46426i)) {
                this.o = sg.bigo.ads.common.w.b.a(this.f46429p, -16777216);
            } else {
                this.o = -16777216;
            }
            final sg.bigo.ads.common.w.b.a aVar2 = new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.2
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f46422c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i2) {
                    if (d.this.r != null) {
                        d.this.r.b();
                    }
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i2) {
                    d.this.q = i2;
                    d dVar = d.this;
                    if (dVar.c(dVar.f46425h)) {
                        d dVar2 = d.this;
                        d.a(dVar2, dVar2.f46429p, d.this.q);
                    }
                    if (d.this.r != null) {
                        d.this.r.a();
                    }
                    return super.a(i2);
                }
            };
            if (z4) {
                ValueAnimator valueAnimator = this.f46430u;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, d);
                this.f46430u = valueAnimatorOfInt;
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                this.f46430u.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            int iIntValue = ((Integer) animatedValue).intValue();
                            sg.bigo.ads.common.w.b.a aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.a(iIntValue);
                            }
                        }
                    }
                });
                this.f46430u.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.7
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        sg.bigo.ads.common.w.b.a aVar3 = aVar2;
                        if (aVar3 != null) {
                            aVar3.b(d.d);
                        }
                    }
                });
                if (aVar2.a() >= 0) {
                    this.f46430u.setDuration(aVar2.a());
                }
                this.f46430u.start();
            } else {
                aVar2.a(d);
                aVar2.b(d);
            }
            z3 = true;
        }
        if (d(this.f46426i) || d(this.f46425h)) {
            int iA = sg.bigo.ads.common.w.b.a(bitmap, -16777216);
            final sg.bigo.ads.common.w.b.a aVar3 = new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.3
                @Override // sg.bigo.ads.common.w.b.a
                public final long a() {
                    return d.f46422c;
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final void b(int i2) {
                    if (d.this.r != null) {
                        d.this.r.b();
                    }
                }

                @Override // sg.bigo.ads.common.w.b.a
                public final boolean a(int i2) {
                    d.this.f46428n = i2;
                    d dVar = d.this;
                    if (dVar.d(dVar.f46425h)) {
                        d dVar2 = d.this;
                        dVar2.b(dVar2.f46428n);
                    }
                    if (d.this.r != null) {
                        d.this.r.a();
                    }
                    return super.a(i2);
                }
            };
            if (z4) {
                ValueAnimator valueAnimator2 = this.t;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.t = sg.bigo.ads.common.w.b.a(this.m, iA, new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.8
                    @Override // sg.bigo.ads.common.w.b.a
                    public final long a() {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            return aVar4.a();
                        }
                        return -1L;
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i2) {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 != null) {
                            aVar4.b(i2);
                        }
                    }

                    @Override // sg.bigo.ads.common.w.b.a
                    public final boolean a(int i2) {
                        sg.bigo.ads.common.w.b.a aVar4 = aVar3;
                        if (aVar4 == null) {
                            return true;
                        }
                        aVar4.a(i2);
                        return true;
                    }
                });
            } else {
                aVar3.a(iA);
                aVar3.b(iA);
            }
        } else {
            z2 = z3;
        }
        if (z2 || (aVar = this.r) == null) {
            return;
        }
        aVar.b();
    }

    public final void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        FixContentFrameLayout.a aVar = (FixContentFrameLayout.a) this.f46427l.getLayoutParams();
        if (aVar.f47568a == i2 || aVar.f47569b == i3) {
            return;
        }
        aVar.f47568a = i2;
        aVar.f47569b = i3;
        this.f46427l.setLayoutParams(aVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.multi_img.c cVar) {
        FixContentFrameLayout fixContentFrameLayout;
        boolean z2;
        this.g = cVar;
        if (a()) {
            int iA = e.a(this.f, 12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.topMargin = iA;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            layoutParams.bottomMargin = iA;
            layoutParams.height = -2;
            layoutParams.width = -2;
            this.k.setLayoutParams(layoutParams);
            fixContentFrameLayout = this.k;
            z2 = true;
        } else {
            fixContentFrameLayout = this.k;
            z2 = false;
        }
        fixContentFrameLayout.setFixContent(z2);
    }

    public static /* synthetic */ void a(d dVar, final Bitmap bitmap, final int i2) {
        if (dVar.a()) {
            dVar.m.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.view.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(d.this.m.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i2);
                    d.this.m.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    d.this.m.setImageDrawable(bitmapDrawable);
                }
            });
        }
    }

    public boolean a() {
        return this.f46424a;
    }
}
