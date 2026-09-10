package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i2, int i3, float f, float f2, int i4, boolean z2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i2 / i4;
        this.zzf = i2 / 400;
        int i5 = i2 / 65;
        this.zzg = i5;
        this.zzh = i5 + i5;
        this.zzi = z2 ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i2, int i3) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i3);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i4 = this.zzk;
        int i5 = this.zzb;
        System.arraycopy(objZzr, i2 * i5, objZzq, i4 * i5, i3 * i5);
        this.zzk += i3;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp() {
        zzcr zzcrVar;
        int i2;
        int i3;
        int iZze;
        int iZze2;
        int i4;
        int i5;
        int i6;
        double d;
        int i7;
        int i8;
        float f;
        int i9;
        int i10;
        long j;
        long j2;
        float f2 = this.zzc;
        float f3 = this.zzd;
        double d2 = f2 / f3;
        int i11 = this.zzk;
        int i12 = 0;
        int i13 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i14 = this.zzj;
            int i15 = this.zzh;
            if (i14 >= i15) {
                int i16 = 0;
                while (true) {
                    int i17 = this.zzo;
                    if (i17 > 0) {
                        int iMin = Math.min(i15, i17);
                        zzo(i16, iMin);
                        this.zzo -= iMin;
                        i16 += iMin;
                        f3 = f3;
                        d = d2;
                        i13 = i13;
                        i15 = i15;
                        i11 = i11;
                    } else {
                        int i18 = this.zza;
                        int i19 = i18 > 4000 ? i18 / 4000 : i13;
                        int i20 = this.zzb;
                        if (i20 != i13) {
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i16, i19);
                            i2 = this.zzf;
                            i3 = this.zzg;
                            iZze = zzcrVar.zze(i12, i2 / i19, i3 / i19);
                            if (i19 != i13) {
                                int i21 = iZze * i19;
                                int i22 = i19 * 4;
                                i5 = i21 - i22;
                                if (i5 >= i2) {
                                    i2 = i5;
                                }
                                i6 = i21 + i22;
                                if (i6 <= i3) {
                                    i3 = i6;
                                }
                                if (i20 == i13) {
                                    iZze2 = zzcrVar.zzf(i16, i2, i3);
                                } else {
                                    zzcrVar.zzd(i16, i13);
                                    iZze2 = zzcrVar.zze(i12, i2, i3);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i4 = i20;
                        } else if (i19 == i13) {
                            iZze2 = this.zzi.zzf(i16, this.zzf, this.zzg);
                            i4 = i13;
                        } else {
                            i20 = i13;
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i16, i19);
                            i2 = this.zzf;
                            i3 = this.zzg;
                            iZze = zzcrVar.zze(i12, i2 / i19, i3 / i19);
                            if (i19 != i13) {
                                int i23 = iZze * i19;
                                int i24 = i19 * 4;
                                i5 = i23 - i24;
                                if (i5 >= i2) {
                                    i2 = i5;
                                }
                                i6 = i23 + i24;
                                if (i6 <= i3) {
                                    i3 = i6;
                                }
                                if (i20 == i13) {
                                    iZze2 = zzcrVar.zzf(i16, i2, i3);
                                } else {
                                    zzcrVar.zzd(i16, i13);
                                    iZze2 = zzcrVar.zze(i12, i2, i3);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i4 = i20;
                        }
                        zzcr zzcrVar2 = this.zzi;
                        int i25 = zzcrVar2.zzc() ? this.zzp : iZze2;
                        int i26 = i16 + i25;
                        zzcrVar2.zzi();
                        this.zzp = iZze2;
                        double d3 = i25;
                        if (d2 > 1.0d) {
                            double d4 = d2 - 1.0d;
                            if (d2 >= 2.0d) {
                                double d5 = (d3 / d4) + this.zzq;
                                int iRound = (int) Math.round(d5);
                                d = d2;
                                this.zzq = d5 - ((double) iRound);
                                i8 = iRound;
                            } else {
                                d = d2;
                                double d6 = ((d3 * (2.0d - d)) / d4) + this.zzq;
                                int iRound2 = (int) Math.round(d6);
                                this.zzo = iRound2;
                                this.zzq = d6 - ((double) iRound2);
                                i8 = i25;
                            }
                            zzcrVar2.zzk(i8);
                            zzcrVar2.zzh(i8, i4, this.zzk, i16, i26);
                            this.zzk += i8;
                            i11 = i11;
                            i16 = i25 + i8 + i16;
                        } else {
                            d = d2;
                            i13 = i13;
                            i15 = i15;
                            double d7 = 1.0d - d;
                            if (d < 0.5d) {
                                double d8 = ((d3 * d) / d7) + this.zzq;
                                int iRound3 = (int) Math.round(d8);
                                this.zzq = d8 - ((double) iRound3);
                                i7 = iRound3;
                            } else {
                                double d9 = ((d3 * ((d + d) - 1.0d)) / d7) + this.zzq;
                                int iRound4 = (int) Math.round(d9);
                                this.zzo = iRound4;
                                this.zzq = d9 - ((double) iRound4);
                                i7 = i25;
                            }
                            int i27 = i25 + i7;
                            zzcrVar2.zzk(i27);
                            System.arraycopy(zzcrVar2.zzr(), i16 * i4, zzcrVar2.zzq(), this.zzk * i4, i25 * i4);
                            int i28 = i16;
                            zzcrVar2.zzh(i7, i4, this.zzk + i25, i26, i28);
                            this.zzk += i27;
                            i16 = i28 + i7;
                        }
                    }
                    if (i16 + i15 > i14) {
                        break;
                    }
                    i11 = i11;
                    f3 = f3;
                    i13 = i13;
                    i15 = i15;
                    d2 = d;
                    i12 = 0;
                }
                int i29 = this.zzj - i16;
                zzcr zzcrVar3 = this.zzi;
                int i30 = this.zzb;
                System.arraycopy(zzcrVar3.zzr(), i16 * i30, zzcrVar3.zzr(), 0, i30 * i29);
                this.zzj = i29;
            }
            f = this.zze * f3;
            if (f != 1.0f || this.zzk == i11) {
            }
            int i31 = this.zza;
            long j3 = i31;
            long j4 = (long) (i31 / f);
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i32 = this.zzk - i11;
            zzcr zzcrVar4 = this.zzi;
            zzcrVar4.zzl(i32);
            int i33 = this.zzb;
            System.arraycopy(zzcrVar4.zzq(), i11 * i33, zzcrVar4.zzp(), this.zzl * i33, i32 * i33);
            this.zzk = i11;
            this.zzl += i32;
            int i34 = 0;
            while (true) {
                i9 = this.zzl - 1;
                if (i34 >= i9) {
                    break;
                }
                while (true) {
                    i10 = this.zzm + 1;
                    j = i10;
                    long j5 = j * j4;
                    j2 = this.zzn;
                    if (j5 <= j2 * j3) {
                        break;
                    }
                    int i35 = i13;
                    zzcrVar4.zzk(i35);
                    zzcrVar4.zzb(i34, j3, j4);
                    this.zzn += i35;
                    this.zzk += i35;
                }
                int i36 = i13;
                this.zzm = i10;
                if (j == j3) {
                    this.zzm = 0;
                    zzgqa.zzi(j2 == j4 ? i36 : 0);
                    this.zzn = 0;
                }
                i34++;
                i13 = i36;
            }
            if (i9 != 0) {
                System.arraycopy(zzcrVar4.zzp(), i9 * i33, zzcrVar4.zzp(), 0, (this.zzl - i9) * i33);
                this.zzl -= i9;
                return;
            }
            return;
        }
        zzo(0, this.zzj);
        this.zzj = 0;
        f3 = f3;
        i11 = i11;
        i13 = 1;
        f = this.zze * f3;
        if (f != 1.0f) {
        }
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgqa.zzi(this.zzk >= 0);
        int i2 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i2), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i2, zzcrVar.zzq(), 0, this.zzk * i2);
    }

    public final void zzd() {
        int i2 = this.zzj;
        int i3 = this.zzo;
        int i4 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i5 = i4 + ((int) ((((((((double) (i2 - i3)) / ((double) (f / f2))) + ((double) i3)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f2))) + 0.5d));
        this.zzq = 0.0d;
        int i6 = this.zzh;
        int i7 = i6 + i6;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i2 + i7);
        zzcrVar.zzm(i2 * this.zzb, i7);
        this.zzj += i7;
        zzp();
        if (this.zzk > i5) {
            this.zzk = Math.max(i5, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgqa.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    public final /* synthetic */ int zzg() {
        return this.zzb;
    }

    public final /* synthetic */ int zzh() {
        return this.zzh;
    }

    public final /* synthetic */ int zzi() {
        return this.zzj;
    }

    public final /* synthetic */ int zzj() {
        return this.zzk;
    }

    public final /* synthetic */ int zzk() {
        return this.zzl;
    }

    public final /* synthetic */ int zzl() {
        return this.zzm;
    }

    public final /* synthetic */ int zzm() {
        return this.zzn;
    }

    public final /* synthetic */ int zzn() {
        return this.zzp;
    }
}
