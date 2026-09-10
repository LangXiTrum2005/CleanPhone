package curiousness;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesEaxParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class arytenoidectomy extends curiousness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24318attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24319dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24320saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final dern f24321wireman;

    /* JADX INFO: compiled from: AesEaxParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f24322attabal = new dern("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f24324saneness = new dern("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f24323dern = new dern("NO_PREFIX");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: AesEaxParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f24325attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24326dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public Integer f24327saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public dern f24328wireman;

        public arytenoidectomy attabal() throws GeneralSecurityException {
            Integer num = this.f24325attabal;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f24327saneness == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f24328wireman == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f24326dern != null) {
                return new arytenoidectomy(num.intValue(), this.f24327saneness.intValue(), this.f24326dern.intValue(), this.f24328wireman);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public saneness dern(int i) throws GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.f24325attabal = Integer.valueOf(i);
            return this;
        }

        public saneness marial(dern dernVar) {
            this.f24328wireman = dernVar;
            return this;
        }

        public saneness saneness(int i) throws GeneralSecurityException {
            if (i != 12 && i != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
            }
            this.f24327saneness = Integer.valueOf(i);
            return this;
        }

        public saneness wireman(int i) throws GeneralSecurityException {
            if (i < 0 || i > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i)));
            }
            this.f24326dern = Integer.valueOf(i);
            return this;
        }

        public saneness() {
            this.f24325attabal = null;
            this.f24327saneness = null;
            this.f24326dern = null;
            this.f24328wireman = dern.f24323dern;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24321wireman != dern.f24323dern;
    }

    public dern beachfront() {
        return this.f24321wireman;
    }

    public int dern() {
        return this.f24320saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof arytenoidectomy)) {
            return false;
        }
        arytenoidectomy arytenoidectomyVar = (arytenoidectomy) obj;
        return arytenoidectomyVar.wireman() == wireman() && arytenoidectomyVar.dern() == dern() && arytenoidectomyVar.marial() == marial() && arytenoidectomyVar.beachfront() == beachfront();
    }

    public int hashCode() {
        return Objects.hash(arytenoidectomy.class, Integer.valueOf(this.f24318attabal), Integer.valueOf(this.f24320saneness), Integer.valueOf(this.f24319dern), this.f24321wireman);
    }

    public int marial() {
        return this.f24319dern;
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f24321wireman + ", " + this.f24320saneness + "-byte IV, " + this.f24319dern + "-byte tag, and " + this.f24318attabal + "-byte key)";
    }

    public int wireman() {
        return this.f24318attabal;
    }

    public arytenoidectomy(int i, int i2, int i3, dern dernVar) {
        this.f24318attabal = i;
        this.f24320saneness = i2;
        this.f24319dern = i3;
        this.f24321wireman = dernVar;
    }
}
