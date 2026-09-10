package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends sg.bigo.ads.controller.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.g f48102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final sg.bigo.ads.controller.b.d f48103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.controller.b.h f48104c;
    int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Context f48106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.controller.a.b f48107i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f48108l;
    long d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f48105e = false;
    private final List<b> j = new ArrayList();
    private final AtomicReference<sg.bigo.ads.controller.g.h> k = new AtomicReference<>();
    final AtomicInteger f = new AtomicInteger(0);

    public interface a {
        void a(int i2);

        void a(int i2, int i3, String str);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f48117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f48118c;
        private final sg.bigo.ads.controller.b.d d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sg.bigo.ads.controller.b.h f48119e;
        private final sg.bigo.ads.controller.a.b f;
        private final e g;

        public b(String str, a aVar, sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.controller.b.h hVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar, e eVar) {
            this.f48116a = str;
            this.f48117b = aVar;
            this.f48118c = gVar;
            this.d = dVar;
            this.f48119e = hVar;
            this.f = bVar;
            this.g = eVar;
            if (c.a().f48091b.compareAndSet(-1, 0)) {
                sg.bigo.ads.common.t.a.a(0, 3, "ConfigInitProcessor", "reinit config and set status.");
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i2) {
            c.a().b();
            a aVar = this.f48117b;
            if (aVar != null) {
                aVar.a(i2);
            }
            if (i.f46986a.x()) {
                sg.bigo.ads.controller.a.b.d.a.f47847a.a(this.f, this.f48118c, this.d, this.f48119e, this.g);
            }
        }

        @Override // sg.bigo.ads.controller.e.e.a
        public final void a(int i2, int i3, String str) {
            c cVarA = c.a();
            String str2 = this.f48116a;
            if (1101 == i3 || 1105 == i3) {
                Map concurrentHashMap = cVarA.f48090a;
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                    cVarA.f48090a = concurrentHashMap;
                }
                if (str2 != null && c.a(concurrentHashMap, str2)) {
                    concurrentHashMap.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                if (cVarA.f48091b.compareAndSet(0, -1)) {
                    sg.bigo.ads.common.t.a.a(0, "ConfigInitProcessor", "Failed to init config and set status.");
                }
            }
            a aVar = this.f48117b;
            if (aVar != null) {
                aVar.a(i2, i3, str);
            }
        }
    }

    public e(Context context, sg.bigo.ads.controller.b.d dVar, sg.bigo.ads.controller.b.h hVar, sg.bigo.ads.common.g gVar, sg.bigo.ads.controller.a.b bVar) {
        this.f48106h = context;
        this.f48102a = gVar;
        this.f48103b = dVar;
        this.f48104c = hVar;
        this.f48107i = bVar;
    }

    private void a(int i2, int i3) {
        if (this.k.get() != null) {
            return;
        }
        this.k.set(new sg.bigo.ads.controller.g.h(this.f48102a, this.f48107i, sg.bigo.ads.controller.b.e.E(), this));
        this.g = i2;
        this.d = SystemClock.elapsedRealtime();
        this.f48105e = sg.bigo.ads.common.f.b.d();
        this.f.incrementAndGet();
        this.f48108l = i3;
        String strA = this.f48102a.a();
        if (q.a((CharSequence) strA)) {
            b(1100, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (c.a().a(strA)) {
            this.k.get().b();
        } else {
            b(1101, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    public final void b(int i2, String str) {
        this.k.set(null);
        if (this.j.isEmpty()) {
            return;
        }
        this.j.remove(0).a(this.f48108l, i2, str);
        if (this.j.isEmpty()) {
            return;
        }
        a(this.g, this.f48108l);
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(final int i2, final int i3, final int i4, final String str, Object obj) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                int i5;
                sg.bigo.ads.common.t.a.a(0, "GlobalConfig", "request error, seq=" + i2 + ", error=" + i3 + ", message=" + str);
                StringBuilder sb = new StringBuilder("Error from server: ");
                sb.append(str);
                String string = sb.toString();
                if (i4 == -9) {
                    eVar = e.this;
                    i5 = 1105;
                } else {
                    eVar = e.this;
                    i5 = 1104;
                }
                eVar.b(i5, string);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                e eVar2 = e.this;
                long j = jElapsedRealtime - eVar2.d;
                int i6 = i3;
                int i7 = i4;
                String str2 = str;
                int i8 = eVar2.g;
                boolean z2 = eVar2.f48105e;
                int i9 = eVar2.f.get();
                sg.bigo.ads.common.g gVar = e.this.f48102a;
                sg.bigo.ads.core.d.b.a(j, i6, i7, str2, i8, z2, i9, gVar == null ? null : gVar.X());
            }
        });
    }

    @Override // sg.bigo.ads.controller.b
    public final void a(int i2, String str) {
        a(i2, str, false);
    }

    public final void a(final int i2, final String str, final boolean z2) {
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.controller.e.e.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("request success, seq=");
                sb.append(i2);
                sb.append(", result=");
                int andSet = 0;
                p005e.a.f(sb, 0, str, 3, "GlobalConfig");
                e eVar = e.this;
                int i3 = eVar.g;
                if (z2) {
                    i3 = 2;
                }
                int i4 = i3;
                try {
                    boolean zN = eVar.f48103b.N();
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("global");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("slots");
                    if (jSONObjectOptJSONObject != null && jSONArrayOptJSONArray != null) {
                        e.this.f48103b.e(jSONObjectOptJSONObject);
                        e eVar2 = e.this;
                        eVar2.f48103b.c(eVar2.f48106h);
                        e.this.f48104c.a(jSONArrayOptJSONArray);
                        e eVar3 = e.this;
                        eVar3.f48104c.c(eVar3.f48106h);
                        sg.bigo.ads.a aVarA = BigoAdSdk.a(e.this.f48106h);
                        aVarA.f45338a = e.this.f48102a.a();
                        aVarA.c(e.this.f48106h);
                        if (!z2) {
                            e.a(e.this);
                            andSet = e.this.f.getAndSet(0);
                        }
                        int i5 = andSet;
                        long jI = e.this.f48103b.i();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        e eVar4 = e.this;
                        long j = jElapsedRealtime - eVar4.d;
                        boolean z3 = eVar4.f48105e;
                        sg.bigo.ads.common.g gVar = eVar4.f48102a;
                        sg.bigo.ads.core.d.b.a(jI, j, zN, i4, z3, i5, gVar == null ? null : gVar.X());
                        h.a().a(e.this.f48103b.J());
                        return;
                    }
                    if (!z2) {
                        e.this.b(1102, "Missing `global` or `slots` params.");
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    e eVar5 = e.this;
                    long j2 = jElapsedRealtime2 - eVar5.d;
                    boolean z4 = eVar5.f48105e;
                    int i6 = eVar5.f.get();
                    sg.bigo.ads.common.g gVar2 = e.this.f48102a;
                    sg.bigo.ads.core.d.b.a(j2, 1102, 10002, "Missing `global` or `slots` params.", i4, z4, i6, gVar2 == null ? null : gVar2.X());
                } catch (JSONException unused) {
                    if (!z2) {
                        e.this.b(1103, "Failed to parse global config.");
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    e eVar6 = e.this;
                    long j3 = jElapsedRealtime3 - eVar6.d;
                    boolean z5 = eVar6.f48105e;
                    int i7 = eVar6.f.get();
                    sg.bigo.ads.common.g gVar3 = e.this.f48102a;
                    sg.bigo.ads.core.d.b.a(j3, 1103, 10002, "Failed to parse global config.", i4, z5, i7, gVar3 != null ? gVar3.X() : null);
                }
            }
        });
    }

    public final void a(a aVar, int i2) {
        b bVar = new b(this.f48102a.a(), aVar, this.f48103b, this.f48104c, this.f48102a, this.f48107i, this);
        int iC = this.f48103b.C();
        if (iC != 2) {
            if (iC == 3) {
                this.j.add(bVar);
            } else if (iC == 4) {
                bVar.a(iC);
            } else if (iC != 5) {
                return;
            }
            a(i2, iC);
            return;
        }
        bVar.a(iC);
    }

    public static /* synthetic */ void a(e eVar) {
        eVar.k.set(null);
        Iterator<b> it = eVar.j.iterator();
        while (it.hasNext()) {
            it.next().a(eVar.f48108l);
        }
        eVar.j.clear();
    }
}
