package com.bykv.vk.openvk.qdl.qdl.qdl.wd;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    public static String qdl(File file) {
        return qdl(file, null);
    }

    public static String qdl(File file, String str) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i2 = bufferedInputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            if (!TextUtils.isEmpty(str)) {
                messageDigest.update(str.getBytes());
            }
            bufferedInputStream.close();
            return qdl(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    private static String qdl(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArr.length * 2];
            int i2 = 0;
            for (byte b2 : bArr) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b2 >>> 4) & 15];
                i2 += 2;
                cArr2[i3] = cArr[b2 & 15];
            }
            return new String(cArr2);
        }
        return "";
    }
}
