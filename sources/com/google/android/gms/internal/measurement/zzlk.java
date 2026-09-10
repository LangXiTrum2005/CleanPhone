package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(a.g(length, i3, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i2, int i3) throws IOException {
        zzr((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i2, int i3) throws IOException {
        zzr(i2 << 3);
        zzq(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i2, int i3) throws IOException {
        zzr(i2 << 3);
        zzr(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i2, int i3) throws IOException {
        zzr((i2 << 3) | 5);
        zzs(i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i2, long j) throws IOException {
        zzr(i2 << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i2, long j) throws IOException {
        zzr((i2 << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i2, boolean z2) throws IOException {
        zzr(i2 << 3);
        zzp(z2 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i2, String str) throws IOException {
        zzr((i2 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i2, zzlh zzlhVar) throws IOException {
        zzr((i2 << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws IOException {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i2, int i3) throws IOException {
        zzr(i3);
        zzv(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzl(int i2, zznm zznmVar, zznx zznxVar) throws IOException {
        zzr((i2 << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i2, zznm zznmVar) throws IOException {
        zzr(11);
        zzc(2, i2);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i2, zzlh zzlhVar) throws IOException {
        zzr(11);
        zzc(2, i2);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws IOException {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b2) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zze;
        try {
            int i3 = i2 + 1;
            try {
                this.zzc[i2] = b2;
                this.zze = i3;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i2 = i3;
                throw new zzll(i2, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e3) {
            indexOutOfBoundsException = e3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i2) throws IOException {
        if (i2 >= 0) {
            zzr(i2);
        } else {
            zzt(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i2) throws IOException {
        int i3;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.zze;
        while ((i2 & (-128)) != 0) {
            try {
                i3 = i4 + 1;
                try {
                    this.zzc[i4] = (byte) (i2 | 128);
                    i2 >>>= 7;
                    i4 = i3;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i4 = i3;
                    throw new zzll(i4, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                throw new zzll(i4, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i3 = i4 + 1;
        this.zzc[i4] = (byte) i2;
        this.zze = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i2) throws IOException {
        int i3 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i3] = (byte) i2;
            bArr[i3 + 1] = (byte) (i2 >> 8);
            bArr[i3 + 2] = (byte) (i2 >> 16);
            bArr[i3 + 3] = (byte) (i2 >> 24);
            this.zze = i3 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i3, this.zzd, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z2 = zzlm.zzd;
        int i3 = this.zze;
        if (!z2 || this.zzd - i3 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.zzc[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e2) {
                        indexOutOfBoundsException = e2;
                        i3 = i4;
                        throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    indexOutOfBoundsException = e3;
                }
            }
            i2 = i3 + 1;
            try {
                this.zzc[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i3 = i2;
                throw new zzll(i3, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzop.zzp(this.zzc, i3, (byte) (((int) j) | 128));
                j >>>= 7;
                i3++;
            }
            i2 = i3 + 1;
            zzop.zzp(this.zzc, i3, (byte) j);
        }
        this.zze = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j) throws IOException {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) j;
            bArr[i2 + 1] = (byte) (j >> 8);
            bArr[i2 + 2] = (byte) (j >> 16);
            bArr[i2 + 3] = (byte) (j >> 24);
            bArr[i2 + 4] = (byte) (j >> 32);
            bArr[i2 + 5] = (byte) (j >> 40);
            bArr[i2 + 6] = (byte) (j >> 48);
            bArr[i2 + 7] = (byte) (j >> 56);
            this.zze = i2 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(i2, this.zzd, 8, e2);
        }
    }

    public final void zzv(byte[] bArr, int i2, int i3) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i3);
            this.zze += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(this.zze, this.zzd, i3, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        zzv(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws IOException {
        int i2 = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i3 = this.zze;
                this.zze = zzos.zzc(str, bArr, i3, this.zzd - i3);
                return;
            }
            int i4 = i2 + iZzz2;
            this.zze = i4;
            int iZzc = zzos.zzc(str, this.zzc, i4, this.zzd - i4);
            this.zze = i2;
            zzr((iZzc - i2) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e2) {
            this.zze = i2;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new zzll(e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
