package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.hn;
import com.google.android.gms.internal.ads.o81;
import com.google.android.gms.internal.ads.p81;
import java.util.Iterator;
import t6.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzo {
    public static final /* synthetic */ int zza = 0;

    public static void zza(String str) {
        if (!zzc()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        l lVar = com.google.android.gms.ads.internal.util.client.zzo.f11000a;
        Iterator itE = ((p81) lVar.f50551d).e(lVar, str);
        boolean z10 = true;
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return;
            }
            String str2 = (String) o81Var.next();
            if (z10) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z10 = false;
        }
    }

    public static void zzb(String str, Throwable th2) {
        if (zzc()) {
            Log.v("Ads", str, th2);
        }
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzo.zzm(2) && ((Boolean) hn.f15331a.o()).booleanValue();
    }
}
