package curiousness;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmSivParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord extends curiousness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24349attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f24350saneness;

    /* JADX INFO: compiled from: AesGcmSivParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f24351attabal = new dern("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f24353saneness = new dern("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f24352dern = new dern("NO_PREFIX");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: AesGcmSivParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f24354attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public dern f24355saneness;

        public cord attabal() throws GeneralSecurityException {
            Integer num = this.f24354attabal;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f24355saneness != null) {
                return new cord(num.intValue(), this.f24355saneness);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public saneness dern(dern dernVar) {
            this.f24355saneness = dernVar;
            return this;
        }

        public saneness saneness(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.f24354attabal = Integer.valueOf(i);
            return this;
        }

        public saneness() {
            this.f24354attabal = null;
            this.f24355saneness = dern.f24352dern;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24350saneness != dern.f24352dern;
    }

    public int dern() {
        return this.f24349attabal;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cord)) {
            return false;
        }
        cord cordVar = (cord) obj;
        return cordVar.dern() == dern() && cordVar.wireman() == wireman();
    }

    public int hashCode() {
        return Objects.hash(cord.class, Integer.valueOf(this.f24349attabal), this.f24350saneness);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f24350saneness + ", " + this.f24349attabal + "-byte key)";
    }

    public dern wireman() {
        return this.f24350saneness;
    }

    public cord(int i, dern dernVar) {
        this.f24349attabal = i;
        this.f24350saneness = dernVar;
    }
}
