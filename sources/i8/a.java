package i8;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ironsource.X3;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l8.b f42908a;

    /* JADX WARN: Code duplicated, block: B:11:0x0047  */
    public static boolean d(Context context, String permission) {
        boolean z10;
        n.f(context, "context");
        n.f(permission, "permission");
        n.f(context, "context");
        n.f(permission, "permission");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(applicationInfo.packageName, PackageManager.PackageInfoFlags.of(4096L)) : context.getPackageManager().getPackageInfo(applicationInfo.packageName, 4096)).requestedPermissions;
        if (strArr != null) {
            z10 = k.c0(strArr, permission);
        }
        return z10 && e(context, permission);
    }

    public static boolean e(Context context, String permission) {
        n.f(context, "context");
        n.f(permission, "permission");
        return b0.b.a(context, permission) == 0;
    }

    public static void i(c permissionsUtils, ArrayList arrayList, int i10) {
        n.f(permissionsUtils, "permissionsUtils");
        Activity activity = permissionsUtils.f42909a;
        if (activity == null) {
            throw new NullPointerException("Activity for the permission request is not exist.");
        }
        ArrayList arrayList2 = permissionsUtils.f42912d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        b0.b.i(activity, (String[]) arrayList.toArray(new String[0]), i10);
        l8.a.a("requestPermission: " + arrayList + " for code " + i10);
    }

    public abstract e8.c a(Application application, int i10);

    public void b(c permissionsUtils, Context context, String[] permissions, int[] grantResults, ArrayList needToRequestPermissionsList, ArrayList deniedPermissionsList, ArrayList grantedPermissionsList, int i10) {
        n.f(permissionsUtils, "permissionsUtils");
        n.f(context, "context");
        n.f(permissions, "permissions");
        n.f(grantResults, "grantResults");
        n.f(needToRequestPermissionsList, "needToRequestPermissionsList");
        n.f(deniedPermissionsList, "deniedPermissionsList");
        n.f(grantedPermissionsList, "grantedPermissionsList");
        throw new UnsupportedOperationException("handlePermissionResult is not implemented, please implement it in your delegate.");
    }

    public abstract boolean c(Context context);

    public final boolean f(Context context, String... permission) {
        n.f(context, "context");
        n.f(permission, "permission");
        boolean z10 = false;
        for (String str : permission) {
            if (!d(context, str)) {
                l8.a.a(X3.j.f27834d + getClass().getSimpleName() + "] havePermissions: " + k.C0(permission) + ", result: " + z10);
                return z10;
            }
        }
        z10 = true;
        l8.a.a(X3.j.f27834d + getClass().getSimpleName() + "] havePermissions: " + k.C0(permission) + ", result: " + z10);
        return z10;
    }

    public void g(c permissionsUtils, Application context, int i10, l8.b bVar) {
        n.f(permissionsUtils, "permissionsUtils");
        n.f(context, "context");
        l8.a.a(X3.j.f27834d + getClass().getSimpleName() + "] presentLimited is not implemented");
        bVar.b(null);
    }

    public abstract void h(c cVar, Context context, int i10, boolean z10);
}
