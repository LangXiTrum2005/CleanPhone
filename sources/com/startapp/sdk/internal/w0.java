package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public final class w0 extends l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jh f41597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41599c;
    public boolean d;

    public w0(jh jhVar) {
        this.f41597a = jhVar;
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        int i2 = this.f41598b + 1;
        this.f41598b = i2;
        if (i2 != 1 || this.f41599c) {
            return;
        }
        if (!this.d) {
            this.d = true;
            if (this.f41597a.g != null) {
                g9 g9Var = new g9(h9.f41042i);
                g9Var.j = false;
                try {
                    com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f40723U.f41603a;
                    if (aVar != null) {
                        ((w9) aVar.q.a()).a(g9Var);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        jh jhVar = this.f41597a;
        Application application = jhVar.g;
        if (application != null) {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(application).g.a();
            ((m8) yhVar.f41716b.a()).f41243a.post(new qh(yhVar));
            v0 v0Var = (v0) com.startapp.sdk.components.a.a(jhVar.g).f40732Q.a();
            v0Var.f41553a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = v0Var.f41556e;
            v0Var.f41554b.getClass();
            AppSessionConfig appSessionConfigJ = MetaData.E().j();
            if (jElapsedRealtime > Math.max(0L, appSessionConfigJ != null ? appSessionConfigJ.a() : TTAdConstant.AD_MAX_EVENT_TIME) + j || v0Var.d <= 0) {
                v0Var.d = jElapsedRealtime;
                v0Var.f41555c.clear();
            }
        }
        if (jhVar.g != null) {
            g9 g9Var2 = new g9(h9.f41042i);
            g9Var2.j = false;
            try {
                com.startapp.sdk.components.a aVar2 = com.startapp.sdk.components.a.f40723U.f41603a;
                if (aVar2 != null) {
                    ((w9) aVar2.q.a()).a(g9Var2);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.l6, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        this.f41598b--;
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.f41599c = zIsChangingConfigurations;
        if (this.f41598b != 0 || zIsChangingConfigurations) {
            return;
        }
        jh jhVar = this.f41597a;
        Application application = jhVar.g;
        if (application != null) {
            yh yhVar = (yh) com.startapp.sdk.components.a.a(application).g.a();
            ((m8) yhVar.f41716b.a()).f41243a.post(new rh(yhVar));
            v0 v0Var = (v0) com.startapp.sdk.components.a.a(jhVar.g).f40732Q.a();
            v0Var.f41553a.getClass();
            v0Var.f41556e = SystemClock.elapsedRealtime();
        }
        if (jhVar.g != null) {
            g9 g9Var = new g9(h9.f41042i);
            g9Var.j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f40723U.f41603a;
                if (aVar != null) {
                    ((w9) aVar.q.a()).a(g9Var);
                }
            } catch (Throwable unused) {
            }
        }
        Application application2 = jhVar.g;
        if (application2 != null) {
            try {
                ((pc) com.startapp.sdk.components.a.a(application2).f40744w.a()).b();
            } catch (Throwable th) {
                g9.a(th);
            }
            if (MetaData.E().U() == null || !MetaData.E().U().h()) {
                return;
            }
            lg lgVar = (lg) com.startapp.sdk.components.a.a(application2).x.a();
            try {
                SensorManager sensorManager = lgVar.f;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(lgVar.f41225n);
                }
            } catch (Throwable th2) {
                if (lgVar.a(2)) {
                    g9.a(th2);
                }
            }
        }
    }
}
