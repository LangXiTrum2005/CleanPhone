package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AesCtrJceCipher.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SecretKeySpec f3844attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f3845dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f3846saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3843wireman = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f3842marial = new C0003attabal();

    /* JADX INFO: renamed from: affiche.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AesCtrJceCipher.java */
    public class C0003attabal extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return cutely.f3861saneness.attabal("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public attabal(byte[] bArr, int i) throws GeneralSecurityException {
        if (!f3843wireman.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        gintrap.attabal(bArr.length);
        this.f3844attabal = new SecretKeySpec(bArr, "AES");
        int blockSize = f3842marial.get().getBlockSize();
        this.f3845dern = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f3846saneness = i;
    }

    @Override // affiche.impassible
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f3846saneness;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int length2 = bArr.length;
        int i2 = this.f3846saneness;
        byte[] bArr3 = new byte[length2 - i2];
        saneness(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void saneness(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = f3842marial.get();
        byte[] bArr4 = new byte[this.f3845dern];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f3846saneness);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f3844attabal, ivParameterSpec);
        } else {
            cipher.init(2, this.f3844attabal, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
