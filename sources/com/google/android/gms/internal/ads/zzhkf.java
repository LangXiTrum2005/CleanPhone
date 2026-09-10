package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkf {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhkf() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzhkf zza(zzhig zzhigVar) throws GeneralSecurityException {
        zzhkh zzhkhVar = new zzhkh(zzhigVar.zzb(), zzhigVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhkhVar)) {
            map.put(zzhkhVar, zzhigVar);
            return this;
        }
        zzhig zzhigVar2 = (zzhig) map.get(zzhkhVar);
        if (zzhigVar2.equals(zzhigVar) && zzhigVar.equals(zzhigVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhkhVar.toString()));
    }

    public final zzhkf zzb(zzhid zzhidVar) throws GeneralSecurityException {
        zzhkg zzhkgVar = new zzhkg(zzhidVar.zzc(), zzhidVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhkgVar)) {
            map.put(zzhkgVar, zzhidVar);
            return this;
        }
        zzhid zzhidVar2 = (zzhid) map.get(zzhkgVar);
        if (zzhidVar2.equals(zzhidVar) && zzhidVar.equals(zzhidVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhkgVar.toString()));
    }

    public final zzhkf zzc(zzhjl zzhjlVar) throws GeneralSecurityException {
        zzhkh zzhkhVar = new zzhkh(zzhjlVar.zzb(), zzhjlVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhkhVar)) {
            map.put(zzhkhVar, zzhjlVar);
            return this;
        }
        zzhjl zzhjlVar2 = (zzhjl) map.get(zzhkhVar);
        if (zzhjlVar2.equals(zzhjlVar) && zzhjlVar.equals(zzhjlVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhkhVar.toString()));
    }

    public final zzhkf zzd(zzhji zzhjiVar) throws GeneralSecurityException {
        zzhkg zzhkgVar = new zzhkg(zzhjiVar.zzc(), zzhjiVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhkgVar)) {
            map.put(zzhkgVar, zzhjiVar);
            return this;
        }
        zzhji zzhjiVar2 = (zzhji) map.get(zzhkgVar);
        if (zzhjiVar2.equals(zzhjiVar) && zzhjiVar.equals(zzhjiVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhkgVar.toString()));
    }

    public final /* synthetic */ Map zze() {
        return this.zza;
    }

    public final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzhkf(zzhki zzhkiVar) {
        this.zza = new HashMap(zzhkiVar.zzg());
        this.zzb = new HashMap(zzhkiVar.zzh());
        this.zzc = new HashMap(zzhkiVar.zzi());
        this.zzd = new HashMap(zzhkiVar.zzj());
    }
}
