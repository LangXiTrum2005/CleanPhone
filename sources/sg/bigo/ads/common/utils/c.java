package sg.bigo.ads.common.utils;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static Activity a(View view) {
        for (int i2 = 0; i2 < 10000 && view != null; i2++) {
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public static synchronized int b(Context context) {
        try {
        } catch (Exception unused) {
            return 0;
        }
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static long c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static long d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static PackageInfo e(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(Context context, String str) {
        String installingPackageName;
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            installingPackageName = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(str).getInstallingPackageName() : context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception unused) {
            installingPackageName = "";
        }
        return installingPackageName == null ? "" : installingPackageName;
    }

    public static boolean g(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (AssertionError unused) {
            return "";
        }
    }

    public static int b(Context context, String str) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 256) != null ? 1 : -1;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return 0;
        }
    }

    public static synchronized String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (TextUtils.isEmpty(packageInfo.versionName)) {
                return "";
            }
            return packageInfo.versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
