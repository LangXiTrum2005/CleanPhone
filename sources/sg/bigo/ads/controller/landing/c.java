package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.h.e;
import sg.bigo.ads.core.landing.WebViewActivityImpl;

/* JADX INFO: loaded from: classes7.dex */
public class c extends WebViewActivityImpl implements f {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final ValueCallback<Boolean> f48200E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f48202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f48203c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48204e;
    private boolean f;
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f48205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sg.bigo.ads.controller.landing.a f48206i;
    private boolean j;
    private final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<f.a> f48207l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f48208n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f48209p;
    private WebHistoryItem q;
    private boolean r;
    public sg.bigo.ads.ad.c<?, ?> s;
    protected sg.bigo.ads.api.core.c t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f48210u;
    protected int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f48211w;

    public static class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48215b;

        private a(int i2, long j) {
            this.f48214a = i2;
            this.f48215b = System.currentTimeMillis() - j;
        }

        @Override // sg.bigo.ads.api.b.f.a
        public final int a() {
            return this.f48214a;
        }

        @Override // sg.bigo.ads.api.b.f.a
        public final long b() {
            return this.f48215b;
        }

        public /* synthetic */ a(int i2, long j, byte b2) {
            this(i2, j);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x008f. Please report as an issue. */
    public c(Activity activity) {
        int intExtra;
        int i2;
        super(activity);
        this.f48201a = 300;
        this.f48203c = -1L;
        this.d = 0;
        this.f = false;
        this.f48207l = new ArrayList();
        this.m = 0;
        this.f48208n = 0;
        this.o = 0;
        this.f48211w = false;
        this.f48200E = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.controller.landing.c.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                Boolean bool2 = bool;
                if (c.this.f48595z != null) {
                    if (bool2 == null || !bool2.booleanValue()) {
                        ViewParent parent = c.this.f48595z.getParent();
                        if (parent instanceof ViewGroup) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.addTransition(new Fade(1));
                            transitionSet.setDuration(300L);
                            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                        }
                    }
                    c.this.f48595z.setEnabled(true);
                    c.this.f48595z.setVisibility(0);
                }
            }
        };
        Intent intent = this.f47011I.getIntent();
        int i3 = -1;
        if (intent != null) {
            int intExtra2 = intent.getIntExtra("ad_identifier", -1);
            this.k = intent.getIntExtra("land_way", -1);
            intExtra = intent.getIntExtra("webview_force_time", -1);
            i3 = intExtra2;
        } else {
            this.k = -1;
            intExtra = -1;
        }
        sg.bigo.ads.ad.c<?, ?> cVarB = d.b(i3);
        this.s = cVarB;
        if (cVarB != null) {
            this.t = cVarB.f();
            this.g = this.s.q();
            this.f48205h = this.s.r();
            this.f48206i = this.s.m;
            this.f48202b = this.t.N().e();
            this.f48204e = this.t.d().f();
        } else {
            this.g = 0;
            this.f48205h = System.currentTimeMillis();
        }
        switch (intExtra) {
            case -1:
                this.r = false;
                this.f48210u = false;
                this.v = 0;
                break;
            case 0:
            default:
                this.r = true;
                this.f48210u = false;
                this.v = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                this.r = false;
                this.f48210u = true;
                i2 = intExtra + 1;
                this.v = i2;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.r = true;
                this.f48210u = false;
                i2 = intExtra - 3;
                this.v = i2;
                break;
        }
        this.f48209p = a(activity);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void D() {
        super.D();
        sg.bigo.ads.controller.landing.a aVar = this.f48206i;
        if (aVar != null) {
            aVar.d = false;
            this.f48206i = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void N() {
        this.f48203c = SystemClock.elapsedRealtime();
        c(1);
        super.N();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
        super.X();
        if (this.s != null) {
            d.a();
            this.s = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z2) {
        if (z2) {
            ao();
        }
    }

    public int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.f
    public final String i() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int j() {
        return this.m;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int k() {
        return this.o;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int l() {
        return this.f48208n;
    }

    @Override // sg.bigo.ads.api.b.f
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f48206i;
        return aVar != null && aVar.d;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int n() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int o() {
        return this.k;
    }

    @Override // sg.bigo.ads.api.b.f
    public final Map<String, String> p() {
        return null;
    }

    public final void q() {
        ImageView imageView = this.f48595z;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.f48595z.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final WebView r() {
        e eVar;
        sg.bigo.ads.controller.landing.a aVar = this.f48206i;
        e eVar2 = null;
        if (aVar != null && aVar.b() && (eVar = aVar.f) != null) {
            u.b(eVar);
            e eVar3 = aVar.f;
            aVar.f = null;
            eVar2 = eVar3;
        }
        if (eVar2 == null) {
            return super.r();
        }
        this.j = true;
        return eVar2;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void s() {
        c(2);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void t() {
        if (this.f48590B == null) {
            return;
        }
        sg.bigo.ads.controller.landing.a aVar = this.f48206i;
        if (aVar != null) {
            if (aVar.f48174c == 2 && !q.a((CharSequence) aVar.f48175e)) {
                this.f48590B.loadDataWithBaseURL(this.C, this.f48206i.f48175e, "text/html", "UTF-8", null);
                c(3);
                return;
            }
            int i2 = this.f48206i.f48174c;
            if (i2 == 3 && this.j) {
                this.D = SystemClock.elapsedRealtime();
                b(this.f48590B.getTitle());
                if (this.f48206i.d) {
                    ProgressBar progressBar = this.y;
                    if (progressBar != null) {
                        progressBar.setAlpha(0.0f);
                    }
                    a(this.C);
                    return;
                }
                return;
            }
            if (i2 == 4 && this.j) {
                this.q = this.f48590B.copyBackForwardList().getCurrentItem();
            }
        }
        sg.bigo.ads.api.core.c cVar = this.t;
        if (cVar != null) {
            this.C = sg.bigo.ads.core.landing.a.a(cVar.N().h(), this.t.N().i(), this.C);
        }
        super.t();
        c(3);
    }

    public final boolean u() {
        int i2;
        if (this.r || this.f48210u) {
            ImageView imageView = this.f48595z;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (!this.f && (i2 = this.f48204e) > 0 && i2 <= 10000) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f48203c;
            if (jElapsedRealtime > 0 && jElapsedRealtime < i2) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean v() {
        WebView webView = this.f48590B;
        if (webView == null) {
            return false;
        }
        if (this.q != null) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (currentIndex <= 0) {
                return super.v();
            }
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.q.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.q.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.v();
    }

    public final void w() {
        if (this.v <= 0) {
            this.f48200E.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.f48590B;
        if (webView != null) {
            webView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.c.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.f48200E != null) {
                        c.this.f48200E.onReceiveValue(Boolean.FALSE);
                    }
                }
            }, r.f47535a.a(this.v));
        }
    }

    private static String a(Activity activity) {
        try {
            String packageName = activity.getPackageName();
            String str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
            if (TextUtils.equals(packageName, str)) {
                return null;
            }
            return str;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }

    private void c(int i2) {
        a aVar = new a(i2, this.f48205h, (byte) 0);
        this.f48207l.add(0, aVar);
        sg.bigo.ads.api.core.c cVar = this.t;
        if (cVar != null) {
            sg.bigo.ads.core.d.b.a(this, aVar, cVar, this.s, this.f48209p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        if (this.r || this.f48210u) {
            q();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final String d(String str) {
        sg.bigo.ads.api.core.c cVar = this.t;
        return cVar != null ? sg.bigo.ads.core.landing.a.a(cVar.N().h(), this.t.N().i(), str) : super.d(str);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e(int i2) {
        super.e(i2);
        String str = this.f48202b;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(str), this.f47011I);
            aVar.k = sg.bigo.ads.common.u.a.e.a();
            g.a(aVar, null);
        }
        if (this.t != null) {
            sg.bigo.ads.core.d.b.a(this, this.f48207l.isEmpty() ? null : this.f48207l.get(0), System.currentTimeMillis() - this.f48205h, this.d, this.t, this.s, this.f48209p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(int i2) {
        super.a(i2);
        this.f48208n = Math.max(this.f48208n, i2);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(String str) {
        super.c(str);
        this.o++;
        this.m = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void d() {
        super.d();
        if (this.r) {
            w();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i2, String str, String str2) {
        super.a(i2, str, str2);
        if (this.f) {
            return;
        }
        c(6);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(int i2) {
        if (u()) {
            return;
        }
        super.d(i2);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (!this.f) {
            this.f48208n = 100;
            c(5);
            if (this.f48210u) {
                w();
            }
        }
        this.f = true;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z2) {
        super.a(str, z2);
        if (z2) {
            c(4);
        }
        int i2 = this.d;
        if (i2 == 0) {
            this.C = str;
        }
        this.d = i2 + 1;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(sg.bigo.ads.api.core.e eVar) {
        sg.bigo.ads.api.core.c cVar = this.t;
        if (cVar != null) {
            sg.bigo.ads.core.d.b.a(cVar, 2, eVar, this.s);
        }
    }
}
