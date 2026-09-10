package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.B5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f9946a = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f9947b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NONE(-1),
        DEFAULT(0),
        V2(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9952a;

        a(int i10) {
            this.f9952a = i10;
        }

        public int b() {
            return this.f9952a;
        }

        public static a a(int i10) {
            if (i10 == 0) {
                return DEFAULT;
            }
            return i10 == 1 ? V2 : DEFAULT;
        }
    }

    static {
        byte[] bArr = new byte[32];
        f9947b = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public static byte[] a(String str, long j10, a aVar, com.applovin.impl.sdk.l lVar) {
        String strK0 = lVar.k0();
        if (strK0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (strK0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        if (a.NONE == aVar) {
            return str.getBytes();
        }
        return a.V2 == aVar ? a(str, j10, false, strK0, lVar) : a(str, j10, strK0, lVar);
    }

    public static String b(String str, long j10, a aVar, com.applovin.impl.sdk.l lVar) {
        String strK0 = lVar.k0();
        if (strK0 == null) {
            throw new IllegalArgumentException("No SDK key specified");
        }
        if (strK0.length() < 86) {
            throw new IllegalArgumentException("SDK key is too short");
        }
        if (TextUtils.isEmpty(str) || a.NONE == aVar) {
            return str;
        }
        byte[] bArrA = a.V2 == aVar ? a(str, j10, true, strK0, lVar) : a(str, j10, strK0, lVar);
        if (bArrA != null) {
            return new String(bArrA);
        }
        return null;
    }

    private static String c(byte[] bArr) {
        return a(Base64.encode(bArr, 2));
    }

    private static byte[] a(String str, long j10, String str2, com.applovin.impl.sdk.l lVar) {
        char c4 = ' ';
        try {
            String strSubstring = str2.substring(32);
            byte b10 = 0;
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bArrA = a(strSubstring2, f9946a, lVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j10 & 255)) ^ bArrA[0]);
            char c5 = '\b';
            byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ bArrA[1]);
            char c10 = 16;
            byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ bArrA[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                char c11 = c5;
                char c12 = c10;
                long j11 = j10 + ((long) i10);
                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                long j14 = j13 ^ (j13 >> c4);
                char c13 = c4;
                byteArrayOutputStream.write((byte) (((long) ((i10 >= bytes.length ? b10 : bytes[i10]) ^ bArrA[i10 % bArrA.length])) ^ (j14 & 255)));
                int i11 = i10 + 1;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i11 % bArrA.length] ^ (i11 >= bytes.length ? (byte) 0 : bytes[i11]))) ^ ((j14 >> c11) & 255)));
                int i12 = i10 + 2;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i12 % bArrA.length] ^ (i12 >= bytes.length ? (byte) 0 : bytes[i12]))) ^ ((j14 >> c12) & 255)));
                int i13 = i10 + 3;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i13 % bArrA.length] ^ (i13 >= bytes.length ? (byte) 0 : bytes[i13]))) ^ ((j14 >> 24) & 255)));
                int i14 = i10 + 4;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i14 % bArrA.length] ^ (i14 >= bytes.length ? (byte) 0 : bytes[i14]))) ^ ((j14 >> c13) & 255)));
                int i15 = i10 + 5;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i15 % bArrA.length] ^ (i15 >= bytes.length ? (byte) 0 : bytes[i15]))) ^ ((j14 >> 40) & 255)));
                int i16 = i10 + 6;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i16 % bArrA.length] ^ (i16 >= bytes.length ? (byte) 0 : bytes[i16]))) ^ ((j14 >> 48) & 255)));
                int i17 = i10 + 7;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i17 % bArrA.length] ^ (i17 >= bytes.length ? (byte) 0 : bytes[i17]))) ^ ((j14 >> 56) & 255)));
                i10 += 8;
                c5 = c11;
                c10 = c12;
                c4 = c13;
                b10 = 0;
            }
            String strC = c(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f9946a, lVar) + ":" + strSubstring + ":" + strC).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            a(str, "encode", e10, lVar);
            return null;
        }
    }

    public static String b(byte[] bArr, com.applovin.impl.sdk.l lVar) {
        String strK0 = lVar.k0();
        if (strK0 != null) {
            if (strK0.length() < 86) {
                throw new IllegalArgumentException("SDK key is too short");
            }
            if (bArr == null) {
                return null;
            }
            if (bArr.length == 0) {
                return "";
            }
            a aVarB = b(bArr);
            if (a.NONE == aVarB) {
                return new String(bArr);
            }
            if (aVarB == a.V2) {
                return a(bArr, strK0, lVar);
            }
            return a(new String(bArr), strK0, lVar);
        }
        throw new IllegalArgumentException("No SDK key specified");
    }

    public static a b(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char c4 = (char) bArr[0];
            if (c4 == '2') {
                return a.V2;
            }
            if (c4 == '{') {
                return a.NONE;
            }
            return a.DEFAULT;
        }
        return a.NONE;
    }

    private static int b(byte[] bArr, String str, com.applovin.impl.sdk.l lVar) {
        int iA;
        int i10;
        if (bArr == null || bArr.length == 0 || TextUtils.isEmpty(str) || (iA = a(bArr, (byte) 58)) < 0) {
            return 0;
        }
        byte[] bytes = a(f9947b, lVar).getBytes();
        int i11 = iA + 1;
        int length = bytes.length + i11;
        if (bArr.length <= length || bArr[length] != 58 || bArr.length <= (i10 = length + 55) || bArr[i10] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
            return 0;
        }
        int i12 = length + 56;
        if (length + 64 > bArr.length) {
            return 0;
        }
        return i12;
    }

    private static byte[] b(String str) {
        return Base64.decode(a(str), 0);
    }

    private static byte[] a(String str, long j10, boolean z10, String str2, com.applovin.impl.sdk.l lVar) {
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f9947b;
            byte[] bArrA = a(strSubstring2, bArr, lVar);
            long jC = q7.c(bArrA) ^ j10;
            byte[] bytes2 = ("2:" + a(bArr, lVar) + ":" + strSubstring + ":").getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jC);
            byteBufferAllocate2.flip();
            byte[] bArrA2 = a(q7.a(bytes), j10, bArrA);
            if (z10) {
                byte[] bytes3 = c(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = c(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e10) {
            a(str, "encode2", e10, lVar);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            a(str, "encode2", e11, lVar);
            return null;
        }
    }

    private static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 % 8;
            if (i11 == 0) {
                long j12 = ((long) i10) + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
                long j14 = (j13 ^ (j13 >>> 29)) * (-8796714831421723037L);
                j11 = j14 ^ (j14 >>> 32);
            }
            bArrCopyOf[i10] = (byte) (((long) bArrCopyOf[i10]) ^ (((j11 >> (i11 * 8)) & 255) ^ ((long) bArr2[i10 % bArr2.length])));
        }
        return bArrCopyOf;
    }

    private static String a(String str, String str2, com.applovin.impl.sdk.l lVar) {
        String[] strArrSplit = str.split(":");
        try {
            try {
                try {
                    if ("1".equals(strArrSplit[0])) {
                        if (strArrSplit.length != 4) {
                            a(str, "v1", "Invalid response format", lVar);
                            return null;
                        }
                        String str3 = strArrSplit[1];
                        char c4 = 2;
                        String str4 = strArrSplit[2];
                        char c5 = 3;
                        byte[] bArrB = b(strArrSplit[3]);
                        if (!str2.endsWith(str4)) {
                            a(str, "v1", "Invalid SDK key", lVar);
                            return null;
                        }
                        byte[] bArr = f9946a;
                        if (a(bArr, lVar).equals(str3)) {
                            byte[] bArrA = a(str2.substring(0, 32), bArr, lVar);
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                            char c10 = 0;
                            char c11 = '(';
                            char c12 = 7;
                            long j10 = (((long) ((byteArrayInputStream.read() ^ bArrA[1]) & 255)) << 8) | ((long) ((byteArrayInputStream.read() ^ bArrA[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrA[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrA[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrA[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA[7]) & 255)) << 56);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr2 = new byte[8];
                            int i10 = byteArrayInputStream.read(bArr2);
                            int i11 = 0;
                            while (i10 >= 0) {
                                char c13 = c4;
                                char c14 = c10;
                                long j11 = ((long) i11) + j10;
                                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                                long j14 = j13 ^ (j13 >> 32);
                                char c15 = c12;
                                char c16 = c5;
                                char c17 = c11;
                                byteArrayOutputStream.write((byte) (((long) (bArr2[c14] ^ bArrA[i11 % bArrA.length])) ^ (j14 & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[1] ^ bArrA[(i11 + 1) % bArrA.length])) ^ ((j14 >> 8) & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[c13] ^ bArrA[(i11 + 2) % bArrA.length])) ^ ((j14 >> 16) & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[c16] ^ bArrA[(i11 + 3) % bArrA.length])) ^ ((j14 >> 24) & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[4] ^ bArrA[(i11 + 4) % bArrA.length])) ^ ((j14 >> 32) & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[5] ^ bArrA[(i11 + 5) % bArrA.length])) ^ ((j14 >> c17) & 255)));
                                byteArrayOutputStream.write((byte) (((long) (bArr2[6] ^ bArrA[(i11 + 6) % bArrA.length])) ^ ((j14 >> 48) & 255)));
                                byteArrayOutputStream.write((byte) (((j14 >> 56) & 255) ^ ((long) (bArr2[c15] ^ bArrA[(i11 + 7) % bArrA.length]))));
                                i11 += 8;
                                c4 = c13;
                                c10 = c14;
                                c5 = c16;
                                c11 = c17;
                                i10 = byteArrayInputStream.read(bArr2);
                                c12 = c15;
                            }
                            return new String(byteArrayOutputStream.toByteArray(), "UTF-8").trim();
                        }
                        a(str, "v1", "Invalid salt signature", lVar);
                        return null;
                    }
                    a(str, "v1", "Invalid encoding version", lVar);
                    return null;
                } catch (IOException e10) {
                    e = e10;
                    com.applovin.impl.sdk.p.b("AppLovinSdk", "Failed to read bytes", e);
                    a(str, "decode", e, lVar);
                    return null;
                }
            } catch (UnsupportedEncodingException e11) {
                a(str, "decode", e11, lVar);
                throw new RuntimeException("UTF-8 encoding not found", e11);
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    private static String a(byte[] bArr, String str, com.applovin.impl.sdk.l lVar) {
        try {
            int iB = b(bArr, str, lVar);
            if (iB == 0) {
                a(new String(bArr), "v2", "Invalid payload format", lVar);
                return null;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iB, bArr.length);
            if (bArrCopyOfRange.length < 16) {
                a(new String(bArr), "v2", "Payload too small", lVar);
                return null;
            }
            long jA = q7.a(bArrCopyOfRange, 8);
            byte[] bArrA = a(str.substring(0, 32), f9947b, lVar);
            return new String(q7.d(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), jA ^ q7.c(bArrA), bArrA)), "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            a(new String(bArr), "decode2", e10, lVar);
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            com.applovin.impl.sdk.p.b("AppLovinSdk", "Failed to ungzip decode", e11);
            a(new String(bArr), "decode2", e11, lVar);
            return null;
        }
    }

    private static int a(byte[] bArr, byte b10) {
        if (bArr != null && bArr.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == b10) {
                    return i10;
                }
            }
        }
        return -1;
    }

    private static void a(String str, String str2, String str3, com.applovin.impl.sdk.l lVar) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str3);
        if (((Boolean) lVar.a(z4.O5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, mapHashMap);
        }
        lVar.E().a(f2.f7863k1, str2, mapHashMap);
    }

    private static void a(String str, String str2, Throwable th2, com.applovin.impl.sdk.l lVar) {
        HashMap map = new HashMap(1);
        if (((Boolean) lVar.a(z4.O5)).booleanValue()) {
            CollectionUtils.putStringIfValid("details", str, map);
        }
        lVar.E().a("AppLovinSdk", str2, th2, map);
    }

    private static byte[] a(String str, byte[] bArr, com.applovin.impl.sdk.l lVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            lVar.E().a("AppLovinSdk", "SHA256", e10);
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    private static String a(byte[] bArr, com.applovin.impl.sdk.l lVar) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            lVar.E().a("AppLovinSdk", "SHA1", e10);
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    private static String a(String str) {
        return str.replace('-', '+').replace('_', '/').replace('*', B5.U);
    }

    private static String a(byte[] bArr) {
        return new String(bArr, "UTF-8").replace('+', '-').replace('/', '_').replace(B5.U, '*');
    }
}
