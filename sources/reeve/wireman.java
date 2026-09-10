package reeve;

/* JADX INFO: compiled from: Settings.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f36179attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final double f36180beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final double f36181competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f36182dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f36183impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f36184marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f36185saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f36186wireman;

    /* JADX INFO: compiled from: Settings.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f36187attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final boolean f36188dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final boolean f36189saneness;

        public attabal(boolean z, boolean z2, boolean z3) {
            this.f36187attabal = z;
            this.f36189saneness = z2;
            this.f36188dern = z3;
        }
    }

    /* JADX INFO: compiled from: Settings.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f36190attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f36191saneness;

        public saneness(int i, int i2) {
            this.f36190attabal = i;
            this.f36191saneness = i2;
        }
    }

    public wireman(long j, saneness sanenessVar, attabal attabalVar, int i, int i2, double d, double d2, int i3) {
        this.f36182dern = j;
        this.f36179attabal = sanenessVar;
        this.f36185saneness = attabalVar;
        this.f36186wireman = i;
        this.f36184marial = i2;
        this.f36180beachfront = d;
        this.f36181competently = d2;
        this.f36183impromptu = i3;
    }

    public boolean attabal(long j) {
        return this.f36182dern < j;
    }
}
