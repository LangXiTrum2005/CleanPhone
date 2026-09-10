package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzt extends zzhzw {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhzt(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(android.support.v4.media.a.g(length, i3, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzJ(int i2, int i3) throws IOException {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzK(int i2, int i3) throws IOException {
        zzs(i2 << 3);
        zzr(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzL(int i2, int i3) throws IOException {
        zzs(i2 << 3);
        zzs(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzM(int i2, int i3) throws IOException {
        zzs((i2 << 3) | 5);
        zzt(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzN(int i2, long j) throws IOException {
        zzs(i2 << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw, com.google.android.gms.internal.ads.zzhzc
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzw(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzh(int i2, long j) throws IOException {
        zzs((i2 << 3) | 1);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzi(int i2, boolean z2) throws IOException {
        zzs(i2 << 3);
        zzq(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzj(int i2, String str) throws IOException {
        zzs((i2 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzk(int i2, zzhzl zzhzlVar) throws IOException {
        zzs((i2 << 3) | 2);
        zzl(zzhzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzl(zzhzl zzhzlVar) throws IOException {
        zzs(zzhzlVar.zzc());
        zzhzlVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzm(byte[] bArr, int i2, int i3) throws IOException {
        zzs(i3);
        zzw(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzn(int i2, zzicc zziccVar) throws IOException {
        zzs(11);
        zzL(2, i2);
        zzs(26);
        zzp(zziccVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzo(int i2, zzhzl zzhzlVar) throws IOException {
        zzs(11);
        zzL(2, i2);
        zzk(3, zzhzlVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzp(zzicc zziccVar) throws IOException {
        zzs(zziccVar.zzbr());
        zziccVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzq(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzc;
        try {
            int i3 = i2 + 1;
            try {
                this.zza[i2] = b2;
                this.zzc = i3;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i2 = i3;
                throw new zzhzu(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzr(int i2) throws IOException {
        if (i2 >= 0) {
            zzs(i2);
        } else {
            zzu(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzs(int i2) throws IOException {
        int i3;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.zzc;
        while ((i2 & (-128)) != 0) {
            try {
                i3 = i4 + 1;
                try {
                    this.zza[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i4 = i3;
                    throw new zzhzu(i4, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                throw new zzhzu(i4, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i3 = i4 + 1;
        this.zza[i4] = (byte) i2;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzt(int i2) throws IOException {
        int i3 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.zzc = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhzu(i3, this.zzb, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzu(long j) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z2 = zzhzw.zzb;
        int i3 = this.zzc;
        if (!z2 || this.zzb - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.zza[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException = e2;
                        i3 = i4;
                        throw new zzhzu(i3, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException = e3;
                }
            }
            i2 = i3 + 1;
            try {
                this.zza[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i2;
                throw new zzhzu(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzidm.zzp(this.zza, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzidm.zzp(this.zza, i3, (byte) j);
        }
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzv(long j) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) j;
            bArr[i2 + 1] = (byte) (j >> 8);
            bArr[i2 + 2] = (byte) (j >> 16);
            bArr[i2 + 3] = (byte) (j >> 24);
            bArr[i2 + 4] = (byte) (j >> 32);
            bArr[i2 + 5] = (byte) (j >> 40);
            bArr[i2 + 6] = (byte) (j >> 48);
            bArr[i2 + 7] = (byte) (j >> 56);
            this.zzc = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhzu(i2, this.zzb, 8, e2);
        }
    }

    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, i2, this.zza, this.zzc, i3);
            this.zzc += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzhzu(this.zzc, this.zzb, i3, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzx(String str) throws IOException {
        int i2 = this.zzc;
        try {
            int iZzA = zzhzw.zzA(str.length() * 3);
            int iZzA2 = zzhzw.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzidr.zzc(str));
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = zzidr.zzd(str, bArr, i3, this.zzb - i3);
                return;
            }
            int i4 = i2 + iZzA2;
            this.zzc = i4;
            int iZzd = zzidr.zzd(str, this.zza, i4, this.zzb - i4);
            this.zzc = i2;
            zzs((iZzd - i2) - iZzA2);
            this.zzc = iZzd;
        } catch (zzidq e2) {
            this.zzc = i2;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzhzu(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzy() {
    }
}
