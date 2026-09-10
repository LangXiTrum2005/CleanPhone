package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPssParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class peridotite extends timberyard {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final BigInteger f14637competently = BigInteger.valueOf(65537);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f14638attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f14639beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f14640dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final dern f14641marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BigInteger f14642saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f14643wireman;

    /* JADX INFO: compiled from: RsaSsaPssParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f14644attabal = new dern("SHA256");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f14646saneness = new dern("SHA384");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f14645dern = new dern("SHA512");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: RsaSsaPssParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final BigInteger f14647competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final BigInteger f14648impromptu;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f14649attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public wireman f14650beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public dern f14651dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        @Nullable
        public Integer f14652marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public BigInteger f14653saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public dern f14654wireman;

        static {
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            f14647competently = bigIntegerValueOf;
            f14648impromptu = bigIntegerValueOf.pow(256);
        }

        public peridotite attabal() throws GeneralSecurityException {
            Integer num = this.f14649attabal;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f14653saneness == null) {
                throw new GeneralSecurityException("publicExponent is not set");
            }
            if (this.f14651dern == null) {
                throw new GeneralSecurityException("signature hash type is not set");
            }
            if (this.f14654wireman == null) {
                throw new GeneralSecurityException("mgf1 hash type is not set");
            }
            if (this.f14650beachfront == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (this.f14652marial == null) {
                throw new GeneralSecurityException("salt length is not set");
            }
            if (num.intValue() < 2048) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f14649attabal, 2048));
            }
            if (this.f14651dern != this.f14654wireman) {
                throw new GeneralSecurityException("MGF1 hash is different from signature hash");
            }
            impromptu(this.f14653saneness);
            return new peridotite(this.f14649attabal.intValue(), this.f14653saneness, this.f14650beachfront, this.f14651dern, this.f14654wireman, this.f14652marial.intValue());
        }

        public saneness beachfront(dern dernVar) {
            this.f14651dern = dernVar;
            return this;
        }

        public saneness competently(wireman wiremanVar) {
            this.f14650beachfront = wiremanVar;
            return this;
        }

        public saneness dern(int i) {
            this.f14649attabal = Integer.valueOf(i);
            return this;
        }

        public final void impromptu(BigInteger bigInteger) throws InvalidAlgorithmParameterException {
            int iCompareTo = bigInteger.compareTo(peridotite.f14637competently);
            if (iCompareTo == 0) {
                return;
            }
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f14647competently).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f14648impromptu) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }

        public saneness marial(int i) throws GeneralSecurityException {
            if (i < 0) {
                throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
            }
            this.f14652marial = Integer.valueOf(i);
            return this;
        }

        public saneness saneness(dern dernVar) {
            this.f14654wireman = dernVar;
            return this;
        }

        public saneness wireman(BigInteger bigInteger) {
            this.f14653saneness = bigInteger;
            return this;
        }

        public saneness() {
            this.f14649attabal = null;
            this.f14653saneness = peridotite.f14637competently;
            this.f14651dern = null;
            this.f14654wireman = null;
            this.f14652marial = null;
            this.f14650beachfront = wireman.f14658wireman;
        }
    }

    /* JADX INFO: compiled from: RsaSsaPssParameters.java */
    public static final class wireman {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f14655attabal = new wireman("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f14657saneness = new wireman("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final wireman f14656dern = new wireman("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final wireman f14658wireman = new wireman("NO_PREFIX");

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
        return this.f14640dern != wireman.f14658wireman;
    }

    public int beachfront() {
        return this.f14639beachfront;
    }

    public dern competently() {
        return this.f14643wireman;
    }

    public dern dern() {
        return this.f14641marial;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof peridotite)) {
            return false;
        }
        peridotite peridotiteVar = (peridotite) obj;
        return peridotiteVar.wireman() == wireman() && Objects.equals(peridotiteVar.marial(), marial()) && Objects.equals(peridotiteVar.impromptu(), impromptu()) && Objects.equals(peridotiteVar.competently(), competently()) && Objects.equals(peridotiteVar.dern(), dern()) && peridotiteVar.beachfront() == beachfront();
    }

    public int hashCode() {
        return Objects.hash(peridotite.class, Integer.valueOf(this.f14638attabal), this.f14642saneness, this.f14640dern, this.f14643wireman, this.f14641marial, Integer.valueOf(this.f14639beachfront));
    }

    public wireman impromptu() {
        return this.f14640dern;
    }

    public BigInteger marial() {
        return this.f14642saneness;
    }

    public String toString() {
        return "RSA SSA PSS Parameters (variant: " + this.f14640dern + ", signature hashType: " + this.f14643wireman + ", mgf1 hashType: " + this.f14641marial + ", saltLengthBytes: " + this.f14639beachfront + ", publicExponent: " + this.f14642saneness + ", and " + this.f14638attabal + "-bit modulus)";
    }

    public int wireman() {
        return this.f14638attabal;
    }

    public peridotite(int i, BigInteger bigInteger, wireman wiremanVar, dern dernVar, dern dernVar2, int i2) {
        this.f14638attabal = i;
        this.f14642saneness = bigInteger;
        this.f14640dern = wiremanVar;
        this.f14643wireman = dernVar;
        this.f14641marial = dernVar2;
        this.f14639beachfront = i2;
    }
}
