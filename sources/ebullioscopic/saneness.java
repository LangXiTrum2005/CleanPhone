package ebullioscopic;

import discernable.rotuma;
import java.math.BigInteger;

/* JADX INFO: compiled from: SecretBigInteger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {
    private final BigInteger value;

    public saneness(BigInteger bigInteger) {
        this.value = bigInteger;
    }

    public static saneness attabal(BigInteger bigInteger, rotuma rotumaVar) {
        if (rotumaVar != null) {
            return new saneness(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public BigInteger saneness(rotuma rotumaVar) {
        if (rotumaVar != null) {
            return this.value;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
