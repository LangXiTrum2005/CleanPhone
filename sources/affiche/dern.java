package affiche;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: AesGcmJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern implements discernable.attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f3867dern = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final SecretKey f3868attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f3869saneness;

    public dern(byte[] bArr, ebullioscopic.attabal attabalVar) throws GeneralSecurityException {
        if (!f3867dern.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f3868attabal = cloop.apical.dern(bArr);
        this.f3869saneness = attabalVar.wireman();
    }

    public static discernable.attabal saneness(curiousness.monoploid monoploidVar) throws GeneralSecurityException {
        if (monoploidVar.saneness().dern() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + monoploidVar.saneness().dern());
        }
        if (monoploidVar.saneness().marial() == 16) {
            return new dern(monoploidVar.marial().wireman(discernable.beachfront.attabal()), monoploidVar.dern());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + monoploidVar.saneness().marial());
    }

    @Override // discernable.attabal
    public byte[] attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f3869saneness;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        AlgorithmParameterSpec algorithmParameterSpecSaneness = cloop.apical.saneness(bArr, this.f3869saneness.length, 12);
        Cipher cipherWireman = cloop.apical.wireman();
        cipherWireman.init(2, this.f3868attabal, algorithmParameterSpecSaneness);
        if (bArr2 != null && bArr2.length != 0) {
            cipherWireman.updateAAD(bArr2);
        }
        byte[] bArr4 = this.f3869saneness;
        return cipherWireman.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
    }
}
