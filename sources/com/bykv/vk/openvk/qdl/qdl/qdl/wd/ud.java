package com.bykv.vk.openvk.qdl.qdl.qdl.wd;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private static final MessageDigest qdl = qdl();
    private static final char[] ud = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private ud() {
    }

    private static MessageDigest qdl() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String qdl(String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest = qdl;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (ud.class) {
            bArrDigest = messageDigest.digest(bytes);
        }
        return qdl(bArrDigest);
    }

    public static String qdl(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = ud;
            cArr[i2] = cArr2[(b2 & 240) >> 4];
            i2 += 2;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }
}
