package extensively;

import astronautic.mathsort;
import astronautic.peridotite;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: compiled from: RsaSsaPssSignConscrypt.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polder implements discernable.adultoid {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26196competently = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26197impromptu = new byte[0];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f26198taiyuan = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RSAPrivateCrtKey f26199attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Provider f26200beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PSSParameterSpec f26201dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f26202marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26203saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26204wireman;

    public polder(RSAPrivateCrtKey rSAPrivateCrtKey, peridotite.dern dernVar, peridotite.dern dernVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f26196competently.isCompatible()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        affiche.gintrap.saneness(rSAPrivateCrtKey.getModulus().bitLength());
        affiche.gintrap.dern(rSAPrivateCrtKey.getPublicExponent());
        this.f26199attabal = rSAPrivateCrtKey;
        this.f26203saneness = seminary.marial(dernVar);
        this.f26201dern = seminary.impromptu(dernVar, dernVar2, i);
        this.f26204wireman = bArr;
        this.f26202marial = bArr2;
        this.f26200beachfront = provider;
    }

    public static discernable.adultoid dern(mathsort mathsortVar, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        peridotite peridotiteVarSaneness = mathsortVar.saneness();
        return new polder((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(mathsortVar.wireman().marial(), peridotiteVarSaneness.marial(), mathsortVar.formularize().saneness(discernable.beachfront.attabal()), mathsortVar.cutely().saneness(discernable.beachfront.attabal()), mathsortVar.apical().saneness(discernable.beachfront.attabal()), mathsortVar.impromptu().saneness(discernable.beachfront.attabal()), mathsortVar.taiyuan().saneness(discernable.beachfront.attabal()), mathsortVar.beachfront().saneness(discernable.beachfront.attabal()))), peridotiteVarSaneness.competently(), peridotiteVarSaneness.dern(), peridotiteVarSaneness.beachfront(), mathsortVar.dern().wireman(), peridotiteVarSaneness.impromptu().equals(peridotite.wireman.f14656dern) ? f26198taiyuan : f26197impromptu, provider);
    }

    public static discernable.adultoid saneness(mathsort mathsortVar) throws GeneralSecurityException {
        return dern(mathsortVar, seminary.saneness());
    }

    @Override // discernable.adultoid
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        Signature signature = Signature.getInstance(this.f26203saneness, this.f26200beachfront);
        signature.initSign(this.f26199attabal);
        signature.setParameter(this.f26201dern);
        signature.update(bArr);
        byte[] bArr2 = this.f26202marial;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f26204wireman;
        return bArr3.length == 0 ? bArrSign : affiche.marial.attabal(bArr3, bArrSign);
    }
}
