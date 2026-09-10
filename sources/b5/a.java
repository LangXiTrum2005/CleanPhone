package b5;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.jvm.internal.n;
import m0.r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5491a = new a();

    public final r1 a(Context context) {
        n.f(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        n.e(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return r1.g(null, windowInsets);
    }
}
