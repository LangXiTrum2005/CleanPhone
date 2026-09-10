package com.blankj.utilcode.util;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: EncryptUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class competently {
    public static byte[] attabal(byte[] bArr) {
        return wireman(bArr, SameMD5.TAG);
    }

    public static String dern(byte[] bArr) {
        return rotuma.saneness(attabal(bArr));
    }

    public static String saneness(String str) {
        return (str == null || str.length() == 0) ? "" : dern(str.getBytes());
    }

    public static byte[] wireman(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
