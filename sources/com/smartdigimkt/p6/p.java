package com.smartdigimkt.p6;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class p {
    private static volatile p g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37728e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f37725a = "p";
    private volatile boolean d = false;
    private long f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.u6.n f37726b = com.smartdigimkt.u6.n.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Integer> f37727c = new HashMap();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.d = true;
                new ArrayList();
                p pVar = p.this;
                pVar.f = pVar.f37726b.c();
                p pVar2 = p.this;
                String str = pVar2.f37725a;
                long unused = pVar2.f;
                long unused2 = p.this.f37728e;
                long unused3 = p.this.f;
                long unused4 = p.this.f37728e;
                if (p.this.f > p.this.f37728e) {
                    List<o> listD = p.this.f37726b.d();
                    String str2 = p.this.f37725a;
                    listD.size();
                    for (o oVar : listD) {
                        try {
                            File file = new File(oVar.e());
                            if (file.exists()) {
                                file.delete();
                            }
                        } catch (Throwable unused5) {
                        }
                        try {
                            if (!TextUtils.isEmpty(oVar.f())) {
                                String strF = oVar.f();
                                p.this.f37727c.remove(strF);
                                com.smartdigimkt.g7.c.a().c(strF);
                            }
                        } catch (Throwable unused6) {
                        }
                    }
                    String str3 = p.this.f37725a;
                }
            } catch (Throwable unused7) {
            }
            p.this.d = false;
        }
    }

    public class b implements Runnable {
        final /* synthetic */ o X;

        public b(o oVar) {
            this.X = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                File file = new File(this.X.e());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable unused) {
            }
            p.this.f37726b.d(this.X.f());
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37730Y;
        final /* synthetic */ long Z;
        final /* synthetic */ long e0;
        final /* synthetic */ int f0;

        public c(String str, String str2, long j, long j2, int i2) {
            this.X = str;
            this.f37730Y = str2;
            this.Z = j;
            this.e0 = j2;
            this.f0 = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.f37726b.a(this.X, this.f37730Y, this.Z, this.e0, this.f0);
        }
    }

    private p() {
        this.f37728e = 209715200L;
        this.f37728e = com.smartdigimkt.d7.d.c().a(4);
    }

    public void e() {
        this.f37728e = com.smartdigimkt.d7.d.c().a(4);
    }

    public static p c() {
        if (g == null) {
            synchronized (p.class) {
                try {
                    if (g == null) {
                        g = new p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public o b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f37726b.a(str);
    }

    public long d() {
        return this.f37728e;
    }

    public void a() {
        if (this.d) {
            return;
        }
        com.smartdigimkt.l7.b.a().a((Runnable) new a(), 13, true);
    }

    public long b() {
        return this.f;
    }

    private void a(o oVar) {
        if (oVar == null) {
            return;
        }
        com.smartdigimkt.l7.b.a().a((Runnable) new b(oVar), 2, true);
    }

    public void a(String str, String str2, long j, long j2, int i2, boolean z2) {
        this.f37727c.put(str, Integer.valueOf(i2));
        if (z2) {
            a(str, str2, j, j2, i2);
        }
    }

    public void a(String str, String str2, long j, long j2, int i2) {
        com.smartdigimkt.l7.b.a().b((Runnable) new c(str, str2, j, j2, i2), 13);
    }

    public synchronized boolean a(String str, int i2) {
        return a(str) >= i2;
    }

    public synchronized int a(String str) {
        if (this.f37727c.containsKey(str) && this.f37727c.get(str) != null) {
            return this.f37727c.get(str).intValue();
        }
        o oVarA = this.f37726b.a(str);
        if (oVarA == null || oVarA.c() <= 0) {
            return 0;
        }
        File file = new File(oVarA.e());
        if (file.exists() && file.length() >= oVarA.a()) {
            this.f37727c.put(str, Integer.valueOf(oVarA.c()));
            this.f37726b.e(str);
            return oVarA.c();
        }
        a(oVarA);
        return 0;
    }
}
