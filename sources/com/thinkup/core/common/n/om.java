package com.thinkup.core.common.n;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.common.ooo.onm;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class om implements Application.ActivityLifecycleCallbacks {
    public static final String m = "end_time";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f41927n = "psid";
    public static final String o = "start_time";
    public static final String o0 = "launch_mode";
    public static final int om = 1;
    public static final int oo = 0;
    JSONObject mo;
    long on;
    private final String mn = "om";
    Runnable mm = new Runnable() { // from class: com.thinkup.core.common.n.om.1
        @Override // java.lang.Runnable
        public final void run() {
            om.o(om.this);
        }
    };
    int m0 = 0;
    private final Handler n0 = com.thinkup.core.common.ooo.m.m.o().o(14);

    public om(long j) {
        this.on = j;
    }

    private void m(long j) {
        String strO00 = o0n.m().o00();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("psid", o0n.m().o0m());
            jSONObject.put("start_time", this.on);
            jSONObject.put("end_time", System.currentTimeMillis());
            jSONObject.put("launch_mode", this.m0);
            this.mo = jSONObject;
            onm.m(o0n.m().on(), oo0.m.o, strO00 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(o0n.m().on()).m(strO00);
        if (mVarM.m0n() == 1) {
            this.n0.postDelayed(this.mm, mVarM.m0o());
        }
        System.currentTimeMillis();
    }

    private void o() {
        if (this.mo != null) {
            onm.m(o0n.m().on(), oo0.m.o, o0n.m().o00() + "playRecord", "");
            this.on = 0L;
            JSONObject jSONObject = this.mo;
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            this.mo = null;
            com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
        }
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
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Handler handler = this.n0;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.thinkup.core.common.n.om.3
                @Override // java.lang.Runnable
                public final void run() {
                    om.m(om.this, jCurrentTimeMillis);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Handler handler = this.n0;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.thinkup.core.common.n.om.2
                @Override // java.lang.Runnable
                public final void run() {
                    om.o(om.this, jCurrentTimeMillis);
                }
            });
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

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    private void o(long j) {
        long j2;
        Handler handler = this.n0;
        if (handler != null) {
            handler.removeCallbacks(this.mm);
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        JSONObject jSONObject = this.mo;
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            if (System.currentTimeMillis() - jOptLong2 > mVarH.m0o()) {
                onm.m(o0n.m().on(), oo0.m.o, o0n.m().o00() + "playRecord", "");
                com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
                j2 = 0;
                this.on = 0L;
            } else {
                j2 = 0;
            }
        } else {
            j2 = 0;
        }
        this.mo = null;
        if (this.on == j2) {
            this.m0 = 1;
            try {
                this.on = o0n.m().o(o0n.m().on(), o0n.m().o00(), 1);
            } catch (Exception unused) {
            }
        } else {
            String strO00 = o0n.m().o00();
            onm.m(o0n.m().on(), oo0.m.o, strO00 + "playRecord", "");
        }
        if (this.on == 0) {
            this.on = System.currentTimeMillis();
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void m(om omVar, long j) {
        String strO00 = o0n.m().o00();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("psid", o0n.m().o0m());
            jSONObject.put("start_time", omVar.on);
            jSONObject.put("end_time", System.currentTimeMillis());
            jSONObject.put("launch_mode", omVar.m0);
            omVar.mo = jSONObject;
            onm.m(o0n.m().on(), oo0.m.o, strO00 + "playRecord", jSONObject.toString());
            jSONObject.toString();
        } catch (Exception unused) {
        }
        com.thinkup.core.oo.m mVarM = com.thinkup.core.oo.o0.o(o0n.m().on()).m(strO00);
        if (mVarM.m0n() == 1) {
            omVar.n0.postDelayed(omVar.mm, mVarM.m0o());
        }
        System.currentTimeMillis();
    }

    public static /* synthetic */ void o(om omVar) {
        if (omVar.mo != null) {
            onm.m(o0n.m().on(), oo0.m.o, o0n.m().o00() + "playRecord", "");
            omVar.on = 0L;
            JSONObject jSONObject = omVar.mo;
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            omVar.mo = null;
            com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    public static /* synthetic */ void o(om omVar, long j) {
        long j2;
        Handler handler = omVar.n0;
        if (handler != null) {
            handler.removeCallbacks(omVar.mm);
        }
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        JSONObject jSONObject = omVar.mo;
        if (jSONObject != null) {
            long jOptLong = jSONObject.optLong("start_time");
            long jOptLong2 = jSONObject.optLong("end_time");
            String strOptString = jSONObject.optString("psid");
            int iOptInt = jSONObject.optInt("launch_mode");
            if (System.currentTimeMillis() - jOptLong2 > mVarH.m0o()) {
                onm.m(o0n.m().on(), oo0.m.o, o0n.m().o00() + "playRecord", "");
                com.thinkup.core.common.oo0.oo.o(iOptInt == 1 ? 3 : 1, jOptLong, jOptLong2, strOptString);
                j2 = 0;
                omVar.on = 0L;
            } else {
                j2 = 0;
            }
        } else {
            j2 = 0;
        }
        omVar.mo = null;
        if (omVar.on == j2) {
            omVar.m0 = 1;
            try {
                omVar.on = o0n.m().o(o0n.m().on(), o0n.m().o00(), 1);
            } catch (Exception unused) {
            }
        } else {
            String strO00 = o0n.m().o00();
            onm.m(o0n.m().on(), oo0.m.o, strO00 + "playRecord", "");
        }
        if (omVar.on == 0) {
            omVar.on = System.currentTimeMillis();
        }
        System.currentTimeMillis();
    }
}
