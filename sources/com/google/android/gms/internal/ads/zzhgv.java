package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes4.dex */
final class zzhgv extends ThreadLocal {
    @Nullable
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhwc.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzhfo.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
