package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzlw implements zzlo {
    public final zzwb zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlw(zzwi zzwiVar, boolean z2) {
        this.zza = new zzwb(zzwiVar, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final zzbf zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i2) {
        this.zzd = i2;
        this.zze = false;
        this.zzc.clear();
    }
}
