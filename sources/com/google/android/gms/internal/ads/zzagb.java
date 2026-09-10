package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagb {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzb(zzaep zzaepVar) throws IOException {
        if (this.zzb) {
            return;
        }
        byte[] bArr = this.zza;
        zzaepVar.zzi(bArr, 0, 10);
        zzaepVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }

    public final void zzc(zzaga zzagaVar, long j, int i2, int i3, int i4, zzafz zzafzVar) {
        zzgqa.zzj(this.zzg <= i3 + i4, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.zzb) {
            int i5 = this.zzc;
            int i6 = i5 + 1;
            this.zzc = i6;
            if (i5 == 0) {
                this.zzd = j;
                this.zze = i2;
                this.zzf = 0;
            }
            this.zzf += i3;
            this.zzg = i4;
            if (i6 >= 16) {
                zzd(zzagaVar, zzafzVar);
            }
        }
    }

    public final void zzd(zzaga zzagaVar, zzafz zzafzVar) {
        if (this.zzc > 0) {
            zzagaVar.zzx(this.zzd, this.zze, this.zzf, this.zzg, zzafzVar);
            this.zzc = 0;
        }
    }
}
