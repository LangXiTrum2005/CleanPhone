package extensively;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums$HashType;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: EcdsaSignJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu implements discernable.adultoid {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26168competently = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26169impromptu = new byte[0];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f26170taiyuan = {0};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ECPrivateKey f26171attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Nullable
    public final Provider f26172beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final EllipticCurves.EcdsaEncoding f26173dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f26174marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26175saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26176wireman;

    public impromptu(ECPrivateKey eCPrivateKey, Enums$HashType enums$HashType, EllipticCurves.EcdsaEncoding ecdsaEncoding, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f26168competently.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f26171attabal = eCPrivateKey;
        this.f26175saneness = affiche.dovishness.beachfront(enums$HashType);
        this.f26173dern = ecdsaEncoding;
        this.f26176wireman = bArr;
        this.f26174marial = bArr2;
        this.f26172beachfront = provider;
    }

    public static discernable.adultoid dern(astronautic.saneness sanenessVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new impromptu((ECPrivateKey) (provider != null ? KeyFactory.getInstance("EC", provider) : affiche.cutely.f3859impromptu.attabal("EC")).generatePrivate(new ECPrivateKeySpec(sanenessVar.competently().saneness(discernable.beachfront.attabal()), EllipticCurves.beachfront((EllipticCurves.CurveType) taiyuan.f26233formularize.dern(sanenessVar.saneness().dern())))), (Enums$HashType) taiyuan.f26232cutely.dern(sanenessVar.saneness().wireman()), (EllipticCurves.EcdsaEncoding) taiyuan.f26230apical.dern(sanenessVar.saneness().marial()), sanenessVar.dern().wireman(), sanenessVar.saneness().beachfront().equals(astronautic.attabal.beachfront.f14547dern) ? f26170taiyuan : f26169impromptu, provider);
    }

    public static discernable.adultoid saneness(astronautic.saneness sanenessVar) throws GeneralSecurityException {
        return dern(sanenessVar, hobby.dern.attabal());
    }

    @Override // discernable.adultoid
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        Signature signatureWireman = wireman(this.f26175saneness);
        signatureWireman.initSign(this.f26171attabal);
        signatureWireman.update(bArr);
        byte[] bArr2 = this.f26174marial;
        if (bArr2.length > 0) {
            signatureWireman.update(bArr2);
        }
        byte[] bArrSign = signatureWireman.sign();
        if (this.f26173dern == EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            bArrSign = EllipticCurves.attabal(bArrSign, EllipticCurves.wireman(this.f26171attabal.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f26176wireman;
        return bArr3.length == 0 ? bArrSign : affiche.marial.attabal(bArr3, bArrSign);
    }

    public final Signature wireman(String str) throws GeneralSecurityException {
        Provider provider = this.f26172beachfront;
        return provider != null ? Signature.getInstance(str, provider) : affiche.cutely.f3862wireman.attabal(str);
    }
}
