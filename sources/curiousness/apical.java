package curiousness;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCtrHmacAeadParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class apical extends curiousness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24298attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final dern f24299beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f24300dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final wireman f24301marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24302saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f24303wireman;

    /* JADX INFO: compiled from: AesCtrHmacAeadParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f24304attabal = new dern("SHA1");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f24307saneness = new dern("SHA224");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f24305dern = new dern("SHA256");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final dern f24308wireman = new dern("SHA384");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final dern f24306marial = new dern("SHA512");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: AesCtrHmacAeadParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public Integer f24309attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public wireman f24310beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24311dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public dern f24312marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public Integer f24313saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public Integer f24314wireman;

        public static void impromptu(int i, dern dernVar) throws GeneralSecurityException {
            if (dernVar == dern.f24304attabal) {
                if (i > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i)));
                }
                return;
            }
            if (dernVar == dern.f24307saneness) {
                if (i > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i)));
                }
                return;
            }
            if (dernVar == dern.f24305dern) {
                if (i > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i)));
                }
            } else if (dernVar == dern.f24308wireman) {
                if (i > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i)));
                }
            } else {
                if (dernVar != dern.f24306marial) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i)));
                }
            }
        }

        public apical attabal() throws GeneralSecurityException {
            if (this.f24309attabal == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f24313saneness == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f24311dern == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f24314wireman;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f24312marial == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f24310beachfront == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            impromptu(num.intValue(), this.f24312marial);
            return new apical(this.f24309attabal.intValue(), this.f24313saneness.intValue(), this.f24311dern.intValue(), this.f24314wireman.intValue(), this.f24310beachfront, this.f24312marial);
        }

        public saneness beachfront(int i) throws GeneralSecurityException {
            if (i < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
            }
            this.f24314wireman = Integer.valueOf(i);
            return this;
        }

        public saneness competently(wireman wiremanVar) {
            this.f24310beachfront = wiremanVar;
            return this;
        }

        public saneness dern(dern dernVar) {
            this.f24312marial = dernVar;
            return this;
        }

        public saneness marial(int i) throws GeneralSecurityException {
            if (i < 12 || i > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
            }
            this.f24311dern = Integer.valueOf(i);
            return this;
        }

        public saneness saneness(int i) throws GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.f24309attabal = Integer.valueOf(i);
            return this;
        }

        public saneness wireman(int i) throws GeneralSecurityException {
            if (i < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
            }
            this.f24313saneness = Integer.valueOf(i);
            return this;
        }

        public saneness() {
            this.f24309attabal = null;
            this.f24313saneness = null;
            this.f24311dern = null;
            this.f24314wireman = null;
            this.f24312marial = null;
            this.f24310beachfront = wireman.f24316dern;
        }
    }

    /* JADX INFO: compiled from: AesCtrHmacAeadParameters.java */
    public static final class wireman {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f24315attabal = new wireman("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f24317saneness = new wireman("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final wireman f24316dern = new wireman("NO_PREFIX");

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
        return this.f24301marial != wireman.f24316dern;
    }

    public int beachfront() {
        return this.f24300dern;
    }

    public int competently() {
        return this.f24303wireman;
    }

    public int dern() {
        return this.f24298attabal;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof apical)) {
            return false;
        }
        apical apicalVar = (apical) obj;
        return apicalVar.dern() == dern() && apicalVar.marial() == marial() && apicalVar.beachfront() == beachfront() && apicalVar.competently() == competently() && apicalVar.impromptu() == impromptu() && apicalVar.wireman() == wireman();
    }

    public int hashCode() {
        return Objects.hash(apical.class, Integer.valueOf(this.f24298attabal), Integer.valueOf(this.f24302saneness), Integer.valueOf(this.f24300dern), Integer.valueOf(this.f24303wireman), this.f24301marial, this.f24299beachfront);
    }

    public wireman impromptu() {
        return this.f24301marial;
    }

    public int marial() {
        return this.f24302saneness;
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f24301marial + ", hashType: " + this.f24299beachfront + ", " + this.f24300dern + "-byte IV, and " + this.f24303wireman + "-byte tags, and " + this.f24298attabal + "-byte AES key, and " + this.f24302saneness + "-byte HMAC key)";
    }

    public dern wireman() {
        return this.f24299beachfront;
    }

    public apical(int i, int i2, int i3, int i4, wireman wiremanVar, dern dernVar) {
        this.f24298attabal = i;
        this.f24302saneness = i2;
        this.f24300dern = i3;
        this.f24303wireman = i4;
        this.f24301marial = wiremanVar;
        this.f24299beachfront = dernVar;
    }
}
