package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjt {
    private final Map zza;
    private final Map zzb;

    private zzhjt() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhjt zza(zzhjs zzhjsVar) throws GeneralSecurityException {
        if (zzhjsVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhju zzhjuVar = new zzhju(zzhjsVar.zzb(), zzhjsVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhjuVar)) {
            map.put(zzhjuVar, zzhjsVar);
            return this;
        }
        zzhjs zzhjsVar2 = (zzhjs) map.get(zzhjuVar);
        if (zzhjsVar2.equals(zzhjsVar) && zzhjsVar.equals(zzhjsVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhjuVar.toString()));
    }

    public final zzhjt zzb(zzhjy zzhjyVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhjyVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhjyVar);
            return this;
        }
        zzhjy zzhjyVar2 = (zzhjy) map.get(clsZza);
        if (zzhjyVar2.equals(zzhjyVar) && zzhjyVar.equals(zzhjyVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final zzhjw zzc() {
        return new zzhjw(this, null);
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public /* synthetic */ zzhjt(zzhjw zzhjwVar, byte[] bArr) {
        this.zza = new HashMap(zzhjwVar.zzd());
        this.zzb = new HashMap(zzhjwVar.zze());
    }

    public /* synthetic */ zzhjt(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
