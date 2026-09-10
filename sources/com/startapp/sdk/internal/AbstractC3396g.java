package com.startapp.sdk.internal;

import android.net.Uri;
import android.util.Base64;
import com.startapp.sdk.common.utils.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: renamed from: com.startapp.sdk.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3396g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f40987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40989c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f40990e;
    public static final String f;
    public static final byte[] g;

    static {
        int i2 = q0.f41381a;
        "startapp.".concat(com.smartdigimkt.y4.g.f40227p);
        f40987a = new byte[]{10, 30, 84, 95, 101, 20, 0, 14, 15, 80, 36, 84, 64, 82, 84, 64, 80, 80, 65, 78, 84, 73, 70, 82, 65, 85, 68, 75, 69, 89, 1, 2, 3, 8, 15, 42, 10, 51, 44, 32};
        f40988b = "ts";
        f40989c = "tsh";
        d = "afh";
        f40990e = "MD5";
        f = "UTF-8";
        g = new byte[]{12, 31, 86, 96, 103, 10, 28, 15, 17, 28, 36, 84, 64, 82, 84, 64, 80, 80, 69, 78, 67, 82, 89, 80, 84, 73, 79, 78, 75, 69, 89, 4, 32, 18, 16, 18, 11, 53, 45, 34};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Pair pair) {
        return com.ironsource.d9.i.f24749c + f40988b + com.ironsource.d9.i.f24747b + ((String) pair.first) + com.ironsource.d9.i.f24749c + d + com.ironsource.d9.i.f24747b + ((String) pair.second);
    }

    public static String b(String str) {
        return Base64.encodeToString(a(str.getBytes()), 2);
    }

    public static Pair c(String str) {
        String strDecode = "";
        if (str != null) {
            try {
                strDecode = URLDecoder.decode(str, f);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        String strA = a();
        return new Pair(strA, a(strDecode + strA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String a(String str, String str2) {
        Pair pairC = c(str2);
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter(f40988b, (String) pairC.first).appendQueryParameter(d, (String) pairC.second).build().toString();
        } catch (Throwable unused) {
            StringBuilder sbW = android.support.v4.media.a.w(str);
            sbW.append(a(pairC));
            return sbW.toString();
        }
    }

    public static String a() {
        int iHashCode = Arrays.hashCode(f40987a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iHashCode > 0) {
            int i2 = (int) ((((jCurrentTimeMillis * 25214903917L) + 11) & 281474976710655L) >>> 17);
            if ((((-iHashCode) & iHashCode) == iHashCode ? (int) ((((long) iHashCode) * ((long) i2)) >> 31) : i2 % iHashCode) == 0) {
                System.out.println();
            }
        }
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = f40987a;
        int length = bytes.length < bArr.length ? bytes.length : bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = bytes[i2];
            byte b3 = bArr[i2];
        }
        byte[] bytes2 = str.getBytes();
        byte b4 = f40987a[5];
        byte[] bArr2 = new byte[Math.min(bytes2.length, (int) b4)];
        for (int i3 = 0; i3 < bytes2.length; i3++) {
            int i4 = i3 % b4;
            bArr2[i4] = (byte) (bArr2[i4] ^ bytes2[i3]);
        }
        byte[] bArr3 = f40987a;
        try {
            return URLEncoder.encode(Base64.encodeToString(MessageDigest.getInstance(f40990e).digest(a(bArr2, new String(bArr3).substring(bArr3[0], bArr3[1]).getBytes())), 3), f);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = g;
        int iHashCode = bArr2.hashCode();
        long jHashCode = bArr.hashCode();
        if (iHashCode > jHashCode) {
            int i2 = (int) ((((jHashCode * 29509871405L) + 11) & 16777215) >>> 17);
            if (iHashCode >= 1000) {
                int i3 = i2 % iHashCode;
            }
        }
        return a(a(bArr, new String(bArr2).substring(bArr2[5], bArr2[33]).getBytes()), new String(bArr2).substring(bArr2[35], bArr2[1]).getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 % bArr2.length]);
        }
        return bArr3;
    }
}
