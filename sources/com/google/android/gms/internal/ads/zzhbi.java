package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzhbi implements zzgzq {
    private final zzhjp zza;

    @Override // com.google.android.gms.internal.ads.zzgzq
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] bArrZza = ((zzhbg) it.next()).zza.zza(bArr, bArr2);
                int length = bArr.length;
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
