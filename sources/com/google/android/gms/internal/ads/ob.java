package com.google.android.gms.internal.ads;

import android.util.Log;
import com.ironsource.X3;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f18214a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f18215b = ob.class.getName();

    public static void a(String str, Object... objArr) {
        if (f18214a) {
            Log.v("Volley", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", d(str, objArr));
    }

    public static String d(String str, Object... objArr) {
        String strJ;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i10 = 2; i10 < stackTrace.length; i10++) {
            if (!stackTrace[i10].getClassName().equals(f18215b)) {
                String className = stackTrace[i10].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i10].getMethodName();
                strJ = q4.a.j(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, ".", methodName);
                Locale locale = Locale.US;
                long id2 = Thread.currentThread().getId();
                StringBuilder sb2 = new StringBuilder(X3.j.f27834d);
                sb2.append(id2);
                sb2.append("] ");
                sb2.append(strJ);
                return defpackage.e.q(": ", str2, sb2);
            }
        }
        strJ = "<unknown>";
        Locale locale2 = Locale.US;
        long id3 = Thread.currentThread().getId();
        StringBuilder sb3 = new StringBuilder(X3.j.f27834d);
        sb3.append(id3);
        sb3.append("] ");
        sb3.append(strJ);
        return defpackage.e.q(": ", str2, sb3);
    }
}
