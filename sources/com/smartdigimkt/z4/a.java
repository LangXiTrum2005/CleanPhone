package com.smartdigimkt.z4;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.m3.j;
import com.smartdigimkt.p6.m;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.l;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    private static volatile a d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f40365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, Boolean> f40366b = new ConcurrentHashMap<>(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ConcurrentHashMap<String, com.smartdigimkt.c5.b> f40367c = new ConcurrentHashMap<>(2);

    /* JADX INFO: renamed from: com.smartdigimkt.z4.a$a, reason: collision with other inner class name */
    public class RunnableC0652a implements Runnable {
        final /* synthetic */ com.smartdigimkt.v6.a X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y6.b f40368Y;
        final /* synthetic */ com.smartdigimkt.y4.d Z;
        final /* synthetic */ g e0;

        public RunnableC0652a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.y6.b bVar, com.smartdigimkt.y4.d dVar, g gVar) {
            this.X = aVar;
            this.f40368Y = bVar;
            this.Z = dVar;
            this.e0 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b(this.X, this.f40368Y, this.Z, this.e0);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ l X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f40372Y;
        final /* synthetic */ com.smartdigimkt.y4.d Z;
        final /* synthetic */ g e0;

        /* JADX INFO: renamed from: com.smartdigimkt.z4.a$c$a, reason: collision with other inner class name */
        public class C0653a implements com.smartdigimkt.c6.d.e {
            public C0653a() {
            }

            @Override // com.smartdigimkt.c6.d.e
            public void a(String str, String str2) {
            }

            @Override // com.smartdigimkt.c6.d.e
            public void a(com.smartdigimkt.w6.d dVar) {
                g gVar = c.this.e0;
                if (gVar != null) {
                    gVar.a(dVar, (com.smartdigimkt.a5.d) null);
                }
            }
        }

        public c(l lVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.y4.d dVar, g gVar) {
            this.X = lVar;
            this.f40372Y = aVar;
            this.Z = dVar;
            this.e0 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = this.X;
            if (lVar == null || !(lVar instanceof com.smartdigimkt.w6.d)) {
                return;
            }
            if (!TextUtils.isEmpty(((com.smartdigimkt.w6.d) lVar).W0())) {
                if (com.smartdigimkt.c5.a.b()) {
                    com.smartdigimkt.c5.a.a().initExpressSDK((com.smartdigimkt.w6.d) this.X);
                    a.this.a((com.smartdigimkt.w6.d) this.X, this.f40372Y, this.Z, this.e0, true);
                    return;
                }
                return;
            }
            if (this.X.a0() != 2 || this.X.x0()) {
                return;
            }
            String strB = com.smartdigimkt.p6.b.b().b(a.this.f40365a, this.f40372Y.f39168i);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            new com.smartdigimkt.c6.d(a.this.f40365a, (com.smartdigimkt.w6.d) this.X, this.f40372Y).a(new C0653a(), strB);
        }
    }

    public class d implements com.smartdigimkt.c6.d.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f40374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f40375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.d f40376c;

        public d(com.smartdigimkt.v6.a aVar, g gVar, com.smartdigimkt.w6.d dVar) {
            this.f40374a = aVar;
            this.f40375b = gVar;
            this.f40376c = dVar;
        }

        @Override // com.smartdigimkt.c6.d.e
        public void a(com.smartdigimkt.w6.d dVar) {
            a.this.a(dVar, this.f40374a, this.f40375b);
        }

        @Override // com.smartdigimkt.c6.d.e
        public void a(String str, String str2) {
            this.f40375b.a(this.f40376c, i.a("30006", androidx.datastore.preferences.protobuf.a.n(d9.i.d, str, ",", str2, d9.i.f24752e)));
        }
    }

    public interface g {
        void a(com.smartdigimkt.a5.d dVar);

        void a(com.smartdigimkt.w6.d dVar);

        void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.a5.d dVar2);

        void a(com.smartdigimkt.w6.d dVar, h hVar);
    }

    private a(Context context) {
        this.f40365a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.v6.a aVar, com.smartdigimkt.y6.b bVar, com.smartdigimkt.y4.d dVar, g gVar) {
        com.smartdigimkt.w6.d dVarA;
        if (bVar != null) {
            try {
                dVarA = a(aVar, bVar);
            } catch (Throwable unused) {
                dVarA = null;
            }
        } else {
            dVarA = null;
        }
        if (dVarA == null) {
            try {
                dVarA = a(aVar);
            } catch (Throwable unused2) {
            }
        }
        com.smartdigimkt.w6.d dVar2 = dVarA;
        if (dVar2 == null) {
            new com.smartdigimkt.b8.b(aVar).a(0, (com.smartdigimkt.w7.c) new b(aVar, gVar, dVar));
        } else {
            a(dVar2, aVar, dVar, gVar, false);
        }
    }

    public class e implements com.smartdigimkt.c5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f40377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f40378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.d f40379c;

        public e(g gVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.d dVar) {
            this.f40377a = gVar;
            this.f40378b = aVar;
            this.f40379c = dVar;
        }

        @Override // com.smartdigimkt.c5.c
        public void a(com.smartdigimkt.c5.b bVar) {
            g gVar = this.f40377a;
            if (gVar != null) {
                gVar.a(bVar);
            }
        }

        @Override // com.smartdigimkt.c5.c
        public void b(com.smartdigimkt.c5.b bVar) {
            a.this.f40366b.put(this.f40378b.f39163a + this.f40378b.f39168i, Boolean.FALSE);
            g gVar = this.f40377a;
            if (gVar != null) {
                gVar.a(this.f40379c, bVar);
            }
        }

        @Override // com.smartdigimkt.c5.c
        public void a(h hVar) {
            a.this.f40366b.put(this.f40378b.f39163a + this.f40378b.f39168i, Boolean.FALSE);
            g gVar = this.f40377a;
            if (gVar != null) {
                gVar.a(this.f40379c, hVar);
            }
        }
    }

    public class f implements com.smartdigimkt.r3.c.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f40380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f40381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.d f40382c;

        public f(com.smartdigimkt.v6.a aVar, g gVar, com.smartdigimkt.w6.d dVar) {
            this.f40380a = aVar;
            this.f40381b = gVar;
            this.f40382c = dVar;
        }

        @Override // com.smartdigimkt.r3.c.h
        public void a() {
            a.this.f40366b.put(this.f40380a.f39163a + this.f40380a.f39168i, Boolean.FALSE);
            g gVar = this.f40381b;
            if (gVar != null) {
                gVar.a(this.f40382c, (com.smartdigimkt.a5.d) null);
            }
        }

        @Override // com.smartdigimkt.r3.c.h
        public void a(h hVar) {
            a.this.f40366b.put(this.f40380a.f39163a + this.f40380a.f39168i, Boolean.FALSE);
            g gVar = this.f40381b;
            if (gVar != null) {
                gVar.a(this.f40382c, hVar);
            }
        }
    }

    public static a a(Context context) {
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public class b implements com.smartdigimkt.w7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f40369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f40370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y4.d f40371c;

        public b(com.smartdigimkt.v6.a aVar, g gVar, com.smartdigimkt.y4.d dVar) {
            this.f40369a = aVar;
            this.f40370b = gVar;
            this.f40371c = dVar;
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, Object obj) {
            com.smartdigimkt.w6.d dVarA;
            try {
                com.smartdigimkt.v6.a aVar = this.f40369a;
                dVarA = com.smartdigimkt.p6.e.a(aVar.f39168i, (JSONObject) obj, "", aVar.j);
            } catch (Exception unused) {
                dVarA = null;
            }
            if (dVarA == null) {
                g gVar = this.f40370b;
                if (gVar != null) {
                    gVar.a((com.smartdigimkt.w6.d) null, i.a("30001", obj != null ? obj.toString() : "No Ad Return."));
                    return;
                }
                return;
            }
            dVarA.c(this.f40369a.f39171p);
            a.this.a(dVarA, this.f40369a);
            com.smartdigimkt.p6.b bVarB = com.smartdigimkt.p6.b.b();
            Context context = a.this.f40365a;
            com.smartdigimkt.v6.a aVar2 = this.f40369a;
            bVarB.a(context, aVar2.f39163a, aVar2.f39166e, aVar2.f39168i, obj.toString());
            g gVar2 = this.f40370b;
            if (gVar2 != null) {
                gVar2.a(dVarA);
            }
            a.this.a(dVarA, this.f40369a, this.f40371c, this.f40370b);
        }

        @Override // com.smartdigimkt.w7.c
        public void b(int i2) {
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2, String str, AdError adError) {
            g gVar = this.f40370b;
            if (gVar != null) {
                gVar.a((com.smartdigimkt.w6.d) null, i.a("30001", str));
            }
        }

        @Override // com.smartdigimkt.w7.c
        public void a(int i2) {
            g gVar = this.f40370b;
            if (gVar != null) {
                gVar.a((com.smartdigimkt.w6.d) null, i.a("30001", "Cancel Request."));
            }
        }
    }

    public void a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.y6.b bVar, com.smartdigimkt.y4.d dVar, g gVar) {
        if (this.f40366b.contains(aVar.f39163a + aVar.f39168i)) {
            if (this.f40366b.get(aVar.f39163a + aVar.f39168i).booleanValue()) {
                if (gVar != null) {
                    gVar.a((com.smartdigimkt.w6.d) null, i.a("20005", "Offer data is loading."));
                    return;
                }
                return;
            }
        }
        this.f40366b.put(aVar.f39163a + aVar.f39168i, Boolean.TRUE);
        com.smartdigimkt.l7.b.a().d(new RunnableC0652a(aVar, bVar, dVar, gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.y4.d dVar2, g gVar, boolean z2) {
        if (gVar != null) {
            gVar.a(dVar);
        }
        if (z2) {
            if (com.smartdigimkt.c5.a.b() && com.smartdigimkt.c5.a.a().isLocalResourceReady(dVar, aVar)) {
                a(dVar, aVar, dVar2, gVar);
                return;
            }
            return;
        }
        a(dVar, aVar, dVar2, gVar);
    }

    public void a(l lVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.y4.d dVar, g gVar) {
        com.smartdigimkt.l7.b.a().d(new c(lVar, aVar, dVar, gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.y4.d dVar2, g gVar) {
        com.smartdigimkt.e5.a.a(aVar, dVar, dVar2);
        if (TextUtils.isEmpty(dVar.W0()) && dVar.a0() == 2) {
            new com.smartdigimkt.c6.d(this.f40365a, dVar, aVar).a(new d(aVar, gVar, dVar));
        } else {
            a(dVar, aVar, gVar);
        }
    }

    public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar, g gVar) {
        if (!TextUtils.isEmpty(dVar.W0())) {
            if (com.smartdigimkt.c5.a.b()) {
                com.smartdigimkt.c5.a.a().handleExpressAdResourceRequest(dVar, aVar, new e(gVar, aVar, dVar));
                return;
            } else {
                if (gVar != null) {
                    gVar.a(dVar, i.a("30007", "Express Offer is not supported."));
                    return;
                }
                return;
            }
        }
        j.a().a(aVar.f39163a, dVar, aVar, new f(aVar, gVar, dVar));
    }

    public com.smartdigimkt.w6.d a(com.smartdigimkt.v6.a aVar, com.smartdigimkt.y6.b bVar) {
        com.smartdigimkt.w6.d dVarA = null;
        if (bVar != null) {
            try {
                if (!TextUtils.isEmpty(bVar.f40239B)) {
                    JSONObject jSONObject = bVar.f40249V;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject(bVar.f40239B);
                    }
                    dVarA = com.smartdigimkt.p6.e.a(aVar.f39168i, jSONObject, bVar.f40239B, aVar.j);
                    dVarA.c(aVar.f39171p);
                }
            } catch (Throwable unused) {
            }
        }
        if (dVarA != null) {
            a(dVarA, aVar);
        }
        return dVarA;
    }

    public com.smartdigimkt.w6.d a(com.smartdigimkt.v6.a aVar) {
        m mVarA = com.smartdigimkt.p6.b.b().a(this.f40365a, aVar.f39168i);
        com.smartdigimkt.w6.d dVarA = null;
        if (mVarA != null && !TextUtils.isEmpty(mVarA.a())) {
            try {
                dVarA = com.smartdigimkt.p6.e.a(aVar.f39168i, new JSONObject(mVarA.a()), mVarA.a(), aVar.j);
                dVarA.c(mVarA.b());
            } catch (Throwable unused) {
            }
            if (dVarA != null) {
                a(dVarA, aVar);
            }
        }
        return dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.w6.d dVar, com.smartdigimkt.v6.a aVar) {
        if (dVar == null || aVar == null) {
            return;
        }
        dVar.N(aVar.f);
        dVar.V(aVar.f39167h);
        dVar.H(aVar.g);
        com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
        if (cVarB != null && cVarB.a()) {
            cVarB.fillDataFetchStatus(this.f40365a, dVar, aVar);
        } else {
            dVar.a(0);
        }
        com.smartdigimkt.e5.b.a(dVar);
        if (aVar.j == 67) {
            com.smartdigimkt.q6.c.a(this.f40365a).a(dVar.L(), dVar.Q0());
            com.smartdigimkt.q6.b.a(this.f40365a).a(dVar.m(), dVar.Q0());
        }
        com.smartdigimkt.j5.b.a().c();
        com.smartdigimkt.t3.a.a().b();
    }
}
