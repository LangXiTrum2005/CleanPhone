package com.adcolony.sdk;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
class d1 {
    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i2 = (b2 >>> 4) & 15;
            int i3 = 0;
            while (true) {
                sb.append((char) ((i2 < 0 || i2 > 9) ? i2 + 87 : i2 + 48));
                i2 = b2 & 15;
                int i4 = i3 + 1;
                if (i3 >= 1) {
                    break;
                }
                i3 = i4;
            }
        }
        return sb.toString();
    }

    public static String a(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        messageDigest.update(str.getBytes("iso-8859-1"), 0, str.length());
        return a(messageDigest.digest());
    }
}
