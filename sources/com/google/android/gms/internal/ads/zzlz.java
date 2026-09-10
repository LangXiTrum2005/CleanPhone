package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzlz {
    private final zzpn zza;
    private final zzly zze;
    private final zzmu zzh;
    private final zzdx zzi;
    private boolean zzj;
    private zzhz zzk;
    private zzxz zzl = new zzxz(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlz(zzly zzlyVar, zzmu zzmuVar, zzdx zzdxVar, zzpn zzpnVar) {
        this.zza = zzpnVar;
        this.zze = zzlyVar;
        this.zzh = zzmuVar;
        this.zzi = zzdxVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlw zzlwVar = (zzlw) it.next();
            if (zzlwVar.zzc.isEmpty()) {
                zzs(zzlwVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzlw zzlwVar) {
        zzlv zzlvVar = (zzlv) this.zzf.get(zzlwVar);
        if (zzlvVar != null) {
            zzlvVar.zza.zzr(zzlvVar.zzb);
        }
    }

    private final void zzt(int i2, int i3) {
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            }
            zzlw zzlwVar = (zzlw) this.zzb.remove(i3);
            this.zzd.remove(zzlwVar.zzb);
            zzu(i3, -zzlwVar.zza.zzz().zza());
            zzlwVar.zze = true;
            if (this.zzj) {
                zzw(zzlwVar);
            }
        }
    }

    private final void zzu(int i2, int i3) {
        while (true) {
            List list = this.zzb;
            if (i2 >= list.size()) {
                return;
            }
            ((zzlw) list.get(i2)).zzd += i3;
            i2++;
        }
    }

    private final void zzv(zzlw zzlwVar) {
        zzwb zzwbVar = zzlwVar.zza;
        zzwh zzwhVar = new zzwh() { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzwh
            public final /* synthetic */ void zza(zzwi zzwiVar, zzbf zzbfVar) {
                this.zza.zzi(zzwiVar, zzbfVar);
            }
        };
        zzlu zzluVar = new zzlu(this, zzlwVar);
        this.zzf.put(zzlwVar, new zzlv(zzwbVar, zzwhVar, zzluVar));
        zzwbVar.zzl(new Handler(zzfj.zze(), null), zzluVar);
        zzwbVar.zzn(new Handler(zzfj.zze(), null), zzluVar);
        zzwbVar.zzp(zzwhVar, this.zzk, this.zza);
    }

    private final void zzw(zzlw zzlwVar) {
        if (zzlwVar.zze && zzlwVar.zzc.isEmpty()) {
            zzlv zzlvVar = (zzlv) this.zzf.remove(zzlwVar);
            zzlvVar.getClass();
            zzwi zzwiVar = zzlvVar.zza;
            zzwiVar.zzs(zzlvVar.zzb);
            zzlu zzluVar = zzlvVar.zzc;
            zzwiVar.zzm(zzluVar);
            zzwiVar.zzo(zzluVar);
            this.zzg.remove(zzlwVar);
        }
    }

    public final zzbf zza(int i2, int i3, List list) {
        zzgqa.zza(i2 >= 0 && i2 <= i3 && i3 <= zzc());
        zzgqa.zza(list.size() == i3 - i2);
        for (int i4 = i2; i4 < i3; i4++) {
            ((zzlw) this.zzb.get(i4)).zza.zzA((zzak) list.get(i4 - i2));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(zzhz zzhzVar) {
        zzgqa.zzi(!this.zzj);
        this.zzk = zzhzVar;
        int i2 = 0;
        while (true) {
            List list = this.zzb;
            if (i2 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlw zzlwVar = (zzlw) list.get(i2);
            zzv(zzlwVar);
            this.zzg.add(zzlwVar);
            i2++;
        }
    }

    public final zzwe zze(zzwg zzwgVar, zzaah zzaahVar, long j) {
        int i2 = zzmg.zzb;
        Pair pair = (Pair) zzwgVar.zza;
        Object obj = pair.first;
        zzwg zzwgVarZza = zzwgVar.zza(pair.second);
        zzlw zzlwVar = (zzlw) this.zzd.get(obj);
        zzlwVar.getClass();
        this.zzg.add(zzlwVar);
        zzlv zzlvVar = (zzlv) this.zzf.get(zzlwVar);
        if (zzlvVar != null) {
            zzlvVar.zza.zzq(zzlvVar.zzb);
        }
        zzlwVar.zzc.add(zzwgVarZza);
        zzvy zzvyVarZzC = zzlwVar.zza.zzG(zzwgVarZza, zzaahVar, j);
        this.zzc.put(zzvyVarZzC, zzlwVar);
        zzr();
        return zzvyVarZzC;
    }

    public final void zzf(zzwe zzweVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlw zzlwVar = (zzlw) identityHashMap.remove(zzweVar);
        zzlwVar.getClass();
        zzlwVar.zza.zzD(zzweVar);
        zzlwVar.zzc.remove(((zzvy) zzweVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzlwVar);
    }

    public final void zzg() {
        for (zzlv zzlvVar : this.zzf.values()) {
            try {
                zzlvVar.zza.zzs(zzlvVar.zzb);
            } catch (RuntimeException e2) {
                zzee.zzf("MediaSourceList", "Failed to release child source.", e2);
            }
            zzwi zzwiVar = zzlvVar.zza;
            zzlu zzluVar = zzlvVar.zzc;
            zzwiVar.zzm(zzluVar);
            zzwiVar.zzo(zzluVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzlw zzlwVar = (zzlw) list.get(i2);
            zzlwVar.zzd = iZza;
            iZza += zzlwVar.zza.zzz().zza();
        }
        return new zzmg(list, this.zzl);
    }

    public final /* synthetic */ void zzi(zzwi zzwiVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    public final /* synthetic */ zzmu zzj() {
        return this.zzh;
    }

    public final /* synthetic */ zzdx zzk() {
        return this.zzi;
    }

    public final zzbf zzl(List list, zzxz zzxzVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzxzVar);
    }

    public final zzbf zzm(int i2, List list, zzxz zzxzVar) {
        if (!list.isEmpty()) {
            this.zzl = zzxzVar;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                zzlw zzlwVar = (zzlw) list.get(i3 - i2);
                if (i3 > 0) {
                    zzlw zzlwVar2 = (zzlw) this.zzb.get(i3 - 1);
                    zzlwVar.zzc(zzlwVar2.zza.zzz().zza() + zzlwVar2.zzd);
                } else {
                    zzlwVar.zzc(0);
                }
                zzu(i3, zzlwVar.zza.zzz().zza());
                this.zzb.add(i3, zzlwVar);
                this.zzd.put(zzlwVar.zzb, zzlwVar);
                if (this.zzj) {
                    zzv(zzlwVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlwVar);
                    } else {
                        zzs(zzlwVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i2, int i3, zzxz zzxzVar) {
        boolean z2 = false;
        if (i2 >= 0 && i2 <= i3 && i3 <= zzc()) {
            z2 = true;
        }
        zzgqa.zza(z2);
        this.zzl = zzxzVar;
        zzt(i2, i3);
        return zzh();
    }

    public final zzbf zzo(int i2, int i3, int i4, zzxz zzxzVar) {
        zzgqa.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzxz zzxzVar) {
        int iZzc = zzc();
        if (zzxzVar.zza() != iZzc) {
            zzxzVar = zzxzVar.zzh().zzf(0, iZzc);
        }
        this.zzl = zzxzVar;
        return zzh();
    }

    public final zzxz zzq() {
        return this.zzl;
    }
}
