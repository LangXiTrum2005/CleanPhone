package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgg extends zzhge {
    public zzhgg(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhge
    public final zzhgc zza(byte[] bArr, int i2) throws InvalidKeyException {
        return new zzhgf(bArr, i2);
    }
}
