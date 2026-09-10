package ud;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mb.g f52130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd.j f52131b;

    public o(mb.g firebaseApp, xd.j settings, ak.k backgroundDispatcher, w0 sessionsActivityLifecycleCallbacks) {
        kotlin.jvm.internal.n.f(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.n.f(settings, "settings");
        kotlin.jvm.internal.n.f(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.n.f(sessionsActivityLifecycleCallbacks, "sessionsActivityLifecycleCallbacks");
        this.f52130a = firebaseApp;
        this.f52131b = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.7.");
        firebaseApp.a();
        Context applicationContext = firebaseApp.f45928a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(sessionsActivityLifecycleCallbacks);
            cn.d0.w(cn.d0.b(backgroundDispatcher), null, new b4.c(this, sessionsActivityLifecycleCallbacks, (ak.f) null, 13), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
