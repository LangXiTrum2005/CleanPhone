package curiousness;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: XAesGcmParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sensatory extends dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f24475attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24476saneness;

    /* JADX INFO: compiled from: XAesGcmParameters.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f24477attabal = new attabal("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f24478saneness = new attabal("NO_PREFIX");
        private final String name;

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public sensatory(attabal attabalVar, int i) {
        this.f24475attabal = attabalVar;
        this.f24476saneness = i;
    }

    public static sensatory saneness(attabal attabalVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new sensatory(attabalVar, i);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24475attabal != attabal.f24478saneness;
    }

    public int dern() {
        return this.f24476saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sensatory)) {
            return false;
        }
        sensatory sensatoryVar = (sensatory) obj;
        return sensatoryVar.wireman() == wireman() && sensatoryVar.dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(sensatory.class, this.f24475attabal, Integer.valueOf(this.f24476saneness));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f24475attabal + "salt_size_bytes: " + this.f24476saneness + ")";
    }

    public attabal wireman() {
        return this.f24475attabal;
    }
}
