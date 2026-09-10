package b0;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static void b(Notification.Action.Builder builder, boolean z10) {
        builder.setAuthenticationRequired(z10);
    }
}
