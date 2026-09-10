package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final class zzhwo implements zzhmn {
    final zzhmn zza;
    final zzhmn zzb;

    public /* synthetic */ zzhwo(zzhmn zzhmnVar, zzhmn zzhmnVar2, byte[] bArr) {
        this.zza = zzhmnVar;
        this.zzb = zzhmnVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhmn
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i2) : this.zzb.zza(bArr, i2);
    }
}
