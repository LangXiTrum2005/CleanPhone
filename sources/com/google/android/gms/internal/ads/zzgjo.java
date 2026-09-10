package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
final class zzgjo extends ThreadLocal {
    @Nullable
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzguw.zza.zza("ChaCha20-Poly1305");
            if (zzgjp.zzf(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
