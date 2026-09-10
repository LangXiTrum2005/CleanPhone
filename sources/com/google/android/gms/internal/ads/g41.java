package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f14754a = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Cipher f14755b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f14756c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f14757d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrF = ps1.F(str, false);
            int length2 = bArrF.length;
            if (length2 <= 16) {
                throw new f41();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrF);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f14756c) {
                b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = b().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
            throw new f41(e10);
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f14757d) {
            try {
                if (f14755b == null) {
                    f14755b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f14755b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cipher;
    }
}
