package sg.bigo.ads.core.e.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.api.core.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f48402a;
    protected r f;
    protected f g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48408l;
    public CopyOnWriteArrayList<e> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48409n;
    public CopyOnWriteArrayList<e> o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f48410p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f48406h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f48407i = 0;
    public long j = 0;
    public long k = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48403b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48404c = new CopyOnWriteArrayList<>();
    public CopyOnWriteArrayList<e> d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CopyOnWriteArrayList<e> f48405e = new CopyOnWriteArrayList<>();

    public c(r rVar) {
        this.f = rVar;
        HashMap map = new HashMap();
        this.f48402a = map;
        this.g = new f(this.f, map);
    }

    public final void a(int i2) {
        this.f48410p = i2;
        f fVar = this.g;
        if (fVar != null) {
            fVar.r = i2;
        }
    }

    public final void b(final Context context, boolean z2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.f.f47062a;
        Iterator<e> it = this.f48403b.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z3) {
            this.f48406h = jCurrentTimeMillis;
            this.f48408l = new CopyOnWriteArrayList<>();
            for (e eVar : this.f48403b) {
                if (!z2 || eVar.a()) {
                    if (eVar.c()) {
                        this.f48408l.add(eVar);
                    }
                }
            }
            if (this.f48408l.size() > 0) {
                f fVar = this.g;
                fVar.s = this.f48408l;
                fVar.j = jCurrentTimeMillis;
                fVar.f48445i = 0;
                d.a().a(this.g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdImpression not need retry");
        }
        for (final e eVar2 : this.f48403b) {
            if (!z2 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "impl_track", eVar2, z3);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "impl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void c(final Context context, boolean z2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.f.f47062a;
        Iterator<e> it = this.f48404c.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z3) {
            this.f48407i = jCurrentTimeMillis;
            this.m = new CopyOnWriteArrayList<>();
            for (e eVar : this.f48404c) {
                if (!z2 || eVar.a()) {
                    if (eVar.c()) {
                        this.m.add(eVar);
                    }
                }
            }
            if (this.m.size() > 0) {
                f fVar = this.g;
                fVar.t = this.m;
                fVar.f48446l = jCurrentTimeMillis;
                fVar.k = 0;
                d.a().a(this.g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdClick not need retry");
        }
        for (final e eVar2 : this.f48404c) {
            if (!z2 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "click_track", eVar2, z3);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "click_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void d(final Context context, boolean z2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.f.f47062a;
        Iterator<e> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z3) {
            this.j = jCurrentTimeMillis;
            this.f48409n = new CopyOnWriteArrayList<>();
            for (e eVar : this.d) {
                if (!z2 || eVar.a()) {
                    if (eVar.c()) {
                        this.f48409n.add(eVar);
                    }
                }
            }
            if (this.f48409n.size() > 0) {
                f fVar = this.g;
                fVar.f48449u = this.f48409n;
                fVar.f48447n = jCurrentTimeMillis;
                fVar.m = 0;
                d.a().a(this.g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdNUrl not need retry");
        }
        for (final e eVar2 : this.d) {
            if (!z2 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "nurl_track", eVar2, z3);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "nurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void e(final Context context, boolean z2) {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.f.f47062a;
        Iterator<e> it = this.f48405e.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        if (z3) {
            this.k = jCurrentTimeMillis;
            this.o = new CopyOnWriteArrayList<>();
            for (e eVar : this.f48405e) {
                if (!z2 || eVar.a()) {
                    if (eVar.c()) {
                        this.o.add(eVar);
                    }
                }
            }
            if (this.o.size() > 0) {
                f fVar = this.g;
                fVar.v = this.o;
                fVar.f48448p = jCurrentTimeMillis;
                fVar.o = 0;
                d.a().a(this.g);
            }
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "AdTracker", "trackThirdLUrl not need retry");
        }
        for (final e eVar2 : this.f48405e) {
            if (!z2 || eVar2.a()) {
                if (eVar2.c()) {
                    a(context, "lurl_track", eVar2, z3);
                } else {
                    sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.core.e.a.c.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.a(c.this, context, "lurl_track", eVar2);
                        }
                    });
                }
            }
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        h hVarA = h.a(this.f48402a, this.f, this.f48410p, str, str2, str3);
        hVarA.a(context, hVarA.f48455a);
    }

    public final void b(String str, String str2) {
        for (e eVar : this.f48403b) {
            if (eVar.c()) {
                eVar.a(str, str2);
            }
        }
        for (e eVar2 : this.f48404c) {
            if (eVar2.c()) {
                eVar2.a(str, str2);
            }
        }
        for (e eVar3 : this.d) {
            if (eVar3.c()) {
                eVar3.a(str, str2);
            }
        }
        for (e eVar4 : this.f48405e) {
            if (eVar4.c()) {
                eVar4.a(str, str2);
            }
        }
    }

    private void a(Context context, final String str, final e eVar, final boolean z2) {
        String str2 = eVar.f48439b;
        sg.bigo.ads.common.u.a aVarD = eVar.d();
        int i2 = eVar.f48440c;
        eVar.a();
        sg.bigo.ads.core.e.b.a(context, i2, str, aVarD, str2, this.f48410p, this.f48402a, new sg.bigo.ads.core.e.b.a() { // from class: sg.bigo.ads.core.e.a.c.5
            @Override // sg.bigo.ads.core.e.b.a
            public final void a() {
                e eVar2 = eVar;
                if (eVar2.d == 1) {
                    c.a(c.this, str, eVar2, true);
                }
                d.a().b(c.this.g);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final void b() {
                c.a(c.this, str, eVar, z2);
                d.a().b(c.this.g);
            }

            @Override // sg.bigo.ads.core.e.b.a
            public final boolean a(int i3) {
                return c.this.f.a(i3);
            }
        });
    }

    public final void a(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.f48402a.put(str, str2);
    }

    public final void a(String str, String str2, sg.bigo.ads.common.u.a aVar, String str3) {
        HashMap map = new HashMap(this.f48402a);
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        map.put("action", str);
        map.put("track_url", aVar.a());
        map.put("domain_front", aVar.e() ? aVar.d() : "");
        map.put("track_name", str3);
        map.put("states", str2);
        map.put("retry", "0");
        map.put("out_ad", String.valueOf(this.f48410p));
        if ("impl_track".equals(str)) {
            sg.bigo.ads.core.d.b.a(map);
        } else if ("click_track".equals(str)) {
            sg.bigo.ads.core.d.b.b(map);
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, final String str, e eVar) {
        String strA = eVar.d().a();
        final String str2 = eVar.f48439b;
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            strA = strA.replaceAll("\\?", "%3f");
        }
        cVar.a(str, "start", new sg.bigo.ads.common.u.b.d(strA), str2);
        final sg.bigo.ads.core.h.e eVarA = sg.bigo.ads.core.h.e.a(context);
        if (eVarA != null) {
            eVarA.setWebViewClient(new sg.bigo.ads.core.h.d() { // from class: sg.bigo.ads.core.e.a.c.6
                @Override // sg.bigo.ads.core.h.d
                public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                    eVarA.destroy();
                }

                @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str3) {
                    super.onPageFinished(webView, str3);
                    c.this.a(str, "success", new sg.bigo.ads.common.u.b.d(str3), str2);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str3) {
                    return false;
                }
            });
            try {
                int i2 = eVar.f48438a;
                if (i2 == 1) {
                    eVarA.loadUrl(strA);
                } else if (i2 == 2) {
                    eVarA.loadData(strA, "text/html", "UTF-8");
                }
            } catch (Exception e2) {
                sg.bigo.ads.core.d.b.a(3002, 10106, e2.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str, e eVar, boolean z2) {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        CopyOnWriteArrayList<e> copyOnWriteArrayList2;
        CopyOnWriteArrayList<e> copyOnWriteArrayList3;
        CopyOnWriteArrayList<e> copyOnWriteArrayList4;
        if ("impl_track".equals(str)) {
            if (!z2 || (copyOnWriteArrayList4 = cVar.f48408l) == null) {
                return;
            }
            copyOnWriteArrayList4.remove(eVar);
            return;
        }
        if ("click_track".equals(str)) {
            if (!z2 || (copyOnWriteArrayList3 = cVar.m) == null) {
                return;
            }
            copyOnWriteArrayList3.remove(eVar);
            return;
        }
        if ("nurl_track".equals(str)) {
            if (!z2 || (copyOnWriteArrayList2 = cVar.f48409n) == null) {
                return;
            }
            copyOnWriteArrayList2.remove(eVar);
            return;
        }
        if ("lurl_track".equals(str) && z2 && (copyOnWriteArrayList = cVar.o) != null) {
            copyOnWriteArrayList.remove(eVar);
        }
    }
}
