package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaan implements zzaah {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzaaf[] zzd = new zzaaf[100];

    public zzaan(boolean z2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized zzaaf zza() {
        zzaaf zzaafVar;
        try {
            this.zzb++;
            int i2 = this.zzc;
            if (i2 > 0) {
                zzaaf[] zzaafVarArr = this.zzd;
                int i3 = i2 - 1;
                this.zzc = i3;
                zzaafVar = zzaafVarArr[i3];
                if (zzaafVar == null) {
                    throw null;
                }
                zzaafVarArr[i3] = null;
            } else {
                zzaafVar = new zzaaf(new byte[65536], 0);
                int i4 = this.zzb;
                zzaaf[] zzaafVarArr2 = this.zzd;
                int length = zzaafVarArr2.length;
                if (i4 > length) {
                    this.zzd = (zzaaf[]) Arrays.copyOf(zzaafVarArr2, length + length);
                    return zzaafVar;
                }
            }
            return zzaafVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzb(zzaaf zzaafVar) {
        zzaaf[] zzaafVarArr = this.zzd;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        zzaafVarArr[i2] = zzaafVar;
        this.zzb--;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzc(zzaag zzaagVar) {
        while (zzaagVar != null) {
            try {
                zzaaf[] zzaafVarArr = this.zzd;
                int i2 = this.zzc;
                this.zzc = i2 + 1;
                zzaafVarArr[i2] = zzaagVar.zzd();
                this.zzb--;
                zzaagVar = zzaagVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzaah
    public final synchronized void zzd() {
        int i2 = this.zza;
        String str = zzfj.zza;
        int iMax = Math.max(0, ((i2 + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i3, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i2) {
        int i3 = this.zza;
        this.zza = i2;
        if (i2 < i3) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }
}
