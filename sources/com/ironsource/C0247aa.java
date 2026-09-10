package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: renamed from: com.ironsource.aa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0247aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f28207a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28208b = "RSA/ECB/PKCS1Padding";

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f28208b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception on key generation error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    private static RSAPublicKey a(String str) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f28208b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception on encryption error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(a(str.getBytes("UTF-8"), a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception on string encryption error: " + e10.getMessage());
            return "";
        }
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance(f28208b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception on decryption error: " + e10.getMessage());
            throw new RuntimeException(e10);
        }
    }
}
