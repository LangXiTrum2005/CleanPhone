package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3631m4 {
    private static final String k = "1.0.6";
    public static String l = "";
    private final InterfaceC3806w7 a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;
    public String h;
    private String i;
    private boolean j;

    /* JADX INFO: renamed from: com.ironsource.m4$b */
    public class b implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        public b(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strJ = C3631m4.this.a.J(this.a);
                if (!TextUtils.isEmpty(strJ)) {
                    C3631m4.this.c = strJ;
                }
                String strC = C3631m4.this.a.c(this.a);
                if (!TextUtils.isEmpty(strC)) {
                    C3631m4.this.e = strC;
                }
                SharedPreferences.Editor editorEdit = this.a.getSharedPreferences("CRep", 0).edit();
                editorEdit.putString("String1", C3631m4.this.c);
                editorEdit.putString("sId", this.b);
                editorEdit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$c */
    public class c extends RunnableC3649n4 {
        public c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m4$d */
    public static class d {
        static volatile C3631m4 a = new C3631m4();

        private d() {
        }
    }

    public static List<J5> c() {
        return null;
    }

    public static C3631m4 d() {
        return d.a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new C3411a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return k;
    }

    public String e() {
        return this.i;
    }

    private C3631m4() {
        this.j = false;
        this.a = Gb.U().a();
        this.f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = " ";
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C3595k4(defaultUncaughtExceptionHandler));
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new J5(new C3613l4(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    /* JADX INFO: renamed from: com.ironsource.m4$a */
    public class a implements InterfaceC3429b {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3429b
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
                    sb.append(" ");
                    sb.append("(");
                    sb.append(thread.getState().toString());
                    sb.append(")");
                    sb.append(" ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString());
                        sb.append(" ");
                        sb.append(thread.getState().toString());
                        sb.append("\n");
                    }
                }
            }
            C3631m4.l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC3429b
        public void b() {
        }
    }

    private void a(Context context, HashSet<String> hashSet) {
        String strA = a(a());
        if (strA.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.c);
        String string2 = sharedPreferences.getString("sId", this.d);
        List<J5> listB = D4.b();
        IronLog.INTERNAL.verbose("reportList size " + listB.size());
        for (J5 j5 : listB) {
            JSONObject jSONObject = new JSONObject();
            String strB = j5.b();
            String strE = j5.e();
            String strD = j5.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo memoryInfoO = this.a.o(context);
                if (memoryInfoO != null) {
                    jSONObject2.put("availRam", this.a.c(memoryInfoO));
                    jSONObject2.put(L6.x, this.a.b(memoryInfoO));
                    jSONObject2.put("mThreshold", this.a.a(memoryInfoO));
                }
                String strT = this.a.t();
                if (strT != null) {
                    jSONObject2.put(L6.z, strT);
                }
                jSONObject2.put("crashDate", strB);
                jSONObject2.put("stacktraceCrash", strE);
                jSONObject2.put("crashType", strD);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(X3.j.q, "9.3.0");
                jSONObject2.put(X3.j.x, this.a.d(context));
                jSONObject2.put(X3.j.W, E1.b(context, packageName));
                jSONObject2.put(X3.j.n, this.a.i());
                jSONObject2.put("network", strA);
                jSONObject2.put(X3.j.p, this.a.e());
                jSONObject2.put("deviceModel", this.a.l());
                jSONObject2.put("totalRam", this.a.r(context));
                jSONObject2.put(Ta.o, this.a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.e)) {
                    jSONObject2.put(X3.j.M, Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    for (String str : hashSet) {
                        try {
                            if (jSONObject2.has(str)) {
                                jSONObject.put(str, jSONObject2.opt(str));
                            }
                        } catch (Exception e) {
                            IronLog.INTERNAL.error(e.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() != 0) {
                new Thread(new c(jSONObject)).start();
            }
        }
        D4.a();
    }

    public Context a() {
        return this.f.getApplicationContext();
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
                return T3.b;
            }
            return networkCapabilities.hasTransport(0) ? T3.g : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
