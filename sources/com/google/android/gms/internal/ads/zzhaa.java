package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhaa {
    public static final zzhpd zza(zzhan zzhanVar) {
        try {
            return ((zzhka) zzhje.zza().zzk(null, zzhka.class)).zzc();
        } catch (GeneralSecurityException e2) {
            throw new zzhkk("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(AbstractJsonLexerKt.NULL), e2);
        }
    }

    public static final zzhan zzb(zzhan zzhanVar) throws GeneralSecurityException {
        return zzhanVar != null ? zzhanVar : zzhat.zzb(zza(null).zzaN());
    }
}
