package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzen extends zzeq {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzen(int i, long j) {
        super(i, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final String toString() {
        List list = this.zzb;
        return zzeq.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    @Nullable
    public final zzen zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzen zzenVar = (zzen) this.zzc.get(i2);
            if (zzenVar.zzd == i) {
                return zzenVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzeo zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzeo zzeoVar = (zzeo) this.zzb.get(i2);
            if (zzeoVar.zzd == i) {
                return zzeoVar;
            }
        }
        return null;
    }

    public final void zzc(zzen zzenVar) {
        this.zzc.add(zzenVar);
    }

    public final void zzd(zzeo zzeoVar) {
        this.zzb.add(zzeoVar);
    }
}
