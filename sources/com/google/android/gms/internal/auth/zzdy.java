package com.google.android.gms.internal.auth;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzee.zzi(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.h(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a.g(i2, i3, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
