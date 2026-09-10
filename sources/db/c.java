package db;

import eb.e0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import kb.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38802a = new Object();

    public static boolean a(String str) {
        synchronized (f38802a) {
            try {
                String strB = m.b(str);
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    if (keyStore.containsAlias(strB)) {
                        return false;
                    }
                    android.support.v4.media.session.a.o(strB);
                    return true;
                } catch (IOException e10) {
                    throw new GeneralSecurityException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b b(String str) throws GeneralSecurityException {
        b bVar;
        try {
            synchronized (f38802a) {
                try {
                    bVar = new b(m.b(str));
                    byte[] bArrA = e0.a(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(bArrA, bVar.b(bVar.a(bArrA, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
