package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.smartdigimkt.v0.p;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaen {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, p.e.f39014a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.p004ironsource.mediationsdk.metadata.a.f25965n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static zzv zzb(byte[] bArr, String str, String str2, int i2, String str3, zzq zzqVar) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(60);
        int i3 = zzb[zzeqVarZzi.zzj(6)];
        int i4 = zzc[zzeqVarZzi.zzj(4)];
        int iZzj = zzeqVarZzi.zzj(5);
        int i5 = iZzj >= 29 ? -1 : (zzd[iZzj] * 1000) / 2;
        zzeqVarZzi.zzh(10);
        int i6 = i3 + (zzeqVarZzi.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzl("video/mp2t");
        zztVar.zzm("audio/vnd.dts");
        zztVar.zzh(i5);
        zztVar.zzE(i6);
        zztVar.zzF(i4);
        zztVar.zzq(null);
        zztVar.zze(str2);
        zztVar.zzg(i2);
        return zztVar.zzM();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int zzc(byte[] bArr) {
        int i2;
        int i3;
        byte b2;
        int i4;
        int i5;
        int i6;
        byte b3;
        boolean z2 = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i5 = (bArr[7] & 3) << 12;
                i6 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = (bArr[5] & 3) << 12;
                i3 = (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b2 = bArr[7];
            } else {
                i5 = (bArr[6] & 3) << 12;
                i6 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
                b3 = bArr[8];
            }
            i4 = (((b3 & 60) >> 2) | i5 | i6) + 1;
            z2 = true;
            if (z2) {
                return (i4 * 16) / 14;
            }
            return i4;
        }
        i2 = (bArr[4] & 3) << 12;
        i3 = (bArr[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4;
        b2 = bArr[6];
        i4 = (((b2 & 240) >> 4) | i2 | i3) + 1;
        if (z2) {
            return (i4 * 16) / 14;
        }
        return i4;
    }

    public static zzaem zzd(byte[] bArr) throws zzat {
        int iZzj;
        int i2;
        long jZzt;
        int i3;
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(40);
        int iZzj2 = zzeqVarZzi.zzj(2);
        boolean zZzi = zzeqVarZzi.zzi();
        int i4 = true != zZzi ? 16 : 20;
        zzeqVarZzi.zzh(true != zZzi ? 8 : 12);
        int iZzj3 = zzeqVarZzi.zzj(i4) + 1;
        boolean zZzi2 = zzeqVarZzi.zzi();
        int iZzj4 = -1;
        int i5 = 0;
        if (zZzi2) {
            iZzj = zzeqVarZzi.zzj(2);
            int iZzj5 = zzeqVarZzi.zzj(3) + 1;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            int iZzj6 = zzeqVarZzi.zzj(3) + 1;
            int iZzj7 = zzeqVarZzi.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i6 = iZzj2 + 1;
            int iZzj8 = zzeqVarZzi.zzj(i6);
            for (int i7 = 0; i7 < i6; i7++) {
                if (((iZzj8 >> i7) & 1) == 1) {
                    zzeqVarZzi.zzh(8);
                }
            }
            int i8 = iZzj5 * 512;
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(2);
                int iZzj9 = (zzeqVarZzi.zzj(2) + 1) << 2;
                int iZzj10 = zzeqVarZzi.zzj(2) + 1;
                while (i5 < iZzj10) {
                    zzeqVarZzi.zzh(iZzj9);
                    i5++;
                }
            }
            i5 = i8;
        } else {
            iZzj = -1;
        }
        zzeqVarZzi.zzh(i4);
        zzeqVarZzi.zzh(12);
        if (zZzi2) {
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(4);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(24);
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzo(zzeqVarZzi.zzj(10) + 1);
            }
            zzeqVarZzi.zzh(5);
            i2 = zze[zzeqVarZzi.zzj(4)];
            iZzj4 = zzeqVarZzi.zzj(8) + 1;
        } else {
            i2 = -2147483647;
        }
        int i9 = i2;
        if (zZzi2) {
            if (iZzj == 0) {
                i3 = 32000;
            } else if (iZzj == 1) {
                i3 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb.append("Unsupported reference clock code in DTS HD header: ");
                    sb.append(iZzj);
                    throw zzat.zzb(sb.toString(), null);
                }
                i3 = 48000;
            }
            jZzt = zzfj.zzt(i5, 1000000L, i3, RoundingMode.DOWN);
        } else {
            jZzt = -9223372036854775807L;
        }
        return new zzaem("audio/vnd.dts.hd;profile=lbr", iZzj4, i9, iZzj3, jZzt, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(42);
        return zzeqVarZzi.zzj(true != zzeqVarZzi.zzi() ? 8 : 12) + 1;
    }

    public static zzaem zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzt;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i2;
        int i3;
        zzeq zzeqVarZzi = zzi(bArr);
        int iZzj2 = zzeqVarZzi.zzj(32);
        int iZzh = zzh(zzeqVarZzi, zzf, true);
        int i4 = iZzh + 1;
        char c2 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c2 == 0) {
            jZzt = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzeqVarZzi.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i5 = iZzh - 1;
            if (((bArr[iZzh] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((char) (bArr[i5] << 8))) != zzfj.zzH(bArr, 0, i5, 65535)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzeqVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i2 = 512;
            } else if (iZzj3 == 1) {
                i2 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb.append("Unsupported base duration index in DTS UHD header: ");
                    sb.append(iZzj3);
                    throw zzat.zzb(sb.toString(), null);
                }
                i2 = 384;
            }
            int iZzj4 = zzeqVarZzi.zzj(3) + 1;
            int iZzj5 = zzeqVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i3 = 32000;
            } else if (iZzj5 == 1) {
                i3 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb2.append("Unsupported clock rate index in DTS UHD header: ");
                    sb2.append(iZzj5);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i3 = 48000;
            }
            if (zzeqVarZzi.zzi()) {
                zzeqVarZzi.zzh(36);
            }
            iZzj = (1 << zzeqVarZzi.zzj(2)) * i3;
            jZzt = zzfj.zzt(i2 * iZzj4, 1000000L, i3, RoundingMode.DOWN);
        }
        int i6 = iZzj;
        long j = jZzt;
        int iZzh2 = 0;
        for (char c3 = 0; c3 < c2; c3 = 1) {
            iZzh2 += zzh(zzeqVarZzi, zzg, true);
        }
        for (int i7 = 0; i7 <= 0; i7++) {
            if (c2 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzeqVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzeqVarZzi, zzi, true) : 0;
        }
        return new zzaem("audio/vnd.dts.uhd;profile=p2", 2, i6, i4 + iZzh2, j, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzeq zzeqVarZzi = zzi(bArr);
        zzeqVarZzi.zzh(32);
        return zzh(zzeqVarZzi, zzj, true) + 1;
    }

    private static int zzh(zzeq zzeqVar, int[] iArr, boolean z2) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzeqVar.zzi(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzeqVar.zzj(iArr[i2]) + i4;
    }

    private static zzeq zzi(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzeq(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        int length = bArrCopyOf.length;
        zzeq zzeqVar = new zzeq(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzeq zzeqVar2 = new zzeq(bArrCopyOf, length);
            while (zzeqVar2.zzc() >= 16) {
                zzeqVar2.zzh(2);
                zzeqVar.zzp(zzeqVar2.zzj(14), 14);
            }
        }
        zzeqVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzeqVar;
    }
}
