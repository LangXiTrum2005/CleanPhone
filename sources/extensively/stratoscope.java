package extensively;

import astronautic.grimness;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1SignJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope implements discernable.adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final RSAPrivateCrtKey f26224attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Nullable
    public Provider f26225beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final byte[] f26226dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final discernable.dovishness f26227marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f26228saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byte[] f26229wireman;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26220competently = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final byte[] f26222impromptu = new byte[0];

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final byte[] f26223taiyuan = {0};

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final byte[] f26221cutely = {1, 2, 3};

    public stratoscope(RSAPrivateCrtKey rSAPrivateCrtKey, astronautic.seminary.dern dernVar, byte[] bArr, byte[] bArr2, discernable.dovishness dovishnessVar, @Nullable Provider provider) throws GeneralSecurityException {
        if (!f26220competently.isCompatible()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        marial(dernVar);
        affiche.gintrap.saneness(rSAPrivateCrtKey.getModulus().bitLength());
        affiche.gintrap.dern(rSAPrivateCrtKey.getPublicExponent());
        this.f26224attabal = rSAPrivateCrtKey;
        this.f26228saneness = trm.marial(dernVar);
        this.f26226dern = bArr;
        this.f26229wireman = bArr2;
        this.f26227marial = dovishnessVar;
        this.f26225beachfront = provider;
    }

    public static discernable.adultoid dern(grimness grimnessVar, @Nullable Provider provider) throws GeneralSecurityException {
        stratoscope stratoscopeVar = new stratoscope((RSAPrivateCrtKey) (provider != null ? KeyFactory.getInstance("RSA", provider) : affiche.cutely.f3859impromptu.attabal("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(grimnessVar.wireman().marial(), grimnessVar.saneness().marial(), grimnessVar.formularize().saneness(discernable.beachfront.attabal()), grimnessVar.cutely().saneness(discernable.beachfront.attabal()), grimnessVar.apical().saneness(discernable.beachfront.attabal()), grimnessVar.impromptu().saneness(discernable.beachfront.attabal()), grimnessVar.taiyuan().saneness(discernable.beachfront.attabal()), grimnessVar.beachfront().saneness(discernable.beachfront.attabal()))), grimnessVar.saneness().dern(), grimnessVar.dern().wireman(), grimnessVar.saneness().beachfront().equals(astronautic.seminary.wireman.f14714dern) ? f26223taiyuan : f26222impromptu, provider != null ? trm.wireman(grimnessVar.wireman(), provider) : affiche.molybdenite.saneness(grimnessVar.wireman()), provider);
        stratoscopeVar.attabal(f26221cutely);
        return stratoscopeVar;
    }

    public static void marial(astronautic.seminary.dern dernVar) throws GeneralSecurityException {
        if (dernVar == astronautic.seminary.dern.f14704attabal || dernVar == astronautic.seminary.dern.f14706saneness || dernVar == astronautic.seminary.dern.f14705dern) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + dernVar);
    }

    public static discernable.adultoid saneness(grimness grimnessVar) throws GeneralSecurityException {
        return dern(grimnessVar, trm.saneness());
    }

    @Override // discernable.adultoid
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        Signature signatureWireman = wireman();
        signatureWireman.initSign(this.f26224attabal);
        signatureWireman.update(bArr);
        byte[] bArr2 = this.f26229wireman;
        if (bArr2.length > 0) {
            signatureWireman.update(bArr2);
        }
        byte[] bArrSign = signatureWireman.sign();
        byte[] bArr3 = this.f26226dern;
        if (bArr3.length > 0) {
            bArrSign = affiche.marial.attabal(bArr3, bArrSign);
        }
        try {
            this.f26227marial.attabal(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }

    public final Signature wireman() throws GeneralSecurityException {
        Provider provider = this.f26225beachfront;
        return provider != null ? Signature.getInstance(this.f26228saneness, provider) : affiche.cutely.f3862wireman.attabal(this.f26228saneness);
    }
}
