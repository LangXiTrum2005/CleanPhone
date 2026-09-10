package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfcc {
    private final zzbza zza;
    private final int zzb;

    public zzfcc(zzbza zzbzaVar, int i2) {
        this.zza = zzbzaVar;
        this.zzb = i2;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return zzgqr.zza(this.zza.zza.getString("ms"));
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    public final boolean zzg() {
        return this.zza.zzk;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    public final int zzi() {
        Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            switch (bundle.getString("query_info_type", "")) {
                case "requester_type_0":
                    return 0;
                case "requester_type_1":
                    return 1;
                case "requester_type_2":
                    return 2;
                case "requester_type_3":
                    return 3;
                case "requester_type_4":
                    return 4;
                case "requester_type_5":
                    return 5;
                case "requester_type_6":
                    return 6;
                case "requester_type_7":
                    return 7;
                case "requester_type_8":
                    return 8;
            }
        }
        return -1;
    }

    public final int zzj() {
        return this.zza.zzo;
    }
}
