package k;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, v vVar) {
        Objects.requireNonNull(vVar);
        com.ironsource.sdk.controller.w wVar = new com.ironsource.sdk.controller.w(vVar, 2);
        i0.a.e(obj).registerOnBackInvokedCallback(1000000, wVar);
        return wVar;
    }

    public static void c(Object obj, Object obj2) {
        i0.a.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
