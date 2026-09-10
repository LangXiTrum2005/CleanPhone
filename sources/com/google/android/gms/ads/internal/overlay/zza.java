package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.yh0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzad zzadVar, @Nullable zzaa zzaaVar, boolean z10, @Nullable yh0 yh0Var, String str, Bundle bundle) {
        int iZzn;
        if (z10) {
            try {
                iZzn = com.google.android.gms.ads.internal.zzt.zzc().zzn(context, intent.getData(), bundle);
                if (zzadVar != null) {
                    zzadVar.zzl();
                }
            } catch (ActivityNotFoundException e10) {
                String message = e10.getMessage();
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
                iZzn = 6;
            }
            if (zzaaVar != null) {
                zzaaVar.zzb(iZzn);
            }
            return iZzn == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            if (((Boolean) zzba.zzc().a(am.Oe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzac(context, intent, yh0Var, str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzY(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.zzl();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            String message2 = e11.getMessage();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message2);
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, @Nullable zzc zzcVar, zzad zzadVar, @Nullable zzaa zzaaVar, @Nullable yh0 yh0Var, String str) {
        int i10 = 0;
        if (zzcVar == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("No intent data for launcher overlay.");
            return false;
        }
        am.a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzadVar, zzaaVar, zzcVar.zzj, yh0Var, str, zzcVar.zzk);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.zzb;
        if (TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.zzc;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.zzd;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.zze;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i10 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzba.zzc().a(am.F5)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().a(am.E5)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent2);
            }
        }
        return zza(context, intent2, zzadVar, zzaaVar, zzcVar.zzj, yh0Var, str, zzcVar.zzk);
    }
}
