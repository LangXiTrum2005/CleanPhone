package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.R;
import sg.bigo.ads.common.h;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class e extends d {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final a f46260E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final a f46261F;
    private final AtomicBoolean G;
    private boolean H;
    private final b.a K;
    private boolean L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b f46262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f46263c;
    protected final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f46264e;
    protected final int f;
    protected final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected RoundedFrameLayout f46265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f46266i;
    protected View j;
    protected LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected ImageView f46267l;
    protected TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected RelativeLayout f46268n;
    protected ImageView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected ImageView f46269p;
    protected ImageView q;
    protected ImageView r;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$10, reason: invalid class name */
    public class AnonymousClass10 implements ValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup.MarginLayoutParams f46271a;

        public AnonymousClass10(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f46271a = marginLayoutParams;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Integer num) {
            this.f46271a.topMargin = num.intValue();
            e.this.f46265h.requestLayout();
            e.this.f46265h.getMeasuredWidth();
            e eVar = e.this;
            eVar.f(eVar.f46263c - this.f46271a.topMargin);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$2, reason: invalid class name */
    public class AnonymousClass2 implements ValueCallback<Void> {
        public AnonymousClass2() {
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Void r1) {
            e.e(e.this);
        }
    }

    public class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f46284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f46285c;
        private float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46286e;

        private a() {
            this.f46284b = ViewConfiguration.get(e.this.f47011I).getScaledTouchSlop();
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065  */
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (e.this.f() || !e.this.G.get()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f46285c = motionEvent.getRawX();
                this.d = motionEvent.getRawY();
                if (!e.this.f() || e.this.f46262b == null) {
                    e.this.f();
                    if (e.this.L) {
                        this.f46286e = (int) motionEvent.getRawY();
                    }
                }
                return false;
            }
            if (action == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(this.f46285c - rawX) >= this.f46284b || Math.abs(this.d - rawY) >= this.f46284b) {
                    e.this.g();
                } else {
                    e eVar = e.this;
                    eVar.g(eVar.f46264e);
                }
            } else if (action == 2) {
                int rawY2 = (int) motionEvent.getRawY();
                int i2 = rawY2 - this.f46286e;
                this.f46286e = rawY2;
                e.this.c(i2);
            } else if (action == 3) {
                e.this.g();
            }
            return true;
        }

        public /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    public e(Activity activity) {
        b bVar;
        int i2;
        super(activity);
        this.G = new AtomicBoolean(true);
        byte b2 = 0;
        this.H = false;
        this.K = new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.1
            @Override // sg.bigo.ads.ad.interstitial.f.b.a
            public final boolean a() {
                if (e.this.u()) {
                    return false;
                }
                e.this.d(0);
                return true;
            }
        };
        this.L = true;
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f46255a;
        if (landingPageStyleConfig != null) {
            int i3 = landingPageStyleConfig.f48168a;
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    bVar = new b(landingPageStyleConfig.f48170c, i3, landingPageStyleConfig.f48171e, landingPageStyleConfig.f);
                    break;
                default:
                    bVar = new b(0, 1, landingPageStyleConfig.f48171e, landingPageStyleConfig.f);
                    break;
            }
        } else {
            bVar = null;
        }
        this.f46262b = bVar;
        int iA = sg.bigo.ads.common.utils.e.a(this.f47011I, 20);
        this.d = iA;
        LandingPageStyleConfig landingPageStyleConfig2 = ((d) this).f46255a;
        this.f46263c = ((landingPageStyleConfig2 == null || (i2 = landingPageStyleConfig2.d) <= 0) ? sg.bigo.ads.common.utils.e.c(this.f47011I) - sg.bigo.ads.common.utils.e.a(this.f47011I, 48) : i2) - iA;
        this.f46264e = 0;
        this.f = (int) ((1.0f - (bVar != null ? bVar.e() : 1.0f)) * this.f46263c);
        this.g = sg.bigo.ads.common.utils.e.a(activity, 3);
        this.f46260E = new a(this, b2);
        this.f46261F = new a(this, b2);
        activity.setTheme(R.style.LandingPageStyle);
        ao();
        Window window = this.f47011I.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.f46263c;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        activity.overridePendingTransition(0, 0);
    }

    private boolean x() {
        WebView webView = this.f48590B;
        if (webView == null) {
            return false;
        }
        return webView.canGoForward();
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        this.f47011I.overridePendingTransition(0, 0);
        b bVar = this.f46262b;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        String host;
        ImageView imageView;
        super.b();
        this.f46265h = (RoundedFrameLayout) o(R.id.inter_landpage_webview_page);
        this.f46266i = (RelativeLayout) o(R.id.inter_webview_top_bar);
        this.k = (LinearLayout) o(R.id.inter_webview_top_action_bar);
        this.f46267l = (ImageView) o(R.id.inter_webview_open);
        this.m = (TextView) o(R.id.inter_webview_host);
        this.r = (ImageView) o(R.id.inter_webview_safe);
        this.j = o(R.id.inter_webview_top_indicator);
        this.f46268n = (RelativeLayout) o(R.id.inter_webview_bottom_bar);
        this.o = (ImageView) o(R.id.inter_webview_forward);
        this.f46269p = (ImageView) o(R.id.inter_webview_copy);
        this.q = (ImageView) o(R.id.inter_webview_refresh);
        this.f46267l.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.f46269p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        View viewO = o(R.id.inter_webview_top_middle);
        int i2 = 8;
        this.f46267l.setVisibility(c() ? 8 : 0);
        this.o.setVisibility(c() ? 8 : 0);
        this.f46269p.setVisibility(c() ? 8 : 0);
        this.q.setVisibility(c() ? 8 : 0);
        this.f46268n.setVisibility(c() ? 8 : 0);
        ImageView imageView2 = this.f48589A;
        if (imageView2 != null) {
            imageView2.setVisibility(c() ? 8 : 0);
        }
        View view = this.j;
        if (view != null) {
            view.setVisibility(c() ? 8 : 0);
        }
        if (viewO != null) {
            viewO.setVisibility(c() ? 8 : 0);
        }
        b bVar = this.f46262b;
        if (bVar != null) {
            this.f46266i.setLayoutDirection(bVar.f() ? 1 : 0);
        }
        this.k.setLayoutDirection(this.f46266i.getLayoutDirection());
        this.f48595z.setLayoutDirection(0);
        this.f46267l.setLayoutDirection(0);
        this.y.setLayoutDirection(0);
        this.x.setLayoutDirection(0);
        this.m.setLayoutDirection(0);
        this.x.setMaxLines(1);
        float fA = sg.bigo.ads.common.utils.e.a(this.f47011I, 16);
        this.f46265h.a(fA, fA, 0.0f, 0.0f);
        this.x.setVisibility(8);
        this.m.setVisibility(8);
        String str = this.C;
        boolean zIsHttpsUrl = URLUtil.isHttpsUrl(str);
        try {
            host = Uri.parse(str).getHost();
        } catch (Exception unused) {
            host = "";
        }
        this.m.setText(host);
        if (q.a((CharSequence) host)) {
            this.m.setVisibility(8);
            imageView = this.r;
        } else {
            this.m.setVisibility(0);
            imageView = this.r;
            if (zIsHttpsUrl) {
                i2 = 0;
            }
        }
        imageView.setVisibility(i2);
        this.f46266i.setOnTouchListener(this.f46261F);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams();
        b bVar2 = this.f46262b;
        if (bVar2 != null) {
            marginLayoutParams.topMargin = bVar2.g() ? this.f46264e : this.f;
        }
        this.f46265h.requestLayout();
        u.a(this.f46265h, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.f.e.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.d(e.this);
            }
        });
        b bVar3 = this.f46262b;
        if ((bVar3 == null || bVar3.d() != 0) && !c()) {
            Drawable progressDrawable = this.y.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    b bVar4 = this.f46262b;
                    gradientDrawable.setColors(new int[]{bVar4 != null ? bVar4.d() : -1, -1312769});
                }
            }
        }
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d() {
        super.d();
        b bVar = this.f46262b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e() {
        super.e();
        b bVar = this.f46262b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void g() {
        float f = ((ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams()).topMargin;
        int i2 = this.f;
        if (f <= i2 * 0.8f) {
            i2 = 0;
        }
        g(i2);
    }

    @Override // sg.bigo.ads.controller.landing.c, sg.bigo.ads.api.b.f
    public final int h() {
        b bVar = this.f46262b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f46253c;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, android.view.View.OnClickListener
    public void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.f46267l) {
            sg.bigo.ads.core.landing.a.a(this.f47011I, this.C, (JSONArray) null);
            return;
        }
        if (view == this.o) {
            WebView webView2 = this.f48590B;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.f48590B.goForward();
            return;
        }
        if (view == this.f46269p) {
            if (sg.bigo.ads.common.utils.c.g(this.f47011I, this.C)) {
                Activity activity = this.f47011I;
                Toast.makeText(activity, sg.bigo.ads.common.utils.a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.q || (webView = this.f48590B) == null) {
            return;
        }
        webView.reload();
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.G.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((eVar.f46263c - ((ViewGroup.MarginLayoutParams) eVar.f46265h.getLayoutParams()).topMargin) * 1.5f) / eVar.g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.4
                @Override // sg.bigo.ads.common.a.a
                public final void a(float f, float f2, int i2, int i3) {
                    e.this.f((int) (i3 - f2));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    e.this.G.set(true);
                }
            };
            aVar.setDuration(jAbs);
            eVar.f46265h.startAnimation(aVar);
        }
    }

    public static /* synthetic */ boolean e(e eVar) {
        eVar.L = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i2) {
        View view;
        int i3 = this.f46263c;
        int i4 = i3 - this.f;
        int i5 = this.d;
        if (i2 == i3 && (view = this.j) != null && !this.H) {
            this.H = true;
            view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new sg.bigo.ads.common.utils.b.a());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(e.this.f46265h, transitionSet);
                    e.this.j.setVisibility(8);
                }
            }, 500L);
        }
        b bVar = this.f46262b;
        if (bVar != null) {
            bVar.a(i2, i4, i3, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        int iMax = Math.max(this.f46264e, Math.min(this.f, i2));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams();
        int i3 = marginLayoutParams.topMargin;
        if (i3 == iMax) {
            return;
        }
        long jAbs = (long) Math.abs(((iMax - i3) * 2.0f) / this.g);
        this.L = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new sg.bigo.ads.common.utils.b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.8
            @Override // sg.bigo.ads.common.utils.b.a
            public final void a(Object obj, Object obj2) {
                RoundedFrameLayout roundedFrameLayout = e.this.f46265h;
                if (obj == roundedFrameLayout && (obj2 instanceof PointF)) {
                    PointF pointF = (PointF) obj2;
                    roundedFrameLayout.getMeasuredWidth();
                    float f = pointF.x;
                    e eVar = e.this;
                    eVar.f((int) (eVar.f46263c - pointF.y));
                }
            }
        });
        transitionSet.setDuration(jAbs);
        transitionSet.addListener((Transition.TransitionListener) new h() { // from class: sg.bigo.ads.ad.interstitial.f.e.9
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                e.e(e.this);
            }
        });
        TransitionManager.beginDelayedTransition(this.f46265h, transitionSet);
        marginLayoutParams.topMargin = iMax;
        this.f46265h.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str) {
        super.a(str);
        this.f48589A.setEnabled(v());
        this.o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(final int i2) {
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.6
            @Override // java.lang.Runnable
            public final void run() {
                e.super.b(i2);
            }
        };
        if (this.G.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((this.f46263c - ((ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams()).topMargin) * 1.5f) / this.g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0.0f, 1.0f);
                }

                @Override // sg.bigo.ads.common.a.a
                public final void a(float f, float f2, int i3, int i4) {
                    e.this.f((int) (i4 - f2));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            aVar.setFillAfter(true);
            aVar.setDuration(jAbs);
            this.f46265h.startAnimation(aVar);
        }
    }

    public final void c(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams();
        int iMin = Math.min(Math.max(this.f46264e, marginLayoutParams.topMargin + i2), this.f);
        marginLayoutParams.topMargin = iMin;
        this.f46265h.requestLayout();
        this.f46265h.getMeasuredWidth();
        f(this.f46263c - iMin);
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, boolean z2) {
        super.a(str, z2);
        this.f48589A.setEnabled(v());
        this.o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(String str) {
        super.b(str);
        TextView textView = this.x;
        if (textView != null) {
            textView.setVisibility(q.a((CharSequence) str) ? 8 : 0);
        }
    }

    public final boolean f() {
        return ((ViewGroup.MarginLayoutParams) this.f46265h.getLayoutParams()).topMargin <= this.f46264e;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        return this.f46260E.onTouch(this.f48590B, motionEvent);
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean b(MotionEvent motionEvent) {
        b bVar = this.f46262b;
        if (bVar != null) {
            return bVar.a(motionEvent, this.K) || super.b(motionEvent);
        }
        return super.b(motionEvent);
    }
}
