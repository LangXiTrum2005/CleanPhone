package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzvs {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzha zzc;

    public zzvs(zzaeu zzaeuVar, zzalw zzalwVar) {
    }

    public final void zza(zzha zzhaVar) {
        if (zzhaVar != this.zzc) {
            this.zzc = zzhaVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
