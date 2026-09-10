package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {

    public static class Api23Impl {
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    public static class Api29Impl {
        public static int a(AppOpsManager appOpsManager, String str, int i2, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        public static String b(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, String str, int i2, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return b(context, str, str2);
        }
        AppOpsManager appOpsManagerC = Api29Impl.c(context);
        int iA = Api29Impl.a(appOpsManagerC, str, Binder.getCallingUid(), str2);
        return iA != 0 ? iA : Api29Impl.a(appOpsManagerC, str, i2, Api29Impl.b(context));
    }

    public static int b(Context context, String str, String str2) {
        return Api23Impl.c((AppOpsManager) Api23Impl.a(context, AppOpsManager.class), str, str2);
    }

    public static String c(String str) {
        return Api23Impl.d(str);
    }
}
