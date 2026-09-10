package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxc {
    private final byte[] zza;

    private zzhxc(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static zzhxc zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzhxc zzb(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i3 > length) {
            i3 = length;
        }
        return new zzhxc(bArr, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhxc) {
            return Arrays.equals(((zzhxc) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb.append("0123456789abcdef".charAt((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4));
            sb.append("0123456789abcdef".charAt(b2 & 15));
        }
        String string = sb.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
