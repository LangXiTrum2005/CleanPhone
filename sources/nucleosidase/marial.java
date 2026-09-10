package nucleosidase;

/* JADX INFO: compiled from: TimeWindow.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final marial f33978dern = new attabal().attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f33979attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f33980saneness;

    /* JADX INFO: compiled from: TimeWindow.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f33981attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f33982saneness = 0;

        public marial attabal() {
            return new marial(this.f33981attabal, this.f33982saneness);
        }

        public attabal dern(long j) {
            this.f33981attabal = j;
            return this;
        }

        public attabal saneness(long j) {
            this.f33982saneness = j;
            return this;
        }
    }

    public marial(long j, long j2) {
        this.f33979attabal = j;
        this.f33980saneness = j2;
    }

    public static attabal dern() {
        return new attabal();
    }

    public long attabal() {
        return this.f33980saneness;
    }

    public long saneness() {
        return this.f33979attabal;
    }
}
