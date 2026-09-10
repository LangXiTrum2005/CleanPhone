package com.smartdigimkt.s6;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.smartdigimkt.n8.p;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    public static final String g = "start_time";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f38196h = "end_time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f38197i = "psid";
    public static final String j = "launch_mode";
    public static final int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f38198l = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f38200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f38201c;
    JSONObject d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38199a = "a";
    Runnable f = new RunnableC0583a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f38202e = com.smartdigimkt.l7.b.a().a(14);

    /* JADX INFO: renamed from: com.smartdigimkt.s6.a$a, reason: collision with other inner class name */
    public class RunnableC0583a implements Runnable {
        public RunnableC0583a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a();
        }
    }

    public class b implements Runnable {
        final /* synthetic */ long X;

        public b(long j) {
            this.X = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.X);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ long X;

        public c(long j) {
            this.X = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b(this.X);
        }
    }

    public a(int i2, long j2) {
        this.f38201c = i2;
        this.f38200b = j2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f38202e;
        if (handler != null) {
            handler.post(new c(jCurrentTimeMillis));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Handler handler = this.f38202e;
        if (handler != null) {
            handler.post(new b(jCurrentTimeMillis));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j2) {
        String strF = com.smartdigimkt.m6.b.p().f();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("psid", com.smartdigimkt.m6.b.p().q());
            jSONObject.put("start_time", this.f38200b);
            jSONObject.put("end_time", System.currentTimeMillis());
            jSONObject.put("launch_mode", this.f38201c);
            this.d = jSONObject;
            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", strF + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        if (aVarB.I0() == 1) {
            this.f38202e.postDelayed(this.f, aVarB.l0());
        }
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d != null) {
            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.m6.b.p().f() + "playRecord", "");
            this.f38200b = 0L;
            JSONObject jSONObject = this.d;
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            this.d = null;
            com.smartdigimkt.i7.d.a(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    public void a(long j2) {
        long j3;
        Handler handler = this.f38202e;
        if (handler != null) {
            handler.removeCallbacks(this.f);
        }
        com.smartdigimkt.l8.a aVarB = com.smartdigimkt.k8.a.e().b();
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            if (System.currentTimeMillis() - jOptLong2 > aVarB.l0()) {
                p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", com.smartdigimkt.m6.b.p().f() + "playRecord", "");
                com.smartdigimkt.i7.d.a(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
                j3 = 0;
                this.f38200b = 0L;
            } else {
                j3 = 0;
            }
        } else {
            j3 = 0;
        }
        this.d = null;
        if (this.f38200b == j3) {
            this.f38201c = 1;
            try {
                this.f38200b = com.smartdigimkt.m6.b.p().a(com.smartdigimkt.m6.b.p().k(), com.smartdigimkt.m6.b.p().f(), 1);
            } catch (Exception unused) {
            }
        } else {
            String strF = com.smartdigimkt.m6.b.p().f();
            p.b(com.smartdigimkt.m6.b.p().k(), "sdm_sdk", strF + "playRecord", "");
        }
        if (this.f38200b == 0) {
            this.f38200b = System.currentTimeMillis();
        }
        System.currentTimeMillis();
    }
}
