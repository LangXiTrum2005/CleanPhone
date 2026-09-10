package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhkl {
    public static final /* synthetic */ int zza = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzhxc zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new zzhkk(sb.toString());
            }
            bArr[i2] = (byte) cCharAt;
        }
        return zzhxc.zza(bArr);
    }

    public static final zzhxc zzb(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '!' || cCharAt > '~') {
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 33);
                sb.append("Not a printable ASCII character: ");
                sb.append(cCharAt);
                throw new GeneralSecurityException(sb.toString());
            }
            bArr[i2] = (byte) cCharAt;
        }
        return zzhxc.zza(bArr);
    }

    public static boolean zzc() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    @Nullable
    public static Integer zzd() {
        if (zzc()) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }

    public static boolean zze(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }
}
