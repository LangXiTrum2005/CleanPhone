package b0;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f5147d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static k0 f5150g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f5152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5146c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f5148e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f5149f = new Object();

    public l0(Context context) {
        this.f5151a = context;
        this.f5152b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i10, String str) {
        this.f5152b.cancel(str, i10);
    }

    public final void b(String str, int i10, Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras == null || !extras.getBoolean("android.support.useSideChannel")) {
            this.f5152b.notify(str, i10, notification);
            return;
        }
        h0 h0Var = new h0(this.f5151a.getPackageName(), i10, str, notification);
        synchronized (f5149f) {
            try {
                if (f5150g == null) {
                    f5150g = new k0(this.f5151a.getApplicationContext());
                }
                f5150g.f5141b.obtainMessage(0, h0Var).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f5152b.cancel(str, i10);
    }
}
