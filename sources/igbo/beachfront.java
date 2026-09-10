package igbo;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: compiled from: AppOpsManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    public static class attabal {
        public static <T> T attabal(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String dern(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        public static int saneness(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }

    /* JADX INFO: compiled from: AppOpsManagerCompat.java */
    public static class saneness {
        public static int attabal(AppOpsManager appOpsManager, String str, int i, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        public static AppOpsManager dern(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        public static String saneness(Context context) {
            return context.getOpPackageName();
        }
    }

    public static int attabal(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return saneness(context, str, str2);
        }
        AppOpsManager appOpsManagerDern = saneness.dern(context);
        int iAttabal = saneness.attabal(appOpsManagerDern, str, Binder.getCallingUid(), str2);
        return iAttabal != 0 ? iAttabal : saneness.attabal(appOpsManagerDern, str, i, saneness.saneness(context));
    }

    public static String dern(String str) {
        return attabal.dern(str);
    }

    public static int saneness(Context context, String str, String str2) {
        return attabal.saneness((AppOpsManager) attabal.attabal(context, AppOpsManager.class), str, str2);
    }
}
