package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafl {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zza(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i5 - 1;
        int i9 = zzb[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? zzc[i8] : zzd[i8]) * 12) / i9) + i10) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? zze[i8] : zzf[i8];
        } else {
            i7 = zzg[i8];
        }
        if (i3 == 3) {
            return android.support.v4.media.a.B(i7, 144, i9, i10);
        }
        return android.support.v4.media.a.B(i4 == 1 ? 72 : 144, i7, i9, i10);
    }

    public static int zzb(int i2) {
        int i3;
        int i4;
        if (!zzl(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = i2 >>> 12;
        int i6 = (i2 >>> 10) & 3;
        int i7 = i5 & 15;
        if (i7 == 0 || i7 == 15 || i6 == 3) {
            return -1;
        }
        return zzm(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i2, int i3) {
        if (i3 != 1) {
            return i3 != 2 ? 384 : 1152;
        }
        return i2 == 3 ? 1152 : 576;
    }
}
