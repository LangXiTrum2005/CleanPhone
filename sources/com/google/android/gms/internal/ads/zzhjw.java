package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjw {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhjw(zzhjt zzhjtVar, byte[] bArr) {
        this.zza = new HashMap(zzhjtVar.zzd());
        this.zzb = new HashMap(zzhjtVar.zze());
    }

    public static zzhjt zza() {
        return new zzhjt(null);
    }

    public final Object zzb(zzgzx zzgzxVar, Class cls) throws GeneralSecurityException {
        zzhju zzhjuVar = new zzhju(zzgzxVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhjuVar)) {
            return ((zzhjs) map.get(zzhjuVar)).zza(zzgzxVar);
        }
        String string = zzhjuVar.toString();
        throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zzc(zzhih zzhihVar, zzhip zzhipVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhjy zzhjyVar = (zzhjy) map.get(cls);
        return zzhjyVar.zze(zzhihVar, zzhipVar, new zzhjx() { // from class: com.google.android.gms.internal.ads.zzhjv
            @Override // com.google.android.gms.internal.ads.zzhjx
            public final /* synthetic */ Object zza(zzhag zzhagVar) {
                return this.zza.zzb(zzhagVar.zza(), zzhjyVar.zzb());
            }
        });
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }
}
