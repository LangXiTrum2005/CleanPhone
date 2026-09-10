package curiousness;

import java.util.Objects;

/* JADX INFO: compiled from: XChaCha20Poly1305Parameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gusty extends dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f24389attabal;

    /* JADX INFO: compiled from: XChaCha20Poly1305Parameters.java */
    public static final class attabal {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f24390attabal = new attabal("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f24392saneness = new attabal("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final attabal f24391dern = new attabal("NO_PREFIX");

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public gusty(attabal attabalVar) {
        this.f24389attabal = attabalVar;
    }

    public static gusty saneness(attabal attabalVar) {
        return new gusty(attabalVar);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24389attabal != attabal.f24391dern;
    }

    public attabal dern() {
        return this.f24389attabal;
    }

    public boolean equals(Object obj) {
        return (obj instanceof gusty) && ((gusty) obj).dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(gusty.class, this.f24389attabal);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f24389attabal + ")";
    }
}
