package sg.bigo.ads.ad.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c<T extends Ad> implements sg.bigo.ads.ad.banner.b.InterfaceC0789b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebView f45520a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f45522c;
    Runnable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    sg.bigo.ads.core.c.b f45524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    h f45525i;
    final T j;
    final sg.bigo.ads.api.core.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f45526l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference<Activity> f45527n;
    public a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f45528p;
    AdOptionsView q;
    View r;
    boolean s;
    private sg.bigo.ads.core.mraid.e t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f45529u;
    private final n v;
    private final Context x;
    private BannerAdRequest y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AdSize f45531z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45521b = 1;
    boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f45523e = false;
    boolean f = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f45530w = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f45519A = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.banner.c.1
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            sg.bigo.ads.ad.banner.b.e(c.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            sg.bigo.ads.ad.banner.b.f(c.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };
    final AtomicBoolean m = new AtomicBoolean(false);

    public interface a {
        void a(int i2, int i3);
    }

    public static class b implements sg.bigo.ads.api.b.a.InterfaceC0830a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private sg.bigo.ads.api.b.a.InterfaceC0830a f45549c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f45548b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Handler f45547a = new Handler();

        public b(sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a) {
            this.f45549c = interfaceC0830a;
        }

        private boolean c() {
            if (this.f45548b) {
                return true;
            }
            this.f45547a.removeCallbacks(null);
            this.f45548b = true;
            return false;
        }

        public final void a() {
            a(new sg.bigo.ads.api.core.d(3001, 10102, "Adx media load error because of destroying before loaded"));
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
        public final void b() {
            sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a;
            if (c() || (interfaceC0830a = this.f45549c) == null) {
                return;
            }
            interfaceC0830a.b();
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
        public final void a(sg.bigo.ads.api.core.d dVar) {
            sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a;
            if (c() || (interfaceC0830a = this.f45549c) == null) {
                return;
            }
            interfaceC0830a.a(dVar);
        }
    }

    public c(Context context, sg.bigo.ads.api.core.g gVar, T t, sg.bigo.ads.api.core.i iVar, n nVar, h hVar, boolean z2) {
        this.x = context;
        this.j = t;
        this.k = iVar;
        this.v = nVar;
        this.f45525i = hVar;
        this.f45526l = z2;
        if (gVar != null) {
            sg.bigo.ads.api.b bVar = gVar.f47034c;
            if (bVar instanceof BannerAdRequest) {
                this.y = (BannerAdRequest) bVar;
            }
        }
    }

    public static /* synthetic */ View a(c cVar, View view) {
        LinearLayout linearLayout = new LinearLayout(cVar.x);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (view != null) {
            linearLayout.addView(view);
        }
        if (!q.a((CharSequence) cVar.k.l())) {
            if (cVar.q == null) {
                cVar.q = new AdOptionsView(cVar.x);
            }
            AdOptionsView adOptionsView = cVar.q;
            sg.bigo.ads.api.core.i iVar = cVar.k;
            adOptionsView.a(iVar, iVar.l());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(cVar.x, 16), sg.bigo.ads.common.utils.e.a(cVar.x, 16), 8388659);
            layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(cVar.x, 10);
            cVar.q.setLayoutParams(layoutParams);
            linearLayout.addView(cVar.q);
        }
        return linearLayout;
    }

    public final void b() {
        try {
            sg.bigo.ads.ad.banner.b.h(this);
            sg.bigo.ads.core.c.b bVar = this.f45524h;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f45522c;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.g != null) {
                this.g = null;
            }
            sg.bigo.ads.core.mraid.e eVar = this.t;
            if (eVar != null) {
                eVar.e();
                this.t = null;
            }
            View view = this.f45529u;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.f45519A);
                this.f45529u = null;
            }
            WebView webView = this.f45520a;
            if (webView != null) {
                u.b(webView);
                this.f45520a = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final View c() {
        if (this.f45529u == null) {
            sg.bigo.ads.common.t.a.a(2, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.f45529u = new FrameLayout(this.x);
        }
        sg.bigo.ads.ad.banner.b.d(this);
        this.f45529u.addOnAttachStateChangeListener(this.f45519A);
        return this.f45529u;
    }

    public final String d() {
        sg.bigo.ads.api.core.i iVar = this.k;
        return iVar != null ? iVar.z() : "";
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[PHI: r0 r1
  0x0053: PHI (r0v11 android.app.Activity) = (r0v6 android.app.Activity), (r0v13 android.app.Activity) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r1v3 T extends sg.bigo.ads.api.Ad) = (r1v1 T extends sg.bigo.ads.api.Ad), (r1v6 T extends sg.bigo.ads.api.Ad) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final Context e() {
        Activity activityB;
        T t;
        String str;
        WeakReference<Activity> weakReference = this.f45527n;
        if (weakReference == null || (activityB = weakReference.get()) == null) {
            activityB = null;
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Interstitial/Reward Video banner ad get activity context from show(Activity activity).");
            T t2 = this.j;
            if (t2 instanceof sg.bigo.ads.ad.c) {
                ((sg.bigo.ads.ad.c) t2).b(1);
            }
        }
        if (activityB == null) {
            sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f46986a;
            if (this.v == n.INTERSTITIAL) {
                if (hVar != null && hVar.n().a(16)) {
                    activityB = sg.bigo.ads.common.f.b.b();
                    if (activityB == null) {
                        str = "Interstitial/Reward Video banner ad failed to get activity context.";
                        sg.bigo.ads.common.t.a.a(0, "BannerAd", str);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Interstitial/Reward Video banner ad get activity context from current activity.");
                        t = this.j;
                        if (t instanceof sg.bigo.ads.ad.c) {
                            ((sg.bigo.ads.ad.c) t).b(2);
                        }
                    }
                }
            } else if (hVar != null && hVar.n().a(17)) {
                try {
                    Activity activityA = sg.bigo.ads.common.utils.c.a(this.f45529u);
                    if (activityA != null) {
                        try {
                            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner ad get activity context from view.");
                            T t3 = this.j;
                            if (t3 instanceof sg.bigo.ads.ad.c) {
                                ((sg.bigo.ads.ad.c) t3).b(3);
                            }
                        } catch (Exception unused) {
                        }
                        activityB = activityA;
                    }
                } catch (Exception unused2) {
                }
                if (activityB == null) {
                    activityB = sg.bigo.ads.common.f.b.b();
                    if (activityB == null) {
                        str = "Banner ad failed to get activity context.";
                        sg.bigo.ads.common.t.a.a(0, "BannerAd", str);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner ad get activity context from current activity.");
                        t = this.j;
                        if (t instanceof sg.bigo.ads.ad.c) {
                            ((sg.bigo.ads.ad.c) t).b(2);
                        }
                    }
                }
            }
        }
        return activityB == null ? this.x : activityB;
    }

    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "performImpression");
        sg.bigo.ads.ad.banner.b.g(this);
        T t = this.j;
        if (t instanceof e) {
            ((e) t).a(sg.bigo.ads.ad.banner.b.i(this));
        }
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.f45523e) {
            h();
            g();
            sg.bigo.ads.core.c.b bVar = this.f45524h;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public final void g() {
        if (this.f45520a != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "javascript:onViewImpression()");
            this.f45520a.loadUrl("javascript:onViewImpression()");
        }
    }

    public final void h() {
        final WebView webView = this.f45520a;
        if (this.f45530w || !(webView instanceof sg.bigo.ads.core.h.b)) {
            return;
        }
        this.f45530w = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.2
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.core.h.b.C0871b c0871b;
                long j;
                long jA;
                long j2;
                long jA2;
                long j3;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Notify webView performance stat.");
                sg.bigo.ads.core.h.b bVar = (sg.bigo.ads.core.h.b) webView;
                if (sg.bigo.ads.api.a.i.f46986a.n().a(0) || sg.bigo.ads.api.a.i.f46986a.n().a(1)) {
                    sg.bigo.ads.core.h.b.C0871b c0871b2 = bVar.f48575h;
                    sg.bigo.ads.core.h.b.a(c0871b2);
                    if (sg.bigo.ads.api.a.i.f46986a.n().a(1)) {
                        if (bVar.f48576i == null) {
                            bVar.f48576i = new sg.bigo.ads.core.h.b.c(bVar, (byte) 0);
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c0871b2.d = bVar.f48576i.a();
                        c0871b2.g = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        c0871b2.f = SystemClock.elapsedRealtime();
                    }
                    c0871b = c0871b2;
                } else {
                    c0871b = null;
                }
                if (c0871b != null) {
                    Boolean bool = c0871b.f48581c;
                    if (bool == null && c0871b.d == null) {
                        return;
                    }
                    Boolean bool2 = c0871b.d;
                    if (bool != null) {
                        long j4 = bool.booleanValue() ? 1L : 0L;
                        jA = sg.bigo.ads.ad.banner.b.a(c.this, c0871b.f48582e);
                        j = j4;
                    } else {
                        j = -1;
                        jA = -1;
                    }
                    if (bool2 != null) {
                        long j5 = bool2.booleanValue() ? 1L : 0L;
                        long j6 = c0871b.g;
                        jA2 = sg.bigo.ads.ad.banner.b.a(c.this, c0871b.f);
                        j2 = j5;
                        j3 = j6;
                    } else {
                        j2 = -1;
                        jA2 = -1;
                        j3 = -1;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Stat check blank resutl.");
                    sg.bigo.ads.core.d.b.a(c.this.k, j, jA, j2, jA2, j3);
                }
            }
        });
    }

    public final AdSize i() {
        List<AdSize> list;
        if (this.f45531z == null) {
            BannerAdRequest bannerAdRequest = this.y;
            if (bannerAdRequest != null && (list = bannerAdRequest.f46959h) != null) {
                for (AdSize adSize : list) {
                    if (!adSize.f46958a.equals(AdSize.ADAPTIVE)) {
                        this.f45531z = adSize;
                        break;
                    }
                }
            }
            if (this.f45531z == null) {
                Context context = this.x;
                this.f45531z = sg.bigo.ads.common.utils.e.c(context, context.getResources().getDisplayMetrics().widthPixels) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.f45531z;
    }

    public static TextView a(Context context, boolean z2) {
        if (!z2) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(q.b("#B2FFFFFF", -1));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x022d  */
    /* JADX WARN: Code duplicated, block: B:117:0x023d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0246  */
    /* JADX WARN: Code duplicated, block: B:120:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x024c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0251  */
    /* JADX WARN: Code duplicated, block: B:124:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x0259  */
    /* JADX WARN: Code duplicated, block: B:128:0x0268  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f4  */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: sg.bigo.ads.core.h.a.1.<init>(sg.bigo.ads.core.h.a, android.content.Context):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private boolean c(final sg.bigo.ads.api.b.a.InterfaceC0830a r13) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.c(sg.bigo.ads.api.b.a$a):boolean");
    }

    public final boolean b(sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a) {
        if (this.s) {
            return true;
        }
        boolean zC = c(interfaceC0830a);
        this.s = zC;
        return zC;
    }

    public static TextView a(Context context, boolean z2, String str) {
        if (!z2 || q.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(sg.bigo.ads.common.utils.e.a(context, PsExtractor.VIDEO_STREAM_MASK));
        textView.setBackgroundColor(q.b("#FFD6D9DB", -7829368));
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    public final void a() {
        if (sg.bigo.ads.common.n.d.b()) {
            b();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b();
                }
            });
        }
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i2, int i3) {
        layoutParams.width = i2;
        layoutParams.height = i3;
        layoutParams.gravity = 17;
        this.f45529u.setMinimumHeight(i3);
    }

    public final void a(final sg.bigo.ads.api.b.a.InterfaceC0830a interfaceC0830a) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.f45521b != 0) {
                    if (cVar.b(interfaceC0830a)) {
                        return;
                    }
                    interfaceC0830a.a(new sg.bigo.ads.api.core.d(3001, 10102, "Adx media load error when preload"));
                    return;
                }
                b bVar = cVar.f45522c;
                if (bVar != null) {
                    bVar.a();
                }
                c.this.f45522c = new b(interfaceC0830a);
                final b bVar2 = c.this.f45522c;
                bVar2.f45547a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                }, MBInterstitialActivity.WEB_LOAD_TIME);
                c cVar2 = c.this;
                if (cVar2.b(cVar2.f45522c)) {
                    return;
                }
                c.this.f45522c.a(new sg.bigo.ads.api.core.d(3001, 10102, "Adx media load error when preload"));
            }
        });
    }
}
