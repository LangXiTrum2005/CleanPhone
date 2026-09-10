package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzbhu {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbhu(String str, Object obj, int i2) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i2;
    }

    public static zzbhu zza(String str, boolean z2) {
        return new zzbhu(str, Boolean.valueOf(z2), 1);
    }

    public static zzbhu zzb(String str, long j) {
        return new zzbhu(str, Long.valueOf(j), 2);
    }

    public static zzbhu zzc(String str, double d) {
        return new zzbhu(str, Double.valueOf(d), 3);
    }

    public static zzbhu zzd(String str, String str2) {
        return new zzbhu("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzbja zzbjaVarZza = zzbjc.zza();
        if (zzbjaVarZza == null) {
            if (zzbjc.zzb() != null) {
                zzbjc.zzb().zza();
            }
            return this.zzb;
        }
        int i2 = this.zzc - 1;
        if (i2 == 0) {
            return zzbjaVarZza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i2 != 1) {
            return i2 != 2 ? zzbjaVarZza.zzd(this.zza, (String) this.zzb) : zzbjaVarZza.zzc(this.zza, ((Double) this.zzb).doubleValue());
        }
        return zzbjaVarZza.zzb(this.zza, ((Long) this.zzb).longValue());
    }
}
