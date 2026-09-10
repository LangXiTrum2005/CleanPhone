package ahermatype;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: CipherEncryption.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f3941attabal = "AES/CBC/PKCS7Padding";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public KeyStore f3942saneness;

    @Override // ahermatype.saneness
    public boolean attabal() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f3942saneness = keyStore;
            keyStore.load(null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // ahermatype.saneness
    public String dern(String str, String str2) throws Exception {
        if (!this.f3942saneness.containsAlias(str)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
            keyGenerator.generateKey();
        }
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) this.f3942saneness.getEntry(str, null)).getSecretKey();
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, secretKey);
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(str2.getBytes());
        byte[] bArr = new byte[iv.length + bArrDoFinal.length + 1];
        bArr[0] = (byte) iv.length;
        System.arraycopy(iv, 0, bArr, 1, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length + 1, bArrDoFinal.length);
        return Base64.encodeToString(bArr, 2);
    }

    @Override // ahermatype.saneness
    public String saneness(String str, String str2) throws Exception {
        if (!this.f3942saneness.containsAlias(str)) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build());
            keyGenerator.generateKey();
        }
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) this.f3942saneness.getEntry(str, null)).getSecretKey();
        byte[] bArrDecode = Base64.decode(str2, 2);
        int i = bArrDecode[0];
        byte[] bArr = new byte[i];
        System.arraycopy(bArrDecode, 1, bArr, 0, i);
        int length = (bArrDecode.length - 1) - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, i + 1, bArr2, 0, length);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, secretKey, new IvParameterSpec(bArr));
        return new String(cipher.doFinal(bArr2));
    }
}
