package com.thinkup.core.common.ooo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class nm {
    private static char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String o = "MD5";

    public static String m(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & 240) >>> 4));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString().toUpperCase(Locale.US);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String n(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (int i2 = 0; i2 < bArrDigest.length; i2++) {
                sb.append(m[(bArrDigest[i2] & 240) >>> 4]);
                sb.append(m[bArrDigest[i2] & 15]);
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String o(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & 240) >>> 4));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static String n(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(m[(bArr[i2] & 240) >>> 4]);
            sb.append(m[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    private static String m(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & 240) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    private static String o(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 & 240) >>> 4));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString().toLowerCase(Locale.US);
    }
}
