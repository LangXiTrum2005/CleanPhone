package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f21898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f21899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f21900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vh1[][] f21901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vh1[] f21902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f21903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f21904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f21905h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f21903f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f21904g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f21905h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f81 f81Var = new f81(2, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f81Var.f14318c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        f81Var.f14317b = bigIntegerModPow2;
        f21898a = ps1.Z(b(bigIntegerMod));
        f21899b = ps1.Z(b(bigIntegerMod2));
        f21900c = ps1.Z(b(bigIntegerModPow));
        f21901d = (vh1[][]) Array.newInstance((Class<?>) vh1.class, 32, 8);
        f81 f81VarA = f81Var;
        for (int i10 = 0; i10 < 32; i10++) {
            f81 f81VarA2 = f81VarA;
            for (int i11 = 0; i11 < 8; i11++) {
                f21901d[i10][i11] = c(f81VarA2);
                f81VarA2 = a(f81VarA2, f81VarA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                f81VarA = a(f81VarA, f81VarA);
            }
        }
        f81 f81VarA3 = a(f81Var, f81Var);
        f21902e = new vh1[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f21902e[i13] = c(f81Var);
            f81Var = a(f81Var, f81VarA3);
        }
    }

    public static f81 a(f81 f81Var, f81 f81Var2) {
        f81 f81Var3 = new f81(2, false);
        BigInteger bigIntegerMultiply = f21904g.multiply(((BigInteger) f81Var.f14317b).multiply((BigInteger) f81Var2.f14317b).multiply((BigInteger) f81Var.f14318c).multiply((BigInteger) f81Var2.f14318c));
        BigInteger bigInteger = f21903f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) f81Var.f14317b).multiply((BigInteger) f81Var2.f14318c).add(((BigInteger) f81Var2.f14317b).multiply((BigInteger) f81Var.f14318c));
        BigInteger bigInteger2 = BigInteger.ONE;
        f81Var3.f14317b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        f81Var3.f14318c = ((BigInteger) f81Var.f14318c).multiply((BigInteger) f81Var2.f14318c).add(((BigInteger) f81Var.f14317b).multiply((BigInteger) f81Var2.f14317b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return f81Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }

    public static vh1 c(f81 f81Var) {
        BigInteger bigIntegerAdd = ((BigInteger) f81Var.f14318c).add((BigInteger) f81Var.f14317b);
        BigInteger bigInteger = f21903f;
        return new vh1(ps1.Z(b(bigIntegerAdd.mod(bigInteger))), ps1.Z(b(((BigInteger) f81Var.f14318c).subtract((BigInteger) f81Var.f14317b).mod(bigInteger))), ps1.Z(b(f21905h.multiply((BigInteger) f81Var.f14317b).multiply((BigInteger) f81Var.f14318c).mod(bigInteger))));
    }
}
