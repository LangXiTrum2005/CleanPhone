package curiousness;

import java.util.Objects;

/* JADX INFO: compiled from: ChaCha20Poly1305Parameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yemenite extends dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f24492attabal;

    /* JADX INFO: compiled from: ChaCha20Poly1305Parameters.java */
    public static final class attabal {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f24493attabal = new attabal("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f24495saneness = new attabal("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final attabal f24494dern = new attabal("NO_PREFIX");

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public yemenite(attabal attabalVar) {
        this.f24492attabal = attabalVar;
    }

    public static yemenite saneness(attabal attabalVar) {
        return new yemenite(attabalVar);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24492attabal != attabal.f24494dern;
    }

    public attabal dern() {
        return this.f24492attabal;
    }

    public boolean equals(Object obj) {
        return (obj instanceof yemenite) && ((yemenite) obj).dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(yemenite.class, this.f24492attabal);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f24492attabal + ")";
    }
}
