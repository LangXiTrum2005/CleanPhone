package com.bykv.vk.openvk.preload.geckox.utils;

import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f13019a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i2 = inputStream.read(bArr, 0, 4096);
                        if (i2 == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i2);
                        }
                        CloseableUtils.close(inputStream);
                        throw th;
                    }
                    CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new RuntimeException(android.support.v4.media.a.o("md5 check failed file: local md5:", strA, " expect md5:", str));
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException(Z.m(e2, new StringBuilder("md5 check failed:")), e2);
                    }
                } catch (Throwable th) {
                    CloseableUtils.close(inputStream);
                    throw th;
                }
            } catch (Exception e3) {
                throw new RuntimeException("md5 check failed:" + e3.getMessage(), e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException(Z.m(e4, new StringBuilder("md5 check failed:")), e4);
        }
    }

    private static String a(byte[] bArr, int i2) {
        if (bArr != null) {
            if (i2 <= bArr.length) {
                int i3 = i2 << 1;
                char[] cArr = new char[i3];
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    byte b2 = bArr[i5];
                    int i6 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i7 = i4 + 1;
                    char[] cArr2 = f13019a;
                    cArr[i4] = cArr2[i6 >> 4];
                    i4 += 2;
                    cArr[i7] = cArr2[b2 & 15];
                }
                return new String(cArr, 0, i3);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
