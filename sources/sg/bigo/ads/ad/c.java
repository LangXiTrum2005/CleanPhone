package sg.bigo.ads.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.core.e.a.e;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T extends Ad, U extends sg.bigo.ads.api.core.c> extends sg.bigo.ads.api.b.a<T, U> implements sg.bigo.ads.common.f.b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private AdBid f45581A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Set<String> f45582B;
    private final Set<String> C;
    private final Map<String, Object> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AdInteractionListener f45583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f45584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected View f45585c;
    public sg.bigo.ads.core.e.a.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45586e;
    public boolean f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45588i;
    public boolean j;
    protected long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45589l;
    public sg.bigo.ads.controller.landing.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f45590n;
    protected int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45591p;
    protected boolean q;
    public int r;
    public long s;
    public long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference<a> f45592u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f45593w;
    private boolean x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f45594z;

    public interface a {
        LandingPageStyleConfig a(Context context, String str, int i2, boolean z2);

        boolean a();
    }

    public c(g gVar) {
        super(gVar.f47034c);
        this.f45586e = false;
        this.f45593w = false;
        this.f = false;
        this.x = false;
        this.g = false;
        this.y = false;
        this.f45587h = false;
        this.f45588i = false;
        this.j = false;
        this.f45582B = new HashSet();
        this.C = new HashSet();
        this.q = false;
        this.r = -1;
        this.s = 0L;
        this.t = 0L;
        this.D = new HashMap();
        this.v = true;
        this.f45584b = gVar;
        x();
        y();
        this.S = new sg.bigo.ads.common.v.a();
    }

    private long A() {
        sg.bigo.ads.api.core.c.a aVarO = this.f45584b.f47032a.O();
        if (aVarO != null) {
            return aVarO.b();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        try {
            sg.bigo.ads.controller.landing.a aVar = this.m;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
    }

    private void x() {
        sg.bigo.ads.api.core.c cVar = this.f45584b.f47032a;
        r rVarM = i.f46986a.m();
        sg.bigo.ads.api.core.c.f[] fVarArrC = cVar.C();
        e[] eVarArr = new e[0];
        if (fVarArrC != null && fVarArrC.length > 0) {
            eVarArr = new e[fVarArrC.length];
            for (int i2 = 0; i2 < fVarArrC.length; i2++) {
                eVarArr[i2] = new e(fVarArrC[i2].a(), this.f45584b.d);
            }
        }
        sg.bigo.ads.api.core.c.f[] fVarArrD = cVar.D();
        e[] eVarArr2 = new e[0];
        if (fVarArrD != null && fVarArrD.length > 0) {
            eVarArr2 = new e[fVarArrD.length];
            for (int i3 = 0; i3 < fVarArrD.length; i3++) {
                eVarArr2[i3] = new e(fVarArrD[i3].a(), this.f45584b.d);
            }
        }
        sg.bigo.ads.api.core.c.f[] fVarArrE = cVar.E();
        e[] eVarArr3 = new e[0];
        if (fVarArrE != null && fVarArrE.length > 0) {
            eVarArr3 = new e[fVarArrE.length];
            for (int i4 = 0; i4 < fVarArrE.length; i4++) {
                eVarArr3[i4] = new e(fVarArrE[i4].a(), this.f45584b.d);
            }
        }
        sg.bigo.ads.api.core.c.f[] fVarArrF = cVar.F();
        e[] eVarArr4 = new e[0];
        if (fVarArrF != null && fVarArrF.length > 0) {
            eVarArr4 = new e[fVarArrF.length];
            for (int i5 = 0; i5 < fVarArrF.length; i5++) {
                eVarArr4[i5] = new e(fVarArrF[i5].a(), this.f45584b.d);
            }
        }
        sg.bigo.ads.core.e.a.b bVarA = a(rVarM, eVarArr, eVarArr2, eVarArr3, eVarArr4);
        this.d = bVarA;
        bVarA.b("express_id", cVar.ab());
    }

    private void y() {
        this.f45586e = false;
        this.f45593w = false;
        this.f = false;
        this.x = false;
        this.g = false;
        this.y = false;
        this.f45587h = false;
        this.f45588i = false;
        this.k = 0L;
        this.f45589l = 0L;
        this.f45581A = null;
        this.j = false;
        this.f47002V = 0;
    }

    private int z() {
        sg.bigo.ads.api.core.c.a aVarO = this.f45584b.f47032a.O();
        if (aVarO != null) {
            return aVarO.a();
        }
        return 0;
    }

    public sg.bigo.ads.core.e.a.b a(r rVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4) {
        return new sg.bigo.ads.core.e.a.b(rVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, sg.bigo.ads.core.d.b.c(this.f45584b.f47032a, this));
    }

    public void a_() {
        if (isExpired() || this.f45588i) {
            b(2000, 2, this.f45588i ? "The ad is destroyed" : "The ad is expired");
            return;
        }
        if (this.y) {
            return;
        }
        this.y = true;
        this.k = SystemClock.elapsedRealtime();
        h();
        AdInteractionListener adInteractionListener = this.f45583a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    public <ValueType> ValueType b(String str, ValueType valuetype) {
        ValueType valuetype2 = (ValueType) this.D.get(str);
        return valuetype2 != null ? valuetype2 : valuetype;
    }

    @Override // sg.bigo.ads.api.b.a
    public final void c() {
        if (this.f45586e) {
            return;
        }
        this.f45586e = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f45589l = jElapsedRealtime;
        sg.bigo.ads.api.b.a aVar = this.f47001U;
        if (aVar instanceof c) {
            ((c) aVar).f45589l = jElapsedRealtime;
        }
        if (this.f45584b.f47032a.ah()) {
            return;
        }
        d("filled");
        if (this.f45584b.f47032a.N().k() == 1) {
            s();
        }
        if (this.f45584b.f47032a.N().c() == 2) {
            sg.bigo.ads.a.c.a(this.f45584b.f47035e);
        }
        sg.bigo.ads.common.f.b.a(this);
    }

    @Override // sg.bigo.ads.api.b.a
    public final String d() {
        return f().H();
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        this.f45588i = true;
        if (sg.bigo.ads.common.n.d.b()) {
            C();
            destroyInMainThread();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.C();
                    c.this.destroyInMainThread();
                }
            });
        }
        if (this.j) {
            sg.bigo.ads.common.form.a.a(f().hashCode(), 4);
        }
        sg.bigo.ads.common.form.a.b(f().hashCode());
        setAdInteractionListener(null);
        sg.bigo.ads.common.f.b.b(this);
    }

    public void destroyInMainThread() {
    }

    @Override // sg.bigo.ads.api.b.a
    public final long e() {
        return f().a();
    }

    @Override // sg.bigo.ads.api.b.a
    public U f() {
        return (U) this.f45584b.f47032a;
    }

    @Override // sg.bigo.ads.api.Ad
    public AdBid getBid() {
        if (this.f45581A == null) {
            g gVar = this.f45584b;
            sg.bigo.ads.api.core.c cVar = gVar.f47032a;
            this.f45581A = cVar.ak() ? new sg.bigo.ads.ad.a.C0780a(gVar, cVar, this.d) : null;
        }
        return this.f45581A;
    }

    @Override // sg.bigo.ads.api.Ad
    public String getExtraInfo(String str) {
        g gVar = this.f45584b;
        sg.bigo.ads.api.core.c cVar = gVar != null ? gVar.f47032a : null;
        return cVar != null ? cVar.b(str) : "";
    }

    public void h() {
        int i2;
        l();
        int i3 = this.T;
        int i4 = sg.bigo.ads.common.v.a.f47553e;
        if (i3 != i4) {
            sg.bigo.ads.common.v.a aVar = this.S;
            View view = this.f45585c;
            if (aVar.g == i4) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 4 - start activity from background");
                i2 = sg.bigo.ads.common.v.a.f47553e;
            } else if (sg.bigo.ads.common.v.a.a(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 5 - Lock screen");
                i2 = sg.bigo.ads.common.v.a.f;
            } else if (sg.bigo.ads.common.v.a.b(view)) {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 3 - Float window");
                i2 = sg.bigo.ads.common.v.a.d;
            } else {
                sg.bigo.ads.common.t.a.a(0, 4, "OutAppChecker", "Out app status: 1 - not outside app");
                i2 = sg.bigo.ads.common.v.a.f47551b;
            }
            this.T = i2;
        }
        this.d.a(this.T);
        this.d.a(this.f45584b.f47035e, false);
        if (a("06002010")) {
            sg.bigo.ads.core.d.b.a(this.f45584b.f47035e, this, (String) b("show_proportion", ""), i(), ((Integer) b("render_style", 0)).intValue(), u(), ((Long) b("attach_render_cost", -1L)).longValue(), SystemClock.elapsedRealtime() - this.f45589l, ((Integer) b("icon_sta", -1)).intValue(), ((Integer) b("img_sta", -1)).intValue(), ((Integer) b("vid_sta", -1)).intValue());
        }
        if (this.f45584b.f47032a.N().k() == 0) {
            s();
        }
    }

    public String i() {
        if (this.f45585c == null) {
            return "";
        }
        return this.f45585c.getWidth() + "x" + this.f45585c.getHeight();
    }

    @Override // sg.bigo.ads.api.Ad
    public boolean isExpired() {
        return this.f45584b.f47032a.J();
    }

    public final void j() {
        AdInteractionListener adInteractionListener = this.f45583a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }

    public void k() {
        AdInteractionListener adInteractionListener = this.f45583a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
        this.f45587h = true;
    }

    public void l() {
        d("impression");
    }

    public void m() {
        d("clicked");
    }

    public boolean n() {
        return this.y;
    }

    public final int o() {
        return this.f45584b.f47033b.b();
    }

    public final int p() {
        return this.f45584b.f47032a.w();
    }

    public final int q() {
        if (this.t != f().y()) {
            return -1;
        }
        return this.r;
    }

    public final long r() {
        if (this.t != f().y()) {
            return 0L;
        }
        return this.s;
    }

    public void s() {
        if (this.f45584b.f47032a.N().f() > 0) {
            final sg.bigo.ads.controller.landing.a aVar = new sg.bigo.ads.controller.landing.a(this.f45584b.f47032a);
            this.m = aVar;
            final Context context = this.f45584b.f47035e;
            final String strA = aVar.f48173b.a();
            final String strJ = aVar.f48173b.j();
            final int iC = aVar.f48173b.c();
            int i2 = aVar.f48174c;
            if (((i2 == 4 || i2 == 5) && TextUtils.isEmpty(strJ)) || sg.bigo.ads.core.landing.a.a(strA) || TextUtils.isEmpty(strA) || !strA.startsWith("http")) {
                return;
            }
            if (iC == 0 || iC == 2) {
                final sg.bigo.ads.controller.landing.a.InterfaceC0863a interfaceC0863a = new sg.bigo.ads.controller.landing.a.InterfaceC0863a() { // from class: sg.bigo.ads.controller.landing.a.3
                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0863a
                    public final void a(String str) {
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preloadWebView onStart preloadType = " + a.this.f48174c + ", url = " + str);
                    }

                    @Override // sg.bigo.ads.controller.landing.a.InterfaceC0863a
                    public final void a(String str, long j, boolean z2, int i3) {
                        a.this.d = z2;
                        HashMap map = new HashMap();
                        map.put("land_way", String.valueOf(i3));
                        sg.bigo.ads.core.d.b.a(a.this.f48172a, "preload_cost", j, z2 ? 1 : 0, map);
                        sg.bigo.ads.common.t.a.a(0, 3, "Preload", "preload landing page onComplete preloadType=" + a.this.f48174c + ", success = " + z2 + ", cost = " + j + ", url = " + str);
                        if (z2) {
                            return;
                        }
                        a.this.a();
                    }
                };
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.controller.landing.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a aVar2 = a.this;
                        int i3 = aVar2.f48174c;
                        if (i3 != 1) {
                            if (i3 == 4 || i3 == 5) {
                                a.a(aVar2, context, strJ, iC, interfaceC0863a);
                                return;
                            }
                            return;
                        }
                        Uri uri = Uri.parse(strA);
                        a.a(a.this, context, uri.getScheme() + "://" + uri.getHost(), iC, interfaceC0863a);
                    }
                });
            }
        }
    }

    @Override // sg.bigo.ads.api.Ad, sg.bigo.ads.api.IconAds
    public void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.f45583a = adInteractionListener;
    }

    public final void t() {
        if (this.x) {
            return;
        }
        this.x = true;
        this.f45594z = SystemClock.elapsedRealtime();
    }

    public final long u() {
        if (this.f45594z == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.f45594z;
    }

    public final boolean v() {
        WeakReference<a> weakReference = this.f45592u;
        return (weakReference == null || weakReference.get() == null || !this.f45592u.get().a()) ? false : true;
    }

    private void d(String str) {
        if (this.f45582B.contains(str)) {
            p005e.a.d(0, 3, str, "ignore callback action, action = ", "Ad");
            return;
        }
        sg.bigo.ads.api.core.c cVarF = f();
        Map<String, Object> mapA = sg.bigo.ads.core.b.a.a(str, this.f45584b.f47033b, this.f47000R, cVarF, Integer.valueOf(cVarF.aj()), null, null, this);
        str.getClass();
        if (str.equals("impression") || str.equals("clicked")) {
            mapA.put("ad_size", i());
            mapA.put("show_proportion", b("show_proportion", ""));
            mapA.put("render_style", b("render_style", 0));
        }
        sg.bigo.ads.core.b.b.a().a(str, mapA);
    }

    public void a() {
        x();
        y();
    }

    @Override // sg.bigo.ads.api.b.a
    public final void b() {
        if (this.f45593w) {
            return;
        }
        this.f45593w = true;
        this.f45584b.f47034c.g.b();
        if (a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, ((Boolean) b("is_cache", Boolean.FALSE)).booleanValue());
        }
    }

    public final void c(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        this.C.add(str);
    }

    private void c(sg.bigo.ads.common.i iVar, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        long jElapsedRealtime = this.k > 0 ? SystemClock.elapsedRealtime() - this.k : 0L;
        String strB = iVar != null ? iVar.b() : "";
        String strA = iVar != null ? iVar.a() : "";
        if (a("06002011")) {
            g gVar = this.f45584b;
            Context context = gVar.f47035e;
            sg.bigo.ads.api.core.c cVar = gVar.f47032a;
            String strI = i();
            int i4 = eVar.f47022a;
            int i5 = eVar.g;
            int i6 = this.f45590n + 1;
            this.f45590n = i6;
            int i7 = this.o + 1;
            this.o = i7;
            sg.bigo.ads.core.d.b.a(context, cVar, strI, strB, strA, i2, i3, i4, i5, jElapsedRealtime, i6, i7, this);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i2, int i3, String str) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f45584b.f47034c.g.b();
        if (!this.f45584b.f47032a.ah() && a("06002008")) {
            sg.bigo.ads.core.d.b.a(this, i2, i3, str);
        }
    }

    public final void b(int i2, int i3, String str) {
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i2, i3, "onAdError: (", " subCode:", ") ");
        sbP.append(str);
        sg.bigo.ads.common.t.a.a(2, 5, "", sbP.toString());
        AdError adError = new AdError(i2, i3, str);
        sg.bigo.ads.core.d.b.a(this.f45584b.f47032a, adError, n());
        AdInteractionListener adInteractionListener = this.f45583a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    public final void a(int i2, String str) {
        b(i2, 0, str);
    }

    @Override // sg.bigo.ads.common.f.b.a
    public final void a(Activity activity) {
        Intent intent;
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            b(2005, 0, "Activity create error");
            sg.bigo.ads.core.d.b.a(f(), 3000, 10117, stringExtra);
        }
    }

    public void a(Point point, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        int i4;
        int i5;
        int width;
        int height;
        String str;
        m();
        this.d.b("action_type", String.valueOf(eVar.f47022a));
        sg.bigo.ads.core.e.a.b bVar = this.d;
        final boolean zA = false;
        if (point != null) {
            i5 = point.x;
            i4 = point.y;
        } else {
            i4 = 0;
            i5 = 0;
        }
        View view = this.f45585c;
        if (view != null) {
            width = view.getWidth();
            height = this.f45585c.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float fFloatValue = width > 0 ? new BigDecimal(i5 / width).setScale(3, 4).floatValue() : 0.0f;
        float fFloatValue2 = height > 0 ? new BigDecimal(i4 / height).setScale(3, 4).floatValue() : 0.0f;
        if (i3 == 1 || i3 == 2) {
            str = DevicePublicKeyStringDef.DIRECT;
        } else {
            str = i3 == 3 ? "confirm" : "unknown";
        }
        bVar.b("click_prop", q.e(q.a("{'x':%d,'y':%d,'ad_w':%d,'ad_h':%d,'x_r':%s,'y_r':%s,'mode':'%s'}", Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), str)));
        this.d.b("click_source", String.valueOf(i3));
        this.d.b("click_module", String.valueOf(i2));
        int i6 = eVar.f47022a;
        if (i6 == 1) {
            zA = this.f45584b.f47032a.a(4);
        } else if (i6 == 4) {
            zA = this.f45584b.f47032a.a(8);
        }
        final sg.bigo.ads.core.e.a.b bVar2 = this.d;
        final Context context = this.f45584b.f47035e;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f48390a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ boolean f48391b;

            public AnonymousClass1() {
                context = context;
                z = zA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.c(context, z);
            }
        });
        sg.bigo.ads.core.d.b.a(this.f45584b.f47032a, 1, eVar, this);
    }

    public final synchronized void a(String str, Object obj) {
        this.D.put(str, obj);
    }

    public void a(sg.bigo.ads.api.b.a aVar) {
        this.f47001U = aVar;
        if (aVar != null) {
            HashMap map = new HashMap();
            sg.bigo.ads.core.d.b.a((Map<String, String>) map, (sg.bigo.ads.api.b.a) this, false);
            this.d.a(map);
        }
    }

    public void a(sg.bigo.ads.api.b.d.a<T> aVar) {
    }

    public final void a(sg.bigo.ads.common.i iVar, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        if (isExpired() || this.f45588i) {
            b(2000, 3, this.f45588i ? "The ad is destroyed" : "The ad is expired");
        } else if (z() != 2 || (n() && SystemClock.elapsedRealtime() - this.k >= A())) {
            b(iVar, i2, i3, eVar);
        }
    }

    public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.e eVar) {
        a(iVar, 0, 1, eVar);
    }

    public final void b(String str) {
        if (q.a((CharSequence) str)) {
            return;
        }
        this.f45582B.add(str);
    }

    public final boolean a(String str) {
        return !this.C.contains(str);
    }

    public static boolean a(c cVar) {
        return cVar == null || cVar.f45588i;
    }

    private void b(sg.bigo.ads.common.i iVar, int i2, int i3, sg.bigo.ads.api.core.e eVar) {
        this.f45591p = i2;
        if (!this.g && !this.f45588i) {
            this.g = true;
            a(iVar != null ? iVar.f47309b : null, i2, i3, eVar);
        }
        c(iVar, i2, i3, eVar);
        AdInteractionListener adInteractionListener = this.f45583a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }
}
