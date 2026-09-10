package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aq1 implements hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12495a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12498d;

    public aq1(hf1 hf1Var, byte[] bArr, byte[] bArr2) {
        this.f12498d = hf1Var;
        this.f12496b = bArr;
        this.f12497c = bArr2;
    }

    public static byte[] c(kj1 kj1Var) throws GeneralSecurityException {
        on1 on1Var = (on1) kj1Var.f16466e;
        Integer num = (Integer) kj1Var.f16467f;
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return wi1.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return wi1.f21526a.b();
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return wi1.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.hf1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f12495a) {
            case 0:
                hf1 hf1Var = (hf1) this.f12498d;
                byte[] bArr3 = this.f12496b;
                int length = bArr3.length;
                byte[] bArr4 = this.f12497c;
                if (length == 0 && bArr4.length == 0) {
                    hf1Var.a(bArr, bArr2);
                    return;
                } else {
                    if (!rj1.c(bArr3, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr4.length != 0) {
                        bArr2 = jc1.f(bArr2, bArr4);
                    }
                    hf1Var.a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
                    return;
                }
            default:
                byte[] bArr5 = (byte[]) this.f12498d;
                byte[] bArr6 = this.f12497c;
                int length2 = bArr6.length;
                if (length2 == 0 && bArr5.length == 0) {
                    b(bArr, bArr2);
                    return;
                } else {
                    if (!rj1.c(bArr6, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    if (bArr5.length != 0) {
                        bArr2 = jc1.f(bArr2, bArr5);
                    }
                    b(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Serializable, long[]] */
    public void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i10 = 31;
            while (i10 >= 0) {
                int i11 = bArrCopyOfRange[i10] & 255;
                int i12 = pi1.P[i10] & 255;
                if (i11 != i12) {
                    if (i11 >= i12) {
                        break;
                    }
                    MessageDigest messageDigest = (MessageDigest) qq1.f19166e.f19169a.zza("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    byte[] bArr4 = this.f12496b;
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jT = pi1.T(0, bArrDigest) & 2097151;
                    long jU = pi1.U(2, bArrDigest) >> 5;
                    long jT2 = pi1.T(5, bArrDigest) >> 2;
                    long jU2 = pi1.U(7, bArrDigest) >> 7;
                    long jU3 = pi1.U(10, bArrDigest) >> 4;
                    long jT3 = pi1.T(13, bArrDigest) >> 1;
                    long jU4 = pi1.U(15, bArrDigest) >> 6;
                    long jT4 = pi1.T(18, bArrDigest) >> 3;
                    long jT5 = pi1.T(21, bArrDigest) & 2097151;
                    long jU5 = pi1.U(23, bArrDigest) >> 5;
                    long jT6 = pi1.T(26, bArrDigest) >> 2;
                    long jU6 = pi1.U(28, bArrDigest) >> 7;
                    long jU7 = pi1.U(31, bArrDigest) >> 4;
                    long jT7 = pi1.T(34, bArrDigest) >> 1;
                    long jU8 = pi1.U(36, bArrDigest) >> 6;
                    long jT8 = pi1.T(39, bArrDigest) >> 3;
                    long jT9 = pi1.T(42, bArrDigest) & 2097151;
                    long jU9 = pi1.U(44, bArrDigest) >> 5;
                    long jT10 = (pi1.T(47, bArrDigest) >> 2) & 2097151;
                    long jU10 = (pi1.U(49, bArrDigest) >> 7) & 2097151;
                    long jU11 = (pi1.U(52, bArrDigest) >> 4) & 2097151;
                    long jT11 = (pi1.T(55, bArrDigest) >> 1) & 2097151;
                    long jU12 = (pi1.U(57, bArrDigest) >> 6) & 2097151;
                    long jU13 = pi1.U(60, bArrDigest) >> 3;
                    long j10 = (jU11 * 666643) + jT5;
                    long j11 = (jU10 * 666643) + jT4;
                    long j12 = (jT10 * 666643) + (jU4 & 2097151);
                    long j13 = (j12 + 1048576) >> 21;
                    long j14 = j13 << 21;
                    long j15 = (jT10 * 654183) + (jU10 * 470296) + j10;
                    long j16 = (j15 + 1048576) >> 21;
                    long j17 = j16 << 21;
                    long j18 = (jT10 * 136657) + (((jU11 * 654183) + ((jT11 * 470296) + ((jU12 * 666643) + (jT6 & 2097151)))) - (jU10 * 997805));
                    long j19 = (j18 + 1048576) >> 21;
                    long j20 = j19 << 21;
                    long j21 = ((jU11 * 136657) + (((jU12 * 654183) + ((jU13 * 470296) + (jU7 & 2097151))) - (jT11 * 997805))) - (jU10 * 683901);
                    long j22 = (j21 + 1048576) >> 21;
                    long j23 = ((jU12 * 136657) + ((jU8 & 2097151) - (jU13 * 997805))) - (jT11 * 683901);
                    long j24 = (j23 + 1048576) >> 21;
                    long j25 = j24 << 21;
                    long j26 = jT9 - (jU13 * 683901);
                    long j27 = (j26 + 1048576) >> 21;
                    long j28 = (jT10 * 470296) + j11 + j13;
                    long j29 = (j28 + 1048576) >> 21;
                    long j30 = j29 << 21;
                    long j31 = (((jU10 * 654183) + ((jU11 * 470296) + ((jT11 * 666643) + (jU5 & 2097151)))) - (jT10 * 997805)) + j16;
                    long j32 = (j31 + 1048576) >> 21;
                    long j33 = j32 << 21;
                    long j34 = (((jU10 * 136657) + (((jT11 * 654183) + ((jU12 * 470296) + ((jU13 * 666643) + (jU6 & 2097151)))) - (jU11 * 997805))) - (jT10 * 683901)) + j19;
                    long j35 = (j34 + 1048576) >> 21;
                    long j36 = j35 << 21;
                    long j37 = (((jT11 * 136657) + (((jU13 * 654183) + (jT7 & 2097151)) - (jU12 * 997805))) - (jU11 * 683901)) + j22;
                    long j38 = (j37 + 1048576) >> 21;
                    long j39 = (((jU13 * 136657) + jT8) - (jU12 * 683901)) + j24;
                    long j40 = (j39 + 1048576) >> 21;
                    long j41 = (j21 - (j22 << 21)) + j35;
                    long j42 = (j41 * 666643) + jT;
                    long j43 = (j42 + 1048576) >> 21;
                    long j44 = j43 << 21;
                    long j45 = (j23 - j25) + j38;
                    long j46 = j37 - (j38 << 21);
                    long j47 = (j41 * 654183) + (j46 * 470296) + (j45 * 666643) + (jT2 & 2097151);
                    long j48 = (j47 + 1048576) >> 21;
                    long j49 = j48 << 21;
                    long j50 = (j26 - (j27 << 21)) + j40;
                    long j51 = j39 - (j40 << 21);
                    long j52 = (j41 * 136657) + (((j45 * 654183) + ((j51 * 470296) + ((j50 * 666643) + (jU3 & 2097151)))) - (j46 * 997805));
                    long j53 = (j52 + 1048576) >> 21;
                    long j54 = j53 << 21;
                    long j55 = (jU9 & 2097151) + j27;
                    long j56 = ((j45 * 136657) + (((j50 * 654183) + ((j55 * 470296) + (j12 - j14))) - (j51 * 997805))) - (j46 * 683901);
                    long j57 = (j56 + 1048576) >> 21;
                    long j58 = j57 << 21;
                    long j59 = ((j50 * 136657) + (((j15 - j17) + j29) - (j55 * 997805))) - (j51 * 683901);
                    long j60 = (j59 + 1048576) >> 21;
                    long j61 = j60 << 21;
                    long j62 = ((j18 - j20) + j32) - (j55 * 683901);
                    long j63 = (j62 + 1048576) >> 21;
                    long j64 = j63 << 21;
                    long j65 = (j41 * 470296) + (j46 * 666643) + (jU & 2097151) + j43;
                    long j66 = (j65 + 1048576) >> 21;
                    long j67 = (((j46 * 654183) + ((j45 * 470296) + ((j51 * 666643) + (jU2 & 2097151)))) - (j41 * 997805)) + j48;
                    long j68 = (j67 + 1048576) >> 21;
                    long j69 = (((j46 * 136657) + (((j51 * 654183) + ((j50 * 470296) + ((j55 * 666643) + (jT3 & 2097151)))) - (j45 * 997805))) - (j41 * 683901)) + j53;
                    long j70 = (j69 + 1048576) >> 21;
                    long j71 = (((j51 * 136657) + (((j55 * 654183) + (j28 - j30)) - (j50 * 997805))) - (j45 * 683901)) + j57;
                    long j72 = (j71 + 1048576) >> 21;
                    long j73 = (((j55 * 136657) + (j31 - j33)) - (j50 * 683901)) + j60;
                    long j74 = (j73 + 1048576) >> 21;
                    long j75 = (j34 - j36) + j63;
                    long j76 = (j75 + 1048576) >> 21;
                    long j77 = j76 << 21;
                    long j78 = (j76 * 666643) + (j42 - j44);
                    long j79 = j78 >> 21;
                    long j80 = j79 << 21;
                    long j81 = (j76 * 470296) + (j65 - (j66 << 21)) + j79;
                    long j82 = j81 >> 21;
                    long j83 = j82 << 21;
                    long j84 = (j76 * 654183) + (j47 - j49) + j66 + j82;
                    long j85 = j84 >> 21;
                    long j86 = j85 << 21;
                    long j87 = ((j67 - (j68 << 21)) - (j76 * 997805)) + j85;
                    long j88 = j87 >> 21;
                    long j89 = j88 << 21;
                    long j90 = (j76 * 136657) + (j52 - j54) + j68 + j88;
                    long j91 = j90 >> 21;
                    long j92 = j91 << 21;
                    long j93 = ((j69 - (j70 << 21)) - (j76 * 683901)) + j91;
                    long j94 = j93 >> 21;
                    long j95 = j94 << 21;
                    long j96 = (j56 - j58) + j70 + j94;
                    long j97 = j96 >> 21;
                    long j98 = j97 << 21;
                    long j99 = (j71 - (j72 << 21)) + j97;
                    long j100 = j99 >> 21;
                    long j101 = j100 << 21;
                    long j102 = (j59 - j61) + j72 + j100;
                    long j103 = j102 >> 21;
                    long j104 = j103 << 21;
                    long j105 = (j73 - (j74 << 21)) + j103;
                    long j106 = j105 >> 21;
                    long j107 = j106 << 21;
                    long j108 = (j62 - j64) + j74 + j106;
                    long j109 = j108 >> 21;
                    long j110 = j109 << 21;
                    long j111 = (j75 - j77) + j109;
                    long j112 = j111 >> 21;
                    long j113 = j112 << 21;
                    long j114 = (666643 * j112) + (j78 - j80);
                    long j115 = j114 >> 21;
                    long j116 = j115 << 21;
                    long j117 = (470296 * j112) + (j81 - j83) + j115;
                    long j118 = j117 >> 21;
                    long j119 = j118 << 21;
                    long j120 = (654183 * j112) + (j84 - j86) + j118;
                    long j121 = j120 >> 21;
                    long j122 = j121 << 21;
                    long j123 = ((j87 - j89) - (997805 * j112)) + j121;
                    long j124 = j123 >> 21;
                    long j125 = j124 << 21;
                    long j126 = (136657 * j112) + (j90 - j92) + j124;
                    long j127 = j126 >> 21;
                    long j128 = j127 << 21;
                    long j129 = ((j93 - j95) - (j112 * 683901)) + j127;
                    long j130 = j129 >> 21;
                    long j131 = j130 << 21;
                    long j132 = (j96 - j98) + j130;
                    long j133 = j132 >> 21;
                    long j134 = j133 << 21;
                    long j135 = (j99 - j101) + j133;
                    long j136 = j135 >> 21;
                    long j137 = j136 << 21;
                    long j138 = (j102 - j104) + j136;
                    long j139 = j138 >> 21;
                    long j140 = j139 << 21;
                    long j141 = (j105 - j107) + j139;
                    long j142 = j141 >> 21;
                    long j143 = j142 << 21;
                    long j144 = (j108 - j110) + j142;
                    long j145 = j144 >> 21;
                    long j146 = j114 - j116;
                    bArrDigest[0] = (byte) j146;
                    long j147 = j135 - j137;
                    long j148 = j132 - j134;
                    long j149 = j129 - j131;
                    long j150 = j126 - j128;
                    long j151 = j123 - j125;
                    long j152 = j120 - j122;
                    long j153 = j117 - j119;
                    bArrDigest[1] = (byte) (j146 >> 8);
                    bArrDigest[2] = (byte) ((j146 >> 16) | (j153 << 5));
                    bArrDigest[3] = (byte) (j153 >> 3);
                    bArrDigest[4] = (byte) (j153 >> 11);
                    bArrDigest[5] = (byte) ((j153 >> 19) | (j152 << 2));
                    bArrDigest[6] = (byte) (j152 >> 6);
                    bArrDigest[7] = (byte) ((j152 >> 14) | (j151 << 7));
                    bArrDigest[8] = (byte) (j151 >> 1);
                    bArrDigest[9] = (byte) (j151 >> 9);
                    bArrDigest[10] = (byte) ((j151 >> 17) | (j150 << 4));
                    bArrDigest[11] = (byte) (j150 >> 4);
                    bArrDigest[12] = (byte) (j150 >> 12);
                    bArrDigest[13] = (byte) ((j150 >> 20) | (j149 + j149));
                    bArrDigest[14] = (byte) (j149 >> 7);
                    bArrDigest[15] = (byte) ((j149 >> 15) | (j148 << 6));
                    bArrDigest[16] = (byte) (j148 >> 2);
                    bArrDigest[17] = (byte) (j148 >> 10);
                    bArrDigest[18] = (byte) ((j148 >> 18) | (j147 << 3));
                    long j154 = j144 - (j145 << 21);
                    long j155 = (j111 - j113) + j145;
                    long j156 = j141 - j143;
                    long j157 = j138 - j140;
                    bArrDigest[19] = (byte) (j147 >> 5);
                    bArrDigest[20] = (byte) (j147 >> 13);
                    bArrDigest[21] = (byte) j157;
                    bArrDigest[22] = (byte) (j157 >> 8);
                    bArrDigest[23] = (byte) ((j157 >> 16) | (j156 << 5));
                    bArrDigest[24] = (byte) (j156 >> 3);
                    bArrDigest[25] = (byte) (j156 >> 11);
                    bArrDigest[26] = (byte) ((j156 >> 19) | (j154 << 2));
                    bArrDigest[27] = (byte) (j154 >> 6);
                    bArrDigest[28] = (byte) ((j154 >> 14) | (j155 << 7));
                    bArrDigest[29] = (byte) (j155 >> 1);
                    bArrDigest[30] = (byte) (j155 >> 9);
                    bArrDigest[31] = (byte) (j155 >> 17);
                    ?? r10 = new long[10];
                    ?? Z = ps1.Z(bArr4);
                    long[] jArr = new long[10];
                    jArr[0] = 1;
                    long[] jArr2 = new long[10];
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    ps1.W(jArr3, Z);
                    ps1.S(jArr4, jArr3, xh1.f21898a);
                    ps1.E(jArr3, jArr3, jArr);
                    ps1.w(jArr4, jArr4, jArr);
                    long[] jArr7 = new long[10];
                    ps1.W(jArr7, jArr4);
                    ps1.S(jArr7, jArr7, jArr4);
                    ps1.W(r10, jArr7);
                    ps1.S(r10, r10, jArr4);
                    ps1.S(r10, r10, jArr3);
                    long[] jArr8 = new long[10];
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    ps1.W(jArr8, r10);
                    ps1.W(jArr9, jArr8);
                    ps1.W(jArr9, jArr9);
                    ps1.S(jArr9, r10, jArr9);
                    ps1.S(jArr8, jArr8, jArr9);
                    ps1.W(jArr8, jArr8);
                    ps1.S(jArr8, jArr9, jArr8);
                    ps1.W(jArr9, jArr8);
                    for (int i13 = 1; i13 < 5; i13++) {
                        ps1.W(jArr9, jArr9);
                    }
                    ps1.S(jArr8, jArr9, jArr8);
                    ps1.W(jArr9, jArr8);
                    for (int i14 = 1; i14 < 10; i14++) {
                        ps1.W(jArr9, jArr9);
                    }
                    ps1.S(jArr9, jArr9, jArr8);
                    ps1.W(jArr10, jArr9);
                    for (int i15 = 1; i15 < 20; i15++) {
                        ps1.W(jArr10, jArr10);
                    }
                    ps1.S(jArr9, jArr10, jArr9);
                    ps1.W(jArr9, jArr9);
                    for (int i16 = 1; i16 < 10; i16++) {
                        ps1.W(jArr9, jArr9);
                    }
                    ps1.S(jArr8, jArr9, jArr8);
                    ps1.W(jArr9, jArr8);
                    for (int i17 = 1; i17 < 50; i17++) {
                        ps1.W(jArr9, jArr9);
                    }
                    ps1.S(jArr9, jArr9, jArr8);
                    ps1.W(jArr10, jArr9);
                    for (int i18 = 1; i18 < 100; i18++) {
                        ps1.W(jArr10, jArr10);
                    }
                    ps1.S(jArr9, jArr10, jArr9);
                    ps1.W(jArr9, jArr9);
                    for (int i19 = 1; i19 < 50; i19++) {
                        ps1.W(jArr9, jArr9);
                    }
                    ps1.S(jArr8, jArr9, jArr8);
                    ps1.W(jArr8, jArr8);
                    ps1.W(jArr8, jArr8);
                    ps1.S(r10, jArr8, r10);
                    ps1.S(r10, r10, jArr7);
                    ps1.S(r10, r10, jArr3);
                    ps1.W(jArr5, r10);
                    ps1.S(jArr5, jArr5, jArr4);
                    ps1.E(jArr6, jArr5, jArr3);
                    if (pi1.E(jArr6)) {
                        ps1.w(jArr6, jArr5, jArr3);
                        if (pi1.E(jArr6)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        ps1.S(r10, r10, xh1.f21900c);
                    }
                    if (!pi1.E(r10) && ((bArr4[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    if ((ps1.b0(r10)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i20 = 0; i20 < 10; i20++) {
                            r10[i20] = -r10[i20];
                        }
                    }
                    ps1.S(jArr2, r10, Z);
                    ay0 ay0Var = new ay0(r10, Z, jArr, 6);
                    wh1[] wh1VarArr = new wh1[8];
                    wh1VarArr[0] = new wh1(new iw0(7, ay0Var, jArr2));
                    f81 f81Var = new f81(1, new ay0(6), new long[10]);
                    pi1.M(ay0Var, f81Var);
                    iw0 iw0Var = new iw0(f81Var);
                    for (int i21 = 1; i21 < 8; i21++) {
                        pi1.I(f81Var, iw0Var, wh1VarArr[i21 - 1]);
                        wh1VarArr[i21] = new wh1(new iw0(f81Var));
                    }
                    byte[] bArrS = pi1.S(bArrDigest);
                    byte[] bArrS2 = pi1.S(bArrCopyOfRange);
                    f81 f81Var2 = new f81(1);
                    iw0 iw0Var2 = new iw0(7);
                    int i22 = 255;
                    while (i22 >= 0 && bArrS[i22] == 0 && bArrS2[i22] == 0) {
                        i22--;
                    }
                    while (i22 >= 0) {
                        pi1.M(new ay0(f81Var2), f81Var2);
                        byte b10 = bArrS[i22];
                        if (b10 > 0) {
                            iw0.k(iw0Var2, f81Var2);
                            pi1.I(f81Var2, iw0Var2, wh1VarArr[bArrS[i22] / 2]);
                        } else if (b10 < 0) {
                            iw0.k(iw0Var2, f81Var2);
                            pi1.K(f81Var2, iw0Var2, wh1VarArr[(-bArrS[i22]) / 2]);
                        }
                        byte b11 = bArrS2[i22];
                        if (b11 > 0) {
                            iw0.k(iw0Var2, f81Var2);
                            pi1.I(f81Var2, iw0Var2, xh1.f21902e[bArrS2[i22] / 2]);
                        } else if (b11 < 0) {
                            iw0.k(iw0Var2, f81Var2);
                            pi1.K(f81Var2, iw0Var2, xh1.f21902e[(-bArrS2[i22]) / 2]);
                        }
                        i22--;
                    }
                    byte[] bArrG = new ay0(f81Var2).g();
                    for (int i23 = 0; i23 < 32; i23++) {
                        if (bArrG[i23] != bArr[i23]) {
                            break;
                        }
                    }
                    return;
                }
                i10--;
                bArr3 = bArr;
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }

    public aq1(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!jc1.e(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f12496b = (byte[]) bArr.clone();
        this.f12497c = bArr2;
        this.f12498d = bArr3;
        if (xh1.f21898a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }
}
