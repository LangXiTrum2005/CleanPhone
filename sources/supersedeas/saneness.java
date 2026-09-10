package supersedeas;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import discernable.beachfront;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import larchwood.dern;

/* JADX INFO: compiled from: PrfAesCmacConscrypt.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness implements dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f38287dern = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Key f38288attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Provider f38289saneness;

    public saneness(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!f38287dern.isCompatible()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f38288attabal = new SecretKeySpec(bArr, "AES");
        this.f38289saneness = provider;
    }

    public static dern saneness(larchwood.attabal attabalVar) throws GeneralSecurityException {
        Provider providerAttabal = hobby.dern.attabal();
        if (providerAttabal == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerAttabal);
        return new saneness(attabalVar.wireman().wireman(beachfront.attabal()), providerAttabal);
    }

    @Override // larchwood.dern
    public byte[] attabal(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f38289saneness);
        mac.init(this.f38288attabal);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }
}
