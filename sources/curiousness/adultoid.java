package curiousness;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class adultoid extends curiousness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24287attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24288dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24289saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f24290wireman;

    /* JADX INFO: compiled from: AesGcmParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f24291attabal = new dern("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f24293saneness = new dern("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f24292dern = new dern("NO_PREFIX");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: AesGcmParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f24294attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24295dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public Integer f24296saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public dern f24297wireman;

        public adultoid attabal() throws GeneralSecurityException {
            Integer num = this.f24294attabal;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f24297wireman == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f24296saneness == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f24295dern != null) {
                return new adultoid(num.intValue(), this.f24296saneness.intValue(), this.f24295dern.intValue(), this.f24297wireman);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public saneness dern(int i) throws GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.f24294attabal = Integer.valueOf(i);
            return this;
        }

        public saneness marial(dern dernVar) {
            this.f24297wireman = dernVar;
            return this;
        }

        public saneness saneness(int i) throws GeneralSecurityException {
            if (i <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i)));
            }
            this.f24296saneness = Integer.valueOf(i);
            return this;
        }

        public saneness wireman(int i) throws GeneralSecurityException {
            if (i < 12 || i > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i)));
            }
            this.f24295dern = Integer.valueOf(i);
            return this;
        }

        public saneness() {
            this.f24294attabal = null;
            this.f24296saneness = null;
            this.f24295dern = null;
            this.f24297wireman = dern.f24292dern;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24290wireman != dern.f24292dern;
    }

    public dern beachfront() {
        return this.f24290wireman;
    }

    public int dern() {
        return this.f24289saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof adultoid)) {
            return false;
        }
        adultoid adultoidVar = (adultoid) obj;
        return adultoidVar.wireman() == wireman() && adultoidVar.dern() == dern() && adultoidVar.marial() == marial() && adultoidVar.beachfront() == beachfront();
    }

    public int hashCode() {
        return Objects.hash(adultoid.class, Integer.valueOf(this.f24287attabal), Integer.valueOf(this.f24289saneness), Integer.valueOf(this.f24288dern), this.f24290wireman);
    }

    public int marial() {
        return this.f24288dern;
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f24290wireman + ", " + this.f24289saneness + "-byte IV, " + this.f24288dern + "-byte tag, and " + this.f24287attabal + "-byte key)";
    }

    public int wireman() {
        return this.f24287attabal;
    }

    public adultoid(int i, int i2, int i3, dern dernVar) {
        this.f24287attabal = i;
        this.f24289saneness = i2;
        this.f24288dern = i3;
        this.f24290wireman = dernVar;
    }
}
