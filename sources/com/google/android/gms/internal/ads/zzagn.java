package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzagn implements zzagj {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagn(int i2, int i3, int i4, int i5) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
    }

    public static zzagn zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagn(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final int zza() {
        return 1751742049;
    }
}
