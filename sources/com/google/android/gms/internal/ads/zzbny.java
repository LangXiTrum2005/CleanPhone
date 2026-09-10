package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbny implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbny(zzboa zzboaVar, boolean z2, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z2;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzboaVar);
        this.zza = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z2) {
        if (this.zza) {
            return;
        }
        if (z2 && this.zzb) {
            ((zzdir) this.zzc).zzdu();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z2));
        ((zzbqj) this.zzc).zze("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i2) {
    }
}
