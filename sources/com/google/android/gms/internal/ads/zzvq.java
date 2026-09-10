package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvq implements zzxy {
    private final zzgtd zza;
    private long zzb;

    public zzvq(List list, List list2) {
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        zzgqa.zza(list.size() == list2.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgtaVar.zzf(new zzvp((zzxy) list.get(i3), (List) list2.get(i3)));
        }
        this.zza = zzgtaVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzg(long j) {
        int i2 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                return;
            }
            ((zzvp) zzgtdVar.get(i2)).zzg(j);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final long zzi() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                break;
            }
            zzvp zzvpVar = (zzvp) zzgtdVar.get(i2);
            long jZzi = zzvpVar.zzi();
            if ((zzvpVar.zza().contains(1) || zzvpVar.zza().contains(2) || zzvpVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i2++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final long zzl() {
        int i2 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                break;
            }
            long jZzl = ((zzvp) zzgtdVar.get(i2)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i2++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzm(zzli zzliVar) {
        boolean zZzm;
        boolean z2 = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i2 = 0;
            zZzm = false;
            while (true) {
                zzgtd zzgtdVar = this.zza;
                if (i2 >= zzgtdVar.size()) {
                    break;
                }
                long jZzl2 = ((zzvp) zzgtdVar.get(i2)).zzl();
                boolean z3 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzliVar.zza;
                if (jZzl2 == jZzl || z3) {
                    zZzm |= ((zzvp) zzgtdVar.get(i2)).zzm(zzliVar);
                }
                i2++;
            }
            z2 |= zZzm;
        } while (zZzm);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final boolean zzn() {
        int i2 = 0;
        while (true) {
            zzgtd zzgtdVar = this.zza;
            if (i2 >= zzgtdVar.size()) {
                return false;
            }
            if (((zzvp) zzgtdVar.get(i2)).zzn()) {
                return true;
            }
            i2++;
        }
    }
}
