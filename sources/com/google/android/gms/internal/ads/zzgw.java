package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgw extends zzgt {
    private final zzgv zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzgw(final byte[] bArr) {
        zzgv zzgvVar = new zzgv() { // from class: com.google.android.gms.internal.ads.zzgu
            @Override // com.google.android.gms.internal.ads.zzgv
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzgvVar;
        zzgqa.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zze;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i2, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws IOException {
        zzf(zzhfVar);
        Uri uri = zzhfVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j = zzhfVar.zze;
        int length = bArrZza.length;
        if (j > length) {
            throw new zzhc(2008);
        }
        int i2 = (int) j;
        this.zzd = i2;
        int i3 = length - i2;
        this.zze = i3;
        long j2 = zzhfVar.zzf;
        if (j2 != -1) {
            this.zze = (int) Math.min(i3, j2);
        }
        this.zzf = true;
        zzg(zzhfVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
