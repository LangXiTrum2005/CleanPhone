package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import com.ironsource.Cf;
import com.ironsource.InterfaceC0259b4;
import com.ironsource.Kb;
import com.ironsource.dh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ContextProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ContextProvider f28559b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0259b4 f28560a = new Cf();

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f28559b == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f28559b == null) {
                        f28559b = new ContextProvider();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f28559b;
    }

    public Context getActiveContext() {
        Activity activityA = this.f28560a.a();
        return activityA != null ? activityA : this.f28560a.b();
    }

    public Context getApplicationContext() {
        Context contextB = this.f28560a.b();
        Activity activityA = this.f28560a.a();
        return (contextB != null || activityA == null) ? contextB : activityA.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f28560a.a();
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f28560a.a(activity);
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f28560a.a(context);
        }
    }

    public void updateStrategyIfNeeded() {
        if (Kb.Y().h().t()) {
            this.f28560a = new dh(this.f28560a.a(), this.f28560a.b());
        }
    }
}
