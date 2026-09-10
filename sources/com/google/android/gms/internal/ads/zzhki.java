package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhki {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzhki(zzhkf zzhkfVar, byte[] bArr) {
        this.zza = new HashMap(zzhkfVar.zze());
        this.zzb = new HashMap(zzhkfVar.zzf());
        this.zzc = new HashMap(zzhkfVar.zzg());
        this.zzd = new HashMap(zzhkfVar.zzh());
    }

    public final boolean zza(zzhke zzhkeVar) {
        return this.zzb.containsKey(new zzhkg(zzhkeVar.getClass(), zzhkeVar.zzf(), null));
    }

    public final zzgzx zzb(zzhke zzhkeVar, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        zzhkg zzhkgVar = new zzhkg(zzhkeVar.getClass(), zzhkeVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhkgVar)) {
            return ((zzhid) map.get(zzhkgVar)).zza(zzhkeVar, zzharVar);
        }
        String string = zzhkgVar.toString();
        throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final zzhke zzc(zzgzx zzgzxVar, Class cls, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        zzhkh zzhkhVar = new zzhkh(zzgzxVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhkhVar)) {
            return ((zzhig) map.get(zzhkhVar)).zza(zzgzxVar, zzharVar);
        }
        String string = zzhkhVar.toString();
        throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final boolean zzd(zzhke zzhkeVar) {
        return this.zzd.containsKey(new zzhkg(zzhkeVar.getClass(), zzhkeVar.zzf(), null));
    }

    public final zzhan zze(zzhke zzhkeVar) throws GeneralSecurityException {
        zzhkg zzhkgVar = new zzhkg(zzhkeVar.getClass(), zzhkeVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhkgVar)) {
            return ((zzhji) map.get(zzhkgVar)).zza(zzhkeVar);
        }
        String string = zzhkgVar.toString();
        throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final zzhke zzf(zzhan zzhanVar, Class cls) throws GeneralSecurityException {
        zzhkh zzhkhVar = new zzhkh(zzhanVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhkhVar)) {
            return ((zzhjl) map.get(zzhkhVar)).zza(zzhanVar);
        }
        String string = zzhkhVar.toString();
        throw new GeneralSecurityException(android.support.v4.media.a.s(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }

    public final /* synthetic */ Map zzg() {
        return this.zza;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
