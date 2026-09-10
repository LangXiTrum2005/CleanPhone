package db;

import android.util.Log;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import defpackage.e;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements va.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38800a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38801b;

    public b(String str) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f38801b = new b(str, keyStore);
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    @Override // va.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i10 = this.f38800a;
        Object obj = this.f38801b;
        switch (i10) {
            case 0:
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[bArr.length + 28];
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, (SecretKey) obj);
                cipher.updateAAD(bArr2);
                if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                    throw new GeneralSecurityException("encryption failed: bytesWritten is wrong");
                }
                byte[] iv = cipher.getIV();
                if (iv.length != 12) {
                    throw new GeneralSecurityException("IV has unexpected length");
                }
                System.arraycopy(iv, 0, bArr3, 0, 12);
                return bArr3;
            default:
                b bVar = (b) obj;
                try {
                    return bVar.a(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e10) {
                    Log.w(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "encountered a potentially transient KeyStore error, will wait and retry", e10);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return bVar.a(bArr, bArr2);
                }
        }
    }

    @Override // va.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        int i10 = this.f38800a;
        Object obj = this.f38801b;
        switch (i10) {
            case 0:
                if (bArr.length < 28) {
                    throw new BadPaddingException("ciphertext too short");
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, (SecretKey) obj, gCMParameterSpec);
                cipher.updateAAD(bArr2);
                return cipher.doFinal(bArr, 12, bArr.length - 12);
            default:
                b bVar = (b) obj;
                try {
                    return bVar.b(bArr, bArr2);
                } catch (BadPaddingException e10) {
                    throw e10;
                } catch (GeneralSecurityException | ProviderException e11) {
                    Log.w(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "encountered a potentially transient KeyStore error, will wait and retry", e11);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return bVar.b(bArr, bArr2);
                }
        }
    }

    public b(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f38801b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(e.n("Keystore cannot load the key with ID: ", str));
        }
    }
}
