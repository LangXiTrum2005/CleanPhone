package androidx.media3.common;

/* JADX INFO: compiled from: FrameInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f11083attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f11084dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f11085marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f11086saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f11087wireman;

    /* JADX INFO: compiled from: FrameInfo.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public impromptu f11088attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f11089dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f11090marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f11091saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f11092wireman = 1.0f;

        public saneness(impromptu impromptuVar, int i, int i2) {
            this.f11088attabal = impromptuVar;
            this.f11091saneness = i;
            this.f11089dern = i2;
        }

        public molybdenite attabal() {
            return new molybdenite(this.f11088attabal, this.f11091saneness, this.f11089dern, this.f11092wireman, this.f11090marial);
        }

        public saneness saneness(float f) {
            this.f11092wireman = f;
            return this;
        }
    }

    public molybdenite(impromptu impromptuVar, int i, int i2, float f, long j) {
        decarock.attabal.saneness(i > 0, "width must be positive, but is: " + i);
        decarock.attabal.saneness(i2 > 0, "height must be positive, but is: " + i2);
        this.f11083attabal = impromptuVar;
        this.f11086saneness = i;
        this.f11084dern = i2;
        this.f11087wireman = f;
        this.f11085marial = j;
    }
}
