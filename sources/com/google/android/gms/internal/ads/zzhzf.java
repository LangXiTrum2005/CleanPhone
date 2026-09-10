package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzf extends zzhzj {
    private final int zzc;
    private final int zzd;

    public zzhzf(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzhzl.zzC(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhzj, com.google.android.gms.internal.ads.zzhzl
    public final byte zza(int i2) {
        zzhzl.zzB(i2, this.zzd);
        return ((zzhzj) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhzj, com.google.android.gms.internal.ads.zzhzl
    public final byte zzb(int i2) {
        return ((zzhzj) this).zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhzj, com.google.android.gms.internal.ads.zzhzl
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhzj
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhzj, com.google.android.gms.internal.ads.zzhzl
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(((zzhzj) this).zza, this.zzc + i2, bArr, i3, i4);
    }
}
