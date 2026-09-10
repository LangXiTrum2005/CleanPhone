package ascolichen;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: ChunkedHmacImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan implements horsehair.competently {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f14473saneness = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final horsehair.taiyuan f14474attabal;

    public taiyuan(horsehair.taiyuan taiyuanVar) throws GeneralSecurityException {
        if (!f14473saneness.isCompatible()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f14474attabal = taiyuanVar;
    }
}
