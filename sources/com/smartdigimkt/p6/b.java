package com.smartdigimkt.p6;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile b f37651c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.u6.m f37652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<String, com.smartdigimkt.y6.d> f37653b;

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y6.b f37654Y;

        public a(String str, com.smartdigimkt.y6.b bVar) {
            this.X = str;
            this.f37654Y = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f37652a == null) {
                b.this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
            }
            b.this.f37652a.a(this.X, this.f37654Y);
            b.this.a(this.f37654Y);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.p6.b$b, reason: collision with other inner class name */
    public class RunnableC0566b implements Runnable {
        final /* synthetic */ com.smartdigimkt.y6.b X;

        public RunnableC0566b(com.smartdigimkt.y6.b bVar) {
            this.X = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f37652a == null) {
                b.this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
            }
            b.this.f37652a.a(this.X);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37656Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;

        public c(String str, String str2, String str3, String str4) {
            this.X = str;
            this.f37656Y = str2;
            this.Z = str3;
            this.e0 = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f37652a.a(this.X, this.f37656Y, this.Z, this.e0);
        }
    }

    public class d implements Runnable {
        final /* synthetic */ Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37657Y;

        public d(Context context, String str) {
            this.X = context;
            this.f37657Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f37652a == null) {
                b.this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(this.X.getApplicationContext()));
            }
            b.this.f37652a.e(this.f37657Y);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f37652a == null) {
                b.this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
            }
            b.this.f37652a.c();
        }
    }

    private b() {
        if (com.smartdigimkt.m6.b.p().k() != null) {
            this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(com.smartdigimkt.m6.b.p().k()));
        }
        this.f37653b = new ConcurrentHashMap<>(3);
    }

    public static b b() {
        if (f37651c == null) {
            synchronized (b.class) {
                try {
                    if (f37651c == null) {
                        f37651c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37651c;
    }

    public void c(Context context, String str) {
        com.smartdigimkt.l7.b.a().g(new d(context, str));
    }

    public void d(Context context, String str) {
    }

    public com.smartdigimkt.y6.b a(String str, String str2) {
        com.smartdigimkt.y6.d dVarD = this.f37653b.get(str);
        if (dVarD == null) {
            dVarD = this.f37652a.d(str);
            this.f37653b.put(str, dVarD);
        }
        return dVarD.a(str2);
    }

    public void b(com.smartdigimkt.y6.b bVar) {
        com.smartdigimkt.l7.b.a().g(new RunnableC0566b(bVar));
    }

    public void a(String str, com.smartdigimkt.y6.b bVar) {
        com.smartdigimkt.l7.b.a().g(new a(str, bVar));
    }

    public String b(Context context, String str) {
        if (this.f37652a == null) {
            this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(context.getApplicationContext()));
        }
        return this.f37652a.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.y6.b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f40239B)) {
            return;
        }
        try {
            if (bVar.s == 67) {
                JSONObject jSONObject = bVar.f40249V;
                if (jSONObject == null) {
                    jSONObject = new JSONObject(bVar.f40239B);
                }
                com.smartdigimkt.w6.d dVarA = com.smartdigimkt.p6.e.a(bVar.f40233e, jSONObject, bVar.f40239B, bVar.s, true);
                if (dVarA == null) {
                    return;
                }
                com.smartdigimkt.q6.c.a(com.smartdigimkt.m6.b.p().k()).a(dVarA.L(), bVar.f40251u);
                com.smartdigimkt.q6.b.a(com.smartdigimkt.m6.b.p().k()).a(dVarA.m(), bVar.f40251u);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(Context context, String str, String str2, String str3, String str4) {
        if (this.f37652a == null) {
            this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(context.getApplicationContext()));
        }
        com.smartdigimkt.l7.b.a().g(new c(str, str2, str3, str4));
    }

    public m a(Context context, String str) {
        if (this.f37652a == null) {
            this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(context.getApplicationContext()));
        }
        return this.f37652a.a(str);
    }

    public void a() {
        com.smartdigimkt.l7.b.a().g(new e());
    }

    public void a(Context context, String str, String str2) {
        if (this.f37652a == null) {
            this.f37652a = com.smartdigimkt.u6.m.a(com.smartdigimkt.u6.d.a(context.getApplicationContext()));
        }
        this.f37652a.a(str, str2);
    }
}
