package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(callback, "callback");
        activity.registerActivityLifecycleCallbacks(callback);
    }
}
