package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxh implements zzfmv {
    private final zzdwy zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdxh(zzdwy zzdwyVar, Set set, Clock clock) {
        this.zzb = zzdwyVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdxg zzdxgVar = (zzdxg) it.next();
            this.zzd.put(zzdxgVar.zzc(), zzdxgVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfmo zzfmoVar, boolean z2) {
        zzdxg zzdxgVar = (zzdxg) this.zzd.get(zzfmoVar);
        if (zzdxgVar == null) {
            return;
        }
        String str = true != z2 ? "f." : "s.";
        Map map = this.zza;
        zzfmo zzfmoVarZzb = zzdxgVar.zzb();
        if (map.containsKey(zzfmoVarZzb)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfmoVarZzb)).longValue();
            this.zzb.zzc().put("label.".concat(zzdxgVar.zza()), androidx.media3.extractor.text.ttml.a.k(jElapsedRealtime, str, new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdK(zzfmo zzfmoVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdL(zzfmo zzfmoVar, String str) {
        this.zza.put(zzfmoVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdM(zzfmo zzfmoVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfmoVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfmoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfmoVar)) {
            zze(zzfmoVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzdN(zzfmo zzfmoVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfmoVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfmoVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfmoVar)) {
            zze(zzfmoVar, true);
        }
    }
}
