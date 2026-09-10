package com.smartdigimkt.p6;

import android.text.TextUtils;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f {
    private static volatile f f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.u6.a f37692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, h> f37693c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37691a = f.class.getName();
    long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f37694e = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.f37694e) {
                try {
                    f.this.b();
                    List<g> listE = f.this.f37692b.e();
                    if (listE != null) {
                        for (int i2 = 0; i2 < listE.size(); i2++) {
                            g gVar = listE.get(i2);
                            String strD = gVar.d();
                            if (!TextUtils.isEmpty(strD)) {
                                h hVar = (h) f.this.f37693c.get(strD);
                                if (hVar == null) {
                                    hVar = new h();
                                    f.this.f37693c.put(strD, hVar);
                                }
                                hVar.a(gVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f37695Y;

        public b(String str, com.smartdigimkt.w6.f fVar) {
            this.X = str;
            this.f37695Y = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            String str = fVar.f37691a;
            synchronized (fVar.f37694e) {
                try {
                    f.this.a();
                    h hVar = (h) f.this.f37693c.get(this.X);
                    if (hVar == null) {
                        hVar = new h();
                        f.this.f37693c.put(this.X, hVar);
                    }
                    hVar.b(((com.smartdigimkt.w6.d) this.f37695Y).I0());
                } catch (Throwable th) {
                    throw th;
                }
            }
            f.this.a(4, this.X, this.f37695Y);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f37696Y;

        public c(String str, com.smartdigimkt.w6.f fVar) {
            this.X = str;
            this.f37696Y = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.f37694e) {
                try {
                    f fVar = f.this;
                    String str = fVar.f37691a;
                    fVar.a();
                    h hVar = (h) f.this.f37693c.get(this.X);
                    if (hVar == null) {
                        hVar = new h();
                        f.this.f37693c.put(this.X, hVar);
                    }
                    com.smartdigimkt.w6.f fVar2 = this.f37696Y;
                    if (fVar2 instanceof com.smartdigimkt.w6.d) {
                        hVar.a(((com.smartdigimkt.w6.d) fVar2).I0());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            f.this.a(6, this.X, this.f37696Y);
        }
    }

    private f() {
        if (com.smartdigimkt.m6.b.p().k() != null) {
            this.f37692b = com.smartdigimkt.u6.a.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
            this.f37693c = new ConcurrentHashMap();
            f();
        }
    }

    private long d() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private void f() {
        this.d = d();
        com.smartdigimkt.l7.b.a().g(new a());
    }

    public void e() {
    }

    public static f c() {
        if (f == null) {
            synchronized (f.class) {
                try {
                    if (f == null) {
                        f = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void b(String str, com.smartdigimkt.w6.f fVar) {
        com.smartdigimkt.l7.b.a().g(new b(str, fVar));
    }

    public void a(String str, com.smartdigimkt.w6.f fVar) {
        com.smartdigimkt.l7.b.a().g(new c(str, fVar));
    }

    public void b() {
        this.f37692b.c();
    }

    public void a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        synchronized (this.f37694e) {
            try {
                a();
                h hVar = this.f37693c.get(str);
                if (hVar != null) {
                    hVar.a(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, com.smartdigimkt.w6.f fVar) {
        if (TextUtils.isEmpty(str) || !(fVar instanceof com.smartdigimkt.w6.d)) {
            return;
        }
        g gVar = new g();
        gVar.d(str);
        gVar.a(((com.smartdigimkt.w6.d) fVar).I0());
        gVar.c(fVar.L());
        gVar.a(i2);
        gVar.b("");
        this.f37692b.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        long jD = d();
        if (this.d != jD) {
            this.f37693c.clear();
            this.d = jD;
        }
    }
}
