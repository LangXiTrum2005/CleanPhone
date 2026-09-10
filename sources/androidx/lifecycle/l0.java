package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m event) {
        kotlin.jvm.internal.n.f(event, "event");
        if (activity instanceof v) {
            o lifecycle = ((v) activity).getLifecycle();
            if (lifecycle instanceof x) {
                ((x) lifecycle).e(event);
            }
        }
    }

    public static void b(Activity activity) {
        n0.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new n0.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new n0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
