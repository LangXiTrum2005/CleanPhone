package com.zg.adlib.util;

import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.codec.binary.Base64;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/zg/adlib/util/AESUtil;", "", "<init>", "()V", "KEY", "", "getKEY", "()Ljava/lang/String;", "setKEY", "(Ljava/lang/String;)V", "TAG", "gcm256algorithm", "AEGCMEncrypt", "content", "keyStr", "genSecKey", "Ljavax/crypto/spec/SecretKeySpec;", "password", "decrypt", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AESUtil {
    public static final AESUtil INSTANCE = new AESUtil();
    private static String KEY = "T4n#Iopp^StQKlp*";
    private static final String TAG = "AESUtil";
    private static final String gcm256algorithm = "AES/GCM/NoPadding";

    private AESUtil() {
    }

    public final String AEGCMEncrypt(String content, String keyStr) {
        Intrinsics.f(content, "content");
        Intrinsics.f(keyStr, "keyStr");
        try {
            if (TextUtils.isEmpty(content) || TextUtils.isEmpty(keyStr)) {
                throw new Exception("AESGCM256加密异常,检查文本或密钥");
            }
            byte[] bArr = new byte[12];
            new SecureRandom().nextBytes(bArr);
            SecretKeySpec secretKeySpecGenSecKey = genSecKey(keyStr);
            Cipher cipher = Cipher.getInstance(gcm256algorithm);
            cipher.init(1, secretKeySpecGenSecKey, new GCMParameterSpec(128, bArr));
            Charset charset = Charsets.f44691a;
            byte[] bytes = content.getBytes(charset);
            Intrinsics.e(bytes, "getBytes(...)");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12 + bArrDoFinal.length);
            Intrinsics.e(byteBufferAllocate, "allocate(...)");
            byteBufferAllocate.put(bArr);
            byteBufferAllocate.put(bArrDoFinal);
            byte[] bArrC = Base64.c(byteBufferAllocate.array());
            Intrinsics.e(bArrC, "encodeBase64(...)");
            return new String(bArrC, charset);
        } catch (Exception e2) {
            Log.e(TAG, "AESGCM256加密文本处理失败,error:" + e2);
            return null;
        }
    }

    public final String decrypt(String content) {
        Intrinsics.f(content, "content");
        try {
            byte[] bArrDecode = android.util.Base64.decode(content, 0);
            Intrinsics.e(bArrDecode, "decode(...)");
            byte[] bArrQ = ArraysKt.q(0, 12, bArrDecode);
            byte[] bArrQ2 = ArraysKt.q(12, bArrDecode.length, bArrDecode);
            Cipher cipher = Cipher.getInstance(gcm256algorithm);
            cipher.init(2, genSecKey(KEY), new GCMParameterSpec(128, bArrQ));
            byte[] bArrDoFinal = cipher.doFinal(bArrQ2);
            Intrinsics.c(bArrDoFinal);
            return new String(bArrDoFinal, Charsets.f44691a);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final SecretKeySpec genSecKey(String password) throws NoSuchAlgorithmException {
        Intrinsics.f(password, "password");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.e(UTF_8, "UTF_8");
        byte[] bytes = password.getBytes(UTF_8);
        Intrinsics.e(bytes, "getBytes(...)");
        return new SecretKeySpec(messageDigest.digest(bytes), "AES");
    }

    public final String getKEY() {
        return KEY;
    }

    public final void setKEY(String str) {
        Intrinsics.f(str, "<set-?>");
        KEY = str;
    }
}
