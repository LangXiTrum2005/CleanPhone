package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgbh implements zzgbb {
    private final int zza;
    private final byte[] zzb;

    public zzgbh(int i2, byte[] bArr) {
        this.zza = i2;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgbb
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbb
    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
