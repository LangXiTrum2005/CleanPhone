package com.smartdigimkt.v0;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class s implements com.smartdigimkt.w1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39027a = "MD5";

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String b(String str) {
        try {
            byte[] bArrC = c(str);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArrC);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i2 = 0;
            for (byte b2 : bArrDigest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b2 >>> 4) & 15];
                i2 += 2;
                cArr2[i3] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static byte[] c(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes(CharEncoding.UTF_16LE);
        a(bytes);
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (int i3 = 0; i3 < bytes.length; i3 += 2) {
            byte b2 = bytes[i3];
            if (b2 != -1 && b2 != -2) {
                bArr[i2] = b2;
                i2++;
                if (i2 == length) {
                    break;
                }
            }
        }
        a(bArr);
        return bArr;
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & 240) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & 240) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toLowerCase(Locale.US);
    }
}
