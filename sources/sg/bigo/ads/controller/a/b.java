package sg.bigo.ads.controller.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.controller.a.a f47798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.g f47799b;
    public sg.bigo.ads.controller.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final sg.bigo.ads.api.a.h f47802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f47803i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicBoolean f47800c = new AtomicBoolean(false);
    final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicBoolean f47801e = new AtomicBoolean(false);
    final AtomicBoolean f = new AtomicBoolean(false);
    private final g k = new g() { // from class: sg.bigo.ads.controller.a.b.1
        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str) {
            b.this.f47798a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], reSave config, fromUrlPath=".concat(String.valueOf(str)));
        }

        @Override // sg.bigo.ads.controller.a.g
        public final void a(String str, boolean z2) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchConfig, country=" + str + ", fromSDKConfigUrl=" + z2);
            if (!z2) {
                b.a(b.this, (sg.bigo.ads.controller.g.k.a) null);
            }
            b.a(b.this, str, true);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f47804l = new Runnable() { // from class: sg.bigo.ads.controller.a.b.2
        @Override // java.lang.Runnable
        public final void run() {
            if (b.a(b.this, new sg.bigo.ads.controller.g.k.a() { // from class: sg.bigo.ads.controller.a.b.2.1
                @Override // sg.bigo.ads.controller.g.k.a
                public final void a(String str, int i2, int i3, int i4, String str2, Map<String, Object> map) {
                    b bVar = b.this;
                    b.a(bVar, bVar.f47799b.v(), false);
                }

                @Override // sg.bigo.ads.controller.g.k.a
                public final void a(String str, int i2, String str2, Map<String, Object> map) {
                }
            })) {
                return;
            }
            b bVar = b.this;
            b.a(bVar, bVar.f47799b.v(), false);
        }
    };
    private final Map<String, String> j = new ConcurrentHashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f47827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f47829c;

        private a(k kVar, String str, long j) {
            this.f47827a = kVar;
            this.f47828b = str;
            this.f47829c = j;
        }

        public /* synthetic */ a(k kVar, String str, long j, byte b2) {
            this(kVar, str, j);
        }
    }

    public b(Context context, sg.bigo.ads.common.g gVar, sg.bigo.ads.api.a.h hVar) {
        this.f47803i = context;
        this.f47798a = new sg.bigo.ads.controller.a.a(context, hVar);
        this.f47799b = gVar;
        this.f47802h = hVar;
    }

    public final h a(String str, String str2, long j, boolean z2) {
        String str3 = str2;
        h hVarA = this.f47798a.a(str, str3, this.j, this.f47799b.v(), this.f47802h.s());
        long jElapsedRealtime = j <= 0 ? 0L : SystemClock.elapsedRealtime() - j;
        if (hVarA.f47865b) {
            this.f47798a.a(0L);
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], update host config, configSource=" + str3 + ", result=" + hVarA);
            if (z2) {
                sg.bigo.ads.core.d.b.a(jElapsedRealtime, hVarA.f47866c, str3, true);
            }
        } else {
            long j2 = jElapsedRealtime;
            int i2 = hVarA.d;
            if (i2 == 0) {
                if (z2) {
                    sg.bigo.ads.core.d.b.a(j2, hVarA.f47866c, str3, false);
                }
            } else if (z2) {
                sg.bigo.ads.core.d.b.a(j2, hVarA.f47866c, str3, i2, hVarA.f47867e);
                str3 = str3;
            }
        }
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "updateHostConfig, configSource=" + str3 + ", update result=" + hVarA);
        return hVarA;
    }

    public final f b(String str, String str2) {
        f.a aVar = new f.a(this.f47798a, this.f47799b, this.f47802h, str, str2);
        aVar.a(this.k);
        return aVar;
    }

    public final void a(long j, String str) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "fetchAntiBanConfig, delayMillis=" + j + ", from=" + str);
        sg.bigo.ads.common.n.d.a(this.f47804l);
        sg.bigo.ads.common.n.d.a(1, this.f47804l, Math.max(j, 0L));
    }

    public final void a(String str, String str2) {
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", android.support.v4.media.a.o("addExtraHost, country=", str, ", host=", str2));
        if (d.a(str2)) {
            if (q.a((CharSequence) str)) {
                str = "all";
            }
            this.j.put(str, str2);
            if (this.f47798a.a(str, str2)) {
                this.f47798a.a(10L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "saveAsync, addExtraHost, delayMillis=10");
            }
        }
    }

    public final void a(final String str, final sg.bigo.ads.controller.a.a.g gVar, final ValueCallback<a> valueCallback, final ValueCallback<String> valueCallback2) {
        final k kVarA = gVar.a(str);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync] fetch svr config, country=" + str + ", url=" + kVarA);
        this.f47798a.a(0L);
        if (kVarA == null) {
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue("not available url.");
            }
        } else {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(kVarA.f47872a), this.f47803i);
            aVar.k = sg.bigo.ads.common.u.a.e.b();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            sg.bigo.ads.common.u.g.a(aVar, new sg.bigo.ads.common.u.b<sg.bigo.ads.common.u.b.a, sg.bigo.ads.common.u.c.d>() { // from class: sg.bigo.ads.controller.a.b.9
                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ sg.bigo.ads.common.u.c.c a(sg.bigo.ads.common.u.c.a aVar2) {
                    return new sg.bigo.ads.common.u.c.d(aVar2);
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.c.c cVar2) {
                    p005e.a.f(new StringBuilder("[net disk] succeed to fetch net disk url: "), 0, kVarA.f47872a, 3, "AntiBan");
                    String strA = ((sg.bigo.ads.common.u.c.d) cVar2).a();
                    if (valueCallback != null) {
                        valueCallback.onReceiveValue(new a(kVarA, strA, jElapsedRealtime, (byte) 0));
                    }
                }

                @Override // sg.bigo.ads.common.u.b
                public final /* synthetic */ void a(sg.bigo.ads.common.u.b.c cVar, sg.bigo.ads.common.u.h hVar) {
                    sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] try another net disk url due to failed to fetch net disk url: " + kVarA.f47872a);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, kVarA.f47872a, 4000, "NetError:" + hVar.f47491a + ", " + hVar.getMessage());
                    b.this.a(str, gVar, valueCallback, valueCallback2);
                }
            });
        }
    }

    public final boolean a(String str, final ValueCallback<a> valueCallback, ValueCallback<String> valueCallback2) {
        final sg.bigo.ads.controller.a.a.e eVar = this.f47798a.k;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch free svr config, canFetch=" + eVar.a());
        if (!eVar.a()) {
            this.f.set(false);
            return false;
        }
        eVar.b();
        a(str, eVar, new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.8
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                eVar.a(true);
                b.this.f47798a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] [saveAsync], fetch third free svr config, onSuccess");
                valueCallback.onReceiveValue(aVar);
            }
        }, valueCallback2);
        return true;
    }

    public static /* synthetic */ boolean a(b bVar, final String str, boolean z2) {
        bVar.f47801e.compareAndSet(false, z2);
        if (!bVar.d.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config return because is fetching, fetch free svr config after fail -> ".concat(String.valueOf(z2)));
            return false;
        }
        sg.bigo.ads.controller.a.a.f fVar = bVar.f47798a.j;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] fetch pay svr config, canFetch=" + fVar.a() + ", fetch free svr config after fail -> " + z2);
        final ValueCallback<a> valueCallback = new ValueCallback<a>() { // from class: sg.bigo.ads.controller.a.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(a aVar) {
                k kVar;
                a aVar2 = aVar;
                b.this.d.set(false);
                b.this.f47801e.set(false);
                b.this.f.set(false);
                if (aVar2 == null || (kVar = aVar2.f47827a) == null) {
                    return;
                }
                b.this.a(aVar2.f47828b, kVar.f47872a, aVar2.f47829c, true);
            }
        };
        final ValueCallback<String> valueCallback2 = new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.6
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all svr urls are fail");
                b.this.f47801e.set(false);
                b.this.f.set(false);
            }
        };
        if (fVar.a()) {
            fVar.b();
            bVar.a(str, fVar, valueCallback, new ValueCallback<String>() { // from class: sg.bigo.ads.controller.a.b.7
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    b.this.d.set(false);
                    if (b.this.f47801e.compareAndSet(true, false) && b.this.f.compareAndSet(false, true)) {
                        b.this.a(str, valueCallback, valueCallback2);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[net disk] all pay svr urls are fail");
                    }
                }
            });
            return true;
        }
        if (bVar.f47801e.compareAndSet(true, false) && bVar.f.compareAndSet(false, true)) {
            bVar.a(str, valueCallback, valueCallback2);
        }
        bVar.d.set(false);
        return false;
    }

    public static /* synthetic */ boolean a(b bVar, final sg.bigo.ads.controller.g.k.a aVar) {
        final sg.bigo.ads.controller.a.a.c cVar = bVar.f47798a.g;
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config, canFetch=" + cVar.a() + ", ignoreFetchInterval=false");
        if (!bVar.f47800c.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[sdk config] fetch sdk config return because it is fetching.");
            return false;
        }
        if (!cVar.a()) {
            bVar.f47800c.set(false);
            return false;
        }
        cVar.g = System.currentTimeMillis();
        bVar.f47798a.a(0L);
        sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config");
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        new sg.bigo.ads.controller.g.k(bVar.f47799b, bVar, new sg.bigo.ads.controller.g.k.a() { // from class: sg.bigo.ads.controller.a.b.4
            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str, int i2, int i3, int i4, String str2, Map<String, Object> map) {
                int i5;
                int i6;
                String str3;
                b.this.f47800c.set(false);
                if (TextUtils.isEmpty(l.a(map, "host_cfg"))) {
                    long jElapsedRealtime2 = jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L;
                    i5 = i3;
                    i6 = i4;
                    StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(i5, i6, "code=", ",subCode=", ",message=");
                    str3 = str2;
                    sbP.append(str3);
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime2, false, str, 4001, sbP.toString());
                } else {
                    i5 = i3;
                    i6 = i4;
                    str3 = str2;
                }
                sg.bigo.ads.controller.g.k.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str, i2, i5, i6, str3, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.g;
                if (bVar2 != null) {
                    bVar2.a(i2, i3, i4, str2, map);
                }
            }

            @Override // sg.bigo.ads.controller.g.k.a
            public final void a(String str, int i2, String str2, Map<String, Object> map) {
                String str3;
                b.this.f47800c.set(false);
                cVar.f47770h = System.currentTimeMillis();
                b.this.f47798a.a(0L);
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[saveAsync], fetch sdk config, on sdk config fetch success");
                if (TextUtils.isEmpty(l.a(map, "host_cfg"))) {
                    str3 = str;
                    sg.bigo.ads.core.d.b.a(jElapsedRealtime > 0 ? SystemClock.elapsedRealtime() - jElapsedRealtime : 0L, false, str3, 4002, "host_cfg is empty.");
                } else {
                    str3 = str;
                }
                sg.bigo.ads.controller.g.k.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(str3, i2, str2, map);
                }
                sg.bigo.ads.controller.b bVar2 = b.this.g;
                if (bVar2 != null) {
                    bVar2.a(i2, str2);
                }
            }
        }).b();
        return true;
    }
}
