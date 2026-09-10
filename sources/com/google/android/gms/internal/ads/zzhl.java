package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzhl extends zzgst {
    private final Map zza;

    public zzhl(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final Set entrySet() {
        return zzgvn.zzb(this.zza.entrySet(), zzhj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final int hashCode() {
        return zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final Set keySet() {
        return zzgvn.zzb(this.zza.keySet(), zzhk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgst, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final Map zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgst, com.google.android.gms.internal.ads.zzgsu
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }
}
