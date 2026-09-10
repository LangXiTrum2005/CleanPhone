package sg.bigo.ads.ad.interstitial;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.YandexWarningTextView;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends r implements sg.bigo.ads.ad.c.a, sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b {
    private final List<Integer> G;
    private p<t> H;
    private final l L;
    private final WeakHashMap<Object, Integer> M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Map<Integer, WeakHashMap<Object, Runnable>> f45735N;
    private final sg.bigo.ads.common.e.a.AbstractC0836a O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f45736P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Runnable f45737Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f45738R;
    private int S;
    private final Runnable T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f45739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.api.a.m f45740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected sg.bigo.ads.api.a.m f45741c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45742e;
    protected boolean f;
    protected boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f45743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.multi_img.b f45744i;
    protected f j;
    protected final Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f45745l;
    protected int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f45746n;
    protected int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected AtomicBoolean f45747p;
    protected boolean q;
    public q r;
    protected sg.bigo.ads.ad.interstitial.e.c s;
    protected sg.bigo.ads.ad.interstitial.g.a t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f45748u;
    protected sg.bigo.ads.common.utils.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected sg.bigo.ads.common.utils.n f45749w;
    protected sg.bigo.ads.common.utils.n x;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a$3, reason: invalid class name */
    public class AnonymousClass3 extends sg.bigo.ads.common.utils.n {
        public AnonymousClass3(long j) {
            super(j, 1000L);
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a() {
            a aVar = a.this;
            aVar.a(aVar.v, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    ViewGroup viewGroup = a.this.D;
                    if (viewGroup != null) {
                        Context context = viewGroup.getContext();
                        int i2 = R.layout.bigo_ad_view_slide_gesture;
                        ViewGroup viewGroup2 = a.this.D;
                        sg.bigo.ads.common.utils.a.a(context, i2, viewGroup2, viewGroup2 != null);
                        View viewFindViewById = a.this.D.findViewById(R.id.inter_slide_gesture_contain);
                        a aVar2 = a.this;
                        aVar2.f45739a = aVar2.D.findViewById(R.id.inter_slide_gesture);
                        View view = a.this.f45739a;
                        if (view == null) {
                            return;
                        }
                        view.setTag(16);
                        u uVarZ = a.this.Z();
                        a aVar3 = a.this;
                        uVarZ.a(aVar3.D, viewFindViewById, aVar3.Y(), 8, 0, a.this.f45739a);
                        a.this.w();
                        View view2 = a.this.f45739a;
                        AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(0.0f, 1.0f, 300L);
                        AlphaAnimation alphaAnimationE2 = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.0f, 200L);
                        alphaAnimationE2.setStartOffset(200L);
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 160.0f, 0.0f);
                        translateAnimation.setDuration(300L);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimationE);
                        animationSet.setAnimationListener(new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.c.9

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ View f45873a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ AlphaAnimation f45874b;

                            public AnonymousClass9() {
                                view = view2;
                                alphaAnimation = alphaAnimationE2;
                            }

                            @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                view.startAnimation(alphaAnimation);
                            }
                        });
                        alphaAnimationE2.setAnimationListener(new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.c.10

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ AnimationSet f45845a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ View f45846b;

                            public AnonymousClass10() {
                                animationSet = animationSet;
                                view = view2;
                            }

                            @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                animationSet.setStartOffset(200L);
                                view.startAnimation(animationSet);
                            }
                        });
                        view2.startAnimation(animationSet);
                        a.this.f45739a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.3.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) a.this.y)) {
                                    return;
                                }
                                a.this.v();
                            }
                        }, 5000L);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.utils.n
        public final void a(long j) {
        }
    }

    public a(Activity activity) {
        super(activity);
        this.G = new ArrayList();
        this.d = false;
        this.f45742e = false;
        this.f = false;
        this.g = false;
        this.k = new Handler(Looper.getMainLooper());
        this.m = 0;
        this.f45746n = 0;
        this.o = 0;
        this.f45747p = new AtomicBoolean(false);
        this.q = true;
        this.L = new l();
        this.M = new WeakHashMap<>();
        this.f45735N = new HashMap();
        this.O = new sg.bigo.ads.common.e.a.AbstractC0836a() { // from class: sg.bigo.ads.ad.interstitial.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC0836a
            public final void a(boolean z2) {
                a.this.c(z2);
            }
        };
        this.f45736P = false;
        this.f45737Q = null;
        this.f45738R = 0;
        this.S = 0;
        this.T = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.y();
            }
        };
        sg.bigo.ads.ad.interstitial.f.b.f46251a = new WeakReference<>(this);
    }

    public static /* synthetic */ double a(int i2, int i3, int i4, int i5) {
        return Math.max(Math.abs(i2 - i4), Math.abs(i3 - i5));
    }

    private boolean ad() {
        if (!this.f45736P) {
            return true;
        }
        if (c() == 0) {
            return !k() || l();
        }
        return false;
    }

    private LandingPageStyleConfig ae() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        if (mVar == null || !this.d) {
            mVar = null;
        }
        int iA = sg.bigo.ads.ad.interstitial.g.a.a(mVar);
        int iB = sg.bigo.ads.ad.interstitial.g.a.b(mVar);
        sg.bigo.ads.ad.interstitial.g.a aVar = this.t;
        int iA2 = (aVar == null || !aVar.d()) ? 0 : Z().f46659i;
        if (iA2 == 0) {
            iA2 = s.a(this.C, 0);
        }
        int i2 = iA2;
        int measuredHeight = 0;
        Class<? extends sg.bigo.ads.controller.landing.c> clsH = h(iA);
        ViewGroup viewGroup = this.D;
        if (viewGroup != null) {
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return new LandingPageStyleConfig(clsH, 9, iA, iB, measuredHeight, i2, 0.8f);
    }

    private boolean af() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        return mVar != null && mVar.c("layer.is_show_layer");
    }

    public static Class<? extends sg.bigo.ads.controller.landing.c> h(int i2) {
        if (i2 == 0) {
            return sg.bigo.ads.ad.interstitial.f.d.class;
        }
        return (7 == i2 || 8 == i2) ? sg.bigo.ads.ad.interstitial.f.a.class : sg.bigo.ads.ad.interstitial.f.e.class;
    }

    private void k(int i2) {
        sg.bigo.ads.ad.interstitial.multi_img.b bVarD;
        if (i2 != 0) {
            if (i2 == 1 && (bVarD = ((t) this.y).D()) != null) {
                bVarD.a(2, 2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f45744i;
        if (bVar != null) {
            bVar.a(1, 2);
        }
    }

    public final boolean A() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        sg.bigo.ads.api.a.m mVar;
        int i2 = R.layout.bigo_ad_view_click_guide;
        int iA = -1;
        if (aq()) {
            sg.bigo.ads.api.a.m mVar2 = this.f45741c;
            iA = mVar2 != null ? mVar2.a("layer.guided_click") : -1;
            if (iA == 1) {
                i2 = R.layout.bigo_ad_view_click_guide_landscape_1;
            } else if (iA == 3) {
                i2 = R.layout.bigo_ad_view_click_guide_landscape_3;
            } else {
                i2 = R.layout.bigo_ad_view_click_guide_landscape_2;
                iA = 2;
            }
        }
        if (this.D == null || c() == 2 || c() == 8 || !this.f45743h.d) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.g.a aVar = this.t;
        if (aVar != null) {
            viewFindViewById = aVar.a(this, this.D, Y(), new v.a() { // from class: sg.bigo.ads.ad.interstitial.a.5
                @Override // sg.bigo.ads.ad.interstitial.v.a
                public final void a(View view) {
                    a.this.a(view);
                }
            });
        } else {
            Context context = this.D.getContext();
            ViewGroup viewGroup = this.D;
            sg.bigo.ads.common.utils.a.a(context, i2, viewGroup, viewGroup != null);
            View viewFindViewById4 = this.D.findViewById(R.id.inter_click_guide_container);
            if (viewFindViewById4 != null) {
                Z().a(this.D, viewFindViewById4, Y(), 10, this.f45743h.f46718l, viewFindViewById4);
                viewFindViewById4.setTag(12);
                Button button = (Button) viewFindViewById4.findViewById(R.id.inter_btn_cta);
                if (button != null) {
                    button.setTag(17);
                }
                viewFindViewById4.findViewById(R.id.inter_icon).setTag(17);
                if (this.d) {
                    if (button != null) {
                        button.setBackgroundColor(this.o);
                    }
                    x xVar = this.f45743h;
                    if (xVar.k) {
                        a(viewFindViewById4, 10, ((t) this.y).f46647z, xVar.f46718l);
                    } else {
                        a(viewFindViewById4, 10, r.f46631F, 0);
                    }
                } else {
                    a(viewFindViewById4, 5, ((t) this.y).f46647z, this.f45743h.f46718l);
                }
                c.b(viewFindViewById4);
                View viewFindViewById5 = viewFindViewById4.findViewById(R.id.inter_click_guide);
                View viewFindViewById6 = viewFindViewById4.findViewById(R.id.inter_click_ripple);
                if (viewFindViewById5 != null && viewFindViewById6 != null) {
                    c.a(viewFindViewById5, viewFindViewById6);
                }
                if (iA == 1 && (viewFindViewById3 = viewFindViewById4.findViewById(R.id.inter_btn_cta_layout)) != null) {
                    c.e(viewFindViewById3);
                } else if (iA == 3 && (viewFindViewById2 = viewFindViewById4.findViewById(R.id.inter_click_guide)) != null) {
                    AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.0f, 600L);
                    alphaAnimationE.setStartOffset(1000L);
                    alphaAnimationE.setInterpolator(sg.bigo.ads.common.utils.b.a(1));
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -sg.bigo.ads.common.utils.e.a(viewFindViewById2.getContext(), 160));
                    translateAnimation.setDuration(600L);
                    translateAnimation.setStartOffset(1000L);
                    translateAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                    AnimationSet animationSet = new AnimationSet(false);
                    animationSet.addAnimation(alphaAnimationE);
                    animationSet.addAnimation(translateAnimation);
                    alphaAnimationE.setRepeatCount(Integer.MAX_VALUE);
                    alphaAnimationE.setRepeatMode(1);
                    translateAnimation.setRepeatCount(Integer.MAX_VALUE);
                    translateAnimation.setRepeatMode(1);
                    viewFindViewById2.startAnimation(animationSet);
                }
            }
            viewFindViewById = this.D.findViewById(R.id.bigo_ad_layout_click_guide);
            a(viewFindViewById);
            if (viewFindViewById == null) {
                viewFindViewById = viewFindViewById4;
            }
        }
        if (viewFindViewById != null && (mVar = this.f45741c) != null) {
            a(viewFindViewById, this.d ? mVar.a("layer.below_area_dp") : 0, this.d && this.f45741c.a("layer.below_area_clickable") == 1, this.d ? this.f45741c.a("layer.up_area_dp") : 0, this.d && this.f45741c.a("layer.up_area_clickable") == 1, 10, this.f45743h.f46718l);
        }
        f(9);
        a(((long) this.f45743h.f46715e) * 1000);
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int B() {
        int iC = c();
        int iD = d();
        switch (iC) {
            case 2:
                if (iD == 5) {
                    return 4;
                }
            case 1:
                return 2;
            case 3:
                return 3;
            case 4:
            default:
                return 1;
            case 5:
            case 6:
                return 4;
            case 7:
            case 8:
                return 5;
            case 9:
                if (iD == 1) {
                    return 2;
                }
                return iD == 5 ? 4 : 9;
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.ad.interstitial.k.b
    public void C() {
        if (G()) {
            ae();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void D() {
        super.D();
        this.k.removeCallbacksAndMessages(null);
        sg.bigo.ads.ad.interstitial.e.c cVar = this.s;
        if (cVar != null) {
            IconAds iconAds = cVar.f46195e;
            if (iconAds != null) {
                iconAds.destroy();
            }
            sg.bigo.ads.common.utils.n nVar = cVar.f46198l;
            if (nVar != null) {
                nVar.b();
                cVar.f46198l = null;
            }
            sg.bigo.ads.common.utils.n nVar2 = cVar.m;
            if (nVar2 != null) {
                nVar2.b();
                cVar.m = null;
            }
            cVar.q.clear();
            cVar.r.clear();
            cVar.s.clear();
            cVar.t.clear();
            cVar.f46199n = true;
            cVar.b();
            cVar.c();
        }
        sg.bigo.ads.common.e.a.b(this.f46325A, this.O);
    }

    public final void E() {
        TextView textView = (TextView) this.D.findViewById(R.id.inter_advertiser);
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f45745l)) {
            textView.setVisibility(8);
            return;
        }
        if (!aq() && (textView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(2, R.id.inter_ad_info);
            layoutParams.addRule(12, 0);
            layoutParams.leftMargin = 18;
            layoutParams.setMarginStart(18);
            layoutParams.bottomMargin = 15;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.f45745l);
        }
    }

    public final boolean F() {
        ae();
        return false;
    }

    public final boolean G() {
        int iC = c();
        return iC == 2 || iC == 6 || iC == 8 || iC == 9;
    }

    public abstract void H();

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[PHI: r0
  0x003b: PHI (r0v16 java.lang.Integer) = (r0v15 java.lang.Integer), (r0v18 java.lang.Integer) binds: [B:24:0x0050, B:17:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public void I() {
        Integer numA;
        if (this.D != null) {
            int iB = -16777216;
            if (this.f45741c == null || !M()) {
                if (!aq()) {
                    Z().a(this.D);
                    return;
                }
                sg.bigo.ads.api.a.m mVar = this.f45741c;
                if (mVar != null) {
                    int iA = mVar.a("video_play_page.background_colour");
                    if (iA == 1) {
                        Z().a(this.D, -1);
                        return;
                    }
                    if (iA == 2) {
                        Z().a(this.D, -16777216);
                        return;
                    }
                    if (iA == 4) {
                        Z().a(this.D, this.m);
                        return;
                    } else if (iA == 5) {
                        Z().a(this.D);
                        return;
                    } else {
                        Z().a(this.D, sg.bigo.ads.common.utils.q.b("#262E33", -7829368));
                        return;
                    }
                }
                return;
            }
            int iA2 = this.f45741c.a("video_play_page.background_colour");
            if (iA2 == 1) {
                iB = -1;
            } else if (iA2 != 2) {
                if (aq()) {
                    if (iA2 == 4) {
                        numA = s.a((NativeAd) this.C);
                        if (numA != null) {
                            iB = numA.intValue();
                        }
                    } else if (iA2 != 3) {
                        iB = -100;
                    }
                    iB = sg.bigo.ads.common.utils.q.b("#262E33", -7829368);
                } else if (iA2 == 3) {
                    numA = s.a((NativeAd) this.C);
                    if (numA != null) {
                        iB = numA.intValue();
                    } else {
                        iB = sg.bigo.ads.common.utils.q.b("#262E33", -7829368);
                    }
                } else {
                    iB = -100;
                }
            }
            u uVarZ = Z();
            ViewGroup viewGroup = this.D;
            if (iB != -100) {
                uVarZ.a(viewGroup, iB);
            } else {
                uVarZ.a(viewGroup);
            }
        }
    }

    public final boolean J() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        return mVar != null && 1 == mVar.a("endpage.is_endpage", 1);
    }

    public final boolean K() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        return (mVar == null || mVar.a("mid_page.show_time") != 0 || J() || af() || this.f45747p.get()) ? false : true;
    }

    public final boolean L() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        return (mVar == null || mVar.a("mid_page.show_time") <= 0 || J() || af() || this.f45747p.get()) ? false : true;
    }

    public final boolean M() {
        int iR = R();
        return iR == R.layout.bigo_ad_activity_interstitial_percent_warning || iR == R.layout.bigo_ad_activity_interstitial_percent_warning_landscape;
    }

    public abstract x b();

    public final int c() {
        synchronized (this.G) {
            try {
                if (this.G.isEmpty()) {
                    return -1;
                }
                return this.G.get(0).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int d() {
        synchronized (this.G) {
            try {
                if (this.G.size() < 2) {
                    return -1;
                }
                return this.G.get(1).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f45735N) {
            try {
                WeakHashMap<Object, Runnable> weakHashMapRemove = this.f45735N.remove(1);
                if (!sg.bigo.ads.common.utils.k.a(weakHashMapRemove)) {
                    Iterator<Map.Entry<Object, Runnable>> it = weakHashMapRemove.entrySet().iterator();
                    while (it.hasNext()) {
                        Runnable value = it.next().getValue();
                        if (value != null) {
                            sg.bigo.ads.common.n.d.a(2, value);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(int i2) {
        q qVar;
        sg.bigo.ads.ad.b.c cVar;
        sg.bigo.ads.ad.interstitial.e.c cVar2 = this.s;
        if (cVar2 != null) {
            sg.bigo.ads.ad.interstitial.e.c.a aVar = cVar2.g;
            if (i2 == 0) {
                aVar.f46213a = 1;
            } else if (i2 == 1) {
                aVar.f46213a = 3;
            } else if (i2 == 9) {
                aVar.f46213a = 4;
            } else if (i2 == 10) {
                aVar.f46213a = 2;
            }
        }
        synchronized (this.G) {
            synchronized (this.G) {
                this.G.remove(Integer.valueOf(i2));
            }
            this.G.add(0, Integer.valueOf(i2));
        }
        int iD = d();
        int iC = c();
        if (iC != iD) {
            k(iD);
        }
        sg.bigo.ads.ad.b.c cVar3 = this.C;
        if (cVar3 != null) {
            cVar3.e(i2);
        }
        if (((i2 == 0) | (i2 == 1) | (i2 == 2) | (i2 == 4) | (i2 == 5) | (i2 == 6) | (i2 == 7) | (i2 == 8) | (i2 == 9)) && (cVar = this.C) != null) {
            ((sg.bigo.ads.core.a.a) cVar.f()).b(SystemClock.elapsedRealtime());
        }
        if (i2 != 0 && i2 != 10 && i2 != 3 && (qVar = this.r) != null) {
            qVar.b();
        }
        switch (iC) {
            case 0:
                sg.bigo.ads.ad.interstitial.multi_img.b bVar = this.f45744i;
                if (bVar != null) {
                    bVar.a(1, 1);
                }
                l lVar = this.L;
                lVar.a(lVar.f46350b);
                return;
            case 1:
                sg.bigo.ads.ad.interstitial.multi_img.b bVarD = ((t) this.y).D();
                if (bVarD != null) {
                    bVarD.a(2, 1);
                }
                l lVar2 = this.L;
                lVar2.a(lVar2.d);
                x xVar = this.f45743h;
                if (xVar == null || !xVar.d) {
                    j(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 2:
            case 8:
            case 9:
                j(R.drawable.bigo_ad_ic_close);
                l lVar3 = this.L;
                lVar3.a(lVar3.f46352e);
                return;
            case 3:
            case 6:
            default:
                return;
            case 4:
                l lVar4 = this.L;
                lVar4.a(lVar4.g);
                return;
            case 5:
                l lVar5 = this.L;
                lVar5.a(lVar5.f);
                x xVar2 = this.f45743h;
                if (xVar2 == null || !xVar2.d) {
                    j(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 7:
                l lVar6 = this.L;
                lVar6.a(lVar6.f46353h);
                x xVar3 = this.f45743h;
                if (xVar3 == null || !xVar3.d) {
                    j(R.drawable.bigo_ad_ic_close);
                    return;
                }
                return;
            case 10:
                l lVar7 = this.L;
                lVar7.a(lVar7.f46351c);
                return;
        }
    }

    public abstract boolean f(boolean z2);

    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        final View viewFindViewById;
        Bitmap bitmapA;
        ViewGroup viewGroup3;
        IconListView iconListView;
        sg.bigo.ads.api.a.m mVar;
        super.g(i2);
        if (this.D == null) {
            return;
        }
        ((t) this.y).D = this.L;
        u uVarZ = Z();
        if (uVarZ instanceof sg.bigo.ads.ad.interstitial.d.a) {
            if (uVarZ instanceof sg.bigo.ads.ad.interstitial.d.m) {
                ((sg.bigo.ads.ad.interstitial.d.m) uVarZ).a(this, this.D, this.f45743h, this.f45744i, this.j);
            } else {
                ((sg.bigo.ads.ad.interstitial.d.a) uVarZ).a(this, this.D, this.f45743h, this.f45741c, this.j);
            }
            o();
        }
        p();
        q();
        ViewGroup viewGroup4 = this.D;
        if (viewGroup4 != null) {
            Button button = (Button) viewGroup4.findViewById(R.id.inter_btn_cta);
            TextView textView = (TextView) this.D.findViewById(R.id.inter_company);
            sg.bigo.ads.api.a.m mVar2 = this.f45741c;
            if (mVar2 != null) {
                int iA = mVar2.a("video_play_page.cta_color");
                int iA2 = this.f45741c.a("endpage.cta_color");
                int iA3 = this.f45741c.a("layer.cta_color");
                this.m = s.a(((t) this.y).f46647z, iA, null);
                this.f45746n = s.a(((t) this.y).f46647z, iA2, null);
                this.o = s.a(((t) this.y).f46647z, iA3, null);
                if (!(Z() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
                    if (button != null) {
                        button.setBackgroundColor(this.m);
                    }
                    if (textView != null) {
                        textView.setTextColor(this.m);
                    }
                }
            }
            if (M() && this.f45741c != null) {
                View viewFindViewById2 = this.D.findViewById(R.id.inter_media_container);
                int iA4 = this.f45741c.a("video_play_page.background_colour");
                if (!aq() ? iA4 == 3 || iA4 == 4 : iA4 == 4 || iA4 == 5) {
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#66000000", -7829368));
                        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_warning);
                        if (textView2 != null) {
                            textView2.setTextColor(sg.bigo.ads.common.utils.q.b("#66FFFFFF", -1));
                        }
                    }
                }
            }
        }
        if (!(Z() instanceof sg.bigo.ads.ad.interstitial.d.a) && (viewGroup3 = this.D) != null) {
            View viewFindViewById3 = viewGroup3.findViewById(R.id.inter_download_msg);
            if (viewFindViewById3 != null) {
                f fVar = this.j;
                if (fVar == null || !fVar.d) {
                    viewFindViewById3.setVisibility(8);
                } else {
                    Button button2 = (Button) viewGroup3.findViewById(R.id.inter_btn_cta);
                    if (button2 != null) {
                        button2.setText(R.string.bigo_ad_cta_download_default);
                    }
                    Z().a(viewGroup3, viewFindViewById3, Y(), 8, this.f45743h.f46717i, new View[0]);
                    if (aq()) {
                        iconListView = (IconListView) viewGroup3.findViewById(R.id.inter_iconlist_download_msg_list);
                        if (this.j != null) {
                            if (aq()) {
                                iconListView.setThemeWhite(true);
                            } else {
                                iconListView.setThemeWhite(true);
                            }
                            iconListView.a(this.j);
                            iconListView.setVisibility(0);
                        }
                    }
                }
            } else if (aq()) {
                iconListView = (IconListView) viewGroup3.findViewById(R.id.inter_iconlist_download_msg_list);
                if (this.j != null && iconListView != null) {
                    if (aq() || !M() || (mVar = this.f45741c) == null) {
                        iconListView.setThemeWhite(true);
                    } else {
                        int iA5 = mVar.a("video_play_page.background_colour");
                        iconListView.setThemeWhite(!aq() ? iA5 == 1 : iA5 == 1);
                    }
                    iconListView.a(this.j);
                    iconListView.setVisibility(0);
                }
            }
        }
        r();
        u();
        f(0);
        H();
        ((t) this.y).f().a(this.d);
        a(this.D);
        x();
        a(((long) this.f45743h.f46713b) * 1000);
        if (aq() && (viewGroup2 = this.D) != null && (viewFindViewById = viewGroup2.findViewById(R.id.inter_ad_info_card_right_bottom)) != null) {
            ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.inter_star);
            View viewFindViewById4 = viewFindViewById.findViewById(R.id.bigo_ad_info_card_background);
            if (imageView != null && viewFindViewById4 != 0) {
                f fVar2 = this.j;
                String creativeId = fVar2 != null ? fVar2.f46240c : "";
                if (this.C != null && sg.bigo.ads.common.utils.q.a((CharSequence) creativeId)) {
                    creativeId = this.C.getCreativeId();
                }
                float fA = (sg.bigo.ads.ad.b.f.a(creativeId, 4) * 0.5f) + 3.5f;
                d dVar = new d();
                TextView textView3 = (TextView) viewFindViewById.findViewById(R.id.inter_title);
                TextView textView4 = (TextView) viewFindViewById.findViewById(R.id.inter_description);
                if (textView3 != null) {
                    dVar.b(textView3);
                }
                if (textView4 != null) {
                    dVar.b(textView4);
                }
                sg.bigo.ads.api.a.m mVar3 = this.f45741c;
                int iA6 = mVar3 != null ? mVar3.a("video_play_page.card_background_colour") : -1;
                if (iA6 == 1) {
                    bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half);
                    viewFindViewById4.setBackgroundColor(-1);
                    dVar.a(-1);
                } else {
                    if (iA6 == 2) {
                        viewFindViewById4.setBackgroundColor(-16777216);
                        dVar.a(-16777216);
                    } else {
                        sg.bigo.ads.ad.interstitial.e.b bVar = new sg.bigo.ads.ad.interstitial.e.b(sg.bigo.ads.common.utils.e.a(imageView.getContext(), 12), 0.0f, new sg.bigo.ads.ad.interstitial.e.a.b() { // from class: sg.bigo.ads.ad.interstitial.a.15
                        }.c());
                        Drawable drawableA = bVar.a();
                        if (drawableA != null) {
                            viewFindViewById4.setBackground(drawableA);
                        } else if (viewFindViewById4 instanceof sg.bigo.ads.common.view.a.c) {
                            ((sg.bigo.ads.common.view.a.c) viewFindViewById4).setBlurStyle(bVar);
                        }
                    }
                    bitmapA = sg.bigo.ads.common.utils.d.a(this.D.getContext(), fA, R.drawable.bigo_ad_ic_star_white, R.drawable.bigo_ad_ic_star_normal, R.drawable.bigo_ad_ic_star_half_white);
                }
                if (bitmapA != null) {
                    imageView.setImageBitmap(bitmapA);
                    imageView.setVisibility(0);
                }
            }
            viewFindViewById.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.16
                @Override // java.lang.Runnable
                public final void run() {
                    AnimationSet animationSet = new AnimationSet(true);
                    Interpolator interpolatorA = sg.bigo.ads.common.utils.b.a(2);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setInterpolator(interpolatorA);
                    animationSet.addAnimation(alphaAnimation);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 1.0f, 1, 1.0f);
                    scaleAnimation.setDuration(300L);
                    alphaAnimation.setInterpolator(interpolatorA);
                    animationSet.addAnimation(scaleAnimation);
                    viewFindViewById.startAnimation(animationSet);
                }
            });
        }
        if (M() && (viewGroup = this.D) != null) {
            TextView textView5 = (TextView) viewGroup.findViewById(R.id.inter_title);
            TextView textView6 = (TextView) this.D.findViewById(R.id.inter_description);
            sg.bigo.ads.api.a.m mVar4 = this.f45741c;
            int i3 = (mVar4 != null ? mVar4.a("video_play_page.background_colour") : -1) == 1 ? -16777216 : -1;
            if (textView5 != null) {
                textView5.setTextColor(i3);
            }
            if (textView6 != null) {
                textView6.setTextColor(i3);
            }
        }
        Activity activity = this.f47011I;
        T t = this.y;
        this.r = new q(activity, ((t) t).f46647z, ((t) t).f(), this.f45741c, aq(), this.j, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.11
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.f46325A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(0.0f);
                }
                a.this.f(10);
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.12
            @Override // java.lang.Runnable
            public final void run() {
                AdCountDownButton adCountDownButton = a.this.f46325A;
                if (adCountDownButton != null) {
                    adCountDownButton.setAlpha(1.0f);
                }
                a aVar = a.this;
                aVar.f(aVar.d());
                a.this.ao();
                if (a.this.c() == 0) {
                    a.this.h();
                }
            }
        }, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.13
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(false);
            }
        });
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.14
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = a.this.r;
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Active mid page.");
                sg.bigo.ads.api.a.m mVar5 = qVar.d;
                Context context = qVar.f46531a;
                if (mVar5 == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty style config.");
                    return;
                }
                if (context == null) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to empty context.");
                    return;
                }
                int iA7 = mVar5.a("mid_page.show_time");
                if (iA7 != -1 && iA7 != 0 && iA7 != 3 && iA7 != 5 && iA7 != 10) {
                    iA7 = 0;
                }
                qVar.f46524E = iA7;
                if (iA7 == 0) {
                    qVar.f46536i = false;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Inactive mid page due to show_time in config.");
                    return;
                }
                q.d dVar2 = qVar.f46522A;
                dVar2.f46626b = mVar5.a("mid_page.pop_layout");
                dVar2.f46625a = mVar5.a("mid_page.pop_method");
                dVar2.f46627c = mVar5.a("mid_page.cta_color");
                q.a aVar = qVar.f46542z;
                aVar.f46613p = qVar;
                aVar.f46608e = mVar5.c("mid_page.is_cta_show_animation");
                aVar.f46605a = mVar5.a("mid_page.click_type");
                aVar.f46606b = mVar5.c("mid_page.ad_component_clickable_switch");
                aVar.f46607c = mVar5.c("mid_page.media_view_clickable_switch");
                aVar.d = mVar5.c("mid_page.other_space_clickable_switch");
                int iA8 = mVar5.a("mid_page.below_area_dp");
                if (iA8 > 0) {
                    aVar.f = sg.bigo.ads.common.utils.e.a(context, iA8);
                }
                aVar.g = mVar5.a("mid_page.below_area_clickable") == 1;
                int iA9 = mVar5.a("mid_page.up_area_dp");
                if (iA9 > 0) {
                    aVar.f46609h = sg.bigo.ads.common.utils.e.a(context, iA9);
                }
                aVar.f46610i = mVar5.a("mid_page.up_area_clickable") == 1;
                aVar.j = sg.bigo.ads.common.utils.e.c(context);
                aVar.f46612n = new View(context);
                aVar.o = new View(context);
                Context context2 = qVar.f46531a;
                sg.bigo.ads.ad.b.c cVar = qVar.f46532b;
                sg.bigo.ads.api.core.c cVar2 = qVar.f46533c;
                if (qVar.a(context2, cVar, cVar2, qVar.d)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Start render mid page.");
                    int i4 = qVar.f46522A.f46625a;
                    ArrayList arrayList = new ArrayList();
                    if (qVar.o) {
                        arrayList.add(2);
                    } else {
                        if (i4 == 1) {
                            arrayList.add(1);
                        }
                        if (i4 == 2) {
                            arrayList.add(1);
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i4 == 3) {
                            arrayList.add(2);
                        }
                        if (i4 == 4) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i4 == 5) {
                            arrayList.add(2);
                            arrayList.add(3);
                            arrayList.add(4);
                        }
                        if (i4 == 6) {
                            arrayList.add(3);
                        }
                        if (i4 == 7) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(1);
                            arrayList.add(4);
                        }
                        if (i4 == 8) {
                            arrayList.add(3);
                            arrayList.add(2);
                            arrayList.add(4);
                        }
                        if (i4 == 9) {
                        }
                        qVar.t = arrayList;
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.3

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ Context f46585a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ sg.bigo.ads.ad.b.c f46586b;

                            /* JADX INFO: renamed from: c */
                            final /* synthetic */ sg.bigo.ads.api.core.c f46587c;

                            public AnonymousClass3() {
                                context = context2;
                                cVar = cVar;
                                cVar = cVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                q.a(q.this, context, cVar, cVar);
                            }
                        });
                    }
                    arrayList.add(4);
                    qVar.t = arrayList;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.3

                        /* JADX INFO: renamed from: a */
                        final /* synthetic */ Context f46585a;

                        /* JADX INFO: renamed from: b */
                        final /* synthetic */ sg.bigo.ads.ad.b.c f46586b;

                        /* JADX INFO: renamed from: c */
                        final /* synthetic */ sg.bigo.ads.api.core.c f46587c;

                        public AnonymousClass3() {
                            context = context2;
                            cVar = cVar;
                            cVar = cVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            q.a(q.this, context, cVar, cVar);
                        }
                    });
                }
                q.AnonymousClass1 anonymousClass1 = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.q.1
                    public AnonymousClass1() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (!q.a(q.this)) {
                            Runnable runnable = q.this.x;
                            if (runnable != null) {
                                runnable.run();
                                q.this.x = null;
                            }
                            q.this.g();
                        }
                        q.b(q.this);
                    }
                };
                int i5 = qVar.f46524E;
                if (i5 > 0) {
                    qVar.f46540u = ((long) i5) * 1000;
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", android.support.v4.media.a.i(qVar.f46524E, "s.", new StringBuilder("Mid page will be shown after ")));
                    qVar.v = anonymousClass1;
                    qVar.a(qVar.f46540u);
                    qVar.a();
                    return;
                }
                if (i5 != -1) {
                    sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page can not be shown due to invalid show delay.");
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "InterstitialMidPageRenderer", "Mid page will be shown after video completion.");
                qVar.f46541w = anonymousClass1;
                qVar.a();
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean i() {
        return ad();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void j() {
        l lVar;
        sg.bigo.ads.core.a.a aVarF;
        int i2;
        l lVar2;
        sg.bigo.ads.core.a.a aVarF2;
        int i3;
        super.j();
        int iC = c();
        q qVar = this.r;
        if (qVar != null) {
            qVar.d();
        }
        p<t> pVar = this.H;
        if (pVar != null && !pVar.f46461l) {
            p<t>.e eVar = pVar.j;
            if (eVar != null) {
                eVar.f46515a.d();
            }
            p<t>.c cVar = pVar.f46455a;
            if (cVar != null) {
                cVar.f46510b = SystemClock.elapsedRealtime();
            }
            l lVar3 = pVar.f46463p;
            if (lVar3 != null) {
                sg.bigo.ads.api.core.c cVarF = pVar.f46457c.f();
                p.a aVar = pVar.m;
                int i4 = aVar.f46505a;
                int i5 = aVar.f46506b;
                p.a aVar2 = pVar.f46462n;
                lVar3.a(cVarF, lVar3.f46349a, i4, i5, aVar2.f46505a, aVar2.f46506b);
            }
        }
        if (iC == 0) {
            l lVar4 = this.L;
            lVar4.a(((t) this.y).f(), lVar4.f46350b, -1, -1, -1, -1);
        } else {
            if (iC == 10) {
                lVar2 = this.L;
                aVarF2 = ((t) this.y).f();
                i3 = lVar2.f46351c;
            } else {
                if (iC == 1) {
                    lVar = this.L;
                    aVarF = ((t) this.y).f();
                    i2 = lVar.d;
                } else if (iC == 2 || iC == 8 || iC == 9) {
                    lVar = this.L;
                    aVarF = ((t) this.y).f();
                    i2 = lVar.f46352e;
                } else if (iC == 5) {
                    lVar2 = this.L;
                    aVarF2 = ((t) this.y).f();
                    i3 = lVar2.f;
                } else if (iC == 4) {
                    lVar2 = this.L;
                    aVarF2 = ((t) this.y).f();
                    i3 = lVar2.g;
                } else if (iC == 7) {
                    lVar2 = this.L;
                    aVarF2 = ((t) this.y).f();
                    i3 = lVar2.f46353h;
                }
                lVar.a(aVarF, i2, -1, -1, -1, -1);
            }
            lVar2.a(aVarF2, i3, -1, -1, -1, -1);
        }
        sg.bigo.ads.ad.interstitial.e.c cVar2 = this.s;
        if (cVar2 != null) {
            cVar2.f46199n = true;
            sg.bigo.ads.ad.interstitial.e.c.a(cVar2.k, cVar2.f46197i);
            sg.bigo.ads.ad.interstitial.e.c.a(cVar2.j, cVar2.f46196h);
            sg.bigo.ads.common.utils.n nVar = cVar2.f46198l;
            if (nVar != null) {
                nVar.d();
            }
            sg.bigo.ads.common.utils.n nVar2 = cVar2.m;
            if (nVar2 != null) {
                nVar2.d();
            }
        }
        sg.bigo.ads.ad.interstitial.g.a aVar3 = this.t;
        if (aVar3 != null) {
            aVar3.c();
        }
    }

    public final boolean l() {
        if (c() != 0 || !this.f45736P) {
            return false;
        }
        Object objZ = Z();
        if (objZ instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objZ).K();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void m() {
        super.m();
        this.f45745l = ((t) this.y).f().i();
        sg.bigo.ads.api.a.m mVarE = ((t) this.y).f().e();
        this.f45741c = mVarE;
        if (mVarE != null) {
            this.d = true;
        }
        this.f45740b = ((t) this.y).f().d().q();
        this.f45743h = b();
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        if (mVar == null || !this.d) {
            sg.bigo.ads.api.a.m mVar2 = this.f45740b;
            if (mVar2 != null) {
                a(mVar2);
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.g.a aVarA = sg.bigo.ads.ad.interstitial.g.a.a(this.f47011I, this.C, mVar, aq());
        this.t = aVarA;
        this.s = new sg.bigo.ads.ad.interstitial.e.c((t) this.y, this.f45741c, aVarA);
        a(this.f45741c);
        this.C.f45592u = new WeakReference<>(this);
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int n() {
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        if (mVar == null) {
            return 0;
        }
        if (this.d) {
            return mVar.a("video_play_page.ad_component_layout");
        }
        return 1;
    }

    public final h.a o() {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        boolean z4 = false;
        if (mVar != null) {
            int iA = this.d ? mVar.a("video_play_page.below_area_dp") : 0;
            boolean z5 = this.d && this.f45741c.a("video_play_page.below_area_clickable") == 1;
            int iA2 = this.d ? this.f45741c.a("video_play_page.up_area_dp") : 0;
            if (this.d && this.f45741c.a("video_play_page.up_area_clickable") == 1) {
                z4 = true;
            }
            int iA3 = this.f45741c.a("video_play_page.click_type");
            int i5 = iA2;
            boolean z6 = z4;
            int i6 = iA;
            a(this.D, i6, z5, i5, z6, 8, iA3);
            i2 = i6;
            z2 = z5;
            i3 = i5;
            z3 = z6;
            i4 = iA3;
        } else {
            i2 = 0;
            z2 = false;
            i3 = 0;
            z3 = false;
            i4 = 0;
        }
        return new h.a(i2, z2, i3, z3, i4);
    }

    public void p() {
        int i2;
        sg.bigo.ads.api.a.m mVar = this.f45741c;
        if (mVar == null || !this.d) {
            return;
        }
        int iA = mVar.a("video_play_page.close_button_style");
        if (iA == 2) {
            i2 = R.drawable.bigo_ad_ic_close2;
        } else if (iA == 3) {
            i2 = R.drawable.bigo_ad_ic_close3;
        } else if (iA != 4) {
            i2 = iA != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5;
        } else {
            i2 = R.drawable.bigo_ad_ic_close4;
        }
        j(i2);
    }

    public void q() {
        int iB;
        if (((t) this.y).f() == null || !((t) this.y).y()) {
            return;
        }
        final sg.bigo.ads.core.a.a aVarF = ((t) this.y).f();
        this.f45747p.set(!aVarF.aZ());
        if (this.f45747p.get() && aVarF.bh() == null && (iB = x.b(this.f45743h.f46719n)) > 0) {
            sg.bigo.ads.common.utils.n nVar = new sg.bigo.ads.common.utils.n(((long) iB) * 1000) { // from class: sg.bigo.ads.ad.interstitial.a.2
                @Override // sg.bigo.ads.common.utils.n
                public final void a() {
                    aVarF.bc();
                    a aVar = a.this;
                    aVar.a(aVar.x, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.s();
                        }
                    });
                }

                @Override // sg.bigo.ads.common.utils.n
                public final void a(long j) {
                }
            };
            this.x = nVar;
            nVar.c();
        }
    }

    public void r() {
        MediaView mediaView;
        YandexWarningTextView yandexWarningTextView;
        YandexWarningTextView yandexWarningTextView2;
        ViewGroup viewGroup = this.D;
        sg.bigo.ads.ad.b.c cVar = this.C;
        if (viewGroup == null || cVar == null) {
            return;
        }
        sg.bigo.ads.api.c.b.a(aq());
        if (t() && ((t) this.y).f().w() == 2) {
            sg.bigo.ads.api.c.b.a();
        }
        ViewGroup viewGroup2 = this.D;
        if (viewGroup2 != null && (mediaView = (MediaView) viewGroup2.findViewById(R.id.inter_media)) != null && M()) {
            mediaView.setImageBlurBorder(false);
            ViewGroup viewGroup3 = this.D;
            sg.bigo.ads.ad.b.c cVar2 = this.C;
            if (viewGroup3 != null && (yandexWarningTextView = (YandexWarningTextView) viewGroup3.findViewById(R.id.inter_warning)) != null) {
                if (cVar2 == null || ((sg.bigo.ads.core.a.a) cVar2.f()).B() == null || ((sg.bigo.ads.core.a.a) cVar2.f()).B().f() < 0) {
                    yandexWarningTextView2 = yandexWarningTextView;
                } else {
                    int iF = ((sg.bigo.ads.core.a.a) cVar2.f()).B().f();
                    View viewFindViewById = viewGroup3.findViewById(R.id.inter_ad_info_exclude_warning);
                    MediaView mediaView2 = (MediaView) viewGroup3.findViewById(R.id.inter_media);
                    RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) viewGroup3.findViewById(R.id.inter_media_layout);
                    float f = iF * 0.01f;
                    if (f > 0.15f) {
                        f = 0.15f;
                    }
                    if (viewFindViewById != null) {
                        yandexWarningTextView.setIsHorizontal(false);
                        sg.bigo.ads.common.utils.u.a(viewFindViewById, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.s.1

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ View f46634a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ YandexWarningTextView f46635b;

                            /* JADX INFO: renamed from: c */
                            final /* synthetic */ RoundedFrameLayout f46636c;
                            final /* synthetic */ float d;

                            /* JADX INFO: renamed from: e */
                            final /* synthetic */ ViewGroup f46637e;
                            final /* synthetic */ sg.bigo.ads.ad.b.c f;
                            final /* synthetic */ MediaView g;

                            /* JADX INFO: renamed from: h */
                            final /* synthetic */ int f46638h;

                            public AnonymousClass1() {
                                view = viewFindViewById;
                                yandexWarningTextView = yandexWarningTextView;
                                roundedFrameLayout = roundedFrameLayout;
                                f = f;
                                viewGroup = viewGroup3;
                                cVar = cVar2;
                                mediaView = mediaView2;
                                i = iF;
                            }

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                int measuredHeight = view.getMeasuredHeight();
                                int iC = sg.bigo.ads.common.utils.e.c(view.getContext());
                                if (measuredHeight <= 0) {
                                    measuredHeight = sg.bigo.ads.common.utils.e.a(view.getContext(), 130);
                                }
                                int paddingTop = yandexWarningTextView.getPaddingTop();
                                int paddingBottom = yandexWarningTextView.getPaddingBottom();
                                int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 16);
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yandexWarningTextView.getLayoutParams();
                                int i2 = marginLayoutParams.topMargin;
                                if (iC < 2000) {
                                    iA *= 2;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                int i3 = marginLayoutParams2.topMargin;
                                int i4 = marginLayoutParams2.bottomMargin;
                                int i5 = marginLayoutParams2.leftMargin;
                                int i6 = marginLayoutParams2.rightMargin;
                                int iRound = Math.round(f * iC) + paddingBottom + paddingTop;
                                int i7 = (((((iC - measuredHeight) - iRound) - i2) - iA) - i3) - i4;
                                if (iC <= 1000) {
                                    i7 = iC / 2;
                                    TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
                                    if (textView != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
                                        marginLayoutParams3.topMargin = 0;
                                        textView.setLayoutParams(marginLayoutParams3);
                                    }
                                    ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_btn_class);
                                    if (viewGroup4 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                                        marginLayoutParams4.topMargin = 0;
                                        viewGroup4.setLayoutParams(marginLayoutParams4);
                                    }
                                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_title);
                                    if (textView2 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
                                        marginLayoutParams5.topMargin = 0;
                                        textView2.setLayoutParams(marginLayoutParams5);
                                    }
                                }
                                int i8 = (view.getContext().getResources().getDisplayMetrics().widthPixels - i5) - i6;
                                sg.bigo.ads.common.p pVarA = s.a(cVar);
                                sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarA.f47362b, pVarA.f47363c, i8, i7);
                                RoundedFrameLayout roundedFrameLayout2 = roundedFrameLayout;
                                roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout2.getContext(), 8));
                                marginLayoutParams2.setMargins(i5, i3, i6, i4);
                                marginLayoutParams2.height = pVarA2.f47363c;
                                marginLayoutParams2.width = pVarA2.f47362b;
                                sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                roundedFrameLayout.setLayoutParams(marginLayoutParams2);
                                if (i == 0) {
                                    yandexWarningTextView.setVisibility(8);
                                    return;
                                }
                                marginLayoutParams.height = iRound;
                                marginLayoutParams.bottomMargin = iA;
                                yandexWarningTextView.setLayoutParams(marginLayoutParams);
                            }
                        });
                    } else {
                        float f2 = f;
                        yandexWarningTextView2 = yandexWarningTextView;
                        if (iF != 0) {
                            yandexWarningTextView2.setIsHorizontal(true);
                            yandexWarningTextView2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.s.2

                                /* JADX INFO: renamed from: b */
                                final /* synthetic */ float f46640b;

                                /* JADX INFO: renamed from: c */
                                final /* synthetic */ sg.bigo.ads.ad.b.c f46641c;
                                final /* synthetic */ RoundedFrameLayout d;

                                /* JADX INFO: renamed from: e */
                                final /* synthetic */ MediaView f46642e;

                                public AnonymousClass2() {
                                    f = f2;
                                    cVar = cVar2;
                                    roundedFrameLayout = roundedFrameLayout;
                                    mediaView = mediaView2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int iC = sg.bigo.ads.common.utils.e.c(yandexWarningTextView.getContext());
                                    int i2 = yandexWarningTextView.getContext().getResources().getDisplayMetrics().widthPixels;
                                    int iRound = Math.round(f * iC) + yandexWarningTextView.getPaddingBottom() + yandexWarningTextView.getPaddingTop();
                                    ViewGroup.LayoutParams layoutParams = yandexWarningTextView.getLayoutParams();
                                    int iA = sg.bigo.ads.common.utils.e.a(yandexWarningTextView.getContext(), 20);
                                    int i3 = (i2 / 2) - (iA * 3);
                                    sg.bigo.ads.common.p pVarA = s.a(cVar);
                                    RoundedFrameLayout roundedFrameLayout2 = roundedFrameLayout;
                                    roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(roundedFrameLayout2.getContext(), 8));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) roundedFrameLayout.getLayoutParams();
                                    marginLayoutParams.setMargins(iA, iA, iA, iA);
                                    if (pVarA.getHeight() <= pVarA.getWidth()) {
                                        marginLayoutParams.width = i3;
                                        marginLayoutParams.height = (int) (((pVarA.getHeight() * 1.0f) * i3) / pVarA.getWidth());
                                        sg.bigo.ads.common.utils.u.c(mediaView, -1, -1);
                                    }
                                    roundedFrameLayout.setLayoutParams(marginLayoutParams);
                                    layoutParams.height = iRound;
                                    yandexWarningTextView.setLayoutParams(layoutParams);
                                }
                            });
                        }
                    }
                }
                yandexWarningTextView2.setVisibility(8);
            }
        }
        Z().a(viewGroup, viewGroup, Y(), S() ? 8 : 1, this.f45743h.f46717i, this.f46325A);
    }

    public void s() {
    }

    public boolean t() {
        if (!this.d) {
            return false;
        }
        switch (n()) {
            case 6:
                this.g = false;
                this.f = false;
                return !aq();
            case 7:
            case 8:
            case 9:
                this.g = false;
                this.f = false;
                return true;
            case 10:
                this.g = false;
                this.f = true;
                return true;
            case 11:
            case 12:
                this.g = true;
                this.f = false;
                return true;
            default:
                this.g = false;
                this.f = false;
                return false;
        }
    }

    public void u() {
        sg.bigo.ads.api.a.m mVar;
        if (this.d && (mVar = this.f45741c) != null) {
            long jA = ((long) mVar.a("video_play_page.guided_click_gesture_show_time")) * 1000;
            if (jA == 0) {
                return;
            }
            this.v = new AnonymousClass3(jA);
        }
    }

    public final void v() {
        View viewFindViewById;
        ViewGroup viewGroup = this.D;
        if (viewGroup == null || (viewFindViewById = viewGroup.findViewById(R.id.inter_slide_gesture_contain)) == null) {
            return;
        }
        AlphaAnimation alphaAnimationE = androidx.media3.extractor.text.ttml.a.e(1.0f, 0.0f, 500L);
        alphaAnimationE.setAnimationListener(new sg.bigo.ads.common.utils.b.c() { // from class: sg.bigo.ads.ad.interstitial.c.11

            /* JADX INFO: renamed from: a */
            final /* synthetic */ View f45847a;

            public AnonymousClass11() {
                view = viewFindViewById;
            }

            @Override // sg.bigo.ads.common.utils.b.c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                sg.bigo.ads.common.utils.u.b(view);
            }
        });
        viewFindViewById.startAnimation(alphaAnimationE);
        viewFindViewById.setVisibility(8);
    }

    public final void w() {
        View viewFindViewById = this.D.findViewById(R.id.inter_slide_gesture_contain);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setTag(16);
        viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.a.4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    a.this.f45738R = (int) motionEvent.getX();
                    a.this.S = (int) motionEvent.getY();
                } else if (action == 1 && a.a(a.this.f45738R, a.this.S, (int) motionEvent.getX(), (int) motionEvent.getY()) > 10.0d) {
                    a.this.v();
                    ((t) a.this.y).f46647z.a((int) motionEvent.getX(), (int) motionEvent.getY(), a.this.f45738R, a.this.S, 8, ((Integer) view.getTag()).intValue());
                }
                return true;
            }
        });
    }

    public void x() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null) {
            return;
        }
        sg.bigo.ads.common.e.a.a(adCountDownButton, this.O);
    }

    public void y() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.f46325A.setVisibility(0);
            c.b((View) this.f46325A);
        }
        if (c() == 0) {
            int i2 = this.f45743h.f46714c;
            int iB = (i2 >= 0 || ((t) this.y).f().x() == 4) ? i2 : 0;
            if (((t) this.y).y()) {
                sg.bigo.ads.core.a.a aVarF = ((t) this.y).f();
                if (this.f45747p.get() && aVarF.bh() == null) {
                    iB = x.b(this.f45743h.f46719n);
                }
            }
            this.f46325A.a(iB, (AdCountDownButton.b) null);
        }
    }

    public final void z() {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null || adCountDownButton.getVisibility() != 0) {
            return;
        }
        this.f46325A.clearAnimation();
        this.f46325A.setVisibility(4);
    }

    public static boolean i(int i2) {
        return (i2 == 7 || i2 == 8 || i2 == 0) ? false : true;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public void d(int i2) {
        this.f45736P = false;
        Runnable runnable = this.f45737Q;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.a(2, runnable);
            this.f45737Q = null;
        } else if (this.f46326B.get()) {
            h();
        }
    }

    public final void e(int i2) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
        if (aq()) {
            if (TextUtils.isEmpty(this.f45745l) || textView2 == null || textView2.getContext() == null) {
                return;
            }
            String strA = sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]);
            if (M()) {
                StringBuilder sbX = android.support.v4.media.a.x(strA, " · ");
                sbX.append(this.f45745l);
                textView2.setText(sbX.toString());
                return;
            } else {
                textView2.setText(this.f45745l + " · " + strA);
                return;
            }
        }
        if (textView == null || textView2 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f45745l)) {
            textView.setVisibility(8);
            return;
        }
        if (!M()) {
            if (i2 != R.layout.bigo_ad_activity_interstitial_native_top) {
                textView.bringToFront();
            }
            textView.setText(this.f45745l);
            textView.setPadding(sg.bigo.ads.common.utils.e.a(this.D.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
            return;
        }
        textView.setVisibility(8);
        textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + this.f45745l);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        FrameLayout.LayoutParams layoutParams;
        int i2;
        String str;
        T t = this.y;
        byte b2 = 0;
        if (t == 0) {
            return false;
        }
        if (((t) t).f46647z instanceof sg.bigo.ads.ad.b.b) {
            Context context = this.f47011I;
            if (context == null) {
                context = ((t) t).f46647z.f45584b.f47035e;
            }
            if (context != null) {
                final p<t> pVar = new p<>((sg.bigo.ads.ad.b.b) ((t) t).f46647z, this, new p.b() { // from class: sg.bigo.ads.ad.interstitial.a.9
                    @Override // sg.bigo.ads.ad.interstitial.p.b
                    public final void a(sg.bigo.ads.ad.b.d dVar) {
                        if (dVar == null) {
                            a.this.ap();
                            return;
                        }
                        t tVar = (t) a.this.y;
                        t.b bVar = tVar.C;
                        if (bVar != null) {
                            tVar.f46647z = dVar;
                            Map<NativeAd, Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a>> map = bVar.f46654a;
                            Pair<sg.bigo.ads.ad.interstitial.a.b, sg.bigo.ads.ad.interstitial.a.a> pair = map == null ? null : map.get(dVar);
                            if (pair != null) {
                                tVar.f46643A = (sg.bigo.ads.ad.interstitial.a.b) pair.first;
                                tVar.f46644B = (sg.bigo.ads.ad.interstitial.a.a) pair.second;
                            }
                        }
                        a aVar = a.this;
                        aVar.C = dVar;
                        aVar.Q();
                    }
                });
                this.H = pVar;
                pVar.f46463p = this.L;
                ViewGroup viewGroup = (ViewGroup) pVar.f46456b.o(R.id.inter_container);
                if (viewGroup != null) {
                    final sg.bigo.ads.api.a.m mVar = pVar.d;
                    if (mVar != null) {
                        List<sg.bigo.ads.ad.b.d> listX = pVar.f46457c.x();
                        if (listX == null || listX.size() == 0) {
                            sg.bigo.ads.common.t.a.a(0, "InterstitialDoubleVideoRenderer", "Failed to start with null ready video list.");
                            pVar.f46458e.a(null);
                            p.c.a("Error native videos");
                        } else {
                            sg.bigo.ads.ad.b.b.a aVar = pVar.f46457c.f45436z;
                            String[] strArr = aVar != null ? aVar.f45442e : new String[]{"", ""};
                            if (listX.size() == 1) {
                                sg.bigo.ads.ad.b.d dVar = listX.get(0);
                                sg.bigo.ads.ad.b.b bVar = pVar.f46457c;
                                if (dVar == bVar.x) {
                                    i2 = 1;
                                } else {
                                    i2 = dVar == bVar.y ? 2 : 0;
                                }
                                pVar.a(false, null, dVar, i2, false, true);
                            } else {
                                boolean z2 = pVar.d.a("multi_ads.page_layout") == 2;
                                final Context context2 = pVar.f46456b.y.f45584b.f47035e;
                                FrameLayout frameLayout = new FrameLayout(context2);
                                pVar.f = frameLayout;
                                viewGroup.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(context2);
                                sg.bigo.ads.ad.b.d dVar2 = listX.get(0);
                                sg.bigo.ads.ad.b.d dVar3 = listX.get(1);
                                Integer numF = dVar2.F();
                                Integer numF2 = dVar3.F();
                                if (numF == null) {
                                    numF = Integer.valueOf(sg.bigo.ads.common.utils.q.b("#01B5FF", -16776961));
                                }
                                if (numF2 == null) {
                                    numF2 = Integer.valueOf(sg.bigo.ads.common.utils.q.b("#FF0054", -65536));
                                }
                                p.d dVar4 = new p.d(b2);
                                pVar.k = dVar4;
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setGradientType(0);
                                gradientDrawable.setColors(new int[]{numF.intValue(), numF2.intValue()});
                                gradientDrawable.setOrientation(GradientDrawable.Orientation.BR_TL);
                                gradientDrawable.setGradientCenter(0.0f, 0.0f);
                                dVar4.f46514c = numF;
                                dVar4.d = numF2;
                                dVar4.f46513b = gradientDrawable;
                                view.setBackground(gradientDrawable);
                                pVar.q = view;
                                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                                LinearLayout linearLayout = new LinearLayout(context2);
                                linearLayout.setOrientation(1);
                                frameLayout.addView(linearLayout);
                                FrameLayout frameLayout2 = new FrameLayout(context2);
                                linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context2, z2 ? 32 : 50)));
                                if (!z2) {
                                    RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(context2);
                                    roundedFrameLayout.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 16));
                                    roundedFrameLayout.setStrokeWidth(sg.bigo.ads.common.utils.e.a(context2, 1) * 1.5f);
                                    roundedFrameLayout.setStrokeColor(sg.bigo.ads.common.utils.q.b("#7FFFFFFF", -1));
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, sg.bigo.ads.common.utils.e.a(context2, 25), 21);
                                    layoutParams2.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
                                    frameLayout2.addView(roundedFrameLayout, layoutParams2);
                                    FrameLayout frameLayout3 = new FrameLayout(context2);
                                    frameLayout3.setBackgroundColor(sg.bigo.ads.common.utils.q.b("#1C000000", -7829368));
                                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -1);
                                    int iA = sg.bigo.ads.common.utils.e.a(context2, 2);
                                    layoutParams3.setMargins(iA, iA, iA, iA);
                                    roundedFrameLayout.addView(frameLayout3, layoutParams3);
                                    TextView textView = new TextView(context2);
                                    textView.setTextColor(-1);
                                    textView.setTextSize(14.0f);
                                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 17);
                                    layoutParams4.leftMargin = sg.bigo.ads.common.utils.e.a(context2, 12);
                                    layoutParams4.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 12);
                                    frameLayout3.addView(textView, layoutParams4);
                                    pVar.g = textView;
                                }
                                final RoundedFrameLayout roundedFrameLayout2 = new RoundedFrameLayout(context2);
                                roundedFrameLayout2.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 6));
                                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
                                layoutParams5.leftMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
                                layoutParams5.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
                                linearLayout.addView(roundedFrameLayout2, layoutParams5);
                                pVar.f46459h = roundedFrameLayout2;
                                pVar.a(context2, roundedFrameLayout2, listX.get(0), strArr[0], pVar.m);
                                FrameLayout frameLayout4 = new FrameLayout(context2);
                                linearLayout.addView(frameLayout4, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context2, z2 ? 80 : 64)));
                                TextView textView2 = new TextView(context2);
                                textView2.setTextColor(-1);
                                textView2.setTextSize(20.0f);
                                textView2.setTypeface(Typeface.defaultFromStyle(1));
                                textView2.setSingleLine(true);
                                textView2.setText(R.string.bigo_ad_double_video_choose_video);
                                if (z2) {
                                    layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
                                    layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(context2, 16);
                                    frameLayout4.addView(textView2, layoutParams);
                                    TextView textView3 = new TextView(context2);
                                    textView3.setTextColor(sg.bigo.ads.common.utils.q.b("#C8FFFFFF", -1));
                                    textView3.setTextSize(13.0f);
                                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 81);
                                    layoutParams6.bottomMargin = sg.bigo.ads.common.utils.e.a(context2, 18);
                                    frameLayout4.addView(textView3, layoutParams6);
                                    pVar.g = textView3;
                                } else {
                                    layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
                                    frameLayout4.addView(textView2, layoutParams);
                                }
                                final RoundedFrameLayout roundedFrameLayout3 = new RoundedFrameLayout(context2);
                                roundedFrameLayout3.setCornerRadius(sg.bigo.ads.common.utils.e.a(context2, 6));
                                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -1, 1.0f);
                                layoutParams7.leftMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
                                layoutParams7.rightMargin = sg.bigo.ads.common.utils.e.a(context2, 10);
                                linearLayout.addView(roundedFrameLayout3, layoutParams7);
                                pVar.f46460i = roundedFrameLayout3;
                                pVar.a(context2, roundedFrameLayout3, listX.get(1), strArr[1], pVar.f46462n);
                                linearLayout.addView(new FrameLayout(context2), new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context2, 32)));
                                roundedFrameLayout2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        sg.bigo.ads.ad.interstitial.c.a(roundedFrameLayout2, -sg.bigo.ads.common.utils.e.a(context2, 40));
                                    }
                                });
                                roundedFrameLayout3.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        sg.bigo.ads.ad.interstitial.c.a(roundedFrameLayout3, sg.bigo.ads.common.utils.e.a(context2, 40));
                                    }
                                });
                                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.p.5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int iA2 = mVar.a("multi_ads.auto_play_time");
                                        int i3 = 3;
                                        if (iA2 != 1) {
                                            if (iA2 == 2) {
                                                i3 = 5;
                                            } else {
                                                i3 = iA2 == 3 ? 10 : 15;
                                            }
                                        }
                                        p pVar2 = p.this;
                                        pVar2.j = new e(i3);
                                        p.this.j.f46515a.c();
                                    }
                                });
                                p<t>.c cVar = pVar.f46455a;
                                sg.bigo.ads.ad.b.d dVar5 = pVar.f46457c.x;
                                cVar.f46509a = SystemClock.elapsedRealtime();
                                sg.bigo.ads.core.a.a aVar2 = dVar5 == null ? null : (sg.bigo.ads.core.a.a) dVar5.f();
                                p pVar2 = p.this;
                                p.a aVar3 = pVar2.m;
                                int i3 = aVar3.f46505a;
                                int i4 = aVar3.f46506b;
                                p.a aVar4 = pVar2.f46462n;
                                sg.bigo.ads.core.d.b.a(aVar2, true, 1, 0, false, -1L, i3, i4, -1L, aVar4.f46505a, aVar4.f46506b, -1L);
                                l lVar = pVar.f46463p;
                                if (lVar != null) {
                                    lVar.a(lVar.f46349a);
                                }
                            }
                        }
                        return true;
                    }
                    sg.bigo.ads.common.t.a.a(0, "InterstitialDoubleVideoRenderer", "Failed to start with null style config.");
                    str = "Error style config";
                    return true;
                }
                sg.bigo.ads.common.t.a.a(0, "InterstitialDoubleVideoRenderer", "Failed to start with null container.");
                str = "Error container";
                p.c.a(str);
                pVar.f46458e.a(null);
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean g() {
        return ad();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void h() {
        l lVar;
        sg.bigo.ads.core.a.a aVarF;
        int i2;
        sg.bigo.ads.ad.interstitial.e.c cVar;
        sg.bigo.ads.ad.interstitial.g.a aVar;
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2;
        super.h();
        int iC = c();
        q qVar = this.r;
        if (qVar != null) {
            qVar.c();
        }
        p<t> pVar = this.H;
        if (pVar != null && !pVar.f46461l) {
            p<t>.e eVar = pVar.j;
            if (eVar != null) {
                eVar.f46515a.c();
            }
            p<t>.c cVar2 = pVar.f46455a;
            if (cVar2 != null && cVar2.f46510b != 0) {
                cVar2.f46511c = (SystemClock.elapsedRealtime() - cVar2.f46510b) + cVar2.f46511c;
            }
            l lVar2 = pVar.f46463p;
            if (lVar2 != null) {
                lVar2.a(pVar.f46457c.f(), lVar2.f46349a);
            }
        }
        if (iC == 0) {
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.f46350b;
        } else if (iC == 10) {
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.f46351c;
        } else if (iC == 1) {
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.d;
        } else if (iC == 2 || iC == 8 || iC == 9) {
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.f46352e;
        } else if (iC == 5) {
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.f;
        } else {
            if (iC != 4) {
                if (iC == 7) {
                    lVar = this.L;
                    aVarF = ((t) this.y).f();
                    i2 = lVar.f46353h;
                }
                cVar = this.s;
                if (cVar != null) {
                    cVar.f46199n = false;
                    sg.bigo.ads.ad.interstitial.e.c.b(cVar.k, cVar.f46197i);
                    sg.bigo.ads.ad.interstitial.e.c.b(cVar.j, cVar.f46196h);
                    nVar = cVar.f46198l;
                    if (nVar != null && nVar.e()) {
                        cVar.f46198l.c();
                    }
                    nVar2 = cVar.m;
                    if (nVar2 != null && nVar2.e()) {
                        cVar.m.c();
                    }
                }
                aVar = this.t;
                if (aVar != null) {
                    aVar.b();
                }
            }
            lVar = this.L;
            aVarF = ((t) this.y).f();
            i2 = lVar.g;
        }
        lVar.a(aVarF, i2);
        cVar = this.s;
        if (cVar != null) {
            cVar.f46199n = false;
            sg.bigo.ads.ad.interstitial.e.c.b(cVar.k, cVar.f46197i);
            sg.bigo.ads.ad.interstitial.e.c.b(cVar.j, cVar.f46196h);
            nVar = cVar.f46198l;
            if (nVar != null) {
                cVar.f46198l.c();
            }
            nVar2 = cVar.m;
            if (nVar2 != null) {
                cVar.m.c();
            }
        }
        aVar = this.t;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean k() {
        Object objZ = Z();
        if (objZ instanceof sg.bigo.ads.ad.interstitial.f.c) {
            return ((sg.bigo.ads.ad.interstitial.f.c) objZ).J();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.c.a
    public LandingPageStyleConfig a(Context context, String str, int i2, boolean z2) {
        LandingPageStyleConfig landingPageStyleConfig;
        q qVar;
        sg.bigo.ads.api.a.m mVar = null;
        mVar = null;
        sg.bigo.ads.api.a.m mVar2 = null;
        LandingPageStyleConfig landingPageStyleConfigAe = null;
        mVar = null;
        if (z2) {
            int iC = c();
            if (iC == 0) {
                u uVarZ = Z();
                sg.bigo.ads.api.a.m mVar3 = this.f45741c;
                if (mVar3 == null || !this.d) {
                    mVar3 = null;
                }
                int iA = sg.bigo.ads.ad.interstitial.d.a.a(uVarZ, mVar3);
                if (i(iA)) {
                    return null;
                }
                return new LandingPageStyleConfig(h(iA), 0, iA, sg.bigo.ads.ad.interstitial.d.a.b(uVarZ, mVar3), 0, 0, 0.0f);
            }
            if (iC == 9) {
                sg.bigo.ads.api.a.m mVar4 = this.f45741c;
                if (mVar4 == null || !this.d) {
                    mVar4 = null;
                }
                int iA2 = sg.bigo.ads.ad.interstitial.g.a.a(mVar4);
                if (i(iA2)) {
                    return null;
                }
                return new LandingPageStyleConfig(h(iA2), 9, iA2, sg.bigo.ads.ad.interstitial.g.a.b(mVar4), 0, 0, 0.0f);
            }
            if (iC != 10) {
                return null;
            }
            sg.bigo.ads.api.a.m mVar5 = this.f45741c;
            if (mVar5 == null || !this.d) {
                mVar5 = null;
            }
            int iA3 = sg.bigo.ads.ad.interstitial.d.a.a(mVar5, "layer.webview_layout");
            if (i(iA3)) {
                return null;
            }
            return new LandingPageStyleConfig(h(iA3), 10, iA3, sg.bigo.ads.ad.interstitial.d.a.b(mVar5, "layer.webview_force_time"), 0, 0, 0.0f);
        }
        int iC2 = c();
        if (iC2 != 0) {
            if (iC2 == 9) {
                landingPageStyleConfigAe = ae();
            } else if (iC2 == 10) {
                sg.bigo.ads.api.a.m mVar6 = this.f45741c;
                if (mVar6 != null && this.d) {
                    mVar2 = mVar6;
                }
                int iA4 = sg.bigo.ads.ad.interstitial.d.a.a(mVar2, "layer.webview_layout");
                int iB = sg.bigo.ads.ad.interstitial.d.a.b(mVar2, "layer.webview_force_time");
                Class<? extends sg.bigo.ads.controller.landing.c> clsH = h(iA4);
                ViewGroup viewGroup = this.D;
                landingPageStyleConfig = new LandingPageStyleConfig(clsH, 10, iA4, iB, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, s.a(this.C, 0), 0.8f);
                if (!landingPageStyleConfig.b() && (qVar = this.r) != null) {
                    qVar.e();
                }
            }
            sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfigAe);
            return landingPageStyleConfigAe;
        }
        u uVarZ2 = Z();
        sg.bigo.ads.api.a.m mVar7 = this.f45741c;
        if (mVar7 != null && this.d) {
            mVar = mVar7;
        }
        int iA5 = sg.bigo.ads.ad.interstitial.d.a.a(uVarZ2, mVar);
        int iB2 = sg.bigo.ads.ad.interstitial.d.a.b(uVarZ2, mVar);
        float f = sg.bigo.ads.ad.interstitial.d.a.a(uVarZ2) ? 0.67f : 0.8f;
        Class<? extends sg.bigo.ads.controller.landing.c> clsH2 = h(iA5);
        ViewGroup viewGroup2 = this.D;
        landingPageStyleConfig = new LandingPageStyleConfig(clsH2, 0, iA5, iB2, viewGroup2 != null ? viewGroup2.getMeasuredHeight() : 0, s.a(this.C, 0), f);
        landingPageStyleConfigAe = landingPageStyleConfig;
        sg.bigo.ads.ad.interstitial.f.b.a(landingPageStyleConfigAe);
        return landingPageStyleConfigAe;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public final void b(int i2) {
        if (c() == 0 && i2 == 0 && k() && !l() && this.f45736P && this.f46326B.get()) {
            h();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public final void c(int i2) {
        if (c() == 0 && i2 == 0 && k() && !l() && this.f45736P && !this.f46326B.get()) {
            j();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void d(boolean z2) {
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null || (adCountDownButton.getVisibility() == 0 && this.f46325A.f45723c)) {
            e(z2);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public void a(int i2) {
        this.f45736P = true;
    }

    public void b(boolean z2) {
        sg.bigo.ads.common.utils.n nVar;
        sg.bigo.ads.common.utils.n nVar2 = this.v;
        if (nVar2 != null) {
            nVar2.b();
            this.v = null;
        }
        sg.bigo.ads.common.utils.n nVar3 = this.f45748u;
        if (nVar3 != null) {
            nVar3.b();
            this.f45748u = null;
        }
        if (z2 && (nVar = this.f45749w) != null) {
            nVar.b();
            this.f45749w = null;
        }
        sg.bigo.ads.common.utils.n nVar4 = this.x;
        if (nVar4 != null) {
            nVar4.b();
            this.x = null;
        }
    }

    public void c(boolean z2) {
        if (z2) {
            U();
        } else {
            V();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public final void a(int i2, int i3, int i4, int i5, int i6) {
        if (c() == c() && i6 == 0) {
            Object objZ = Z();
            if (objZ instanceof sg.bigo.ads.ad.interstitial.f.c) {
                sg.bigo.ads.ad.interstitial.f.c cVar = (sg.bigo.ads.ad.interstitial.f.c) objZ;
                cVar.a(i2, i3, i4, i5);
                if (cVar.K() && this.f45736P && !this.f46326B.get()) {
                    j();
                }
            }
        }
    }

    public final void b(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.M) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.M.remove(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.f45735N) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.f45735N.get(1);
                if (!sg.bigo.ads.common.utils.k.a(weakHashMap)) {
                    for (Object obj : objArr) {
                        if (obj != null) {
                            weakHashMap.remove(obj);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(long j) {
        if (j <= 0) {
            y();
            return;
        }
        z();
        this.k.removeCallbacks(this.T);
        this.k.postDelayed(this.T, j);
    }

    public final void a(View view) {
        sg.bigo.ads.ad.interstitial.e.c cVar = this.s;
        if (cVar == null || !(view instanceof ViewGroup)) {
            return;
        }
        sg.bigo.ads.ad.interstitial.e.c.a(cVar.j, cVar.f46196h);
        sg.bigo.ads.ad.interstitial.e.c cVar2 = this.s;
        ViewGroup viewGroup = (ViewGroup) view;
        cVar2.f46200p = false;
        sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.c) cVar2.f46192a.f(), 2);
        if (viewGroup == null) {
            cVar2.a(cVar2.f46194c, "layerView is null", 2);
            return;
        }
        if (sg.bigo.ads.ad.interstitial.e.a.b.b(cVar2.f46194c)) {
            cVar2.a(cVar2.f46194c, "config is invalid", 2);
            return;
        }
        if (!cVar2.a(2)) {
            cVar2.a(cVar2.f46194c, "icon request hasScene return false", 2);
            return;
        }
        cVar2.c();
        sg.bigo.ads.ad.interstitial.e.a aVar = cVar2.k;
        if (aVar != null) {
            aVar.f46172b.d();
            sg.bigo.ads.common.utils.u.b(cVar2.k.f46171a);
        }
        cVar2.k = null;
        sg.bigo.ads.ad.interstitial.e.c.AnonymousClass4 anonymousClass4 = new sg.bigo.ads.ad.interstitial.e.c.b(viewGroup, cVar2.f46194c) { // from class: sg.bigo.ads.ad.interstitial.e.c.4

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ViewGroup f46207a;

            /* JADX INFO: renamed from: e */
            private boolean f46209e = false;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(ViewGroup viewGroup2, sg.bigo.ads.ad.interstitial.e.a.b bVar) {
                super(viewGroup2, bVar, (byte) 0);
                viewGroup = viewGroup2;
                this.f46209e = false;
            }

            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            public final void a(sg.bigo.ads.ad.interstitial.e.a aVar2) {
                sg.bigo.ads.ad.interstitial.g.a aVar3;
                RealtimeBlurLinearLayout realtimeBlurLinearLayout;
                super.a(aVar2);
                if (!this.f46209e || (aVar3 = c.this.d) == null || (realtimeBlurLinearLayout = aVar2.f46171a) == null) {
                    return;
                }
                aVar3.a(realtimeBlurLinearLayout);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x0101  */
            @Override // sg.bigo.ads.ad.interstitial.e.c.b
            public final boolean a() {
                AnonymousClass4 anonymousClass5;
                n nVar;
                sg.bigo.ads.ad.interstitial.e.a.c cVar3;
                String str;
                c cVar4 = c.this;
                if (cVar4.f46195e == null) {
                    cVar3 = cVar4.f46194c;
                    str = "icon ads is null";
                } else {
                    if (!cVar4.f46199n) {
                        if (cVar4.a()) {
                            c.this.c();
                            c cVar5 = c.this;
                            cVar5.a(cVar5.f46194c, "host ad is destroyed", 2);
                            return true;
                        }
                        List listA = c.a(c.this.f46195e);
                        if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
                            c.this.c();
                            c cVar6 = c.this;
                            cVar6.a(cVar6.f46194c, "icon ads download failed", 2);
                            return true;
                        }
                        boolean zA = c.this.f46194c.a();
                        if (u.c(this.f46216c) && u.d(this.f46216c)) {
                            c.a(c.this, 2);
                            c cVar7 = c.this;
                            Context context = this.f46216c.getContext();
                            c cVar8 = c.this;
                            cVar7.k = sg.bigo.ads.ad.interstitial.e.a.a(context, cVar8.f46194c, listA, cVar8.r);
                            c.a(c.this, zA);
                            RealtimeBlurLinearLayout realtimeBlurLinearLayout = c.this.k.f46171a;
                            int iE = this.d.e();
                            if (iE == 5 || iE == 6) {
                                View viewFindViewById = viewGroup.findViewById(R.id.inter_icons_bottom_anchor);
                                View viewFindViewById2 = viewGroup.findViewById(R.id.inter_icons_center_anchor);
                                if (viewFindViewById != null) {
                                    ViewParent parent = viewFindViewById.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup) parent).addView(realtimeBlurLinearLayout, viewFindViewById.getLayoutParams());
                                    }
                                }
                                if (viewFindViewById2 != null) {
                                    sg.bigo.ads.ad.interstitial.e.a aVar2 = c.this.k;
                                    ViewParent parent2 = viewFindViewById2.getParent();
                                    if (parent2 instanceof ViewGroup) {
                                        ViewGroup viewGroup2 = (ViewGroup) parent2;
                                        anonymousClass5 = this;
                                        viewGroup2.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3

                                            /* JADX INFO: renamed from: a */
                                            final /* synthetic */ View f46223a;

                                            /* JADX INFO: renamed from: b */
                                            final /* synthetic */ ViewGroup f46224b;

                                            /* JADX INFO: renamed from: c */
                                            final /* synthetic */ View f46225c;
                                            final /* synthetic */ Integer d;

                                            /* JADX INFO: renamed from: e */
                                            final /* synthetic */ sg.bigo.ads.ad.interstitial.e.a f46226e;

                                            /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.e.c$b$3$1 */
                                            public class AnonymousClass1 extends sg.bigo.ads.common.h {

                                                /* JADX INFO: renamed from: a */
                                                final /* synthetic */ ValueAnimator f46227a;

                                                public AnonymousClass1() {
                                                    valueAnimator = valueAnimator;
                                                }

                                                @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                public final void onTransitionEnd(Transition transition) {
                                                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                    b.this.a(aVar);
                                                }

                                                @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                public final void onTransitionStart(Transition transition) {
                                                    ValueAnimator valueAnimator = valueAnimator;
                                                    if (valueAnimator != null) {
                                                        valueAnimator.start();
                                                    }
                                                }
                                            }

                                            public AnonymousClass3() {
                                                view = realtimeBlurLinearLayout;
                                                viewGroup = viewGroup2;
                                                view = viewFindViewById2;
                                                num = num;
                                                aVar = aVar2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                u.b(view);
                                                viewGroup.addView(view, view.getLayoutParams());
                                                ValueAnimator valueAnimatorA = b.this.a(num);
                                                TransitionSet transitionSet = new TransitionSet();
                                                transitionSet.addTransition(new ChangeBounds());
                                                transitionSet.setDuration(300L);
                                                transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.common.h() { // from class: sg.bigo.ads.ad.interstitial.e.c.b.3.1

                                                    /* JADX INFO: renamed from: a */
                                                    final /* synthetic */ ValueAnimator f46227a;

                                                    public AnonymousClass1() {
                                                        valueAnimator = valueAnimatorA;
                                                    }

                                                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                    public final void onTransitionEnd(Transition transition) {
                                                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                                        b.this.a(aVar);
                                                    }

                                                    @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
                                                    public final void onTransitionStart(Transition transition) {
                                                        ValueAnimator valueAnimator = valueAnimator;
                                                        if (valueAnimator != null) {
                                                            valueAnimator.start();
                                                        }
                                                    }
                                                });
                                                TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                                            }
                                        });
                                    }
                                }
                                c.a(c.this, anonymousClass5.d, 2, listA);
                                c cVar9 = c.this;
                                cVar9.m = c.a(cVar9, cVar9.f46194c, cVar9.r);
                                nVar = c.this.m;
                                if (nVar != null) {
                                    nVar.c();
                                }
                            } else {
                                this.f46209e = true;
                                a(viewGroup, realtimeBlurLinearLayout, -234881024, c.this.k);
                            }
                            anonymousClass5 = this;
                            c.a(c.this, anonymousClass5.d, 2, listA);
                            c cVar10 = c.this;
                            cVar10.m = c.a(cVar10, cVar10.f46194c, cVar10.r);
                            nVar = c.this.m;
                            if (nVar != null) {
                                nVar.c();
                            }
                        } else {
                            anonymousClass5 = this;
                        }
                        c.this.c();
                        return true;
                    }
                    cVar3 = cVar4.f46194c;
                    str = "page is Paused";
                }
                cVar4.a(cVar3, str, 2);
                return false;
            }
        };
        cVar2.f46197i = anonymousClass4;
        anonymousClass4.d();
    }

    public final void a(View view, int i2, sg.bigo.ads.core.adview.h hVar, int i3) {
        ViewGroup viewGroup = this.D;
        if (viewGroup == null) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to set ad click due to native ad view is null.");
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, view, i2, hVar, i3);
        }
    }

    public final void e(boolean z2) {
        if (f(z2)) {
            k(c());
            super.d(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final void a(final View view, int i2, boolean z2, int i3, boolean z3, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams2;
        if (!(view instanceof FrameLayout) && !(view instanceof RelativeLayout)) {
            sg.bigo.ads.common.t.a.a(0, "InterstitialNativeActivityImpl", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) view;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i2 > 0) {
            View view2 = new View(context);
            view2.setId(R.id.bigo_ad_interstitial_below_area_click);
            view2.setTag(25);
            if (viewGroup2 instanceof FrameLayout) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i2), 80);
            } else if (viewGroup2 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i2));
                layoutParams3.addRule(12);
                layoutParams2 = layoutParams3;
            } else {
                viewGroup = this.D;
                if (z2) {
                    if (viewGroup != null) {
                        a(view2, i4, ((t) this.y).f46647z, i5);
                    }
                } else if (viewGroup != null) {
                    sg.bigo.ads.ad.b.a.a(viewGroup, view2, i4, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.7
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i6, int i7, int i8, int i9, int i10, int i11) {
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for below area: " + view);
                        }
                    }, i5);
                }
            }
            viewGroup2.addView(view2, layoutParams2);
            viewGroup = this.D;
            if (z2) {
                if (viewGroup != null) {
                    a(view2, i4, ((t) this.y).f46647z, i5);
                }
            } else if (viewGroup != null) {
                sg.bigo.ads.ad.b.a.a(viewGroup, view2, i4, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.7
                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(int i6, int i7, int i8, int i9, int i10, int i11) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for below area: " + view);
                    }
                }, i5);
            }
        }
        if (i3 > 0) {
            View view3 = new View(context);
            view3.setTag(24);
            if (!(viewGroup2 instanceof FrameLayout)) {
                if (viewGroup2 instanceof RelativeLayout) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i3));
                }
                if (z3) {
                    if (this.D != null) {
                        a(view3, i4, ((t) this.y).f46647z, i5);
                    }
                } else if (this.C != null) {
                    sg.bigo.ads.ad.b.a.a(this.D, view3, i4, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.8
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i6, int i7, int i8, int i9, int i10, int i11) {
                            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for up area: " + view);
                        }
                    }, i5);
                }
            }
            layoutParams = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(context, i3));
            viewGroup2.addView(view3, layoutParams);
            if (z3) {
                if (this.D != null) {
                    a(view3, i4, ((t) this.y).f46647z, i5);
                }
            } else if (this.C != null) {
                sg.bigo.ads.ad.b.a.a(this.D, view3, i4, new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.interstitial.a.8
                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(int i6, int i7, int i8, int i9, int i10, int i11) {
                        sg.bigo.ads.common.t.a.a(0, 3, "InterstitialNativeActivityImpl", "Forbidden click for up area: " + view);
                    }
                }, i5);
            }
        }
    }

    public void a(ViewGroup viewGroup) {
        MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.inter_media);
        if (mediaView != null) {
            mediaView.setTag(5);
        }
        if (this.f45743h.f46712a) {
            viewGroup.setTag(11);
            a(viewGroup, 1, ((t) this.y).f46647z, this.f45743h.f46717i);
            if (mediaView != null) {
                mediaView.b().a(false);
                return;
            }
            return;
        }
        if (!this.d) {
            a(viewGroup, 8, (sg.bigo.ads.core.adview.h) null, 0);
            return;
        }
        if (!(Z() instanceof sg.bigo.ads.ad.interstitial.d.a) && mediaView != null) {
            a(mediaView, 8, ((t) this.y).f46647z, this.f45743h.f46717i);
            if (this.f45743h.f) {
                mediaView.setMediaAreaClickable(true);
                mediaView.b().a(false);
            } else {
                mediaView.setMediaAreaClickable(false);
                mediaView.b().a(true);
            }
        }
        if (!(Z() instanceof sg.bigo.ads.ad.interstitial.d.a)) {
            View viewFindViewById = viewGroup.findViewById(R.id.inter_media_container);
            if (t()) {
                viewFindViewById = viewGroup.findViewById(R.id.inter_media_layout);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setTag(9);
                if (this.f45743h.g) {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(true);
                    }
                    a(viewFindViewById, 8, ((t) this.y).f46647z, this.f45743h.f46717i);
                } else {
                    if (mediaView != null) {
                        mediaView.setOtherClickAreaClick(false);
                    }
                    a(viewFindViewById, 8, r.f46631F, 0);
                }
            }
        }
        if (Z() instanceof sg.bigo.ads.ad.interstitial.d.a) {
            return;
        }
        View viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info);
        if (M() && aq()) {
            viewFindViewById2 = viewGroup.findViewById(R.id.inter_ad_info_inner);
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setTag(18);
            if (t()) {
                viewFindViewById2 = viewGroup.findViewById(R.id.inter_media_container);
                viewFindViewById2.setTag(18);
            }
            x xVar = this.f45743h;
            if (xVar.f46716h) {
                a(viewFindViewById2, 8, ((t) this.y).f46647z, xVar.f46717i);
            } else {
                a(viewFindViewById2, 8, r.f46631F, 0);
            }
        }
    }

    private void a(sg.bigo.ads.api.a.m mVar) {
        if (mVar == null) {
            return;
        }
        this.f45744i = ((t) this.y).C();
        sg.bigo.ads.core.a.a aVarF = ((t) this.y).f();
        this.j = new f(mVar.a("video_play_page.gp_element"), mVar.a("video_play_page.gp_force_time"), aVarF != null ? aVarF.n() : "");
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (r11 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.a.a(boolean):void");
    }

    public final void a(Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        synchronized (this.M) {
            try {
                for (Object obj : objArr) {
                    if (obj != null) {
                        this.M.put(obj, 1);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.ad.c.a
    public final boolean a() {
        return this.f45736P;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.b.InterfaceC0819b
    public boolean a(MotionEvent motionEvent, sg.bigo.ads.ad.interstitial.f.b.a aVar, int i2) {
        boolean zB;
        AdCountDownButton adCountDownButton = this.f46325A;
        boolean z2 = false;
        if (adCountDownButton != null) {
            if (motionEvent == null || adCountDownButton.f == null) {
                zB = false;
            } else {
                zB = sg.bigo.ads.common.utils.u.b(adCountDownButton.f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (zB) {
                if (motionEvent.getAction() == 1) {
                    if (aVar != null && aVar.a()) {
                        z2 = true;
                    }
                    if (z2 && this.f45737Q == null) {
                        if (this.f45736P) {
                            this.f45737Q = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.10
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AdCountDownButton adCountDownButton2 = a.this.f46325A;
                                    if (adCountDownButton2 != null) {
                                        adCountDownButton2.a();
                                    }
                                }
                            };
                        } else {
                            AdCountDownButton adCountDownButton2 = this.f46325A;
                            if (adCountDownButton2 != null) {
                                adCountDownButton2.a();
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean a(Object obj, Runnable runnable) {
        Integer num;
        if (obj == null || runnable == null) {
            return false;
        }
        synchronized (this.M) {
            num = this.M.get(obj);
        }
        if (num == null) {
            runnable.run();
            return false;
        }
        synchronized (this.f45735N) {
            try {
                WeakHashMap<Object, Runnable> weakHashMap = this.f45735N.get(num);
                if (weakHashMap == null) {
                    weakHashMap = new WeakHashMap<>();
                    this.f45735N.put(num, weakHashMap);
                }
                weakHashMap.put(obj, runnable);
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
