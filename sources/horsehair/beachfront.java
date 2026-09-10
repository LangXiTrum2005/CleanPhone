package horsehair;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCmacParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f27927attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f27928dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f27929saneness;

    /* JADX INFO: compiled from: AesCmacParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f27930attabal = new dern("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f27932saneness = new dern("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f27931dern = new dern("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final dern f27933wireman = new dern("NO_PREFIX");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: AesCmacParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f27934attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public dern f27935dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public Integer f27936saneness;

        public beachfront attabal() throws GeneralSecurityException {
            Integer num = this.f27934attabal;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f27936saneness == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f27935dern != null) {
                return new beachfront(num.intValue(), this.f27936saneness.intValue(), this.f27935dern);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public saneness dern(int i) throws GeneralSecurityException {
            if (i >= 10 && 16 >= i) {
                this.f27936saneness = Integer.valueOf(i);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }

        public saneness saneness(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
            }
            this.f27934attabal = Integer.valueOf(i);
            return this;
        }

        public saneness wireman(dern dernVar) {
            this.f27935dern = dernVar;
            return this;
        }

        public saneness() {
            this.f27934attabal = null;
            this.f27936saneness = null;
            this.f27935dern = dern.f27933wireman;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f27928dern != dern.f27933wireman;
    }

    public dern beachfront() {
        return this.f27928dern;
    }

    public int dern() {
        return this.f27929saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof beachfront)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) obj;
        return beachfrontVar.wireman() == wireman() && beachfrontVar.marial() == marial() && beachfrontVar.beachfront() == beachfront();
    }

    public int hashCode() {
        return Objects.hash(beachfront.class, Integer.valueOf(this.f27927attabal), Integer.valueOf(this.f27929saneness), this.f27928dern);
    }

    public int marial() {
        dern dernVar = this.f27928dern;
        if (dernVar == dern.f27933wireman) {
            return dern();
        }
        if (dernVar != dern.f27930attabal && dernVar != dern.f27932saneness && dernVar != dern.f27931dern) {
            throw new IllegalStateException("Unknown variant");
        }
        int iDern = dern();
        return iDern + 5;
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f27928dern + ", " + this.f27929saneness + "-byte tags, and " + this.f27927attabal + "-byte key)";
    }

    public int wireman() {
        return this.f27927attabal;
    }

    public beachfront(int i, int i2, dern dernVar) {
        this.f27927attabal = i;
        this.f27929saneness = i2;
        this.f27928dern = dernVar;
    }
}
