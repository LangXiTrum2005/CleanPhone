package extensively;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: Ed25519VerifyJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi implements discernable.dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final PublicKey f26207attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f26208dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f26209saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider f26210wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26206marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final byte[] f26205beachfront = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    public polloi(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!f26206marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        this.f26207attabal = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(marial(bArr)));
        this.f26209saneness = bArr2;
        this.f26208dern = bArr3;
        this.f26210wireman = provider;
    }

    public static discernable.dovishness dern(astronautic.kowloon kowloonVar) throws GeneralSecurityException {
        return wireman(kowloonVar, saneness());
    }

    public static byte[] marial(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return affiche.marial.attabal(f26205beachfront, bArr);
        }
        throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
    }

    public static Provider saneness() throws GeneralSecurityException {
        Provider providerAttabal = hobby.dern.attabal();
        if (providerAttabal != null) {
            return providerAttabal;
        }
        throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
    }

    public static discernable.dovishness wireman(astronautic.kowloon kowloonVar, Provider provider) throws GeneralSecurityException {
        if (f26206marial.isCompatible()) {
            return new polloi(kowloonVar.competently().wireman(), kowloonVar.dern().wireman(), kowloonVar.saneness().dern().equals(astronautic.taiyuan.attabal.f14726dern) ? new byte[]{0} : new byte[0], provider);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        int length = bArr.length;
        byte[] bArr3 = this.f26209saneness;
        if (length != bArr3.length + 64) {
            throw new GeneralSecurityException(String.format("Invalid signature length: %s", 64));
        }
        if (!creditor.marial(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance("Ed25519", this.f26210wireman);
        signature.initVerify(this.f26207attabal);
        signature.update(bArr2);
        signature.update(this.f26208dern);
        try {
            zVerify = signature.verify(bArr, this.f26209saneness.length, 64);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
