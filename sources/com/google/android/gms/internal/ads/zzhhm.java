package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhhm {
    private static final zzhhh zzb = new zzhhh(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final zzhhj zzc = new zzhhj(new zzhhk(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] zza = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static byte[] zza(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 + i3;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            bArr2[i4 + 1] = (byte) ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b2 = (byte) (bArr2[i5] + i6);
            bArr2[i5] = b2;
            int i7 = (b2 + 8) >> 4;
            bArr2[i5] = (byte) (b2 - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr2[63] = (byte) (bArr2[63] + i6);
        zzhhj zzhhjVar = new zzhhj(zzc);
        zzhhl zzhhlVar = new zzhhl();
        for (i2 = 1; i2 < 64; i2 += 2) {
            zzhhh zzhhhVar = new zzhhh(zzb);
            zzk(zzhhhVar, i2 / 2, bArr2[i2]);
            zzhhl.zza(zzhhlVar, zzhhjVar);
            zzg(zzhhjVar, zzhhlVar, zzhhhVar);
        }
        zzhhk zzhhkVar = new zzhhk();
        zzhhk.zza(zzhhkVar, zzhhjVar);
        zzi(zzhhjVar, zzhhkVar);
        zzhhk.zza(zzhhkVar, zzhhjVar);
        zzi(zzhhjVar, zzhhkVar);
        zzhhk.zza(zzhhkVar, zzhhjVar);
        zzi(zzhhjVar, zzhhkVar);
        zzhhk.zza(zzhhkVar, zzhhjVar);
        zzi(zzhhjVar, zzhhkVar);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            zzhhh zzhhhVar2 = new zzhhh(zzb);
            zzk(zzhhhVar2, i8 / 2, bArr2[i8]);
            zzhhl.zza(zzhhlVar, zzhhjVar);
            zzg(zzhhjVar, zzhhlVar, zzhhhVar2);
        }
        zzhhk zzhhkVar2 = new zzhhk(zzhhjVar);
        long[] jArr = new long[10];
        zzhht.zzf(jArr, zzhhkVar2.zza);
        long[] jArr2 = new long[10];
        zzhht.zzf(jArr2, zzhhkVar2.zzb);
        long[] jArr3 = new long[10];
        zzhht.zzf(jArr3, zzhhkVar2.zzc);
        long[] jArr4 = new long[10];
        zzhht.zzf(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhht.zzb(jArr5, jArr2, jArr);
        zzhht.zze(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhht.zze(jArr6, jArr, jArr2);
        zzhht.zze(jArr6, jArr6, zzhho.zza);
        zzhht.zza(jArr6, jArr6, jArr4);
        zzhht.zzc(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhht.zzh(jArr5), zzhht.zzh(jArr6))) {
            return zzhhkVar2.zzb();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        MessageDigest messageDigest = (MessageDigest) zzhwc.zzd.zzb("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & AbstractJsonLexerKt.TC_INVALID;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        return bArrDigest;
    }

    public static boolean zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        byte b2;
        byte[] bArr4 = bArr2;
        if (bArr4.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, 32, 64);
        int i2 = 31;
        while (i2 >= 0) {
            int i3 = bArrCopyOfRange[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i4 = zza[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 != i4) {
                if (i3 >= i4) {
                    break;
                }
                MessageDigest messageDigest = (MessageDigest) zzhwc.zzd.zzb("SHA-512");
                messageDigest.update(bArr4, 0, 32);
                messageDigest.update(bArr3);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long jZzn = zzn(bArrDigest, 0) & 2097151;
                long jZzo = zzo(bArrDigest, 2) >> 5;
                long jZzn2 = zzn(bArrDigest, 5) >> 2;
                long jZzo2 = zzo(bArrDigest, 7) >> 7;
                long jZzo3 = zzo(bArrDigest, 10) >> 4;
                long jZzn3 = zzn(bArrDigest, 13) >> 1;
                long jZzo4 = zzo(bArrDigest, 15) >> 6;
                long jZzn4 = zzn(bArrDigest, 18) >> 3;
                long jZzn5 = zzn(bArrDigest, 21) & 2097151;
                long jZzo5 = zzo(bArrDigest, 23) >> 5;
                long jZzn6 = zzn(bArrDigest, 26) >> 2;
                long jZzo6 = zzo(bArrDigest, 28) >> 7;
                long jZzo7 = zzo(bArrDigest, 31) >> 4;
                long jZzn7 = zzn(bArrDigest, 34) >> 1;
                long jZzo8 = zzo(bArrDigest, 36) >> 6;
                long jZzn8 = zzn(bArrDigest, 39) >> 3;
                long jZzn9 = zzn(bArrDigest, 42) & 2097151;
                long jZzo9 = zzo(bArrDigest, 44) >> 5;
                long jZzn10 = (zzn(bArrDigest, 47) >> 2) & 2097151;
                long jZzo10 = (zzo(bArrDigest, 49) >> 7) & 2097151;
                long jZzo11 = (zzo(bArrDigest, 52) >> 4) & 2097151;
                long jZzn11 = (zzn(bArrDigest, 55) >> 1) & 2097151;
                long jZzo12 = (zzo(bArrDigest, 57) >> 6) & 2097151;
                long jZzo13 = zzo(bArrDigest, 60) >> 3;
                long j = (jZzo11 * 666643) + jZzn5;
                long j2 = (jZzo10 * 666643) + jZzn4;
                long j3 = (jZzn10 * 666643) + (jZzo4 & 2097151);
                long j4 = (j3 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j5 = j4 << 21;
                long j6 = (jZzn10 * 654183) + (jZzo10 * 470296) + j;
                long j7 = (j6 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j8 = j7 << 21;
                long j9 = (jZzn10 * 136657) + (((jZzo11 * 654183) + ((jZzn11 * 470296) + ((jZzo12 * 666643) + (jZzn6 & 2097151)))) - (jZzo10 * 997805));
                long j10 = (j9 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j11 = j10 << 21;
                long j12 = ((jZzo11 * 136657) + (((jZzo12 * 654183) + ((jZzo13 * 470296) + (jZzo7 & 2097151))) - (jZzn11 * 997805))) - (jZzo10 * 683901);
                long j13 = (j12 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j14 = ((jZzo12 * 136657) + ((jZzo8 & 2097151) - (jZzo13 * 997805))) - (jZzn11 * 683901);
                long j15 = (j14 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j16 = j15 << 21;
                long j17 = jZzn9 - (jZzo13 * 683901);
                long j18 = (j17 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j19 = (jZzn10 * 470296) + j2 + j4;
                long j20 = (j19 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j21 = j20 << 21;
                long j22 = (((jZzo10 * 654183) + ((jZzo11 * 470296) + ((jZzn11 * 666643) + (jZzo5 & 2097151)))) - (jZzn10 * 997805)) + j7;
                long j23 = (j22 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j24 = j23 << 21;
                long j25 = (((jZzo10 * 136657) + (((jZzn11 * 654183) + ((jZzo12 * 470296) + ((jZzo13 * 666643) + (jZzo6 & 2097151)))) - (jZzo11 * 997805))) - (jZzn10 * 683901)) + j10;
                long j26 = (j25 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j27 = j26 << 21;
                long j28 = (((jZzn11 * 136657) + (((jZzo13 * 654183) + (jZzn7 & 2097151)) - (jZzo12 * 997805))) - (jZzo11 * 683901)) + j13;
                long j29 = (j28 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j30 = (((jZzo13 * 136657) + jZzn8) - (jZzo12 * 683901)) + j15;
                long j31 = (j30 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j32 = (j12 - (j13 << 21)) + j26;
                long j33 = (j32 * 666643) + jZzn;
                long j34 = (j33 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j35 = j34 << 21;
                long j36 = (j14 - j16) + j29;
                long j37 = j28 - (j29 << 21);
                long j38 = (j32 * 654183) + (j37 * 470296) + (j36 * 666643) + (jZzn2 & 2097151);
                long j39 = (j38 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j40 = j39 << 21;
                long j41 = (j17 - (j18 << 21)) + j31;
                long j42 = j30 - (j31 << 21);
                long j43 = (j32 * 136657) + (((j36 * 654183) + ((j42 * 470296) + ((j41 * 666643) + (jZzo3 & 2097151)))) - (j37 * 997805));
                long j44 = (j43 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j45 = j44 << 21;
                long j46 = (jZzo9 & 2097151) + j18;
                long j47 = ((j36 * 136657) + (((j41 * 654183) + ((j46 * 470296) + (j3 - j5))) - (j42 * 997805))) - (j37 * 683901);
                long j48 = (j47 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j49 = j48 << 21;
                long j50 = ((j41 * 136657) + (((j6 - j8) + j20) - (j46 * 997805))) - (j42 * 683901);
                long j51 = (j50 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j52 = j51 << 21;
                long j53 = ((j9 - j11) + j23) - (j46 * 683901);
                long j54 = (j53 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j55 = j54 << 21;
                long j56 = (j32 * 470296) + (j37 * 666643) + (jZzo & 2097151) + j34;
                long j57 = (j56 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j58 = (((j37 * 654183) + ((j36 * 470296) + ((j42 * 666643) + (jZzo2 & 2097151)))) - (j32 * 997805)) + j39;
                long j59 = (j58 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j60 = (((j37 * 136657) + (((j42 * 654183) + ((j41 * 470296) + ((j46 * 666643) + (jZzn3 & 2097151)))) - (j36 * 997805))) - (j32 * 683901)) + j44;
                long j61 = (j60 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j62 = (((j42 * 136657) + (((j46 * 654183) + (j19 - j21)) - (j41 * 997805))) - (j36 * 683901)) + j48;
                long j63 = (j62 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j64 = (((j46 * 136657) + (j22 - j24)) - (j41 * 683901)) + j51;
                long j65 = (j64 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j66 = (j25 - j27) + j54;
                long j67 = (j66 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
                long j68 = j67 << 21;
                long j69 = (j67 * 666643) + (j33 - j35);
                long j70 = j69 >> 21;
                long j71 = j70 << 21;
                long j72 = (j67 * 470296) + (j56 - (j57 << 21)) + j70;
                long j73 = j72 >> 21;
                long j74 = j73 << 21;
                long j75 = (j67 * 654183) + (j38 - j40) + j57 + j73;
                long j76 = j75 >> 21;
                long j77 = j76 << 21;
                long j78 = ((j58 - (j59 << 21)) - (j67 * 997805)) + j76;
                long j79 = j78 >> 21;
                long j80 = j79 << 21;
                long j81 = (j67 * 136657) + (j43 - j45) + j59 + j79;
                long j82 = j81 >> 21;
                long j83 = j82 << 21;
                long j84 = ((j60 - (j61 << 21)) - (j67 * 683901)) + j82;
                long j85 = j84 >> 21;
                long j86 = j85 << 21;
                long j87 = (j47 - j49) + j61 + j85;
                long j88 = j87 >> 21;
                long j89 = j88 << 21;
                long j90 = (j62 - (j63 << 21)) + j88;
                long j91 = j90 >> 21;
                long j92 = j91 << 21;
                long j93 = (j50 - j52) + j63 + j91;
                long j94 = j93 >> 21;
                long j95 = j94 << 21;
                long j96 = (j64 - (j65 << 21)) + j94;
                long j97 = j96 >> 21;
                long j98 = j97 << 21;
                long j99 = (j53 - j55) + j65 + j97;
                long j100 = j99 >> 21;
                long j101 = j100 << 21;
                long j102 = (j66 - j68) + j100;
                long j103 = j102 >> 21;
                long j104 = j103 << 21;
                long j105 = (666643 * j103) + (j69 - j71);
                long j106 = j105 >> 21;
                long j107 = j106 << 21;
                long j108 = (470296 * j103) + (j72 - j74) + j106;
                long j109 = j108 >> 21;
                long j110 = j109 << 21;
                long j111 = (654183 * j103) + (j75 - j77) + j109;
                long j112 = j111 >> 21;
                long j113 = j112 << 21;
                long j114 = ((j78 - j80) - (997805 * j103)) + j112;
                long j115 = j114 >> 21;
                long j116 = j115 << 21;
                long j117 = (136657 * j103) + (j81 - j83) + j115;
                long j118 = j117 >> 21;
                long j119 = j118 << 21;
                long j120 = ((j84 - j86) - (j103 * 683901)) + j118;
                long j121 = j120 >> 21;
                long j122 = j121 << 21;
                long j123 = (j87 - j89) + j121;
                long j124 = j123 >> 21;
                long j125 = j124 << 21;
                long j126 = (j90 - j92) + j124;
                long j127 = j126 >> 21;
                long j128 = j127 << 21;
                long j129 = (j93 - j95) + j127;
                long j130 = j129 >> 21;
                long j131 = j130 << 21;
                long j132 = (j96 - j98) + j130;
                long j133 = j132 >> 21;
                long j134 = j133 << 21;
                long j135 = (j99 - j101) + j133;
                long j136 = j135 >> 21;
                long j137 = j105 - j107;
                bArrDigest[0] = (byte) j137;
                long j138 = j126 - j128;
                long j139 = j123 - j125;
                long j140 = j120 - j122;
                long j141 = j117 - j119;
                long j142 = j114 - j116;
                long j143 = j111 - j113;
                long j144 = j108 - j110;
                bArrDigest[1] = (byte) (j137 >> 8);
                bArrDigest[2] = (byte) ((j137 >> 16) | (j144 << 5));
                bArrDigest[3] = (byte) (j144 >> 3);
                bArrDigest[4] = (byte) (j144 >> 11);
                bArrDigest[5] = (byte) ((j144 >> 19) | (j143 << 2));
                bArrDigest[6] = (byte) (j143 >> 6);
                bArrDigest[7] = (byte) ((j143 >> 14) | (j142 << 7));
                bArrDigest[8] = (byte) (j142 >> 1);
                bArrDigest[9] = (byte) (j142 >> 9);
                bArrDigest[10] = (byte) ((j142 >> 17) | (j141 << 4));
                bArrDigest[11] = (byte) (j141 >> 4);
                bArrDigest[12] = (byte) (j141 >> 12);
                bArrDigest[13] = (byte) ((j141 >> 20) | (j140 + j140));
                bArrDigest[14] = (byte) (j140 >> 7);
                bArrDigest[15] = (byte) ((j140 >> 15) | (j139 << 6));
                bArrDigest[16] = (byte) (j139 >> 2);
                bArrDigest[17] = (byte) (j139 >> 10);
                bArrDigest[18] = (byte) ((j139 >> 18) | (j138 << 3));
                long j145 = j135 - (j136 << 21);
                long j146 = (j102 - j104) + j136;
                long j147 = j132 - j134;
                long j148 = j129 - j131;
                bArrDigest[19] = (byte) (j138 >> 5);
                bArrDigest[20] = (byte) (j138 >> 13);
                bArrDigest[21] = (byte) j148;
                bArrDigest[22] = (byte) (j148 >> 8);
                bArrDigest[23] = (byte) ((j148 >> 16) | (j147 << 5));
                bArrDigest[24] = (byte) (j147 >> 3);
                bArrDigest[25] = (byte) (j147 >> 11);
                bArrDigest[26] = (byte) ((j147 >> 19) | (j145 << 2));
                bArrDigest[27] = (byte) (j145 >> 6);
                bArrDigest[28] = (byte) ((j145 >> 14) | (j146 << 7));
                bArrDigest[29] = (byte) (j146 >> 1);
                bArrDigest[30] = (byte) (j146 >> 9);
                bArrDigest[31] = (byte) (j146 >> 17);
                long[] jArr = new long[10];
                long[] jArrZzg = zzhht.zzg(bArr3);
                long[] jArr2 = new long[10];
                jArr2[0] = 1;
                long[] jArr3 = new long[10];
                long[] jArr4 = new long[10];
                long[] jArr5 = new long[10];
                long[] jArr6 = new long[10];
                long[] jArr7 = new long[10];
                zzhht.zzf(jArr4, jArrZzg);
                zzhht.zze(jArr5, jArr4, zzhho.zza);
                zzhht.zzb(jArr4, jArr4, jArr2);
                zzhht.zza(jArr5, jArr5, jArr2);
                long[] jArr8 = new long[10];
                zzhht.zzf(jArr8, jArr5);
                zzhht.zze(jArr8, jArr8, jArr5);
                zzhht.zzf(jArr, jArr8);
                zzhht.zze(jArr, jArr, jArr5);
                zzhht.zze(jArr, jArr, jArr4);
                long[] jArr9 = new long[10];
                long[] jArr10 = new long[10];
                long[] jArr11 = new long[10];
                zzhht.zzf(jArr9, jArr);
                zzhht.zzf(jArr10, jArr9);
                zzhht.zzf(jArr10, jArr10);
                zzhht.zze(jArr10, jArr, jArr10);
                zzhht.zze(jArr9, jArr9, jArr10);
                zzhht.zzf(jArr9, jArr9);
                zzhht.zze(jArr9, jArr10, jArr9);
                zzhht.zzf(jArr10, jArr9);
                for (int i5 = 1; i5 < 5; i5++) {
                    zzhht.zzf(jArr10, jArr10);
                }
                zzhht.zze(jArr9, jArr10, jArr9);
                zzhht.zzf(jArr10, jArr9);
                for (int i6 = 1; i6 < 10; i6++) {
                    zzhht.zzf(jArr10, jArr10);
                }
                zzhht.zze(jArr10, jArr10, jArr9);
                zzhht.zzf(jArr11, jArr10);
                for (int i7 = 1; i7 < 20; i7++) {
                    zzhht.zzf(jArr11, jArr11);
                }
                zzhht.zze(jArr10, jArr11, jArr10);
                zzhht.zzf(jArr10, jArr10);
                for (int i8 = 1; i8 < 10; i8++) {
                    zzhht.zzf(jArr10, jArr10);
                }
                zzhht.zze(jArr9, jArr10, jArr9);
                zzhht.zzf(jArr10, jArr9);
                for (int i9 = 1; i9 < 50; i9++) {
                    zzhht.zzf(jArr10, jArr10);
                }
                zzhht.zze(jArr10, jArr10, jArr9);
                zzhht.zzf(jArr11, jArr10);
                for (int i10 = 1; i10 < 100; i10++) {
                    zzhht.zzf(jArr11, jArr11);
                }
                zzhht.zze(jArr10, jArr11, jArr10);
                zzhht.zzf(jArr10, jArr10);
                for (int i11 = 1; i11 < 50; i11++) {
                    zzhht.zzf(jArr10, jArr10);
                }
                zzhht.zze(jArr9, jArr10, jArr9);
                zzhht.zzf(jArr9, jArr9);
                zzhht.zzf(jArr9, jArr9);
                zzhht.zze(jArr, jArr9, jArr);
                zzhht.zze(jArr, jArr, jArr8);
                zzhht.zze(jArr, jArr, jArr4);
                zzhht.zzf(jArr6, jArr);
                zzhht.zze(jArr6, jArr6, jArr5);
                zzhht.zzb(jArr7, jArr6, jArr4);
                if (zze(jArr7)) {
                    zzhht.zza(jArr7, jArr6, jArr4);
                    if (zze(jArr7)) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                    }
                    zzhht.zze(jArr, jArr, zzhho.zzc);
                }
                if (zze(jArr)) {
                    b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                } else {
                    byte b3 = bArr3[31];
                    b2 = AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                }
                if (zzf(jArr) == ((bArr3[31] & b2) >> 7)) {
                    zzm(jArr, jArr);
                }
                zzhht.zze(jArr3, jArr, jArrZzg);
                zzhhl zzhhlVar = new zzhhl(new zzhhk(jArr, jArrZzg, jArr2), jArr3);
                zzhhi[] zzhhiVarArr = new zzhhi[8];
                zzhhiVarArr[0] = new zzhhi(zzhhlVar);
                zzhhj zzhhjVar = new zzhhj(new zzhhk(), new long[10]);
                zzi(zzhhjVar, zzhhlVar.zza);
                zzhhl zzhhlVar2 = new zzhhl(zzhhjVar);
                for (int i12 = 1; i12 < 8; i12++) {
                    zzg(zzhhjVar, zzhhlVar2, zzhhiVarArr[i12 - 1]);
                    zzhhiVarArr[i12] = new zzhhi(new zzhhl(zzhhjVar));
                }
                byte[] bArrZzl = zzl(bArrDigest);
                byte[] bArrZzl2 = zzl(bArrCopyOfRange);
                zzhhj zzhhjVar2 = new zzhhj(zzc);
                zzhhl zzhhlVar3 = new zzhhl();
                int i13 = b2;
                while (i13 >= 0 && bArrZzl[i13] == 0 && bArrZzl2[i13] == 0) {
                    i13--;
                }
                while (i13 >= 0) {
                    zzi(zzhhjVar2, new zzhhk(zzhhjVar2));
                    byte b4 = bArrZzl[i13];
                    if (b4 > 0) {
                        zzhhl.zza(zzhhlVar3, zzhhjVar2);
                        zzg(zzhhjVar2, zzhhlVar3, zzhhiVarArr[bArrZzl[i13] / 2]);
                    } else if (b4 < 0) {
                        zzhhl.zza(zzhhlVar3, zzhhjVar2);
                        zzh(zzhhjVar2, zzhhlVar3, zzhhiVarArr[(-bArrZzl[i13]) / 2]);
                    }
                    byte b5 = bArrZzl2[i13];
                    if (b5 > 0) {
                        zzhhl.zza(zzhhlVar3, zzhhjVar2);
                        zzg(zzhhjVar2, zzhhlVar3, zzhho.zze[bArrZzl2[i13] / 2]);
                    } else if (b5 < 0) {
                        zzhhl.zza(zzhhlVar3, zzhhjVar2);
                        zzh(zzhhjVar2, zzhhlVar3, zzhho.zze[(-bArrZzl2[i13]) / 2]);
                    }
                    i13--;
                }
                byte[] bArrZzb = new zzhhk(zzhhjVar2).zzb();
                for (int i14 = 0; i14 < 32; i14++) {
                    if (bArrZzb[i14] != bArr2[i14]) {
                        return false;
                    }
                }
                return true;
            }
            i2--;
            bArr4 = bArr2;
        }
        return false;
    }

    public static void zzd() {
        if (zzhho.zza == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    public static /* synthetic */ boolean zze(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhht.zzd(jArr2);
        byte[] bArrZzh = zzhht.zzh(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrZzh[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ int zzf(long[] jArr) {
        return zzhht.zzh(jArr)[0] & 1;
    }

    private static void zzg(zzhhj zzhhjVar, zzhhl zzhhlVar, zzhhh zzhhhVar) {
        zzhhk zzhhkVar = zzhhlVar.zza;
        zzhhk zzhhkVar2 = zzhhjVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhhkVar2.zza;
        long[] jArr3 = zzhhkVar.zzb;
        long[] jArr4 = zzhhkVar.zza;
        zzhht.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhhkVar2.zzb;
        zzhht.zzb(jArr5, jArr3, jArr4);
        zzhht.zze(jArr5, jArr5, zzhhhVar.zzb);
        long[] jArr6 = zzhhhVar.zza;
        long[] jArr7 = zzhhkVar2.zzc;
        zzhht.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhhjVar.zzb;
        zzhht.zze(jArr8, zzhhlVar.zzb, zzhhhVar.zzc);
        zzhhhVar.zza(jArr2, zzhhkVar.zzc);
        zzhht.zza(jArr, jArr2, jArr2);
        zzhht.zzb(jArr2, jArr7, jArr5);
        zzhht.zza(jArr5, jArr7, jArr5);
        zzhht.zza(jArr7, jArr, jArr8);
        zzhht.zzb(jArr8, jArr, jArr8);
    }

    private static void zzh(zzhhj zzhhjVar, zzhhl zzhhlVar, zzhhh zzhhhVar) {
        zzhhk zzhhkVar = zzhhlVar.zza;
        zzhhk zzhhkVar2 = zzhhjVar.zza;
        long[] jArr = new long[10];
        long[] jArr2 = zzhhkVar2.zza;
        long[] jArr3 = zzhhkVar.zzb;
        long[] jArr4 = zzhhkVar.zza;
        zzhht.zza(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhhkVar2.zzb;
        zzhht.zzb(jArr5, jArr3, jArr4);
        zzhht.zze(jArr5, jArr5, zzhhhVar.zza);
        long[] jArr6 = zzhhhVar.zzb;
        long[] jArr7 = zzhhkVar2.zzc;
        zzhht.zze(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhhjVar.zzb;
        zzhht.zze(jArr8, zzhhlVar.zzb, zzhhhVar.zzc);
        zzhhhVar.zza(jArr2, zzhhkVar.zzc);
        zzhht.zza(jArr, jArr2, jArr2);
        zzhht.zzb(jArr2, jArr7, jArr5);
        zzhht.zza(jArr5, jArr7, jArr5);
        zzhht.zzb(jArr7, jArr, jArr8);
        zzhht.zza(jArr8, jArr, jArr8);
    }

    private static void zzi(zzhhj zzhhjVar, zzhhk zzhhkVar) {
        zzhhk zzhhkVar2 = zzhhjVar.zza;
        long[] jArr = zzhhkVar2.zza;
        long[] jArr2 = zzhhkVar.zza;
        long[] jArr3 = new long[10];
        zzhht.zzf(jArr, jArr2);
        long[] jArr4 = zzhhkVar2.zzc;
        long[] jArr5 = zzhhkVar.zzb;
        zzhht.zzf(jArr4, jArr5);
        long[] jArr6 = zzhhjVar.zzb;
        zzhht.zzf(jArr6, zzhhkVar.zzc);
        zzhht.zza(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhhkVar2.zzb;
        zzhht.zza(jArr7, jArr2, jArr5);
        zzhht.zzf(jArr3, jArr7);
        zzhht.zza(jArr7, jArr4, jArr);
        zzhht.zzb(jArr4, jArr4, jArr);
        zzhht.zzb(jArr, jArr3, jArr7);
        zzhht.zzb(jArr6, jArr6, jArr4);
    }

    private static int zzj(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return (i6 & (i6 + i6)) >> 7;
    }

    private static void zzk(zzhhh zzhhhVar, int i2, byte b2) {
        zzhhh[][] zzhhhVarArr = zzhho.zzd;
        zzhhh zzhhhVar2 = zzhhhVarArr[i2][0];
        int i3 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 7;
        int i4 = (-i3) & b2;
        int i5 = b2 - (i4 + i4);
        zzhhhVar.zzb(zzhhhVar2, zzj(i5, 1));
        zzhhhVar.zzb(zzhhhVarArr[i2][1], zzj(i5, 2));
        zzhhhVar.zzb(zzhhhVarArr[i2][2], zzj(i5, 3));
        zzhhhVar.zzb(zzhhhVarArr[i2][3], zzj(i5, 4));
        zzhhhVar.zzb(zzhhhVarArr[i2][4], zzj(i5, 5));
        zzhhhVar.zzb(zzhhhVarArr[i2][5], zzj(i5, 6));
        zzhhhVar.zzb(zzhhhVarArr[i2][6], zzj(i5, 7));
        zzhhhVar.zzb(zzhhhVarArr[i2][7], zzj(i5, 8));
        long[] jArr = zzhhhVar.zzc;
        long[] jArr2 = zzhhhVar.zza;
        long[] jArrCopyOf = Arrays.copyOf(zzhhhVar.zzb, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        zzm(jArrCopyOf3, jArrCopyOf3);
        zzhhhVar.zzb(new zzhhh(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i3);
    }

    private static byte[] zzl(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr2[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b2 = bArr2[i2];
                    if (b2 != 0) {
                        byte b3 = bArr2[i4];
                        int i6 = b2 << i5;
                        int i7 = b3 + i6;
                        if (i7 > 15) {
                            int i8 = b3 - i6;
                            if (i8 < -15) {
                                break;
                            }
                            bArr2[i4] = (byte) i8;
                            while (i2 < 256) {
                                if (bArr2[i2] == 0) {
                                    bArr2[i2] = 1;
                                    break;
                                }
                                bArr2[i2] = 0;
                                i2++;
                            }
                        } else {
                            bArr2[i4] = (byte) i7;
                            bArr2[i2] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    private static void zzm(long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            jArr[i2] = -jArr2[i2];
        }
    }

    private static long zzn(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16) | (bArr[i2] & 255) | (((long) (bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
    }

    private static long zzo(byte[] bArr, int i2) {
        return (((long) (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24) | zzn(bArr, i2);
    }
}
