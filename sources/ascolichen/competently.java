package ascolichen;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: ChunkedAesCmacConscrypt.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently implements horsehair.competently {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14455marial = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f14456attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final SecretKeySpec f14457dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final horsehair.beachfront f14458saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Provider f14459wireman;

    public competently(horsehair.attabal attabalVar, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            throw new IllegalArgumentException("conscrypt is null");
        }
        if (!f14455marial.isCompatible()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            this.f14459wireman = provider;
            this.f14456attabal = attabalVar.dern().wireman();
            this.f14458saneness = attabalVar.saneness();
            this.f14457dern = saneness(attabalVar);
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static horsehair.competently attabal(horsehair.attabal attabalVar, Provider provider) throws GeneralSecurityException {
        return new competently(attabalVar, provider);
    }

    public static SecretKeySpec saneness(horsehair.attabal attabalVar) {
        return new SecretKeySpec(attabalVar.marial().wireman(discernable.beachfront.attabal()), "AES");
    }
}
