package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhk {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhhk(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public static zzhhk zza(zzhhk zzhhkVar, zzhhj zzhhjVar) {
        zzhhk zzhhkVar2 = zzhhjVar.zza;
        long[] jArr = zzhhkVar.zza;
        long[] jArr2 = zzhhkVar2.zza;
        long[] jArr3 = zzhhjVar.zzb;
        zzhht.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhhkVar.zzb;
        long[] jArr5 = zzhhkVar2.zzb;
        long[] jArr6 = zzhhkVar2.zzc;
        zzhht.zze(jArr4, jArr5, jArr6);
        zzhht.zze(zzhhkVar.zzc, jArr6, jArr3);
        return zzhhkVar;
    }

    public final byte[] zzb() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = this.zzc;
        zzhht.zzf(jArr4, jArr14);
        zzhht.zzf(jArr13, jArr4);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zze(jArr5, jArr12, jArr14);
        zzhht.zze(jArr6, jArr5, jArr4);
        zzhht.zzf(jArr12, jArr6);
        zzhht.zze(jArr7, jArr12, jArr5);
        zzhht.zzf(jArr12, jArr7);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zze(jArr8, jArr12, jArr7);
        zzhht.zzf(jArr12, jArr8);
        zzhht.zzf(jArr13, jArr12);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzhht.zzf(jArr12, jArr13);
            zzhht.zzf(jArr13, jArr12);
        }
        zzhht.zze(jArr9, jArr13, jArr8);
        zzhht.zzf(jArr12, jArr9);
        zzhht.zzf(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            zzhht.zzf(jArr12, jArr13);
            zzhht.zzf(jArr13, jArr12);
        }
        zzhht.zze(jArr12, jArr13, jArr9);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zzf(jArr12, jArr13);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            zzhht.zzf(jArr13, jArr12);
            zzhht.zzf(jArr12, jArr13);
        }
        zzhht.zze(jArr10, jArr12, jArr8);
        zzhht.zzf(jArr12, jArr10);
        zzhht.zzf(jArr13, jArr12);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            zzhht.zzf(jArr12, jArr13);
            zzhht.zzf(jArr13, jArr12);
        }
        zzhht.zze(jArr11, jArr13, jArr10);
        zzhht.zzf(jArr13, jArr11);
        zzhht.zzf(jArr12, jArr13);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            zzhht.zzf(jArr13, jArr12);
            zzhht.zzf(jArr12, jArr13);
        }
        zzhht.zze(jArr13, jArr12, jArr11);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zzf(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzhht.zzf(jArr12, jArr13);
            zzhht.zzf(jArr13, jArr12);
        }
        zzhht.zze(jArr12, jArr13, jArr10);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zzf(jArr12, jArr13);
        zzhht.zzf(jArr13, jArr12);
        zzhht.zze(jArr, jArr13, jArr6);
        zzhht.zze(jArr2, this.zza, jArr);
        zzhht.zze(jArr3, this.zzb, jArr);
        byte[] bArrZzh = zzhht.zzh(jArr3);
        bArrZzh[31] = (byte) ((zzhhm.zzf(jArr2) << 7) ^ bArrZzh[31]);
        return bArrZzh;
    }

    public zzhhk() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhhk(zzhhj zzhhjVar) {
        this();
        zza(this, zzhhjVar);
    }

    public zzhhk(zzhhk zzhhkVar) {
        this.zza = Arrays.copyOf(zzhhkVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhhkVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhhkVar.zzc, 10);
    }
}
