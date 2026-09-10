package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzalz implements zzaer {
    private final zzaer zzb;
    private final zzalw zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzalz(zzaer zzaerVar, zzalw zzalwVar) {
        this.zzb = zzaerVar;
        this.zzc = zzalwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final zzaga zzu(int i2, int i3) {
        if (i3 != 3) {
            this.zze = true;
            return this.zzb.zzu(i2, i3);
        }
        SparseArray sparseArray = this.zzd;
        zzamb zzambVar = (zzamb) sparseArray.get(i2);
        if (zzambVar != null) {
            return zzambVar;
        }
        zzamb zzambVar2 = new zzamb(this.zzb.zzu(i2, 3), this.zzc);
        sparseArray.put(i2, zzambVar2);
        return zzambVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((zzamb) sparseArray.valueAt(i2)).zza(true);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    public final void zzw(zzafr zzafrVar) {
        this.zzb.zzw(zzafrVar);
    }
}
