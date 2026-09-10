package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpr extends zzpv {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzpr(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzJ(byte b) throws IOException {
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzps(i, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzK(int i, boolean z) throws IOException {
        zzw(i << 3);
        zzJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzL(byte[] bArr, int i, int i2) throws IOException {
        zzw(i2);
        zze(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv, com.google.android.gms.internal.consent_sdk.zzpe
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(this.zzc, this.zzb, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzh(int i, zzpm zzpmVar) throws IOException {
        zzw((i << 3) | 2);
        zzi(zzpmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzi(zzpm zzpmVar) throws IOException {
        zzw(zzpmVar.zzd());
        zzpmVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzj(int i, int i2) throws IOException {
        zzw((i << 3) | 5);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzk(int i) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzl(int i, long j) throws IOException {
        zzw((i << 3) | 1);
        zzm(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzm(long j) throws IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzps(i, this.zzb, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzn(int i, int i2) throws IOException {
        zzw(i << 3);
        zzo(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzo(int i) throws IOException {
        if (i >= 0) {
            zzw(i);
        } else {
            zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzp(zzrq zzrqVar) throws IOException {
        zzw(zzrqVar.zzn());
        zzrqVar.zzB(this);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzq(int i, zzrq zzrqVar) throws IOException {
        zzw(11);
        zzv(2, i);
        zzw(26);
        zzp(zzrqVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzr(int i, zzpm zzpmVar) throws IOException {
        zzw(11);
        zzv(2, i);
        zzh(3, zzpmVar);
        zzw(12);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzs(int i, String str) throws IOException {
        zzw((i << 3) | 2);
        zzt(str);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzt(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzC = zzpv.zzC(str.length() * 3);
            int iZzC2 = zzpv.zzC(str.length());
            if (iZzC2 != iZzC) {
                zzw(zzsy.zzb(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzsy.zza(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzC2;
            this.zzc = i3;
            int iZza = zzsy.zza(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzw((iZza - i) - iZzC2);
            this.zzc = iZza;
        } catch (zzsx e) {
            this.zzc = i;
            zzE(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzps(e2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzu(int i, int i2) throws IOException {
        zzw((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzv(int i, int i2) throws IOException {
        zzw(i << 3);
        zzw(i2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzw(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzps(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzps(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzx(int i, long j) throws IOException {
        zzw(i << 3);
        zzy(j);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzy(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzc;
        if (!zzpv.zzb || this.zzb - i2 < 10) {
            int i3 = i2;
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.zza[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i4;
                        throw new zzps(i3, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.zza[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new zzps(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzsw.zzn(this.zza, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzsw.zzn(this.zza, i2, (byte) j);
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpv
    public final void zzI() {
    }
}
