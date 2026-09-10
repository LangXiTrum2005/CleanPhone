package androidx.work;

/* JADX INFO: compiled from: Constraints.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final saneness f14205taiyuan = new attabal().attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public NetworkType f14206attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f14207beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f14208competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f14209dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public dern f14210impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f14211marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f14212saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f14213wireman;

    /* JADX INFO: compiled from: Constraints.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f14214attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f14220saneness = false;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public NetworkType f14217dern = NetworkType.NOT_REQUIRED;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f14221wireman = false;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public boolean f14219marial = false;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f14215beachfront = -1;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public long f14216competently = -1;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public dern f14218impromptu = new dern();

        public saneness attabal() {
            return new saneness(this);
        }

        public attabal saneness(NetworkType networkType) {
            this.f14217dern = networkType;
            return this;
        }
    }

    public saneness() {
        this.f14206attabal = NetworkType.NOT_REQUIRED;
        this.f14207beachfront = -1L;
        this.f14208competently = -1L;
        this.f14210impromptu = new dern();
    }

    public void apical(NetworkType networkType) {
        this.f14206attabal = networkType;
    }

    public void arytenoidectomy(long j) {
        this.f14207beachfront = j;
    }

    public dern attabal() {
        return this.f14210impromptu;
    }

    public boolean beachfront() {
        return this.f14213wireman;
    }

    public boolean competently() {
        return this.f14212saneness;
    }

    public void cutely(dern dernVar) {
        this.f14210impromptu = dernVar;
    }

    public long dern() {
        return this.f14207beachfront;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || saneness.class != obj.getClass()) {
            return false;
        }
        saneness sanenessVar = (saneness) obj;
        if (this.f14212saneness == sanenessVar.f14212saneness && this.f14209dern == sanenessVar.f14209dern && this.f14213wireman == sanenessVar.f14213wireman && this.f14211marial == sanenessVar.f14211marial && this.f14207beachfront == sanenessVar.f14207beachfront && this.f14208competently == sanenessVar.f14208competently && this.f14206attabal == sanenessVar.f14206attabal) {
            return this.f14210impromptu.equals(sanenessVar.f14210impromptu);
        }
        return false;
    }

    public void formularize(boolean z) {
        this.f14213wireman = z;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f14206attabal.hashCode() * 31) + (this.f14212saneness ? 1 : 0)) * 31) + (this.f14209dern ? 1 : 0)) * 31) + (this.f14213wireman ? 1 : 0)) * 31) + (this.f14211marial ? 1 : 0)) * 31;
        long j = this.f14207beachfront;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f14208competently;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f14210impromptu.hashCode();
    }

    public void impassible(boolean z) {
        this.f14212saneness = z;
    }

    public boolean impromptu() {
        return this.f14209dern;
    }

    public void kowloon(boolean z) {
        this.f14211marial = z;
    }

    public boolean marial() {
        return this.f14210impromptu.dern() > 0;
    }

    public void monoploid(long j) {
        this.f14208competently = j;
    }

    public NetworkType saneness() {
        return this.f14206attabal;
    }

    public boolean taiyuan() {
        return this.f14211marial;
    }

    public void triweekly(boolean z) {
        this.f14209dern = z;
    }

    public long wireman() {
        return this.f14208competently;
    }

    public saneness(attabal attabalVar) {
        this.f14206attabal = NetworkType.NOT_REQUIRED;
        this.f14207beachfront = -1L;
        this.f14208competently = -1L;
        this.f14210impromptu = new dern();
        this.f14212saneness = attabalVar.f14214attabal;
        this.f14209dern = attabalVar.f14220saneness;
        this.f14206attabal = attabalVar.f14217dern;
        this.f14213wireman = attabalVar.f14221wireman;
        this.f14211marial = attabalVar.f14219marial;
        this.f14210impromptu = attabalVar.f14218impromptu;
        this.f14207beachfront = attabalVar.f14215beachfront;
        this.f14208competently = attabalVar.f14216competently;
    }

    public saneness(saneness sanenessVar) {
        this.f14206attabal = NetworkType.NOT_REQUIRED;
        this.f14207beachfront = -1L;
        this.f14208competently = -1L;
        this.f14210impromptu = new dern();
        this.f14212saneness = sanenessVar.f14212saneness;
        this.f14209dern = sanenessVar.f14209dern;
        this.f14206attabal = sanenessVar.f14206attabal;
        this.f14213wireman = sanenessVar.f14213wireman;
        this.f14211marial = sanenessVar.f14211marial;
        this.f14210impromptu = sanenessVar.f14210impromptu;
    }
}
