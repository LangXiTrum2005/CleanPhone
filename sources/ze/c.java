package ze;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f54915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ye.e f54916c;

    public c(Context context, ye.e eVar) throws Exception {
        this.f54915b = context;
        this.f54916c = eVar;
        String str = context.getPackageName() + ".FlutterSecureStoragePluginKey" + eVar.c();
        this.f54914a = str;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(str, null) == null) {
            a();
        }
    }

    public final void a() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        Context context = this.f54915b;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean z10 = keyguardManager != null && keyguardManager.isDeviceSecure();
        ye.e eVar = this.f54916c;
        boolean z11 = eVar.f54384h;
        boolean z12 = eVar.f54385i;
        if (z11 && !z10) {
            throw new Exception("BIOMETRIC_UNAVAILABLE: Biometric enforcement enabled but device has no PIN, pattern, password, or biometric enrolled. Cannot generate secure key.");
        }
        if (!z10) {
            Log.w("AESCipher23", "Device has no PIN/biometric security. Generating key without user authentication requirement (enforceBiometrics=false).");
        }
        String str = this.f54914a;
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(NotificationCompat.FLAG_LOCAL_ONLY);
        if (z10) {
            keySize.setUserAuthenticationRequired(true);
            keySize.setUserAuthenticationParameters(0, z12 ? 2 : 3);
            keySize.setInvalidatedByBiometricEnrollment(true);
        } else {
            keySize.setUserAuthenticationRequired(false);
        }
        keySize.setUnlockedDeviceRequired(true);
        if (context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
            keySize.setIsStrongBoxBacked(true);
            Log.d("AESCipher23", "StrongBox is available and enabled for biometric key");
        } else {
            Log.w("AESCipher23", "StrongBox requested but not available on this device. Using standard TEE.");
        }
        try {
            keyGenerator.init(keySize.build());
            keyGenerator.generateKey();
        } catch (Exception e10) {
            if (!context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                throw e10;
            }
            Log.w("AESCipher23", " Key generation failed with StrongBox. Retrying without StrongBox.", e10);
            KeyGenParameterSpec.Builder unlockedDeviceRequired = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(NotificationCompat.FLAG_LOCAL_ONLY).setUnlockedDeviceRequired(true);
            if (z10) {
                unlockedDeviceRequired.setUserAuthenticationRequired(true);
                unlockedDeviceRequired.setUserAuthenticationParameters(0, z12 ? 2 : 3);
                unlockedDeviceRequired.setInvalidatedByBiometricEnrollment(true);
            }
            keyGenerator.init(unlockedDeviceRequired.build());
            keyGenerator.generateKey();
            Log.d("AESCipher23", "Key generation succeeded without StrongBox");
        }
    }

    public final Cipher b(Context context, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.f54916c.b(), 0);
        String string = sharedPreferences.getString("KeyStoreIV1", null);
        if (string != null && sharedPreferences.contains("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK")) {
            cipher.init(2, key, new GCMParameterSpec(128, Base64.decode(string, 0)));
            return cipher;
        }
        cipher.init(1, key);
        byte[] iv = cipher.getIV();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("KeyStoreIV1", Base64.encodeToString(iv, 0));
        editorEdit.apply();
        return cipher;
    }

    @Override // ze.a
    public final void c() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry(this.f54914a);
        this.f54915b.getSharedPreferences(this.f54916c.b(), 0).edit().remove("KeyStoreIV1").apply();
    }

    @Override // ze.a
    public final Cipher d(Context context) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = this.f54914a;
        Key key = keyStore.getKey(str, null);
        if (key != null) {
            return b(context, key);
        }
        a();
        return b(context, keyStore.getKey(str, null));
    }

    @Override // ze.a
    public final Key e(byte[] bArr) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot unwrap other keys");
    }

    @Override // ze.a
    public final byte[] g(SecretKeySpec secretKeySpec) {
        throw new UnsupportedOperationException("AES symmetric keys in AndroidKeyStore cannot wrap other keys");
    }
}
