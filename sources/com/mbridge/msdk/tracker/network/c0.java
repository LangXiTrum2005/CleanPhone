package com.mbridge.msdk.tracker.network;

import android.util.Log;
import com.ironsource.X3;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f36910a = "TrackManager_Volley";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36911b = "com.mbridge.msdk.tracker.network.c0";

    public static void a(Throwable th2, String str, Object... objArr) {
        Log.e(f36910a, a(str, objArr), th2);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f36910a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f36910a, a(str, objArr));
    }

    private static String a(String str, Object... objArr) {
        String string;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f36911b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbJ = d5.u.j(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbJ.append(stackTrace[i10].getMethodName());
                string = sbJ.toString();
                Locale locale = Locale.US;
                long id2 = Thread.currentThread().getId();
                StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
                sb2.append(id2);
                sb2.append("] ");
                sb2.append(string);
                return defpackage.e.q(": ", str, sb2);
            }
        }
        string = "<unknown>";
        Locale locale2 = Locale.US;
        long id3 = Thread.currentThread().getId();
        StringBuilder sb3 = new StringBuilder(X3.j.f27834d);
        sb3.append(id3);
        sb3.append("] ");
        sb3.append(string);
        return defpackage.e.q(": ", str, sb3);
    }

    public static void d(String str, Object... objArr) {
    }
}
