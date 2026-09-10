package com.smartdigimkt.m6;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.i7.e;
import com.smartdigimkt.n8.f;
import com.smartdigimkt.n8.i;
import com.smartdigimkt.n8.p;
import com.smartdigimkt.sdk.api.IntegrationCheckListener;
import com.smartdigimkt.sdk.api.SDMDebuggerConfig;
import com.smartdigimkt.sdk.api.SDMInitConfig;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.smartdigimkt.sdk.core.bridge.entity.AppInfoEntity;
import com.smartdigimkt.y7.h;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.smartdigimkt.s7.a, com.smartdigimkt.p7.a, com.smartdigimkt.q7.a, com.smartdigimkt.t7.a {
    private static volatile b L;
    private static final Object M = new Object();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Object f36846N = new Object();
    private String C;
    private SDMDebuggerConfig D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f36849E;
    private JSONObject H;
    private BroadcastReceiver K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36855c;
    private Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f36856e;
    private volatile boolean f;
    private volatile SDMInitConfig g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f36857h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f36859l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36860n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile h f36861p;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile String f36863w;
    private volatile String x;
    private volatile String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile String f36864z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36853a = com.smartdigimkt.m6.a.y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36858i = "";
    private String j = "";
    private final Map<String, Object> k = new ConcurrentHashMap();
    private long m = 0;
    private long o = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f36862u = false;
    private boolean v = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile long f36847A = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f36850F = false;
    private boolean G = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Object f36851I = new Object();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Object f36852J = new Object();
    private final com.smartdigimkt.s7.a q = new com.smartdigimkt.s7.b();
    private final com.smartdigimkt.p7.b r = new com.smartdigimkt.p7.b();
    private final com.smartdigimkt.q7.a s = new com.smartdigimkt.q7.b();
    private final com.smartdigimkt.t7.a t = new com.smartdigimkt.t7.b();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final String f36848B = android.support.v4.media.a.r(new StringBuilder(), File.separator, "sdm.test");

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f36865Y;
        final /* synthetic */ Context Z;

        public a(String str, String str2, Context context) {
            this.X = str;
            this.f36865Y = str2;
            this.Z = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.X, this.f36865Y);
            b.this.H();
            com.smartdigimkt.k3.c.d().a(this.Z, b.this.f36859l);
            if (b.this.y()) {
                return;
            }
            b.this.a((SDMSDK.InitCallBack) null);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.m6.b$b, reason: collision with other inner class name */
    public class C0545b implements IntegrationCheckListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SDMSDK.InitCallBack f36866a;

        public C0545b(SDMSDK.InitCallBack initCallBack) {
            this.f36866a = initCallBack;
        }

        @Override // com.smartdigimkt.sdk.api.IntegrationCheckListener
        public void onValidationFail(String str) {
            b.this.a(this.f36866a, str);
        }

        @Override // com.smartdigimkt.sdk.api.IntegrationCheckListener
        public void onValidationSucceed() {
            b.this.a(this.f36866a, "");
            com.smartdigimkt.n8.c.a((Map<String, Object>) b.this.k);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        private void b() {
            if (b.this.D()) {
                String strA = com.smartdigimkt.n8.c.a(b.this.d);
                Log.i("sdm_sdk", "********************************** " + f.a() + " *************************************");
                if (!TextUtils.isEmpty(com.smartdigimkt.n8.c.C())) {
                    Log.i("sdm_sdk", "Mediation Version: " + com.smartdigimkt.n8.c.C());
                }
                Log.i("sdm_sdk", "GAID(ADID): " + com.smartdigimkt.n8.c.m(b.this.d) + " , AndroidID: " + strA + ", OAID: " + com.smartdigimkt.n8.c.F());
                StringBuilder sb = new StringBuilder("********************************** ");
                sb.append(f.a());
                sb.append(" *************************************");
                Log.i("sdm_sdk", sb.toString());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.smartdigimkt.r7.a.a().d(b.this.d);
                b bVar = b.this;
                bVar.b(bVar.d);
                b.this.v();
                i.a(b.this.d).b();
                b bVar2 = b.this;
                bVar2.a(bVar2.d, b.this.f36854b, 0);
                com.smartdigimkt.k3.c.d().a((com.smartdigimkt.k3.c.e) null);
                com.smartdigimkt.s6.c cVarB = b.this.b();
                if (cVarB != null) {
                    cVarB.cleanExpiredInfo();
                }
                com.smartdigimkt.i7.h.a().b();
                com.smartdigimkt.k8.a.e().i();
                b bVar3 = b.this;
                bVar3.a(bVar3.d, b.this.D);
                b();
                b.this.G();
            } catch (Throwable unused) {
            }
        }
    }

    public class d extends BroadcastReceiver {

        public class a implements Runnable {
            final /* synthetic */ Context X;

            public a(Context context) {
                this.X = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.smartdigimkt.n8.h.h(this.X)) {
                    com.smartdigimkt.i7.h.a().b();
                    com.smartdigimkt.q3.c.a().c();
                    e.a().c();
                }
            }
        }

        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            b.this.a(new a(context));
            try {
                com.smartdigimkt.s6.c cVarB = b.this.b();
                if (cVarB != null) {
                    cVarB.resetSSID();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        Context contextK = k();
        if (contextK != null) {
            try {
                BroadcastReceiver broadcastReceiver = this.K;
                if (broadcastReceiver != null) {
                    contextK.unregisterReceiver(broadcastReceiver);
                    com.smartdigimkt.s6.b.a(contextK).a(this.K);
                }
                this.K = null;
            } catch (Throwable unused) {
            }
            try {
                this.K = new d();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                contextK.registerReceiver(this.K, intentFilter);
                com.smartdigimkt.s6.b.a(contextK).a(this.K, intentFilter);
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        boolean zExists = false;
        if (this.d != null) {
            try {
                zExists = new File(this.d.getExternalFilesDir(null), this.f36848B).exists();
                if (!zExists) {
                    zExists = new File(this.d.getFilesDir(), this.f36848B).exists();
                }
            } catch (Throwable unused) {
            }
        }
        this.f36850F = zExists;
    }

    public static b p() {
        if (L == null) {
            synchronized (b.class) {
                try {
                    if (L == null) {
                        L = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.smartdigimkt.n8.c.a(this.d, this.k);
    }

    public boolean A() {
        return this.f36859l;
    }

    public boolean B() {
        return this.f36856e;
    }

    public boolean C() {
        return this.f36849E && this.D != null;
    }

    public boolean D() {
        return this.f36850F || this.G;
    }

    public boolean E() {
        return this.f;
    }

    public boolean F() {
        return this.f36849E;
    }

    public String i() {
        return this.f36857h;
    }

    public int j() {
        return -1;
    }

    public Context k() {
        return this.d;
    }

    public SDMDebuggerConfig l() {
        return this.D;
    }

    public long m() {
        return this.m;
    }

    public h n() {
        if (this.f36861p == null) {
            synchronized (f36846N) {
                try {
                    if (this.f36861p == null) {
                        this.f36861p = new com.smartdigimkt.y7.f(this.d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36861p;
    }

    public long o() {
        return this.o;
    }

    public String q() {
        try {
            if (TextUtils.isEmpty(this.f36863w)) {
                a(k(), f(), 0);
            }
        } catch (Throwable unused) {
        }
        return this.f36863w;
    }

    public String r() {
        if (TextUtils.isEmpty(this.y)) {
            this.y = p.a(this.d, "exc_log", "exc_sys", "");
        }
        return this.y;
    }

    public String s() {
        return this.j;
    }

    public String t() {
        if (TextUtils.isEmpty(this.x)) {
            this.x = p.a(this.d, "sdm_sdk", "UP_ID", "");
        }
        return this.x;
    }

    public String u() {
        return this.f36858i;
    }

    public boolean w() {
        return this.v;
    }

    public boolean x() {
        return this.f36859l;
    }

    public boolean y() {
        return false;
    }

    public boolean z() {
        return this.f36862u;
    }

    @Override // com.smartdigimkt.s7.a
    public void b(String... strArr) {
        com.smartdigimkt.s7.a aVar = this.q;
        if (aVar != null) {
            aVar.b(strArr);
        }
    }

    public void c(boolean z2) {
        this.f36862u = z2;
    }

    public void d(Context context) {
        if (this.d == null) {
            this.d = context;
        }
    }

    @Override // com.smartdigimkt.s7.a
    public boolean e() {
        com.smartdigimkt.s7.a aVar = this.q;
        if (aVar != null) {
            return aVar.e();
        }
        return false;
    }

    public String f() {
        if (TextUtils.isEmpty(this.f36854b)) {
            this.f36854b = p.a(this.d, "sdm_sdk", com.smartdigimkt.g8.b.a.f35517b, "");
        }
        if (!TextUtils.isEmpty(this.f36854b)) {
            return this.f36854b;
        }
        AppInfoEntity appInfoEntityH = com.smartdigimkt.n8.c.h();
        if (appInfoEntityH != null) {
            String mediationAppId = appInfoEntityH.getMediationAppId();
            if (!TextUtils.isEmpty(mediationAppId)) {
                return mediationAppId;
            }
        }
        return this.f36854b;
    }

    public String g() {
        if (TextUtils.isEmpty(this.f36855c)) {
            this.f36855c = p.a(this.d, "sdm_sdk", com.smartdigimkt.g8.b.a.f35518c, "");
        }
        if (!TextUtils.isEmpty(this.f36855c)) {
            return this.f36855c;
        }
        AppInfoEntity appInfoEntityH = com.smartdigimkt.n8.c.h();
        if (appInfoEntityH != null) {
            String mediationAppKey = appInfoEntityH.getMediationAppKey();
            if (!TextUtils.isEmpty(mediationAppKey)) {
                return mediationAppKey;
            }
        }
        return this.f36855c;
    }

    public String h() {
        if (TextUtils.isEmpty(this.f36864z)) {
            this.f36864z = p.a(this.d, "exc_log", "exc_bk", "");
        }
        return this.f36864z;
    }

    private void c(Context context) {
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            this.d = context.getApplicationContext();
        } else {
            this.d = context;
        }
    }

    public void a(Context context, SDMInitConfig sDMInitConfig) {
        c(context);
        synchronized (M) {
            try {
                if (context == null) {
                    return;
                }
                if (sDMInitConfig == null) {
                    return;
                }
                if (this.f36856e) {
                    return;
                }
                this.f36856e = true;
                this.g = sDMInitConfig;
                if (context instanceof Application) {
                    com.smartdigimkt.m7.a.b().b((Application) context);
                }
                this.f36860n = System.currentTimeMillis();
                String appId = sDMInitConfig.getAppId();
                String appKey = sDMInitConfig.getAppKey();
                this.f36857h = sDMInitConfig.getBundleName();
                this.j = sDMInitConfig.getSystemDevFrameworkType();
                this.D = sDMInitConfig.getDebuggerConfig();
                try {
                    Map<String, Object> extraMap = sDMInitConfig.getExtraMap();
                    if (extraMap != null) {
                        this.k.clear();
                        for (Map.Entry<String, Object> entry : extraMap.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && value != null) {
                                this.k.put(key, value);
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.e(com.smartdigimkt.m6.a.y, "init() >>> extraMap putAll error.", th);
                }
                this.f36854b = appId;
                this.f36855c = appKey;
                this.f36847A = 0L;
                a(new a(appId, appKey, context));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(boolean z2) {
        this.v = z2;
    }

    public String d(String str) {
        String strOptString;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        synchronized (this.f36851I) {
            try {
                strOptString = this.H.optString(str);
                if (TextUtils.isEmpty(strOptString)) {
                    strOptString = c(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strOptString;
    }

    public void e(String str) {
        this.f36864z = str;
        p.b(this.d, "exc_log", "exc_bk", str);
    }

    @Override // com.smartdigimkt.p7.a
    public com.smartdigimkt.s6.c b() {
        return this.r.b();
    }

    public void h(String str) {
        this.f36858i = str;
    }

    private String c(String str) {
        synchronized (this.f36851I) {
            try {
                String strOptString = this.H.optString(str);
                if (!TextUtils.isEmpty(strOptString)) {
                    return strOptString;
                }
                String strT = t();
                String str2 = "";
                if (TextUtils.isEmpty(strT)) {
                    strT = com.smartdigimkt.n8.c.a(this.d) + com.smartdigimkt.n8.c.y();
                    str2 = new Random().nextInt(10000000) + "";
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strB = com.smartdigimkt.n8.e.b(strT + str + str2 + jCurrentTimeMillis);
                try {
                    this.H.put(str, strB);
                } catch (Exception unused) {
                }
                p.b(this.d, "sdm_sdk", "SPU_SESSIONID_KEY", this.H.toString());
                if (!TextUtils.isEmpty(t())) {
                    str2 = null;
                }
                com.smartdigimkt.i7.d.a(str, "2", str2, jCurrentTimeMillis + "");
                return strB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.C)) {
            return;
        }
        if (TextUtils.equals(str, this.C)) {
            this.f36849E = true;
        }
        if (this.f36849E && D()) {
            Log.i(com.smartdigimkt.m6.a.y, "Update Setting Debugger's device success.");
        }
    }

    public void e(boolean z2) {
        this.G = z2;
    }

    public void f(String str) {
        this.y = str;
        p.b(this.d, "exc_log", "exc_sys", str);
    }

    public void g(String str) {
        p.b(this.d, "sdm_sdk", "UP_ID", str);
        this.x = str;
    }

    @Override // com.smartdigimkt.q7.a
    public List<String> d() {
        return this.s.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        long jA = p.a(context, "sdm_sdk", com.smartdigimkt.g8.b.a.x, 0L);
        this.m = jA;
        if (jA == 0) {
            long j = this.f36860n;
            this.m = j;
            p.b(context, "sdm_sdk", com.smartdigimkt.g8.b.a.x, j);
        }
        this.o = ((a(this.f36860n) - a(this.m)) / 86400000) + 1;
    }

    public void d(boolean z2) {
        this.f36859l = z2;
    }

    @Override // com.smartdigimkt.q7.a
    public JSONArray c() {
        return this.s.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SDMSDK.InitCallBack initCallBack, String str) {
        if (initCallBack == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            initCallBack.fail(str);
            return;
        }
        String strA = a();
        if (!TextUtils.isEmpty(strA)) {
            initCallBack.fail(strA);
        } else {
            initCallBack.success();
        }
    }

    public void a(SDMSDK.InitCallBack initCallBack) {
        synchronized (M) {
            try {
                if (!B()) {
                    a(initCallBack, "Please call init method first.");
                    return;
                }
                if (this.d == null) {
                    a(initCallBack, "The context can not be null or empty.");
                    return;
                }
                if (this.g == null) {
                    a(initCallBack, "The sdmInitConfig can not be null or empty.");
                    return;
                }
                if (TextUtils.isEmpty(this.f36854b)) {
                    a(initCallBack, "The appId can not be null or empty.");
                    return;
                }
                if (TextUtils.isEmpty(this.f36855c)) {
                    a(initCallBack, "The appKey can not be null or empty.");
                    return;
                }
                if (this.f) {
                    a(initCallBack, "");
                    return;
                }
                this.f = true;
                a(this.d, this.g.getExtraMap(), new C0545b(initCallBack));
                b(com.smartdigimkt.n8.h.b());
                a(new c());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2) {
        p.b(this.d, "sdm_sdk", com.smartdigimkt.g8.b.a.f35517b, str);
        p.b(this.d, "sdm_sdk", com.smartdigimkt.g8.b.a.f35518c, str2);
    }

    @Override // com.smartdigimkt.s7.a
    public void a(String... strArr) {
        com.smartdigimkt.s7.a aVar = this.q;
        if (aVar != null) {
            aVar.a(strArr);
        }
    }

    @Override // com.smartdigimkt.s7.a
    public boolean a(String str) {
        com.smartdigimkt.s7.a aVar = this.q;
        return aVar != null && aVar.a(str);
    }

    @Override // com.smartdigimkt.s7.a
    public void a(boolean z2) {
        com.smartdigimkt.s7.a aVar = this.q;
        if (aVar != null) {
            aVar.a(z2);
        }
    }

    public void a(Runnable runnable) {
        com.smartdigimkt.l7.b.a().b(runnable, 7);
    }

    public void a(Context context, SDMDebuggerConfig sDMDebuggerConfig) {
        if (context == null) {
            if (D()) {
                Log.e(com.smartdigimkt.m6.a.y, "setDebuggerConfig fail, because context is null.");
                return;
            }
            return;
        }
        if (sDMDebuggerConfig == null) {
            if (D()) {
                Log.i(com.smartdigimkt.m6.a.y, "debugConfig is null not in debug mode.");
                return;
            }
            return;
        }
        if (this.d == null) {
            p().c(context.getApplicationContext());
        }
        this.C = sDMDebuggerConfig.getDeviceId();
        this.D = sDMDebuggerConfig;
        this.f36849E = a(context);
        if (TextUtils.isEmpty(this.C)) {
            if (D()) {
                Log.e(com.smartdigimkt.m6.a.y, "Setting Debugger's device fail, because deviceId is empty.");
            }
            this.f36849E = false;
        } else {
            if (this.f36849E) {
                if (D()) {
                    Log.i(com.smartdigimkt.m6.a.y, "Setting Debugger's device success.");
                }
                if (this.D == null || !D()) {
                    return;
                }
                Log.i(com.smartdigimkt.m6.a.y, "Debugger config is in effect now.");
                return;
            }
            if (D()) {
                Log.e(com.smartdigimkt.m6.a.y, "The incoming device id does not match the current device id, and the debugger mode cannot take effect.");
            }
        }
    }

    private boolean a(Context context) {
        String strA = com.smartdigimkt.n8.c.a(context);
        if (!TextUtils.isEmpty(strA) && strA.equals(this.C)) {
            return true;
        }
        String strY = com.smartdigimkt.n8.c.y();
        if (!TextUtils.isEmpty(strY) && strY.equals(this.C)) {
            return true;
        }
        com.smartdigimkt.s6.c cVarB = p().b();
        return cVarB != null && cVarB.checkDebuggerDevice(context, this.C);
    }

    public long a(Context context, String str, int i2) throws JSONException {
        synchronized (this.f36852J) {
            try {
                com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
                String strA = p.a(context, "sdm_sdk", "SPU_PSID_KEY", "");
                String strA2 = p.a(context, "sdm_sdk", "SPU_SESSIONID_KEY", "");
                long jA = p.a(context, "sdm_sdk", "SPU_INIT_TIME_KEY", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - jA < 0) {
                    jA = 0;
                }
                if (jCurrentTimeMillis - jA <= (i2 == 0 ? aVarB.k0() : aVarB.l0())) {
                    aVarB.k0();
                    this.f36863w = strA;
                    if (!TextUtils.isEmpty(strA2)) {
                        synchronized (this.f36851I) {
                            this.H = new JSONObject(strA2);
                        }
                    }
                    return 0L;
                }
                aVarB.k0();
                String strT = t();
                String strValueOf = "";
                if (TextUtils.isEmpty(strT)) {
                    strT = com.smartdigimkt.n8.c.a(context) + com.smartdigimkt.n8.c.m(context);
                    strValueOf = String.valueOf(new Random().nextInt(10000000));
                }
                this.f36863w = com.smartdigimkt.n8.e.b(strT + str + strValueOf + jCurrentTimeMillis);
                synchronized (this.f36851I) {
                    this.H = new JSONObject();
                }
                p.b(context, "sdm_sdk", "SPU_PSID_KEY", this.f36863w);
                p.b(context, "sdm_sdk", "SPU_SESSIONID_KEY", "");
                p.b(context, "sdm_sdk", "SPU_INIT_TIME_KEY", jCurrentTimeMillis);
                com.smartdigimkt.i7.d.a((String) null, "1", strValueOf, jCurrentTimeMillis + "");
                if (i2 == 0) {
                    this.f36847A = jCurrentTimeMillis;
                }
                return jCurrentTimeMillis;
            } catch (Throwable th) {
                throw th;
            }
            throw th;
        }
    }

    @Override // com.smartdigimkt.q7.a
    public void a(List<String> list) {
        this.s.a(list);
    }

    private long a(long j) {
        Date date = new Date(j);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    @Override // com.smartdigimkt.t7.a
    public void a(Context context, Map<String, Object> map, IntegrationCheckListener integrationCheckListener) {
        this.t.a(context, map, integrationCheckListener);
    }

    @Override // com.smartdigimkt.t7.a
    public String a() {
        return this.t.a();
    }
}
