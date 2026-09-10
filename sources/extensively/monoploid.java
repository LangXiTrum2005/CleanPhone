package extensively;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: compiled from: Ed25519SignJce.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid implements discernable.adultoid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f26192attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PrivateKey f26193dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f26194saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider f26195wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f26191marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final byte[] f26190beachfront = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, RemoteControlWriter.BLOCK_CMDOK};

    public monoploid(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!f26191marial.isCompatible()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        this.f26192attabal = bArr2;
        this.f26194saneness = bArr3;
        this.f26195wireman = provider;
        this.f26193dern = KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(marial(bArr)));
    }

    public static discernable.adultoid dern(astronautic.cutely cutelyVar) throws GeneralSecurityException {
        return wireman(cutelyVar, saneness());
    }

    public static byte[] marial(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return affiche.marial.attabal(f26190beachfront, bArr);
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
    }

    public static Provider saneness() throws GeneralSecurityException {
        Provider providerAttabal = hobby.dern.attabal();
        if (providerAttabal != null) {
            return providerAttabal;
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    public static discernable.adultoid wireman(astronautic.cutely cutelyVar, Provider provider) throws GeneralSecurityException {
        return new monoploid(cutelyVar.competently().wireman(discernable.beachfront.attabal()), cutelyVar.dern().wireman(), cutelyVar.saneness().dern().equals(astronautic.taiyuan.attabal.f14726dern) ? new byte[]{0} : new byte[0], provider);
    }

    @Override // discernable.adultoid
    public byte[] attabal(byte[] bArr) throws GeneralSecurityException {
        Signature signature = Signature.getInstance("Ed25519", this.f26195wireman);
        signature.initSign(this.f26193dern);
        signature.update(bArr);
        signature.update(this.f26194saneness);
        byte[] bArrSign = signature.sign();
        byte[] bArr2 = this.f26192attabal;
        return bArr2.length == 0 ? bArrSign : affiche.marial.attabal(bArr2, bArrSign);
    }
}
