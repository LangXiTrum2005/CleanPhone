package ads_mobile_sdk;

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
import saneness.fatness;

/* JADX INFO: loaded from: classes.dex */
public final class et2 {
    public static final Charset a = StandardCharsets.UTF_8;
    public static Cipher b = null;
    public static final Object c = new Object();
    public static final Object d = new Object();

    public static byte[] a(String str, byte[] bArr) throws dt2 {
        byte[] bArrDoFinal;
        if (bArr.length != 16) {
            throw new dt2();
        }
        try {
            byte[] bArrSaneness = fatness.saneness(str, false);
            if (bArrSaneness.length <= 16) {
                throw new dt2();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrSaneness.length);
            byteBufferAllocate.put(bArrSaneness);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[bArrSaneness.length - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = a().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new dt2(e);
        }
    }

    public static String b(String str, byte[] bArr) {
        return new String(a(str, bArr), a);
    }

    public static Cipher a() {
        Cipher cipher;
        synchronized (d) {
            try {
                if (b == null) {
                    b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
