package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhl extends zzmf implements zznn {
    private static final zzhl zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        zzhl zzhlVar = new zzhl();
        zzf = zzhlVar;
        zzmf.zzcp(zzhl.class, zzhlVar);
    }

    private zzhl() {
    }

    public static zzhk zza() {
        return (zzhk) zzf.zzck();
    }

    public final int zzc() {
        int iZza = zzhj.zza(this.zzd);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final int zzd() {
        int iZza = zzhn.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zze(int i2) {
        this.zzd = i2 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzf(int i2) {
        this.zze = i2 - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", zzhi.zza, "zze", zzhm.zza});
        }
        if (i3 == 3) {
            return new zzhl();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new zzhk(bArr);
        }
        if (i3 == 5) {
            return zzf;
        }
        throw null;
    }
}
