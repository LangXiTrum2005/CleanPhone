package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1Parameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class seminary extends timberyard {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final BigInteger f14699marial = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14700attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f14701dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BigInteger f14702saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f14703wireman;

    /* JADX INFO: compiled from: RsaSsaPkcs1Parameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f14704attabal = new dern("SHA256");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f14706saneness = new dern("SHA384");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f14705dern = new dern("SHA512");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: RsaSsaPkcs1Parameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final BigInteger f14707beachfront;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final BigInteger f14708marial;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f14709attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public dern f14710dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public BigInteger f14711saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public wireman f14712wireman;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f14708marial = bigIntegerValueOf;
            f14707beachfront = bigIntegerValueOf.pow(256);
        }

        public seminary attabal() throws GeneralSecurityException {
            Integer num = this.f14709attabal;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f14711saneness == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f14710dern == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f14712wireman == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f14709attabal));
            }
            beachfront(this.f14711saneness);
            return new seminary(this.f14709attabal.intValue(), this.f14711saneness, this.f14712wireman, this.f14710dern);
        }

        public final void beachfront(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(seminary.f14699marial);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f14708marial).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f14707beachfront) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public saneness dern(int i) {
            this.f14709attabal = Integer.valueOf(i);
            return this;
        }

        public saneness marial(wireman wiremanVar) {
            this.f14712wireman = wiremanVar;
            return this;
        }

        public saneness saneness(dern dernVar) {
            this.f14710dern = dernVar;
            return this;
        }

        public saneness wireman(BigInteger bigInteger) {
            this.f14711saneness = bigInteger;
            return this;
        }

        public saneness() {
            this.f14709attabal = null;
            this.f14711saneness = seminary.f14699marial;
            this.f14710dern = null;
            this.f14712wireman = wireman.f14716wireman;
        }
    }

    /* JADX INFO: compiled from: RsaSsaPkcs1Parameters.java */
    public static final class wireman {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f14713attabal = new wireman("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f14715saneness = new wireman("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final wireman f14714dern = new wireman("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final wireman f14716wireman = new wireman("NO_PREFIX");

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
        return this.f14701dern != wireman.f14716wireman;
    }

    public wireman beachfront() {
        return this.f14701dern;
    }

    public dern dern() {
        return this.f14703wireman;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof seminary)) {
            return false;
        }
        seminary seminaryVar = (seminary) obj;
        return seminaryVar.wireman() == wireman() && Objects.equals(seminaryVar.marial(), marial()) && seminaryVar.beachfront() == beachfront() && seminaryVar.dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(seminary.class, Integer.valueOf(this.f14700attabal), this.f14702saneness, this.f14701dern, this.f14703wireman);
    }

    public BigInteger marial() {
        return this.f14702saneness;
    }

    public String toString() {
        return "RSA SSA PKCS1 Parameters (variant: " + this.f14701dern + ", hashType: " + this.f14703wireman + ", publicExponent: " + this.f14702saneness + ", and " + this.f14700attabal + "-bit modulus)";
    }

    public int wireman() {
        return this.f14700attabal;
    }

    public seminary(int i, BigInteger bigInteger, wireman wiremanVar, dern dernVar) {
        this.f14700attabal = i;
        this.f14702saneness = bigInteger;
        this.f14701dern = wiremanVar;
        this.f14703wireman = dernVar;
    }
}
