package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbrt implements zzbqk, zzbrs {
    private final zzbrs zza;
    private final HashSet zzb = new HashSet();

    public zzbrt(zzbrs zzbrsVar) {
        this.zza = zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk, com.google.android.gms.internal.ads.zzbqv
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbnn) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbnn) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzm(String str, zzbnn zzbnnVar) {
        this.zza.zzm(str, zzbnnVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbnnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzn(String str, zzbnn zzbnnVar) {
        this.zza.zzn(str, zzbnnVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbnnVar));
    }
}
