package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzazn implements zzfvz {
    private final zzfuh zza;
    private final zzfuv zzb;
    private final zzbaa zzc;
    private final zzazm zzd;
    private final zzayw zze;
    private final zzbac zzf;
    private final zzazu zzg;
    private final zzazl zzh;

    public zzazn(zzfuh zzfuhVar, zzfuv zzfuvVar, zzbaa zzbaaVar, zzazm zzazmVar, zzayw zzaywVar, zzbac zzbacVar, zzazu zzazuVar, zzazl zzazlVar) {
        this.zza = zzfuhVar;
        this.zzb = zzfuvVar;
        this.zzc = zzbaaVar;
        this.zzd = zzazmVar;
        this.zze = zzaywVar;
        this.zzf = zzbacVar;
        this.zzg = zzazuVar;
        this.zzh = zzazlVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfuh zzfuhVar = this.zza;
        zzawp zzawpVarZzb = this.zzb.zzb();
        map.put("v", zzfuhVar.zza());
        map.put("gms", Boolean.valueOf(zzfuhVar.zzc()));
        map.put("gv", Long.valueOf(zzawpVarZzb.zzd()));
        map.put("int", zzawpVarZzb.zzb());
        map.put("attts", Long.valueOf(zzawpVarZzb.zzh().zzb()));
        map.put("att", zzawpVarZzb.zzh().zzd());
        map.put("attkid", zzawpVarZzb.zzh().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzazu zzazuVar = this.zzg;
        if (zzazuVar != null) {
            map.put("tcq", Long.valueOf(zzazuVar.zze()));
            map.put("tpq", Long.valueOf(zzazuVar.zzd()));
            map.put("tcv", Long.valueOf(zzazuVar.zzf()));
            map.put("tpv", Long.valueOf(zzazuVar.zzg()));
            map.put("tchv", Long.valueOf(zzazuVar.zzi()));
            map.put("tphv", Long.valueOf(zzazuVar.zzh()));
            map.put("tcc", Long.valueOf(zzazuVar.zzj()));
            map.put("tpc", Long.valueOf(zzazuVar.zzk()));
            zzayw zzaywVar = this.zze;
            if (zzaywVar != null) {
                map.put(com.smartdigimkt.b0.a.W, Long.valueOf(zzaywVar.zzc()));
            }
            zzbac zzbacVar = this.zzf;
            if (zzbacVar != null) {
                map.put("vs", Long.valueOf(zzbacVar.zzc()));
                map.put("vf", Long.valueOf(zzbacVar.zzd()));
            }
        }
        return map;
    }

    public final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzc() {
        zzazl zzazlVar = this.zzh;
        Map mapZzf = zzf();
        if (zzazlVar != null) {
            mapZzf.put("vst", zzazlVar.zzb());
        }
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzd() {
        zzbaa zzbaaVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzbaaVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
