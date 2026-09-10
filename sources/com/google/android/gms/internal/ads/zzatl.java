package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatl implements zzatk {
    @Override // com.google.android.gms.internal.ads.zzatk
    public final byte zza(zzatw zzatwVar, int i2) {
        return zzatwVar.zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final zzatw zzb(zzatw zzatwVar, int i2, int i3) {
        byte[] bArr;
        int length;
        if (i2 < 0 || i2 > i3 || i3 > (length = (bArr = zzatwVar.zza).length) || i2 > i3 || i3 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzatw(zzatw.zzh(bArr, i2, i3 - i2));
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final zzatk zzc() {
        return new zzatl();
    }
}
