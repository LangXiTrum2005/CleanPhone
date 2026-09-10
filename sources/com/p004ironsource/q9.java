package com.p004ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class q9 {
    private static final String k = "1.0.6";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f26549l = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vf f26550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26552c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26553e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f26554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f26555i;
    private boolean j;

    public class a implements InterfaceC3345b {
        public a() {
        }

        @Override // com.p004ironsource.InterfaceC3345b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ");
                    sb.append(thread.getName());
                    sb.append(" Thread ID ");
                    sb.append(thread.getId());
                    sb.append(" (");
                    sb.append(thread.getState().toString());
                    sb.append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
            }
            q9.f26549l = sb.toString();
        }

        @Override // com.p004ironsource.InterfaceC3345b
        public void b() {
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f26557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26558b;

        public b(Context context, String str) {
            this.f26557a = context;
            this.f26558b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strP = q9.this.f26550a.p(this.f26557a);
                if (!TextUtils.isEmpty(strP)) {
                    q9.this.f26552c = strP;
                }
                String strA = q9.this.f26550a.a(this.f26557a);
                if (!TextUtils.isEmpty(strA)) {
                    q9.this.f26553e = strA;
                }
                SharedPreferences.Editor editorEdit = this.f26557a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", q9.this.f26552c);
                editorEdit.putString("sId", this.f26558b);
                editorEdit.apply();
            } catch (Exception e2) {
                IronLog.INTERNAL.error(e2.toString());
            }
        }
    }

    public class c extends r9 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static volatile q9 f26561a = new q9(null);

        private d() {
        }
    }

    private q9() {
        this.j = false;
        this.f26550a = on.U().f();
        this.f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.f26555i = " ";
        this.f26554h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new o9(defaultUncaughtExceptionHandler));
    }

    public static List<mc> c() {
        return null;
    }

    public static q9 d() {
        return d.f26561a;
    }

    public Context a() {
        return this.f.getApplicationContext();
    }

    public String b() {
        return k;
    }

    public String e() {
        return this.f26555i;
    }

    public /* synthetic */ q9(a aVar) {
        this();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return z8.f27869b;
                }
                return networkCapabilities.hasTransport(0) ? z8.g : "none";
            } catch (Exception e2) {
                IronLog.INTERNAL.error(e2.toString());
                return "none";
            }
        }
        return "none";
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.f26552c);
        String string2 = sharedPreferences.getString("sId", this.d);
        List<mc> listB = ha.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (mc mcVar : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = mcVar.b();
            String strE = mcVar.e();
            String strD = mcVar.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoZ = this.f26550a.z(context);
                if (memoryInfoZ != null) {
                    jSONObject2.put("availRam", this.f26550a.c(memoryInfoZ));
                    jSONObject2.put(ne.x, this.f26550a.b(memoryInfoZ));
                    jSONObject2.put(ne.y, this.f26550a.a(memoryInfoZ));
                }
                String strI = this.f26550a.i();
                if (strI != null) {
                    jSONObject2.put(ne.f26281z, strI);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(d9.i.q, "8.10.0");
                jSONObject2.put(d9.i.x, this.f26550a.b(context));
                jSONObject2.put(d9.i.W, b4.b(context, packageName));
                jSONObject2.put(d9.i.f24756n, this.f26550a.p());
                jSONObject2.put("network", strA);
                jSONObject2.put(d9.i.f24757p, this.f26550a.l());
                jSONObject2.put(d9.i.f24755l, this.f26550a.e());
                jSONObject2.put("totalRam", this.f26550a.h(context));
                jSONObject2.put("deviceOS", this.f26550a.m());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put(d9.i.k, this.f26550a.g());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.f26553e)) {
                    jSONObject2.put(d9.i.M, Boolean.parseBoolean(this.f26553e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e2) {
                            IronLog.INTERNAL.error(e2.toString());
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
        ha.a();
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new mc(new p9(th).getStackTrace(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z2, String str3, int i2, boolean z3) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.f26555i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f26554h = str;
            }
            this.d = str3;
            if (z2) {
                new C3343a(i2).a(z3).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }
}
