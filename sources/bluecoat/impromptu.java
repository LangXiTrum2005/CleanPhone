package bluecoat;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f15101beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f15102dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f15105wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public attabal f15100attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f15104saneness = new attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f15103marial = C.TIME_UNSET;

    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f15106attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f15107beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final boolean[] f15108competently = new boolean[15];

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f15109dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f15110impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f15111marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f15112saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f15113wireman;

        public static int dern(long j) {
            return (int) (j % 15);
        }

        public long attabal() {
            long j = this.f15111marial;
            if (j == 0) {
                return 0L;
            }
            return this.f15107beachfront / j;
        }

        public void beachfront(long j) {
            long j2 = this.f15113wireman;
            if (j2 == 0) {
                this.f15106attabal = j;
            } else if (j2 == 1) {
                long j3 = j - this.f15106attabal;
                this.f15112saneness = j3;
                this.f15107beachfront = j3;
                this.f15111marial = 1L;
            } else {
                long j4 = j - this.f15109dern;
                int iDern = dern(j2);
                if (Math.abs(j4 - this.f15112saneness) <= 1000000) {
                    this.f15111marial++;
                    this.f15107beachfront += j4;
                    boolean[] zArr = this.f15108competently;
                    if (zArr[iDern]) {
                        zArr[iDern] = false;
                        this.f15110impromptu--;
                    }
                } else {
                    boolean[] zArr2 = this.f15108competently;
                    if (!zArr2[iDern]) {
                        zArr2[iDern] = true;
                        this.f15110impromptu++;
                    }
                }
            }
            this.f15113wireman++;
            this.f15109dern = j;
        }

        public void competently() {
            this.f15113wireman = 0L;
            this.f15111marial = 0L;
            this.f15107beachfront = 0L;
            this.f15110impromptu = 0;
            Arrays.fill(this.f15108competently, false);
        }

        public boolean marial() {
            return this.f15113wireman > 15 && this.f15110impromptu == 0;
        }

        public long saneness() {
            return this.f15107beachfront;
        }

        public boolean wireman() {
            long j = this.f15113wireman;
            if (j == 0) {
                return false;
            }
            return this.f15108competently[dern(j - 1)];
        }
    }

    public long attabal() {
        return marial() ? this.f15100attabal.attabal() : C.TIME_UNSET;
    }

    public void beachfront(long j) {
        this.f15100attabal.beachfront(j);
        if (this.f15100attabal.marial() && !this.f15105wireman) {
            this.f15102dern = false;
        } else if (this.f15103marial != C.TIME_UNSET) {
            if (!this.f15102dern || this.f15104saneness.wireman()) {
                this.f15104saneness.competently();
                this.f15104saneness.beachfront(this.f15103marial);
            }
            this.f15102dern = true;
            this.f15104saneness.beachfront(j);
        }
        if (this.f15102dern && this.f15104saneness.marial()) {
            attabal attabalVar = this.f15100attabal;
            this.f15100attabal = this.f15104saneness;
            this.f15104saneness = attabalVar;
            this.f15102dern = false;
            this.f15105wireman = false;
        }
        this.f15103marial = j;
        this.f15101beachfront = this.f15100attabal.marial() ? 0 : this.f15101beachfront + 1;
    }

    public void competently() {
        this.f15100attabal.competently();
        this.f15104saneness.competently();
        this.f15102dern = false;
        this.f15103marial = C.TIME_UNSET;
        this.f15101beachfront = 0;
    }

    public int dern() {
        return this.f15101beachfront;
    }

    public boolean marial() {
        return this.f15100attabal.marial();
    }

    public float saneness() {
        if (marial()) {
            return (float) (1.0E9d / this.f15100attabal.attabal());
        }
        return -1.0f;
    }

    public long wireman() {
        return marial() ? this.f15100attabal.saneness() : C.TIME_UNSET;
    }
}
