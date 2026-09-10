package picketboat;

import android.content.Context;
import android.os.Process;

/* JADX INFO: compiled from: PermissionChecker.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {
    public static int attabal(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strDern = igbo.beachfront.dern(str);
        if (strDern == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i2 || !technofreak.marial.attabal(context.getPackageName(), str2)) ? igbo.beachfront.saneness(context, strDern, str2) : igbo.beachfront.attabal(context, i2, strDern, str2)) == 0 ? 0 : -2;
    }

    public static int saneness(Context context, String str) {
        return attabal(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
