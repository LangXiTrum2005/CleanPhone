package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzhho {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhhh[][] zzd;
    static final zzhhh[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhhn zzhhnVar = new zzhhn(null);
        zzhhnVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhhnVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhhnVar.zzb(bigIntegerModPow2);
        zza = zzhht.zzg(zzb(bigIntegerMod));
        zzb = zzhht.zzg(zzb(bigIntegerMod2));
        zzc = zzhht.zzg(zzb(bigIntegerModPow));
        zzd = (zzhhh[][]) Array.newInstance((Class<?>) zzhhh.class, 32, 8);
        zzhhn zzhhnVarZza = zzhhnVar;
        for (int i2 = 0; i2 < 32; i2++) {
            zzhhn zzhhnVarZza2 = zzhhnVarZza;
            for (int i3 = 0; i3 < 8; i3++) {
                zzd[i2][i3] = zzc(zzhhnVarZza2);
                zzhhnVarZza2 = zza(zzhhnVarZza2, zzhhnVarZza);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                zzhhnVarZza = zza(zzhhnVarZza, zzhhnVarZza);
            }
        }
        zzhhn zzhhnVarZza3 = zza(zzhhnVar, zzhhnVar);
        zze = new zzhhh[8];
        for (int i5 = 0; i5 < 8; i5++) {
            zze[i5] = zzc(zzhhnVar);
            zzhhnVar = zza(zzhhnVar, zzhhnVarZza3);
        }
    }

    private static zzhhn zza(zzhhn zzhhnVar, zzhhn zzhhnVar2) {
        zzhhn zzhhnVar3 = new zzhhn(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhhnVar.zza().multiply(zzhhnVar2.zza()).multiply(zzhhnVar.zzc()).multiply(zzhhnVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhhnVar.zza().multiply(zzhhnVar2.zzc()).add(zzhhnVar2.zza().multiply(zzhhnVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhhnVar3.zzb(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhhnVar3.zzd(zzhhnVar.zzc().multiply(zzhhnVar2.zzc()).add(zzhhnVar.zza().multiply(zzhhnVar2.zza())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhhnVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }

    private static zzhhh zzc(zzhhn zzhhnVar) {
        BigInteger bigIntegerAdd = zzhhnVar.zzc().add(zzhhnVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhhh(zzhht.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhht.zzg(zzb(zzhhnVar.zzc().subtract(zzhhnVar.zza()).mod(bigInteger))), zzhht.zzg(zzb(zzh.multiply(zzhhnVar.zza()).multiply(zzhhnVar.zzc()).mod(bigInteger))));
    }
}
