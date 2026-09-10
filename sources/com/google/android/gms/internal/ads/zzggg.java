package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzggg {
    private final Context zza;
    private final zzgnc zzb;
    private final zzgec zzc;
    private final String zzd;

    public zzggg(Context context, zzgnc zzgncVar, zzgec zzgecVar, zzgad zzgadVar) {
        this.zza = context;
        this.zzb = zzgncVar;
        this.zzc = zzgecVar;
        this.zzd = zzgadVar.zzb();
    }

    public final String zza(boolean z2, long j) {
        String string;
        zzgna zzgnaVarZza = this.zzb.zza(55);
        try {
            try {
                try {
                    zzgnaVarZza.zza();
                    zzawy zzawyVarZza = zzawz.zza();
                    zzawyVarZza.zzb(this.zzd);
                    zzawyVarZza.zza("0.815976881");
                    Context context = this.zza;
                    zzawyVarZza.zzd(context.getPackageName());
                    zzawyVarZza.zzc(System.currentTimeMillis() / 1000);
                    zzawyVarZza.zzf((System.currentTimeMillis() - j) / 1000);
                    try {
                        zzawyVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzawyVarZza.zze(-1L);
                    }
                    zzgec zzgecVar = this.zzc;
                    if (!zzgecVar.zzc()) {
                        zzgecVar.zza();
                    }
                    zzaxf zzaxfVarZzf = zzgecVar.zzf(((zzawz) zzawyVarZza.zzbu()).zzaN(), null);
                    zzaxfVarZzf.zzc(5);
                    zzaxfVarZzf.zzd(2);
                    string = zzgay.zza(((zzaxg) zzaxfVarZzf.zzbu()).zzaN(), true);
                } catch (Throwable th) {
                    zzgnaVarZza.zzb(th);
                    throw th;
                }
            } catch (UnsupportedEncodingException e2) {
                zzgnaVarZza.zzb(e2);
                string = Integer.toString(7);
            }
            zzgnaVarZza.zzc();
            return string;
        } catch (Throwable th2) {
            zzgnaVarZza.zzc();
            throw th2;
        }
    }
}
