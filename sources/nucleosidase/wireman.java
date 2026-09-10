package nucleosidase;

/* JADX INFO: compiled from: StorageMetrics.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final wireman f33986dern = new attabal().attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f33987attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f33988saneness;

    /* JADX INFO: compiled from: StorageMetrics.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f33989attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f33990saneness = 0;

        public wireman attabal() {
            return new wireman(this.f33989attabal, this.f33990saneness);
        }

        public attabal dern(long j) {
            this.f33990saneness = j;
            return this;
        }

        public attabal saneness(long j) {
            this.f33989attabal = j;
            return this;
        }
    }

    public wireman(long j, long j2) {
        this.f33987attabal = j;
        this.f33988saneness = j2;
    }

    public static attabal dern() {
        return new attabal();
    }

    public long attabal() {
        return this.f33987attabal;
    }

    public long saneness() {
        return this.f33988saneness;
    }
}
