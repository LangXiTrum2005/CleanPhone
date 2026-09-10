package unliveable;

import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: Logging.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {
    public static String attabal(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void beachfront(String str, String str2, Object obj) {
        if (Log.isLoggable(marial(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void competently(String str, String str2, Object obj) {
        if (Log.isLoggable(marial(str), 5)) {
            String.format(str2, obj);
        }
    }

    public static void dern(String str, String str2, Object... objArr) {
        if (Log.isLoggable(marial(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static String marial(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return attabal("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    public static void saneness(String str, String str2, Object obj) {
        if (Log.isLoggable(marial(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void wireman(String str, String str2, Throwable th) {
        Log.isLoggable(marial(str), 6);
    }
}
