package com.smartdigimkt.i7;

import com.smartdigimkt.b8.o;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.u6.i;
import com.thinkup.core.oo.m0;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile h f35885c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35886a = com.smartdigimkt.m3.h.f36614b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AtomicInteger f35887b = new AtomicInteger(0);

    public class a implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f35888Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;
        final /* synthetic */ String f0;

        public a(int i2, String str, String str2, String str3, String str4) {
            this.X = i2;
            this.f35888Y = str;
            this.Z = str2;
            this.e0 = str3;
            this.f0 = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.a7.d dVar = new com.smartdigimkt.a7.d();
            dVar.f33780b = this.X;
            dVar.d = this.f35888Y;
            dVar.f33781c = this.Z;
            dVar.f33782e = this.e0;
            dVar.f = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35888Y);
            sb.append(dVar.f);
            sb.append(this.e0);
            dVar.f33779a = com.smartdigimkt.n8.e.b(sb.toString() != null ? this.e0 : "");
            dVar.g = this.f0;
            String unused = h.this.f35886a;
            dVar.a();
            i.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).b(dVar);
        }
    }

    private h() {
    }

    public synchronized void b() {
        List<com.smartdigimkt.a7.d> listA;
        int iOptInt;
        if (this.f35887b.get() <= 0 && (listA = i.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).a(10)) != null && listA.size() > 0) {
            this.f35887b.set(listA.size());
            this.f35887b.get();
            for (com.smartdigimkt.a7.d dVar : listA) {
                if (System.currentTimeMillis() - dVar.f >= m0.om) {
                    this.f35887b.decrementAndGet();
                    i.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).a(dVar);
                } else {
                    try {
                        iOptInt = new JSONObject(dVar.g).optInt("business_type");
                    } catch (Throwable unused) {
                        iOptInt = 1000;
                    }
                    if (dVar.f33780b == 3) {
                        new com.smartdigimkt.d8.b(dVar.f33782e, iOptInt).a(new b(dVar));
                    } else {
                        new o(dVar, iOptInt != 1001).a(0, (com.smartdigimkt.w7.c) new c(dVar));
                    }
                }
            }
        }
    }

    public static h a() {
        if (f35885c == null) {
            synchronized (h.class) {
                try {
                    if (f35885c == null) {
                        f35885c = new h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35885c;
    }

    public class b implements com.smartdigimkt.d8.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a7.d f35889a;

        public b(com.smartdigimkt.a7.d dVar) {
            this.f35889a = dVar;
        }

        @Override // com.smartdigimkt.d8.c.a
        public void a(Object obj) {
            String unused = h.this.f35886a;
            this.f35889a.a();
            i.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).a(this.f35889a);
            h.this.f35887b.decrementAndGet();
        }

        @Override // com.smartdigimkt.d8.c.a
        public void a(Throwable th) {
            String unused = h.this.f35886a;
            this.f35889a.a();
            th.getMessage();
            h.this.f35887b.decrementAndGet();
        }
    }

    public class c implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a7.d f35891a;

        public c(com.smartdigimkt.a7.d dVar) {
            this.f35891a = dVar;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            String unused = h.this.f35886a;
            this.f35891a.a();
            i.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k())).a(this.f35891a);
            h.this.f35887b.decrementAndGet();
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            String unused = h.this.f35886a;
            this.f35891a.a();
            h.this.f35887b.decrementAndGet();
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            h.this.f35887b.decrementAndGet();
        }
    }

    public void a(int i2, String str, String str2, String str3, String str4) {
        com.smartdigimkt.l7.b.a().b((Runnable) new a(i2, str, str2, str3, str4), 16);
    }
}
