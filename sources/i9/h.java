package i9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.applovin.shadow.okio.Segment;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f42932b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f42933c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42935e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f42931a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f42934d = new AtomicBoolean();

    public static void a(Context context, int i10) throws f, g {
        e eVar = e.f42929b;
        int iC = eVar.c(context, i10);
        if (iC != 0) {
            Intent intentB = eVar.b(context, iC, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iC);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentB != null) {
                throw new g(iC, intentB, "Google Play Services not available");
            }
            throw new f();
        }
    }

    public static boolean b(Context context) {
        try {
            if (!f42933c) {
                PackageInfo packageInfoF = r9.c.a(context).f(134217792, "com.google.android.gms");
                i.b(context);
                if (packageInfoF == null || i.e(packageInfoF, false) || !i.e(packageInfoF, true)) {
                    f42932b = false;
                } else {
                    f42932b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f42933c = true;
        }
        return f42932b || !"user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", Segment.SIZE).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
