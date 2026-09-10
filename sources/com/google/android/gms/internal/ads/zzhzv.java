package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzv extends zzhzs {
    private final OutputStream zzg;

    public zzhzv(OutputStream outputStream, int i2) {
        super(i2);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzH(int i2) throws IOException {
        if (this.zzb - this.zzc < i2) {
            zzI();
        }
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzJ(int i2, int i3) throws IOException {
        zzs((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzK(int i2, int i3) throws IOException {
        zzH(20);
        zzd(i2 << 3);
        if (i3 >= 0) {
            zzd(i3);
        } else {
            zze(i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzL(int i2, int i3) throws IOException {
        zzH(20);
        zzd(i2 << 3);
        zzd(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzM(int i2, int i3) throws IOException {
        zzH(14);
        zzd((i2 << 3) | 5);
        zzf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzN(int i2, long j) throws IOException {
        zzH(20);
        zzd(i2 << 3);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw, com.google.android.gms.internal.ads.zzhzc
    public final void zza(byte[] bArr, int i2, int i3) throws IOException {
        zzw(bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzh(int i2, long j) throws IOException {
        zzH(18);
        zzd((i2 << 3) | 1);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzi(int i2, boolean z2) throws IOException {
        zzH(11);
        zzd(i2 << 3);
        zzc(z2 ? (byte) 1 : (byte) 0);
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
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b2);
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
        zzH(5);
        zzd(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzt(int i2) throws IOException {
        zzH(4);
        zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzu(long j) throws IOException {
        zzH(10);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzv(long j) throws IOException {
        zzH(8);
        zzg(j);
    }

    public final void zzw(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.zzb;
        int i5 = this.zzc;
        int i6 = i4 - i5;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, this.zza, i5, i3);
            this.zzc += i3;
            this.zzd += i3;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, i2, bArr2, i5, i6);
        int i7 = i2 + i6;
        this.zzc = i4;
        this.zzd += i6;
        zzI();
        int i8 = i3 - i6;
        if (i8 <= i4) {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.zzc = i8;
        } else {
            this.zzg.write(bArr, i7, i8);
        }
        this.zzd += i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzA = zzhzw.zzA(length);
            int i2 = iZzA + length;
            int i3 = this.zzb;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int iZzd = zzidr.zzd(str, bArr, 0, length);
                zzs(iZzd);
                zzw(bArr, 0, iZzd);
                return;
            }
            if (i2 > i3 - this.zzc) {
                zzI();
            }
            int iZzA2 = zzhzw.zzA(str.length());
            int i4 = this.zzc;
            try {
                try {
                    if (iZzA2 == iZzA) {
                        int i5 = i4 + iZzA2;
                        this.zzc = i5;
                        int iZzd2 = zzidr.zzd(str, this.zza, i5, i3 - i5);
                        this.zzc = i4;
                        iZzc = (iZzd2 - i4) - iZzA2;
                        zzd(iZzc);
                        this.zzc = iZzd2;
                    } else {
                        iZzc = zzidr.zzc(str);
                        zzd(iZzc);
                        this.zzc = zzidr.zzd(str, this.zza, this.zzc, iZzc);
                    }
                    this.zzd += iZzc;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzhzu(e2);
                }
            } catch (zzidq e3) {
                this.zzd -= this.zzc - i4;
                this.zzc = i4;
                throw e3;
            }
        } catch (zzidq e4) {
            zzF(str, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhzw
    public final void zzy() throws IOException {
        if (this.zzc > 0) {
            zzI();
        }
    }
}
