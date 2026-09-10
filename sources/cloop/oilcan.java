package cloop;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: InsecureNonceAesGcmJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oilcan {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f15695saneness = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SecretKey f15696attabal;

    public oilcan(byte[] bArr) throws GeneralSecurityException {
        if (!f15695saneness.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f15696attabal = apical.dern(bArr);
    }

    public byte[] attabal(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecAttabal = apical.attabal(bArr);
        Cipher cipherWireman = apical.wireman();
        cipherWireman.init(2, this.f15696attabal, algorithmParameterSpecAttabal);
        if (bArr3 != null && bArr3.length != 0) {
            cipherWireman.updateAAD(bArr3);
        }
        return cipherWireman.doFinal(bArr2, i, bArr2.length - i);
    }
}
