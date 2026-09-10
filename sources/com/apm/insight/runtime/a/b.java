package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10283a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10284b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f10285c = false;
    private static int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f10286e = false;
    private static long f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f10287z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10289B;
    private Application g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f10290h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f10293n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f10294p;
    private long q;
    private String r;
    private long s;
    private String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10295u;
    private String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f10296w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f10291i = new ArrayList();
    private List<Long> j = new ArrayList();
    private List<String> k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f10292l = new ArrayList();
    private LinkedList<a> m = new LinkedList<>();
    private boolean x = false;
    private long y = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f10288A = 50;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f10298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f10299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f10300c;

        public a(String str, String str2, long j) {
            this.f10299b = str2;
            this.f10300c = j;
            this.f10298a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f10300c)) + " : " + this.f10298a + ' ' + this.f10299b;
        }
    }

    private b(Application application) {
        this.f10290h = application;
        this.g = application;
        if (application != null) {
            try {
                this.g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f10293n = activity.getClass().getName();
                        b.this.o = System.currentTimeMillis();
                        boolean unused = b.f10284b = bundle != null;
                        boolean unused2 = b.f10285c = true;
                        b.this.f10291i.add(b.this.f10293n);
                        b.this.j.add(Long.valueOf(b.this.o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f10293n, b.this.o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f10291i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f10291i.size()) {
                            b.this.f10291i.remove(iIndexOf);
                            b.this.j.remove(iIndexOf);
                        }
                        b.this.k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f10292l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.t = activity.getClass().getName();
                        b.this.f10295u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.f10289B == 0) {
                            b.this.x = false;
                            boolean unused = b.f10285c = false;
                            b.this.y = SystemClock.uptimeMillis();
                        } else if (b.this.f10289B < 0) {
                            b.n(b.this);
                            b.this.x = false;
                            boolean unused2 = b.f10285c = false;
                            b.this.y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.t, b.this.f10295u, d9.h.t0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.r = activity.getClass().getName();
                        b.this.s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.x) {
                            if (b.f10283a) {
                                b.k();
                                int unused = b.d = 1;
                                long unused2 = b.f = b.this.s;
                            }
                            if (!b.this.r.equals(b.this.t)) {
                                return;
                            }
                            if (b.f10285c && !b.f10284b) {
                                int unused3 = b.d = 4;
                                long unused4 = b.f = b.this.s;
                                return;
                            } else if (!b.f10285c) {
                                int unused5 = b.d = 3;
                                long unused6 = b.f = b.this.s;
                                return;
                            }
                        }
                        b.this.x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.r, b.this.s, d9.h.u0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f10294p = activity.getClass().getName();
                        b.this.q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f10294p, b.this.q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.v = activity.getClass().getName();
                        b.this.f10296w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.v, b.this.f10296w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int g(b bVar) {
        int i2 = bVar.f10289B;
        bVar.f10289B = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int l(b bVar) {
        int i2 = bVar.f10289B;
        bVar.f10289B = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int n(b bVar) {
        bVar.f10289B = 0;
        return 0;
    }

    public static /* synthetic */ boolean k() {
        f10283a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f10291i;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < this.f10291i.size(); i2++) {
                try {
                    jSONArray.put(a(this.f10291i.get(i2), this.j.get(i2).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.k;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                try {
                    jSONArray.put(a(this.k.get(i2), this.f10292l.get(i2).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f10293n, this.o));
                jSONObject.put("last_start_activity", a(this.f10294p, this.q));
                jSONObject.put("last_resume_activity", a(this.r, this.s));
                jSONObject.put("last_pause_activity", a(this.t, this.f10295u));
                jSONObject.put("last_stop_activity", a(this.v, this.f10296w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final String h() {
        return String.valueOf(this.r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.x;
    }

    public static long c() {
        return f;
    }

    public static b d() {
        if (f10287z == null) {
            synchronized (b.class) {
                try {
                    if (f10287z == null) {
                        f10287z = new b(com.apm.insight.e.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10287z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.y;
    }

    public static int b() {
        int i2 = d;
        if (i2 == 1) {
            return f10286e ? 2 : 1;
        }
        return i2;
    }

    public static void a() {
        f10286e = true;
    }

    private static JSONObject a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", str);
            jSONObject.put("time", j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(b bVar, String str, long j, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.m.size() >= bVar.f10288A) {
                    aVar = bVar.m.poll();
                    if (aVar != null) {
                        bVar.m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j);
                    bVar.m.add(aVar);
                }
                aVar.f10299b = str2;
                aVar.f10298a = str;
                aVar.f10300c = j;
            } catch (Throwable unused) {
            }
        }
    }
}
