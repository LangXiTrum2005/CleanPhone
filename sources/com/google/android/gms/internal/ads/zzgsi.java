package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsi extends zzgru {
    final /* synthetic */ zzgsk zza;
    private final Object zzb;
    private int zzc;

    public zzgsi(zzgsk zzgskVar, int i2) {
        Objects.requireNonNull(zzgskVar);
        this.zza = zzgskVar;
        this.zzb = zzgskVar.zzo(i2);
        this.zzc = i2;
    }

    private final void zza() {
        int i2 = this.zzc;
        if (i2 != -1) {
            zzgsk zzgskVar = this.zza;
            if (i2 < zzgskVar.size() && Objects.equals(this.zzb, zzgskVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgru, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgru, java.util.Map.Entry
    public final Object getValue() {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzgskVar.zzp(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgru, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgsk zzgskVar = this.zza;
        Map mapZzc = zzgskVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            zzgskVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgskVar.zzp(i2);
        zzgskVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
