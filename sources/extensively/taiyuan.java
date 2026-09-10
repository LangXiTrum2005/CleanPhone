package extensively;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Enums$HashType;
import hobby.creditor;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: EcdsaVerifyJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan implements discernable.dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ECPublicKey f26236attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Nullable
    public final Provider f26237beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final EllipticCurves.EcdsaEncoding f26238dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final byte[] f26239marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26240saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26241wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26231competently = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26234impromptu = new byte[0];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f26235taiyuan = {0};

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final hobby.impromptu<Enums$HashType, astronautic.attabal.wireman> f26232cutely = hobby.impromptu.attabal().attabal(Enums$HashType.SHA256, astronautic.attabal.wireman.f14560attabal).attabal(Enums$HashType.SHA384, astronautic.attabal.wireman.f14562saneness).attabal(Enums$HashType.SHA512, astronautic.attabal.wireman.f14561dern).saneness();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final hobby.impromptu<EllipticCurves.EcdsaEncoding, astronautic.attabal.marial> f26230apical = hobby.impromptu.attabal().attabal(EllipticCurves.EcdsaEncoding.IEEE_P1363, astronautic.attabal.marial.f14554attabal).attabal(EllipticCurves.EcdsaEncoding.DER, astronautic.attabal.marial.f14555saneness).saneness();

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final hobby.impromptu<EllipticCurves.CurveType, astronautic.attabal.dern> f26233formularize = hobby.impromptu.attabal().attabal(EllipticCurves.CurveType.NIST_P256, astronautic.attabal.dern.f14551saneness).attabal(EllipticCurves.CurveType.NIST_P384, astronautic.attabal.dern.f14550dern).attabal(EllipticCurves.CurveType.NIST_P521, astronautic.attabal.dern.f14552wireman).saneness();

    public taiyuan(ECPublicKey eCPublicKey, Enums$HashType enums$HashType, EllipticCurves.EcdsaEncoding ecdsaEncoding, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f26231competently.isCompatible()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f26240saneness = affiche.dovishness.beachfront(enums$HashType);
        this.f26236attabal = eCPublicKey;
        this.f26238dern = ecdsaEncoding;
        this.f26241wireman = bArr;
        this.f26239marial = bArr2;
        this.f26237beachfront = provider;
    }

    public static discernable.dovishness dern(astronautic.dern dernVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new taiyuan((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : affiche.cutely.f3859impromptu.attabal("EC")).generatePublic(new ECPublicKeySpec(dernVar.beachfront(), EllipticCurves.beachfront((EllipticCurves.CurveType) f26233formularize.dern(dernVar.saneness().dern())))), (Enums$HashType) f26232cutely.dern(dernVar.saneness().wireman()), (EllipticCurves.EcdsaEncoding) f26230apical.dern(dernVar.saneness().marial()), dernVar.dern().wireman(), dernVar.saneness().beachfront().equals(astronautic.attabal.beachfront.f14547dern) ? f26235taiyuan : f26234impromptu, provider);
    }

    public static discernable.dovishness saneness(astronautic.dern dernVar) throws GeneralSecurityException {
        return dern(dernVar, hobby.dern.attabal());
    }

    @Override // discernable.dovishness
    public void attabal(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f26241wireman;
        if (bArr3.length == 0) {
            marial(bArr, bArr2);
        } else {
            if (!creditor.marial(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            marial(Arrays.copyOfRange(bArr, this.f26241wireman.length, bArr.length), bArr2);
        }
    }

    public final void marial(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.f26238dern == EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            if (bArr.length != EllipticCurves.wireman(this.f26236attabal.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = EllipticCurves.saneness(bArr);
        }
        if (!EllipticCurves.apical(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureWireman = wireman(this.f26240saneness);
        signatureWireman.initVerify(this.f26236attabal);
        signatureWireman.update(bArr2);
        byte[] bArr3 = this.f26239marial;
        if (bArr3.length > 0) {
            signatureWireman.update(bArr3);
        }
        try {
            zVerify = signatureWireman.verify(bArr);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }

    public final Signature wireman(String str) throws GeneralSecurityException {
        Provider provider = this.f26237beachfront;
        return provider != null ? Signature.getInstance(str, provider) : affiche.cutely.f3862wireman.attabal(str);
    }
}
