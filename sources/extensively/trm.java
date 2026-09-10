package extensively;

import astronautic.saran;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1VerifyConscrypt.java */
/* JADX INFO: loaded from: classes3.dex */
public final class trm implements discernable.dovishness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26242beachfront = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final byte[] f26243competently = new byte[0];

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26244impromptu = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RSAPublicKey f26245attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f26246dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Provider f26247marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26248saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26249wireman;

    public trm(RSAPublicKey rSAPublicKey, astronautic.seminary.dern dernVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f26242beachfront.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        affiche.gintrap.saneness(rSAPublicKey.getModulus().bitLength());
        affiche.gintrap.dern(rSAPublicKey.getPublicExponent());
        this.f26245attabal = rSAPublicKey;
        this.f26248saneness = marial(dernVar);
        this.f26246dern = bArr;
        this.f26249wireman = bArr2;
        this.f26247marial = provider;
    }

    public static discernable.dovishness dern(saran saranVar) throws GeneralSecurityException {
        Provider providerSaneness = saneness();
        if (providerSaneness != null) {
            return wireman(saranVar, providerSaneness);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static String marial(astronautic.seminary.dern dernVar) throws GeneralSecurityException {
        if (dernVar == astronautic.seminary.dern.f14704attabal) {
            return "SHA256withRSA";
        }
        if (dernVar == astronautic.seminary.dern.f14706saneness) {
            return "SHA384withRSA";
        }
        if (dernVar == astronautic.seminary.dern.f14705dern) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    @Nullable
    public static Provider saneness() {
        if (!creditor.wireman() || creditor.dern().intValue() > 21) {
            return hobby.dern.attabal();
        }
        return null;
    }

    public static discernable.dovishness wireman(saran saranVar, Provider provider) throws GeneralSecurityException {
        return new trm((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(saranVar.marial(), saranVar.saneness().marial())), saranVar.saneness().dern(), saranVar.dern().wireman(), saranVar.saneness().beachfront().equals(astronautic.seminary.wireman.f14714dern) ? f26244impromptu : f26243competently, provider);
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (!creditor.marial(this.f26246dern, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f26248saneness, this.f26247marial);
        signature.initVerify(this.f26245attabal);
        signature.update(bArr2);
        byte[] bArr3 = this.f26249wireman;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            zVerify = signature.verify(Arrays.copyOfRange(bArr, this.f26246dern.length, bArr.length));
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
