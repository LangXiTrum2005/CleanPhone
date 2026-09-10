package com.bytedance.sdk.component.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class fi {
    private static final char[] ri = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String ri(byte[] bArr) {
        if (bArr != null) {
            return ri(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String ri(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    byte b = bArr[i5 + i];
                    int i6 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i7 = i4 + 1;
                    char[] cArr2 = ri;
                    cArr[i4] = cArr2[i6 >> 4];
                    i4 += 2;
                    cArr[i7] = cArr2[b & 15];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static String ri(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                }
                String strRi = ri(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strRi;
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
        }
        return null;
    }

    public static String ri(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes(C.UTF8_NAME));
                    return ri(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
