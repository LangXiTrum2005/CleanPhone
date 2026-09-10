package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibe {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName(CharEncoding.ISO_8859_1);
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = ByteBuffer.wrap(bArr);
        zzhzq.zzG(bArr, 0, 0, false);
    }

    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zzb(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int zzc(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }
}
