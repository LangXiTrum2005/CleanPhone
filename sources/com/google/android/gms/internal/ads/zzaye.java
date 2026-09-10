package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaye {
    public static final String zza(Context context, String str, long j, boolean z2) {
        try {
            zzawy zzawyVarZza = zzawz.zza();
            zzawyVarZza.zzb(str);
            zzawyVarZza.zza("0.460000000");
            zzawyVarZza.zzd(context.getPackageName());
            zzawyVarZza.zzf((System.currentTimeMillis() - j) / 1000);
            zzawyVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzawyVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzawyVarZza.zze(-1L);
            }
            zzaxf zzaxfVarZzc = zzaxp.zzc(((zzawz) zzawyVarZza.zzbu()).zzaN(), null);
            zzaxfVarZzc.zzc(5);
            zzaxfVarZzc.zzd(2);
            return Base64.encodeToString(((zzaxg) zzaxfVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
