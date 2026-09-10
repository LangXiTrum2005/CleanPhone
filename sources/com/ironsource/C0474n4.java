package com.ironsource;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0474n4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f29793k = "1.0.6";
    public static String l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0674y7 f29794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ContextProvider f29799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f29800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f29803j;

    /* JADX INFO: renamed from: com.ironsource.n4$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f29805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29806b;

        public b(Context context, String str) {
            this.f29805a = context;
            this.f29806b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strI = C0474n4.this.f29794a.I(this.f29805a);
                if (!TextUtils.isEmpty(strI)) {
                    C0474n4.this.f29796c = strI;
                }
                String strC = C0474n4.this.f29794a.c(this.f29805a);
                if (!TextUtils.isEmpty(strC)) {
                    C0474n4.this.f29798e = strC;
                }
                SharedPreferences.Editor editorEdit = this.f29805a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C0474n4.this.f29796c);
                editorEdit.putString("sId", this.f29806b);
                editorEdit.apply();
            } catch (Exception e10) {
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n4$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c extends RunnableC0492o4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n4$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @SuppressLint({"StaticFieldLeak"})
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile C0474n4 f29809a = new C0474n4(0);

        private d() {
        }
    }

    public /* synthetic */ C0474n4(int i10) {
        this();
    }

    public String e() {
        return this.f29802i;
    }

    private C0474n4() {
        this.f29803j = false;
        this.f29794a = Kb.Y().a();
        this.f29799f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f29800g = defaultUncaughtExceptionHandler;
        this.f29802i = " ";
        this.f29801h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C0438l4(defaultUncaughtExceptionHandler));
    }

    public static List<K5> c() {
        return null;
    }

    public static C0474n4 d() {
        return d.f29809a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z10, String str3, int i10, boolean z11) {
        Context applicationContext = this.f29799f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f29802i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f29801h = str;
            }
            this.f29797d = str3;
            if (z10) {
                new C0236a(i10).a(z11).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.f29803j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return f29793k;
    }

    /* JADX INFO: renamed from: com.ironsource.n4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements InterfaceC0254b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0254b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb2 = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb2.append("*** Thread Name ");
                    sb2.append(thread.getName());
                    sb2.append(" Thread ID ");
                    sb2.append(thread.getId());
                    sb2.append(" (");
                    sb2.append(thread.getState().toString());
                    sb2.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb2.append(stackTraceElement.toString());
                        sb2.append(" ");
                        sb2.append(thread.getState().toString());
                        sb2.append("\n");
                    }
                }
            }
            C0474n4.l = sb2.toString();
        }

        @Override // com.ironsource.InterfaceC0254b
        public void b() {
        }
    }

    public void a(Throwable th2) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.f29803j);
        if (!this.f29803j || th2 == null) {
            return;
        }
        new K5(new C0456m4(th2).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f29796c);
        String string2 = sharedPreferences.getString("sId", this.f29797d);
        List<K5> listB = E4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (K5 k8 : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = k8.b();
            String strE = k8.e();
            String strD = k8.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoO = this.f29794a.o(context);
                if (memoryInfoO != null) {
                    jSONObject2.put("availRam", this.f29794a.c(memoryInfoO));
                    jSONObject2.put(O6.f26760x, this.f29794a.b(memoryInfoO));
                    jSONObject2.put("mThreshold", this.f29794a.a(memoryInfoO));
                }
                String strT = this.f29794a.t();
                if (strT != null) {
                    jSONObject2.put(O6.f26766z, strT);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", f29793k);
                jSONObject2.put(X3.j.f27858q, "9.4.3");
                jSONObject2.put(X3.j.f27866x, this.f29794a.d(context));
                jSONObject2.put(X3.j.W, E1.b(context, packageName));
                jSONObject2.put(X3.j.f27852n, this.f29794a.i());
                jSONObject2.put("network", strA);
                jSONObject2.put(X3.j.f27856p, this.f29794a.e());
                jSONObject2.put("deviceModel", this.f29794a.l());
                jSONObject2.put("totalRam", this.f29794a.r(context));
                jSONObject2.put(Wa.f27581o, this.f29794a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f29794a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f29798e)) {
                    jSONObject2.put(X3.j.M, Boolean.parseBoolean(this.f29798e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e10) {
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        E4.a();
    }

    public Context a() {
        return this.f29799f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return T3.f27210b;
            }
            return networkCapabilities.hasTransport(0) ? T3.f27215g : "none";
        } catch (Exception e10) {
            IronLog.INTERNAL.error(e10.toString());
            return "none";
        }
    }
}
