package com.smartdigimkt.k3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.smartdigimkt.n8.f;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.r6.h;
import com.smartdigimkt.sdk.api.business.express.IExpressAdManager;
import com.smartdigimkt.sdk.api.business.omsdk.IOmsdkHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private static volatile c s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36172c;
    private AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f36173e;
    private List<e> f;
    private Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f36174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f36175i;
    private com.smartdigimkt.n3.b j;
    private com.smartdigimkt.n3.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f36176l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Boolean f36177n;
    private volatile Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f36178p;
    WeakReference<Activity> q;
    private Object r;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(true, (String) null);
        }
    }

    public class b implements h.g {
        public b() {
        }

        @Override // com.smartdigimkt.r6.h.g
        public void a() {
            c.this.a(true, (String) null);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.k3.c$c, reason: collision with other inner class name */
    public class RunnableC0517c implements Runnable {

        /* JADX INFO: renamed from: com.smartdigimkt.k3.c$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.j5.c.a().a(c.this.g);
                com.smartdigimkt.j5.c.a().b(c.this.g);
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.k3.c$c$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.smartdigimkt.j5.a.a().a(c.this.g);
            }
        }

        public RunnableC0517c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.smartdigimkt.k5.e.a().c()) {
                    String unused = c.this.f36170a;
                    com.smartdigimkt.j5.c.a().d(c.this.g);
                    com.smartdigimkt.j5.c.a().e(c.this.g);
                    if (com.smartdigimkt.j5.c.a().d(c.this.g) || com.smartdigimkt.j5.c.a().e(c.this.g)) {
                        com.smartdigimkt.m6.b.p().a(new a());
                    }
                }
                String unused2 = c.this.f36170a;
                com.smartdigimkt.j5.a.a().c(c.this.g);
                if (com.smartdigimkt.j5.a.a().c(c.this.g)) {
                    com.smartdigimkt.m6.b.p().a(new b());
                }
            } catch (Throwable th) {
                c.this.a(false, th.getMessage());
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WebView webView;
            String unused = c.this.f36170a;
            try {
                webView = new WebView(c.this.g);
            } catch (Throwable unused2) {
                webView = null;
            }
            if (webView != null) {
                try {
                    webView.destroy();
                } catch (Throwable unused3) {
                }
                c.this.f36177n = Boolean.TRUE;
            } else {
                c.this.f36177n = Boolean.FALSE;
            }
            String unused4 = c.this.f36170a;
            Boolean unused5 = c.this.f36177n;
        }
    }

    public interface e {
        void fail(String str);

        void success();
    }

    private c() {
        boolean z2;
        String simpleName = getClass().getSimpleName();
        this.f36170a = simpleName;
        this.f36171b = "adx_first_init";
        this.f36173e = new Object();
        boolean z3 = false;
        this.f36176l = false;
        this.m = false;
        this.r = new Object();
        this.f36172c = false;
        this.d = new AtomicBoolean(false);
        try {
            IExpressAdManager iExpressAdManager = (IExpressAdManager) com.smartdigimkt.n8.h.a(simpleName, (Class<?>) IExpressAdManager.class, "com.smartdigimkt.expressad.bridge.ExpressResourceHandle");
            if (iExpressAdManager != null) {
                com.smartdigimkt.c5.a.a(iExpressAdManager);
                z2 = true;
            } else {
                z2 = false;
            }
        } catch (Throwable unused) {
        }
        try {
            IOmsdkHandler iOmsdkHandler = (IOmsdkHandler) com.smartdigimkt.n8.h.a(this.f36170a, (Class<?>) IOmsdkHandler.class, "com.smartdigimkt.basead.oversea_plugin.bridge.OmsdkHandler");
            if (iOmsdkHandler != null) {
                com.smartdigimkt.k5.e.a().a(iOmsdkHandler);
                z3 = true;
            }
        } catch (Throwable unused2) {
        }
        if (com.smartdigimkt.m6.b.p().D()) {
            Log.i("sdm_sdk", "********************************** " + f.a() + " *************************************");
            Log.i("sdm_sdk", "Inject Info >>>>> ExpressModule: " + z2 + " , OmsdkModule: " + z3);
            StringBuilder sb = new StringBuilder("********************************** ");
            sb.append(f.a());
            sb.append(" *************************************");
            Log.i("sdm_sdk", sb.toString());
        }
    }

    public static c d() {
        if (s == null) {
            synchronized (c.class) {
                try {
                    if (s == null) {
                        s = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return s;
    }

    private void f() {
        if (this.f36177n != null) {
            return;
        }
        if (this.o == null) {
            com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
            if (!aVarB.M0()) {
                this.o = Boolean.valueOf(aVarB.X() == 1);
            }
        }
        if (this.o == null || !this.o.booleanValue()) {
            return;
        }
        com.smartdigimkt.l7.b.a().e(new d());
    }

    public boolean e() {
        return this.f36178p;
    }

    public boolean g() {
        return com.smartdigimkt.c5.a.b();
    }

    public boolean h() {
        return this.f36174h;
    }

    public boolean i() {
        if (this.o != null && !this.o.booleanValue()) {
            return true;
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB.M0()) {
            return true;
        }
        this.o = Boolean.valueOf(aVarB.X() == 1);
        if (!this.o.booleanValue()) {
            return true;
        }
        f();
        if (this.f36177n != null) {
            return this.f36177n.booleanValue();
        }
        return true;
    }

    public Context b() {
        return com.smartdigimkt.m6.b.p().k();
    }

    public Activity c() {
        synchronized (this.r) {
            try {
                WeakReference<Activity> weakReference = this.q;
                if (weakReference == null) {
                    return null;
                }
                return weakReference.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void a(Context context, boolean z2) {
        try {
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.g = context.getApplicationContext();
            this.f36174h = z2;
            this.f36178p = false;
            ((Application) this.g).registerActivityLifecycleCallbacks(new com.smartdigimkt.m3.b(z2));
            p.c().e();
            p.c().a();
            com.smartdigimkt.d7.d.c().b();
            com.smartdigimkt.d7.d.c().a();
            com.smartdigimkt.p6.f.c().e();
            com.smartdigimkt.j5.c.a().c(b());
            com.smartdigimkt.j5.a.a().b(b());
            com.smartdigimkt.p6.b.b().a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(e eVar) {
        if (this.f36172c) {
            if (eVar != null) {
                eVar.success();
                return;
            }
            return;
        }
        synchronized (this.f36173e) {
            try {
                if (this.d.get()) {
                    if (eVar != null) {
                        this.f.add(eVar);
                    }
                    return;
                }
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                this.d.set(true);
                if (eVar != null) {
                    this.f.add(eVar);
                }
                if (!com.smartdigimkt.n8.p.a(this.g, "sdm_sdk", "adx_first_init", true)) {
                    a(true, (String) null);
                } else {
                    com.smartdigimkt.n8.p.b(this.g, "sdm_sdk", "adx_first_init", false);
                    com.smartdigimkt.l7.b.a().a((Runnable) new a(), 300L);
                    h.e().a(new b());
                    com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                    if (aVarB != null && aVarB.M0()) {
                        h.e().a("f4KUIn7GLGrT26XAm6zaYebAl4wH26rV2eFGJWKUIBdGLGrT26XAm6zaYebAl4wH26rV2eFA2eRp9yxUYekRlWKPKTItLWK1K8vs23wRm8bwJ8H4J85HmuriluOGJWK4vBOGLGrT26XAY6qsYekRJ8r4KGtGITm4KTZGm6zHJpvZ2QMRl3wT2WKPKTK6I3K1K8vs23wU9eztlEFAm6oGJWK4vnSGLGrT26XAY6qsYekRJ8R7KGtGITmUKTZGm6zHJpvZ2QMRl3wP9uxRJ8R7KGtGITmtKTZGm6zHJpvZ2QMRl3wHfWKPKTKaIGK1K8vs23wU9eztlEFA2u7GJWK4vBdGLGrT26XAY6qsYekRJpMZKGtGITFUKTZGm6zHJpvZ2QMRl3wUl4KPKTKXL3K1K8vs23wU9eztlEFA5eSGJWK4vB7GLGrT26XAY6qsYekRJpxQKGtGITFCKTZGm6zHJpvZ2QMRl3w62GKPKThGLGrT26XA5ebsm8bsJpxq26rq24KPKTK6vWK1K8vs23wX26HsYek79EhA5eHtlWKPKTK6vGK1K8vs23wXY8b6lECs96hAmEw7Y8zVlWrz", 1, com.smartdigimkt.m6.c.b(), 1, true);
                    }
                }
                com.smartdigimkt.l7.b.a().g(new RunnableC0517c());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2, String str) {
        synchronized (this.f36173e) {
            if (z2) {
                try {
                    this.f36172c = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f.get(i2);
                if (eVar != null) {
                    if (z2) {
                        eVar.success();
                    } else {
                        eVar.fail(str);
                    }
                }
            }
            this.f.clear();
            this.d.set(false);
        }
    }

    public void a(boolean z2) {
        if (!this.f36178p) {
            this.f36178p = true;
        }
        this.f36174h = z2;
        if (z2) {
            com.smartdigimkt.n3.b bVar = this.j;
            if (bVar != null) {
                bVar.a(this.f36175i);
                this.j = null;
                return;
            }
            return;
        }
        this.f36175i = System.currentTimeMillis();
    }

    public void a(com.smartdigimkt.n3.b bVar) {
        this.j = bVar;
    }

    public void a() {
        boolean z2 = !this.f36176l && this.m;
        com.smartdigimkt.n3.c cVar = this.k;
        if (cVar != null) {
            cVar.a(z2);
            this.k = null;
        }
        this.m = false;
        this.f36176l = false;
    }

    public void a(com.smartdigimkt.n3.c cVar) {
        this.k = cVar;
        this.f36176l = false;
    }

    public void a(Activity activity) {
        synchronized (this.r) {
            this.q = new WeakReference<>(activity);
        }
    }

    public JSONArray a(Map<String, Object> map) {
        String strA = com.smartdigimkt.n8.h.a(map, "nv_tmpl_id", "[\"1\",\"2\",\"3\",\"4\",\"5\"]");
        if (!TextUtils.isEmpty(strA)) {
            try {
                JSONArray jSONArray = new JSONArray(strA);
                if (jSONArray.length() > 0) {
                    return jSONArray;
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put("1");
        jSONArray2.put("2");
        jSONArray2.put("3");
        jSONArray2.put("4");
        jSONArray2.put("5");
        return jSONArray2;
    }
}
