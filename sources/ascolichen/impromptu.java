package ascolichen;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: compiled from: ChunkedAesCmacImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu implements horsehair.competently {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14460saneness = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final horsehair.attabal f14461attabal;

    public impromptu(horsehair.attabal attabalVar) {
        this.f14461attabal = attabalVar;
    }

    public static horsehair.competently attabal(horsehair.attabal attabalVar) throws GeneralSecurityException {
        if (!f14460saneness.isCompatible()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerAttabal = hobby.dern.attabal();
        if (providerAttabal != null) {
            try {
                return competently.attabal(attabalVar, providerAttabal);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new impromptu(attabalVar);
    }
}
