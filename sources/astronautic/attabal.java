package astronautic;

import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Objects;

/* JADX INFO: compiled from: EcdsaParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends timberyard {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final marial f14542attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f14543dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f14544saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final beachfront f14545wireman;

    /* JADX INFO: compiled from: EcdsaParameters.java */
    public static final class beachfront {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final beachfront f14546attabal = new beachfront("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final beachfront f14548saneness = new beachfront("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final beachfront f14547dern = new beachfront("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final beachfront f14549wireman = new beachfront("NO_PREFIX");

        public beachfront(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: EcdsaParameters.java */
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ECParameterSpec f14553attabal;
        private final String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f14551saneness = new dern("NIST_P256", hobby.competently.f27750attabal);

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f14550dern = new dern("NIST_P384", hobby.competently.f27755saneness);

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final dern f14552wireman = new dern("NIST_P521", hobby.competently.f27753dern);

        public dern(String str, ECParameterSpec eCParameterSpec) {
            this.name = str;
            this.f14553attabal = eCParameterSpec;
        }

        public ECParameterSpec attabal() {
            return this.f14553attabal;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: EcdsaParameters.java */
    public static final class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final marial f14554attabal = new marial("IEEE_P1363");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final marial f14555saneness = new marial("DER");
        private final String name;

        public marial(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: EcdsaParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public marial f14556attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public wireman f14557dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public dern f14558saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public beachfront f14559wireman;

        public attabal attabal() throws GeneralSecurityException {
            marial marialVar = this.f14556attabal;
            if (marialVar == null) {
                throw new GeneralSecurityException("signature encoding is not set");
            }
            dern dernVar = this.f14558saneness;
            if (dernVar == null) {
                throw new GeneralSecurityException("EC curve type is not set");
            }
            wireman wiremanVar = this.f14557dern;
            if (wiremanVar == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            beachfront beachfrontVar = this.f14559wireman;
            if (beachfrontVar == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (dernVar == dern.f14551saneness && wiremanVar != wireman.f14560attabal) {
                throw new GeneralSecurityException("NIST_P256 requires SHA256");
            }
            if (dernVar == dern.f14550dern && wiremanVar != wireman.f14562saneness && wiremanVar != wireman.f14561dern) {
                throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
            }
            if (dernVar != dern.f14552wireman || wiremanVar == wireman.f14561dern) {
                return new attabal(marialVar, dernVar, wiremanVar, beachfrontVar);
            }
            throw new GeneralSecurityException("NIST_P521 requires SHA512");
        }

        public saneness dern(wireman wiremanVar) {
            this.f14557dern = wiremanVar;
            return this;
        }

        public saneness marial(beachfront beachfrontVar) {
            this.f14559wireman = beachfrontVar;
            return this;
        }

        public saneness saneness(dern dernVar) {
            this.f14558saneness = dernVar;
            return this;
        }

        public saneness wireman(marial marialVar) {
            this.f14556attabal = marialVar;
            return this;
        }

        public saneness() {
            this.f14556attabal = null;
            this.f14558saneness = null;
            this.f14557dern = null;
            this.f14559wireman = beachfront.f14549wireman;
        }
    }

    /* JADX INFO: compiled from: EcdsaParameters.java */
    public static final class wireman {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f14560attabal = new wireman("SHA256");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f14562saneness = new wireman("SHA384");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final wireman f14561dern = new wireman("SHA512");

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
        return this.f14545wireman != beachfront.f14549wireman;
    }

    public beachfront beachfront() {
        return this.f14545wireman;
    }

    public dern dern() {
        return this.f14544saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof attabal)) {
            return false;
        }
        attabal attabalVar = (attabal) obj;
        return attabalVar.marial() == marial() && attabalVar.dern() == dern() && attabalVar.wireman() == wireman() && attabalVar.beachfront() == beachfront();
    }

    public int hashCode() {
        return Objects.hash(attabal.class, this.f14542attabal, this.f14544saneness, this.f14543dern, this.f14545wireman);
    }

    public marial marial() {
        return this.f14542attabal;
    }

    public String toString() {
        return "ECDSA Parameters (variant: " + this.f14545wireman + ", hashType: " + this.f14543dern + ", encoding: " + this.f14542attabal + ", curve: " + this.f14544saneness + ")";
    }

    public wireman wireman() {
        return this.f14543dern;
    }

    public attabal(marial marialVar, dern dernVar, wireman wiremanVar, beachfront beachfrontVar) {
        this.f14542attabal = marialVar;
        this.f14544saneness = dernVar;
        this.f14543dern = wiremanVar;
        this.f14545wireman = beachfrontVar;
    }
}
