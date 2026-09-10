package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhzs extends zzhzw {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzhzs(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b2) {
        byte[] bArr = this.zza;
        int i2 = this.zzc;
        bArr[i2] = b2;
        this.zzc = i2 + 1;
        this.zzd++;
    }

    public final void zzd(int i2) {
        if (!zzhzw.zzb) {
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) (i2 | 128);
                this.zzd++;
                i2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i4 = this.zzc;
            this.zzc = i4 + 1;
            bArr2[i4] = (byte) i2;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzidm.zzp(bArr3, i5, (byte) (i2 | 128));
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        zzidm.zzp(bArr4, i6, (byte) i2);
        this.zzd += (int) (((long) this.zzc) - j);
    }

    public final void zze(long j) {
        if (zzhzw.zzb) {
            long j2 = this.zzc;
            while (true) {
                int i2 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    zzidm.zzp(bArr, i3, (byte) i2);
                    this.zzd += (int) (((long) this.zzc) - j2);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzidm.zzp(bArr2, i4, (byte) (i2 | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i5 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i6 = this.zzc;
                    this.zzc = i6 + 1;
                    bArr3[i6] = (byte) i5;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                bArr4[i7] = (byte) (i5 | 128);
                this.zzd++;
                j >>>= 7;
            }
        }
    }

    public final void zzf(int i2) {
        int i3 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.zzc = i3 + 4;
        this.zzd += 4;
    }

    public final void zzg(long j) {
        int i2 = this.zzc;
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
        this.zzd += 8;
    }
}
