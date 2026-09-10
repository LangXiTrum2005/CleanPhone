package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes4.dex */
public final class zzee {
    private static final Object zza = new Object();

    @Pure
    public static void zza(String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzb(String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzc(String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzd(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th));
        }
    }

    @Pure
    public static void zze(String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    @Pure
    public static void zzf(String str, String str2, Throwable th) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th));
        }
    }

    @Pure
    public static String zzg(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
        int length = String.valueOf(str).length();
        return androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, IOUtils.LINE_SEPARATOR_UNIX);
    }
}
