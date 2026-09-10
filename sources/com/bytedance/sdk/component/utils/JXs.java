package com.bytedance.sdk.component.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    private static final char[] Lxb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String Lxb(byte[] bArr) {
        if (bArr != null) {
            return Lxb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String Lxb(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i + i2 <= bArr.length) {
                int i3 = i2 * 2;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    byte b = bArr[i5 + i];
                    int i6 = i4 + 1;
                    char[] cArr2 = Lxb;
                    cArr[i4] = cArr2[(b & 255) >> 4];
                    i4 += 2;
                    cArr[i6] = cArr2[b & cw.m];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static String Lxb(File file) {
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
                String strLxb = Lxb(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return strLxb;
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

    public static String Lxb(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes(C.UTF8_NAME));
                    return Lxb(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
