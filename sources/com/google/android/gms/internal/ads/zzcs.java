package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcs implements zzcr {
    final /* synthetic */ zzct zza;
    private final short[] zzb;
    private short[] zzc;
    private short[] zzd;
    private short[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzcs(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new short[zzctVar.zzh()];
        this.zzc = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new short[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new short[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(short[] sArr, int i2, int i3, int i4) {
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                int iZzg = this.zza.zzg() * i2;
                iAbs += Math.abs(sArr[iZzg + i9] - sArr[(iZzg + i3) + i9]);
            }
            int i10 = iAbs * i7;
            int i11 = i5 * i3;
            if (i10 < i11) {
                i5 = iAbs;
            }
            if (i10 < i11) {
                i7 = i3;
            }
            int i12 = iAbs * i6;
            int i13 = i8 * i3;
            if (i12 > i13) {
                i8 = iAbs;
            }
            if (i12 > i13) {
                i6 = i3;
            }
            i3++;
        }
        this.zzf = i5 / i7;
        this.zzg = i8 / i6;
        return i7;
    }

    private final short[] zzt(short[] sArr, int i2, int i3) {
        zzct zzctVar = this.zza;
        int length = sArr.length / zzctVar.zzg();
        return i2 + i3 <= length ? sArr : Arrays.copyOf(sArr, android.support.v4.media.a.B(length, 3, 2, i3) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i2, long j, long j2) {
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzg()) {
                return;
            }
            short[] sArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            short[] sArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i2) + i3;
            short s = sArr2[iZzg2];
            short s2 = sArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j;
            long jZzl = ((long) zzctVar.zzl()) * j2;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j2;
            int i4 = i3;
            long j3 = jZzl2 - jZzl;
            long j4 = jZzl2 - jZzm;
            sArr[(iZzj * iZzg) + i4] = (short) ((((j3 - j4) * ((long) s2)) + (j4 * ((long) s))) / j3);
            i3 = i4 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        int i2 = this.zzf;
        return i2 != 0 && this.zza.zzn() != 0 && this.zzg <= i2 * 3 && i2 + i2 > this.zzh * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i2, int i3) {
        int iZzg;
        short[] sArr = this.zzc;
        int i4 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i4 >= zzctVar.zzh() / i3) {
                return;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i3;
                if (i5 < iZzg) {
                    i6 += sArr[(iZzg * i4) + (zzctVar.zzg() * i2) + i5];
                    i5++;
                }
            }
            this.zzb[i4] = (short) (i6 / iZzg);
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zze(int i2, int i3, int i4) {
        return zzs(this.zzb, 0, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zzf(int i2, int i3, int i4) {
        return zzs(this.zzc, i2, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzg() {
        this.zzh = 0;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = this.zzd;
        short[] sArr2 = this.zzc;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i8])) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzi() {
        this.zzh = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzj(int i2) {
        this.zzc = zzt(this.zzc, this.zza.zzi(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzk(int i2) {
        this.zzd = zzt(this.zzd, this.zza.zzj(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzl(int i2) {
        this.zze = zzt(this.zze, this.zza.zzk(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzm(int i2, int i3) {
        for (int i4 = 0; i4 < this.zza.zzg() * i3; i4++) {
            this.zzc[i2 + i4] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asShortBuffer().put(this.zzd, 0, zzctVar.zzg() * i2);
        byteBuffer.position(((i2 + i2) * zzctVar.zzg()) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzp() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzq() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final /* synthetic */ Object zzr() {
        return this.zzc;
    }
}
