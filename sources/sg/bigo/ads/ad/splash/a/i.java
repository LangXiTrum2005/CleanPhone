package sg.bigo.ads.ad.splash.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.HashSet;
import java.util.Set;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends sg.bigo.ads.ad.interstitial.e {
    static final Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> j = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ViewFlow f46884c;
    Indicator d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    RoundedFrameLayout f46885e;
    sg.bigo.ads.ad.interstitial.multi_img.a f;
    sg.bigo.ads.ad.interstitial.multi_img.view.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.multi_img.b f46886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final x f46887i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final sg.bigo.ads.ad.b.c f46888l;
    final ViewGroup m;
    sg.bigo.ads.ad.interstitial.multi_img.view.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    sg.bigo.ads.ad.interstitial.multi_img.view.c f46890p;
    final sg.bigo.ads.ad.b.a.InterfaceC0783a k = new sg.bigo.ads.ad.b.a.InterfaceC0783a() { // from class: sg.bigo.ads.ad.splash.a.i.1
        @Override // sg.bigo.ads.ad.b.a.InterfaceC0783a
        public final boolean a() {
            if (i.this.f46884c != null) {
                return i.this.f46884c.f47628h;
            }
            return false;
        }
    };
    w q = new w() { // from class: sg.bigo.ads.ad.splash.a.i.3
        @Override // sg.bigo.ads.ad.interstitial.w
        public final void a() {
            Bitmap bitmap = b.j;
            boolean zAR = ((sg.bigo.ads.core.a.a) i.this.f46888l.f()).aR();
            if (bitmap != null) {
                if (zAR) {
                    synchronized (i.j) {
                        i.j.remove(i.this.g);
                    }
                }
                i.this.g.a(bitmap);
            }
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final sg.bigo.ads.ad.interstitial.d f46889n = new sg.bigo.ads.ad.interstitial.d();

    /* JADX INFO: renamed from: sg.bigo.ads.ad.splash.a.i$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46894a;

        static {
            int[] iArr = new int[sg.bigo.ads.ad.interstitial.multi_img.d.values().length];
            f46894a = iArr;
            try {
                iArr[sg.bigo.ads.ad.interstitial.multi_img.d.LTR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46894a[sg.bigo.ads.ad.interstitial.multi_img.d.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46894a[sg.bigo.ads.ad.interstitial.multi_img.d.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46894a[sg.bigo.ads.ad.interstitial.multi_img.d.TILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(sg.bigo.ads.ad.b.c cVar, ViewGroup viewGroup, x xVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar) {
        this.f46888l = cVar;
        this.m = viewGroup;
        this.f46886h = bVar;
        this.f46887i = xVar;
    }

    public final sg.bigo.ads.ad.interstitial.multi_img.view.a a(Context context, sg.bigo.ads.ad.interstitial.multi_img.c cVar, int i2, String str, boolean z2) {
        final sg.bigo.ads.ad.interstitial.multi_img.view.a aVar = new sg.bigo.ads.ad.interstitial.multi_img.view.a(context, this.f46886h, cVar, d(), i2, str, z2, null);
        aVar.s = true;
        ViewFlow.b bVar = new ViewFlow.b();
        bVar.f47653a = -1;
        bVar.f47654b = -1;
        bVar.f47655c = false;
        bVar.d = cVar.d;
        this.f46884c.addView(aVar.j, bVar);
        if (this.f != null) {
            aVar.r = new sg.bigo.ads.ad.interstitial.multi_img.view.d.a() { // from class: sg.bigo.ads.ad.splash.a.i.10
                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void a() {
                    i.this.f.a(i.this.f46884c.a(aVar.j));
                }

                @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                public final void b() {
                    aVar.r = null;
                    a();
                }
            };
        }
        return aVar;
    }

    public final int d() {
        m mVar = this.f46886h.f46369a;
        if (mVar == null) {
            return 1;
        }
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar.a("video_play_page.mediaview_colour"));
    }

    public final boolean e() {
        return this.f46886h.f46370b == sg.bigo.ads.ad.interstitial.multi_img.d.NONE;
    }

    public final void f() {
        if (e()) {
            return;
        }
        int iA = this.f46886h.f46369a.a("video_play_page.multi_guide");
        switch (iA) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                a(iA, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.this.f46884c.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.i.8.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (i.this.f46884c.g) {
                                    return;
                                }
                                i.a(i.this, 3L, 0L, 300L);
                            }
                        });
                    }
                });
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f46884c.setFlipInterval((iA - 5) * 1000);
                this.f46884c.c();
                break;
        }
    }

    public static /* synthetic */ void a(i iVar, final long j2, long j3, final long j4) {
        if (j2 > 0) {
            ViewFlow viewFlow = iVar.f46884c;
            if (!viewFlow.g && !viewFlow.e()) {
                iVar.f46884c.setScrollEnabled(false);
                int iA = sg.bigo.ads.common.utils.e.a(iVar.m.getContext(), 40);
                final int scrollX = iVar.f46884c.getScrollX();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iA, 0);
                valueAnimatorOfInt.setDuration(2 * j4);
                valueAnimatorOfInt.setStartDelay(j3);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.splash.a.i.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        i.a(i.this, j2 - 1, 300L, j4);
                    }
                });
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.splash.a.i.7
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        if (animatedValue instanceof Integer) {
                            i.this.f46884c.scrollTo(((Integer) animatedValue).intValue() + scrollX, i.this.f46884c.getScrollY());
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            }
        }
        iVar.f46884c.setScrollEnabled(true);
    }
}
