package astronautic;

import java.util.Objects;

/* JADX INFO: compiled from: Ed25519Parameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends timberyard {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f14724attabal;

    /* JADX INFO: compiled from: Ed25519Parameters.java */
    public static final class attabal {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f14725attabal = new attabal("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final attabal f14727saneness = new attabal("CRUNCHY");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final attabal f14726dern = new attabal("LEGACY");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final attabal f14728wireman = new attabal("NO_PREFIX");

        public attabal(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public taiyuan(attabal attabalVar) {
        this.f14724attabal = attabalVar;
    }

    public static taiyuan saneness(attabal attabalVar) {
        return new taiyuan(attabalVar);
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f14724attabal != attabal.f14728wireman;
    }

    public attabal dern() {
        return this.f14724attabal;
    }

    public boolean equals(Object obj) {
        return (obj instanceof taiyuan) && ((taiyuan) obj).dern() == dern();
    }

    public int hashCode() {
        return Objects.hash(taiyuan.class, this.f14724attabal);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f14724attabal + ")";
    }
}
