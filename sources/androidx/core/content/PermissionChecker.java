package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.AppOpsManagerCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    public static int a(Context context, String str) {
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strC = AppOpsManagerCompat.c(str);
            if (strC != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                if (((Process.myUid() == iMyUid && Objects.equals(context.getPackageName(), packageName)) ? AppOpsManagerCompat.a(context, strC, iMyUid, packageName) : AppOpsManagerCompat.b(context, strC, packageName)) != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }
}
