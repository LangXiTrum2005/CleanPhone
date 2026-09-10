package curiousness;

import java.util.Objects;

/* JADX INFO: compiled from: LegacyKmsAeadParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saran extends dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f24464attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f24465saneness;

    /* JADX INFO: compiled from: LegacyKmsAeadParameters.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f24466attabal = new attabal("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f24467saneness = new attabal("NO_PREFIX");
        private final String name;

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public saran(String str, attabal attabalVar) {
        this.f24464attabal = str;
        this.f24465saneness = attabalVar;
    }

    public static saran saneness(String str, attabal attabalVar) {
        return new saran(str, attabalVar);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24465saneness != attabal.f24467saneness;
    }

    public String dern() {
        return this.f24464attabal;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof saran)) {
            return false;
        }
        saran saranVar = (saran) obj;
        return saranVar.f24464attabal.equals(this.f24464attabal) && saranVar.f24465saneness.equals(this.f24465saneness);
    }

    public int hashCode() {
        return Objects.hash(saran.class, this.f24464attabal, this.f24465saneness);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f24464attabal + ", variant: " + this.f24465saneness + ")";
    }

    public attabal wireman() {
        return this.f24465saneness;
    }
}
