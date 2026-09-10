package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.o81;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.tt0;
import java.util.Iterator;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f11000a = new l(new tt0(0, 7));

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(lineNumber).length());
        sb2.append(str);
        sb2.append(" @");
        sb2.append(lineNumber);
        return sb2.toString();
    }

    public static void zzd(String str) {
        if (!zzm(3)) {
            return;
        }
        if (str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        l lVar = f11000a;
        Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
        boolean z10 = true;
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return;
            }
            String str2 = (String) o81Var.next();
            if (z10) {
                Log.d("Ads", str2);
            } else {
                Log.d("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zze(String str, Throwable th2) {
        if (zzm(3)) {
            Log.d("Ads", str, th2);
        }
    }

    public static void zzf(String str) {
        if (!zzm(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        l lVar = f11000a;
        Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
        boolean z10 = true;
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return;
            }
            String str2 = (String) o81Var.next();
            if (z10) {
                Log.e("Ads", str2);
            } else {
                Log.e("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzg(String str, Throwable th2) {
        if (zzm(6)) {
            Log.e("Ads", str, th2);
        }
    }

    public static void zzh(String str) {
        if (!zzm(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        l lVar = f11000a;
        Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
        boolean z10 = true;
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return;
            }
            String str2 = (String) o81Var.next();
            if (z10) {
                Log.i("Ads", str2);
            } else {
                Log.i("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzi(String str) {
        if (!zzm(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        l lVar = f11000a;
        Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
        boolean z10 = true;
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return;
            }
            String str2 = (String) o81Var.next();
            if (z10) {
                Log.w("Ads", str2);
            } else {
                Log.w("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzj(String str, Throwable th2) {
        if (zzm(5)) {
            Log.w("Ads", str, th2);
        }
    }

    public static void zzl(String str, @Nullable Throwable th2) {
        if (zzm(5)) {
            if (th2 != null) {
                zzj(a(str), th2);
            } else {
                zzi(a(str));
            }
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
