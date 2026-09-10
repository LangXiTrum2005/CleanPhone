package com.google.android.exoplayer2.audio;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class OpusUtil {
    public static ArrayList a(byte[] bArr) {
        long j = (((long) (((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long b(byte b2, byte b3) {
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
}
