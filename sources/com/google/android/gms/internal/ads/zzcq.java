package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcq implements zzcr {
    final /* synthetic */ zzct zza;
    private final float[] zzb;
    private float[] zzc;
    private float[] zzd;
    private float[] zze;
    private double zzf;
    private double zzg;
    private double zzh;

    public zzcq(zzct zzctVar) {
        Objects.requireNonNull(zzctVar);
        this.zza = zzctVar;
        this.zzb = new float[zzctVar.zzh()];
        this.zzc = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zzd = new float[zzctVar.zzh() * zzctVar.zzg()];
        this.zze = new float[zzctVar.zzh() * zzctVar.zzg()];
    }

    private final int zzs(float[] fArr, int i2, int i3, int i4) {
        int i5 = 255;
        int i6 = 0;
        double d = 0.0d;
        double d2 = 1.0d;
        int i7 = i3;
        while (true) {
            double d3 = i5;
            double d4 = i6;
            if (i7 > i4) {
                this.zzf = d2 / d4;
                this.zzg = d / d3;
                return i6;
            }
            int i8 = 0;
            double dAbs = 0.0d;
            while (i8 < i7) {
                int iZzg = this.zza.zzg() * i2;
                dAbs += (double) Math.abs(fArr[iZzg + i8] - fArr[(iZzg + i7) + i8]);
                i8++;
                i5 = i5;
            }
            int i9 = i5;
            double d5 = d4 * dAbs;
            double d6 = i7;
            double d7 = d2 * d6;
            if (d5 < d7) {
                d2 = dAbs;
            }
            if (d5 < d7) {
                i6 = i7;
            }
            double d8 = d3 * dAbs;
            double d9 = d6 * d;
            if (d8 > d9) {
                d = dAbs;
            }
            i5 = d8 > d9 ? i7 : i9;
            i7++;
        }
    }

    private final float[] zzt(float[] fArr, int i2, int i3) {
        zzct zzctVar = this.zza;
        int length = fArr.length / zzctVar.zzg();
        return i2 + i3 <= length ? fArr : Arrays.copyOf(fArr, android.support.v4.media.a.B(length, 3, 2, i3) * zzctVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzb(int i2, long j, long j2) {
        int i3 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i3 >= zzctVar.zzg()) {
                return;
            }
            float[] fArr = this.zzd;
            int iZzg = zzctVar.zzg();
            int iZzj = zzctVar.zzj();
            float[] fArr2 = this.zze;
            int iZzg2 = (zzctVar.zzg() * i2) + i3;
            float f = fArr2[iZzg2];
            float f2 = fArr2[iZzg2 + zzctVar.zzg()];
            long jZzm = ((long) zzctVar.zzm()) * j;
            long jZzl = ((long) zzctVar.zzl()) * j2;
            long jZzl2 = ((long) (zzctVar.zzl() + 1)) * j2;
            long j3 = jZzl2 - jZzm;
            long j4 = jZzl2 - jZzl;
            fArr[(iZzj * iZzg) + i3] = ((j3 * f) + ((j4 - j3) * f2)) / j4;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final boolean zzc() {
        double d = this.zzf;
        return d != 0.0d && this.zza.zzn() != 0 && this.zzg <= d * 3.0d && d + d > this.zzh * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzd(int i2, int i3) {
        int iZzg;
        int i4 = 0;
        while (true) {
            zzct zzctVar = this.zza;
            if (i4 >= zzctVar.zzh() / i3) {
                return;
            }
            double d = 0.0d;
            int i5 = 0;
            while (true) {
                iZzg = zzctVar.zzg() * i3;
                if (i5 < iZzg) {
                    d += (double) this.zzc[(iZzg * i4) + (zzctVar.zzg() * i2) + i5];
                    i5++;
                }
            }
            this.zzb[i4] = (float) (d / ((double) iZzg));
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
        this.zzh = 0.0d;
        this.zzf = 0.0d;
        this.zzg = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzh(int i2, int i3, int i4, int i5, int i6) {
        float[] fArr = this.zzd;
        float[] fArr2 = this.zzc;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                fArr[i10] = ((fArr2[i9] * i11) + (fArr2[i8] * (i2 - i11))) / i2;
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
            this.zzc[i2 + i4] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzn(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().get(this.zzc, zzctVar.zzi() * zzctVar.zzg(), i2 / 4);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcr
    public final void zzo(ByteBuffer byteBuffer, int i2) {
        zzct zzctVar = this.zza;
        byteBuffer.asFloatBuffer().put(this.zzd, 0, zzctVar.zzg() * i2);
        byteBuffer.position((i2 * 4 * zzctVar.zzg()) + byteBuffer.position());
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
