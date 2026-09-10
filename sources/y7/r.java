package y7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q7.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f54310c = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InternalAppEventsLogger f54312b;

    public r(Context context, String str) {
        this.f54311a = str;
        this.f54312b = new InternalAppEventsLogger(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getPackageInfo(RemoteServiceWrapper.RECEIVER_SERVICE_PACKAGE, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Bundle bundle, String str) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            e0.B("LoginLogger", "Event: " + str + " | auth_logger_id=" + bundle.getString("0_auth_logger_id") + " | result=" + bundle.getString("2_result") + " | method=" + bundle.getString("3_method") + " | extras=" + bundle.getString("6_extras"));
            this.f54312b.logEventImplicitly(str, bundle);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
