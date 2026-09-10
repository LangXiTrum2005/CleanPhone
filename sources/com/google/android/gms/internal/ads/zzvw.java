package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzvw implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvv zzc;
    private final byte[] zzd;
    private int zze;

    public zzvw(zzhb zzhbVar, int i2, zzvv zzvvVar) {
        zzgqa.zza(i2 > 0);
        this.zza = zzhbVar;
        this.zzb = i2;
        this.zzc = zzvvVar;
        this.zzd = new byte[1];
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zze;
        if (i4 == 0) {
            zzhb zzhbVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i5 = 0;
            if (zzhbVar.zza(bArr2, 0, 1) != -1) {
                int i6 = (bArr2[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr3 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int iZza = zzhbVar.zza(bArr3, i5, i7);
                        if (iZza != -1) {
                            i5 += iZza;
                            i7 -= iZza;
                        }
                    }
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (bArr3[i8] != 0) {
                            break;
                        }
                        i6 = i8;
                    }
                    if (i6 > 0) {
                        this.zzc.zza(new zzer(bArr3, i6));
                    }
                }
                i4 = this.zzb;
                this.zze = i4;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i2, Math.min(i4, i3));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zza.zze(zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        return this.zza.zzj();
    }
}
