package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafn {
    public static List zza(byte[] bArr) {
        long jZze = zze(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzh(zzi(jZze)));
        arrayList.add(zzh(zzi(3840L)));
        return arrayList;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int i2;
        if ((byteBuffer.get(5) & 2) == 0) {
            i2 = 0;
        } else {
            byte b2 = byteBuffer.get(26);
            int i3 = 28;
            int i4 = 28;
            for (int i5 = 0; i5 < b2; i5++) {
                i4 += byteBuffer.get(i5 + 27);
            }
            byte b3 = byteBuffer.get(i4 + 26);
            for (int i6 = 0; i6 < b3; i6++) {
                i3 += byteBuffer.get(i4 + 27 + i6);
            }
            i2 = i4 + i3;
        }
        int i7 = byteBuffer.get(i2 + 26) + 27 + i2;
        return (int) ((zzg(byteBuffer.get(i7), byteBuffer.limit() - i7 > 1 ? byteBuffer.get(i7 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int zze(byte[] bArr) {
        return (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static boolean zzf(long j, long j2) {
        return j - j2 <= zzi(3840L) / 1000;
    }

    private static long zzg(byte b2, byte b3) {
        int i2;
        int i3;
        int i4 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            i3 = 10000 << (i6 & 1);
        } else {
            i3 = i7 == 3 ? 60000 : 10000 << i7;
        }
        return ((long) i2) * ((long) i3);
    }

    private static byte[] zzh(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long zzi(long j) {
        return (j * 1000000000) / 48000;
    }
}
