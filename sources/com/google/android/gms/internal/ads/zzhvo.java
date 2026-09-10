package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvo {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i2) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhvn zzhvnVar = new zzhvn(2, new byte[(length * 3) / 4]);
        if (!zzhvnVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i3 = zzhvnVar.zzb;
        byte[] bArr = zzhvnVar.zza;
        if (i3 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }
}
