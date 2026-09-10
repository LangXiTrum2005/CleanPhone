package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaox {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzaox(int i2, int i3) {
        this.zzc = i2;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i2) {
        zzgqa.zzi(!this.zzd);
        boolean z2 = i2 == this.zzc;
        this.zzd = z2;
        if (z2) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i2, int i3) {
        if (this.zzd) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i5 = this.zzb + i4;
            if (length < i5) {
                this.zza = Arrays.copyOf(bArr2, i5 + i5);
            }
            System.arraycopy(bArr, i2, this.zza, this.zzb, i4);
            this.zzb += i4;
        }
    }

    public final boolean zze(int i2) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i2;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
