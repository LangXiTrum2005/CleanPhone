package com.google.android.gms.internal.ads;

import android.util.Log;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarw {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable("Volley", 2);
    private static final String zzc = zzarw.class.getName();

    public static void zza(String str, Object... objArr) {
        if (zzb) {
            Log.v(zza, zze(str, objArr));
        }
    }

    public static void zzb(String str, Object... objArr) {
        Log.d(zza, zze(str, objArr));
    }

    public static void zzc(String str, Object... objArr) {
        Log.e(zza, zze(str, objArr));
    }

    public static void zzd(Throwable th, String str, Object... objArr) {
        Log.e(zza, zze(str, objArr), th);
    }

    private static String zze(String str, Object... objArr) {
        String strS;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i2 = 2; i2 < stackTrace.length; i2++) {
            if (!stackTrace[i2].getClassName().equals(zzc)) {
                String className = stackTrace[i2].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length()), strSubstring2, mo.ono, methodName);
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder(d9.i.d);
                sb.append(id);
                sb.append("] ");
                sb.append(strS);
                return android.support.v4.media.a.r(sb, ": ", str2);
            }
        }
        strS = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder(d9.i.d);
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strS);
        return android.support.v4.media.a.r(sb2, ": ", str2);
    }
}
