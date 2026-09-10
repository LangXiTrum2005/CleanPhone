package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjy extends zzgjz {
    public zzgjy(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgjz
    public final zzgjx zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgjw(bArr, i);
    }
}
