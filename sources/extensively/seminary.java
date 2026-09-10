package extensively;

import astronautic.peridotite;
import astronautic.splinterproof;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPssVerifyConscrypt.java */
/* JADX INFO: loaded from: classes3.dex */
public final class seminary implements discernable.dovishness {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26211competently = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26212impromptu = new byte[0];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f26213taiyuan = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RSAPublicKey f26214attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Provider f26215beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PSSParameterSpec f26216dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f26217marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26218saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26219wireman;

    public seminary(RSAPublicKey rSAPublicKey, peridotite.dern dernVar, peridotite.dern dernVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f26211competently.isCompatible()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!dernVar.equals(dernVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        affiche.gintrap.saneness(rSAPublicKey.getModulus().bitLength());
        affiche.gintrap.dern(rSAPublicKey.getPublicExponent());
        this.f26214attabal = rSAPublicKey;
        this.f26218saneness = marial(dernVar);
        this.f26216dern = impromptu(dernVar, dernVar2, i);
        this.f26219wireman = bArr;
        this.f26217marial = bArr2;
        this.f26215beachfront = provider;
    }

    public static String beachfront(peridotite.dern dernVar) {
        if (dernVar == peridotite.dern.f14644attabal) {
            return "SHA-256";
        }
        if (dernVar == peridotite.dern.f14646saneness) {
            return "SHA-384";
        }
        if (dernVar == peridotite.dern.f14645dern) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unsupported MD hash: " + dernVar);
    }

    public static MGF1ParameterSpec competently(peridotite.dern dernVar) {
        if (dernVar == peridotite.dern.f14644attabal) {
            return MGF1ParameterSpec.SHA256;
        }
        if (dernVar == peridotite.dern.f14646saneness) {
            return MGF1ParameterSpec.SHA384;
        }
        if (dernVar == peridotite.dern.f14645dern) {
            return MGF1ParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("Unsupported MGF1 hash: " + dernVar);
    }

    public static discernable.dovishness dern(splinterproof splinterproofVar) throws GeneralSecurityException {
        return wireman(splinterproofVar, saneness());
    }

    public static PSSParameterSpec impromptu(peridotite.dern dernVar, peridotite.dern dernVar2, int i) {
        return new PSSParameterSpec(beachfront(dernVar), "MGF1", competently(dernVar2), i, 1);
    }

    public static String marial(peridotite.dern dernVar) {
        if (dernVar == peridotite.dern.f14644attabal) {
            return "SHA256withRSA/PSS";
        }
        if (dernVar == peridotite.dern.f14646saneness) {
            return "SHA384withRSA/PSS";
        }
        if (dernVar == peridotite.dern.f14645dern) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + dernVar);
    }

    @Nullable
    public static Provider saneness() {
        if (!creditor.wireman() || creditor.dern().intValue() > 23) {
            return hobby.dern.attabal();
        }
        return null;
    }

    public static discernable.dovishness wireman(splinterproof splinterproofVar, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(splinterproofVar.marial(), splinterproofVar.saneness().marial()));
        peridotite peridotiteVarSaneness = splinterproofVar.saneness();
        return new seminary(rSAPublicKey, peridotiteVarSaneness.competently(), peridotiteVarSaneness.dern(), peridotiteVarSaneness.beachfront(), splinterproofVar.dern().wireman(), splinterproofVar.saneness().impromptu().equals(peridotite.wireman.f14656dern) ? f26213taiyuan : f26212impromptu, provider);
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!creditor.marial(this.f26219wireman, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f26218saneness, this.f26215beachfront);
        signature.initVerify(this.f26214attabal);
        signature.setParameter(this.f26216dern);
        signature.update(bArr2);
        byte[] bArr3 = this.f26217marial;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f26219wireman;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
