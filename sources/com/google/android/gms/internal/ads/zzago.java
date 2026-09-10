package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
final class zzago implements zzagj {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzago(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.zza = i2;
        this.zzb = i4;
        this.zzc = i5;
        this.zzd = i6;
        this.zze = i7;
        this.zzf = i8;
    }

    public static zzago zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(12);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC5 = zzerVar.zzC();
        int iZzC6 = zzerVar.zzC();
        zzerVar.zzk(4);
        return new zzago(iZzC, iZzC2, iZzC3, iZzC4, iZzC5, iZzC6, zzerVar.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final int zza() {
        return 1752331379;
    }

    public final int zzc() {
        int i2 = this.zza;
        if (i2 == 1935960438) {
            return 2;
        }
        if (i2 == 1935963489) {
            return 1;
        }
        if (i2 == 1937012852) {
            return 3;
        }
        zzee.zzc("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i2))));
        return -1;
    }

    public final long zzd() {
        return zzfj.zzt(this.zzd, ((long) this.zzb) * 1000000, this.zzc, RoundingMode.DOWN);
    }
}
