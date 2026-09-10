package astronautic;

import java.util.Objects;

/* JADX INFO: compiled from: MlDsaParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends timberyard {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f14631attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final saneness f14632saneness;

    /* JADX INFO: compiled from: MlDsaParameters.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f14633attabal = new attabal("ML_DSA_65");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f14634saneness = new attabal("ML_DSA_87");
        private final String name;

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: MlDsaParameters.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f14635attabal = new saneness("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final saneness f14636saneness = new saneness("NO_PREFIX");
        private final String name;

        public saneness(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public monoploid(attabal attabalVar, saneness sanenessVar) {
        this.f14631attabal = attabalVar;
        this.f14632saneness = sanenessVar;
    }

    public static monoploid saneness(attabal attabalVar, saneness sanenessVar) {
        return new monoploid(attabalVar, sanenessVar);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f14632saneness != saneness.f14636saneness;
    }

    public attabal dern() {
        return this.f14631attabal;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof monoploid)) {
            return false;
        }
        monoploid monoploidVar = (monoploid) obj;
        return monoploidVar.dern() == dern() && monoploidVar.wireman() == wireman();
    }

    public int hashCode() {
        return Objects.hash(monoploid.class, this.f14631attabal, this.f14632saneness);
    }

    public String toString() {
        return "ML-DSA Parameters (ML-DSA instance: " + this.f14631attabal + ", variant: " + this.f14632saneness + ")";
    }

    public saneness wireman() {
        return this.f14632saneness;
    }
}
