package sg.bigo.ads.controller.landing;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.b.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.a.a.c, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f48189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f48190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f48191c;
    private final String f;
    private final sg.bigo.ads.api.core.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.ad.c<?, ?> f48193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.controller.landing.a f48194i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f48195l;
    private final long m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f48192e = "ChromeTabStatSession";
    private int j = 0;
    private boolean k = false;
    protected long d = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<f.a> f48196n = new ArrayList();
    private final AtomicBoolean o = new AtomicBoolean(true);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f48197p = new AtomicBoolean(true);
    private boolean q = false;

    public static class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48199b;

        private a(int i2, long j) {
            this.f48198a = i2;
            this.f48199b = System.currentTimeMillis() - j;
        }

        @Override // sg.bigo.ads.api.b.f.a
        public final int a() {
            return this.f48198a;
        }

        @Override // sg.bigo.ads.api.b.f.a
        public final long b() {
            return this.f48199b;
        }

        public /* synthetic */ a(int i2, long j, byte b2) {
            this(i2, j);
        }
    }

    public b(String str, sg.bigo.ads.api.core.c cVar, sg.bigo.ads.ad.c<?, ?> cVar2, sg.bigo.ads.controller.landing.a aVar) {
        long jCurrentTimeMillis;
        this.f = str;
        this.g = cVar;
        this.f48193h = cVar2;
        this.f48194i = aVar;
        if (cVar2 != null) {
            this.f48195l = cVar2.q();
            jCurrentTimeMillis = cVar2.r();
        } else {
            this.f48195l = 0;
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.m = jCurrentTimeMillis;
    }

    @Override // sg.bigo.ads.a.a.c
    public final void a() {
        p005e.a.f(new StringBuilder("Chrome tabs shown: "), 0, this.f, 3, "ChromeTabStatSession");
        a(1);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "ChromeTabStatSession", "Chrome tabs page started: " + this.f);
        this.d = SystemClock.elapsedRealtime();
        this.j = this.j + 1;
        if (this.o.compareAndSet(true, false)) {
            a(4);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void c() {
        this.k = true;
        p005e.a.f(new StringBuilder("Chrome tabs page aborted: "), 0, this.f, 3, "ChromeTabStatSession");
    }

    @Override // sg.bigo.ads.a.a.c
    public final void d() {
        p005e.a.f(new StringBuilder("Chrome tabs page failed: "), 0, this.f, 3, "ChromeTabStatSession");
        if (this.q) {
            return;
        }
        a(6);
    }

    @Override // sg.bigo.ads.a.a.c
    public final void e() {
        p005e.a.f(new StringBuilder("Chrome tabs page finished: "), 0, this.f, 3, "ChromeTabStatSession");
        this.q = true;
        if (this.f48197p.compareAndSet(true, false)) {
            a(5);
        }
    }

    @Override // sg.bigo.ads.a.a.c
    public final void f() {
        p005e.a.f(new StringBuilder("Chrome tabs hidden: "), 0, this.f, 3, "ChromeTabStatSession");
        sg.bigo.ads.core.d.b.a(this, this.f48196n.isEmpty() ? null : this.f48196n.get(0), System.currentTimeMillis() - this.m, this.j, this.g, this.f48193h, (String) null);
    }

    @Override // sg.bigo.ads.api.b.f
    public final int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.f
    public final String i() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int j() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int k() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int l() {
        return this.q ? 100 : 0;
    }

    @Override // sg.bigo.ads.api.b.f
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f48194i;
        return aVar != null && aVar.d;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int n() {
        return this.f48195l;
    }

    @Override // sg.bigo.ads.api.b.f
    public final int o() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b.f
    public final Map<String, String> p() {
        if (!this.k && TextUtils.isEmpty(this.f48189a) && TextUtils.isEmpty(this.f48191c) && TextUtils.isEmpty(this.f48190b)) {
            return null;
        }
        HashMap map = new HashMap();
        if (this.k) {
            map.put("tab_aborted", "1");
        }
        if (!TextUtils.isEmpty(this.f48189a)) {
            map.put("chrome_pkg", this.f48189a);
        }
        if (!TextUtils.isEmpty(this.f48191c)) {
            map.put("is_chrome_def", TextUtils.equals(this.f48189a, this.f48191c) ? "1" : "0");
        }
        if (!TextUtils.isEmpty(this.f48190b)) {
            map.put("chrome_ver", this.f48190b);
        }
        return map;
    }

    private void a(int i2) {
        a aVar = new a(i2, this.m, (byte) 0);
        this.f48196n.add(0, aVar);
        sg.bigo.ads.core.d.b.a(this, aVar, this.g, this.f48193h, (String) null);
    }
}
