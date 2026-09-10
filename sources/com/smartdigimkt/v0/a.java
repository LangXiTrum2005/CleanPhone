package com.smartdigimkt.v0;

import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38960a = "HkzwDFeD4QuyLdx5igfZYcu9xTM9NN==";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f38961b = new byte[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f38962c = new byte[16];

    /* JADX INFO: renamed from: com.smartdigimkt.v0.a$a, reason: collision with other inner class name */
    public static class C0630a extends Provider {
        public C0630a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        a(com.smartdigimkt.r4.a.b(f38960a));
    }

    private static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(bArrDigest, 0, f38961b, 0, 32);
            System.arraycopy(bArrDigest, 32, f38962c, 0, 16);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String b(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0630a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        return b(str, f38961b, f38962c);
    }

    public static byte[] d(String str) {
        String upperCase = str.trim().replace(" ", "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            bArr[i2] = (byte) (Integer.decode("0x" + upperCase.substring(i3, i4) + upperCase.substring(i4, i3 + 2)).intValue() & 255);
        }
        return bArr;
    }

    public static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String b(String str) {
        return a(str, f38961b, f38962c);
    }

    public static String a(byte[] bArr) {
        String strM = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() == 1) {
                strM = android.support.v4.media.a.D(strM, "0", hexString);
            } else {
                strM = android.support.v4.media.a.m(strM, hexString);
            }
        }
        return strM;
    }
}
