package cloop;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AesGcmJceUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f15639attabal = new attabal();

    /* JADX INFO: compiled from: AesGcmJceUtil.java */
    public class attabal extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return affiche.cutely.f3861saneness.attabal("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static AlgorithmParameterSpec attabal(byte[] bArr) {
        return saneness(bArr, 0, bArr.length);
    }

    public static SecretKey dern(byte[] bArr) throws GeneralSecurityException {
        affiche.gintrap.attabal(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec saneness(byte[] bArr, int i, int i2) {
        Integer numDern = hobby.creditor.dern();
        return (numDern == null || numDern.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static Cipher wireman() {
        return f15639attabal.get();
    }
}
