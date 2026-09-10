package horsehair;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: HmacParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly extends monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f27974attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f27975dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f27976saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f27977wireman;

    /* JADX INFO: compiled from: HmacParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f27978attabal = new dern("SHA1");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f27981saneness = new dern("SHA224");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f27979dern = new dern("SHA256");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final dern f27982wireman = new dern("SHA384");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final dern f27980marial = new dern("SHA512");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: HmacParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f27983attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public dern f27984dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public Integer f27985saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public wireman f27986wireman;

        public static void beachfront(int i, dern dernVar) throws GeneralSecurityException {
            if (i < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
            }
            if (dernVar == dern.f27978attabal) {
                if (i > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i)));
                }
                return;
            }
            if (dernVar == dern.f27981saneness) {
                if (i > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i)));
                }
                return;
            }
            if (dernVar == dern.f27979dern) {
                if (i > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i)));
                }
            } else if (dernVar == dern.f27982wireman) {
                if (i > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i)));
                }
            } else {
                if (dernVar != dern.f27980marial) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i)));
                }
            }
        }

        public triweekly attabal() throws GeneralSecurityException {
            Integer num = this.f27983attabal;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f27985saneness == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f27984dern == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f27986wireman == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f27983attabal));
            }
            beachfront(this.f27985saneness.intValue(), this.f27984dern);
            return new triweekly(this.f27983attabal.intValue(), this.f27985saneness.intValue(), this.f27986wireman, this.f27984dern);
        }

        public saneness dern(int i) throws GeneralSecurityException {
            this.f27983attabal = Integer.valueOf(i);
            return this;
        }

        public saneness marial(wireman wiremanVar) {
            this.f27986wireman = wiremanVar;
            return this;
        }

        public saneness saneness(dern dernVar) {
            this.f27984dern = dernVar;
            return this;
        }

        public saneness wireman(int i) throws GeneralSecurityException {
            this.f27985saneness = Integer.valueOf(i);
            return this;
        }

        public saneness() {
            this.f27983attabal = null;
            this.f27985saneness = null;
            this.f27984dern = null;
            this.f27986wireman = wireman.f27990wireman;
        }
    }

    /* JADX INFO: compiled from: HmacParameters.java */
    public static final class wireman {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f27987attabal = new wireman("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f27989saneness = new wireman("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final wireman f27988dern = new wireman("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final wireman f27990wireman = new wireman("NO_PREFIX");

        public wireman(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f27975dern != wireman.f27990wireman;
    }

    public int beachfront() {
        wireman wiremanVar = this.f27975dern;
        if (wiremanVar == wireman.f27990wireman) {
            return dern();
        }
        if (wiremanVar != wireman.f27987attabal && wiremanVar != wireman.f27989saneness && wiremanVar != wireman.f27988dern) {
            throw new IllegalStateException("Unknown variant");
        }
        int iDern = dern();
        return iDern + 5;
    }

    public wireman competently() {
        return this.f27975dern;
    }

    public int dern() {
        return this.f27976saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof triweekly)) {
            return false;
        }
        triweekly triweeklyVar = (triweekly) obj;
        return triweeklyVar.marial() == marial() && triweeklyVar.beachfront() == beachfront() && triweeklyVar.competently() == competently() && triweeklyVar.wireman() == wireman();
    }

    public int hashCode() {
        return Objects.hash(triweekly.class, Integer.valueOf(this.f27974attabal), Integer.valueOf(this.f27976saneness), this.f27975dern, this.f27977wireman);
    }

    public int marial() {
        return this.f27974attabal;
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f27975dern + ", hashType: " + this.f27977wireman + ", " + this.f27976saneness + "-byte tags, and " + this.f27974attabal + "-byte key)";
    }

    public dern wireman() {
        return this.f27977wireman;
    }

    public triweekly(int i, int i2, wireman wiremanVar, dern dernVar) {
        this.f27974attabal = i;
        this.f27976saneness = i2;
        this.f27975dern = wiremanVar;
        this.f27977wireman = dernVar;
    }
}
