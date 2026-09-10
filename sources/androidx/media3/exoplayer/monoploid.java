package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid implements coi {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f12126apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f12127arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float f12128attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f12129beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final float f12130competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public long f12131cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f12132dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public long f12133formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public long f12134impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public long f12135impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f12136kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f12137marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public long f12138molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public long f12139monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public long f12140polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f12141saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public long f12142taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f12143triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final float f12144wireman;

    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public float f12145attabal = 0.97f;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f12150saneness = 1.03f;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f12148dern = 1000;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f12151wireman = 1.0E-7f;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f12149marial = decarock.grimness.outmarry(20);

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public long f12146beachfront = decarock.grimness.outmarry(500);

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f12147competently = 0.999f;

        public monoploid attabal() {
            return new monoploid(this.f12145attabal, this.f12150saneness, this.f12148dern, this.f12151wireman, this.f12149marial, this.f12146beachfront, this.f12147competently);
        }
    }

    public static long impromptu(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    @Override // androidx.media3.exoplayer.coi
    public void attabal(androidx.media3.common.adultoid.competently competentlyVar) {
        this.f12135impromptu = decarock.grimness.outmarry(competentlyVar.f10675attabal);
        this.f12126apical = decarock.grimness.outmarry(competentlyVar.f10678saneness);
        this.f12133formularize = decarock.grimness.outmarry(competentlyVar.f10676dern);
        float f = competentlyVar.f10679wireman;
        if (f == -3.4028235E38f) {
            f = this.f12128attabal;
        }
        this.f12136kowloon = f;
        float f2 = competentlyVar.f10677marial;
        if (f2 == -3.4028235E38f) {
            f2 = this.f12141saneness;
        }
        this.f12143triweekly = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f12135impromptu = C.TIME_UNSET;
        }
        competently();
    }

    public final void beachfront(long j) {
        long j2 = this.f12140polloi + (this.f12138molybdenite * 3);
        if (this.f12134impassible > j2) {
            float fOutmarry = decarock.grimness.outmarry(this.f12132dern);
            this.f12134impassible = com.google.common.primitives.beachfront.dern(j2, this.f12131cutely, this.f12134impassible - (((long) ((this.f12127arytenoidectomy - 1.0f) * fOutmarry)) + ((long) ((this.f12143triweekly - 1.0f) * fOutmarry))));
            return;
        }
        long jArytenoidectomy = decarock.grimness.arytenoidectomy(j - ((long) (Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f12127arytenoidectomy - 1.0f) / this.f12144wireman)), this.f12134impassible, j2);
        this.f12134impassible = jArytenoidectomy;
        long j3 = this.f12133formularize;
        if (j3 == C.TIME_UNSET || jArytenoidectomy <= j3) {
            return;
        }
        this.f12134impassible = j3;
    }

    public final void competently() {
        long j;
        long j2 = this.f12135impromptu;
        if (j2 != C.TIME_UNSET) {
            j = this.f12142taiyuan;
            if (j == C.TIME_UNSET) {
                long j3 = this.f12126apical;
                if (j3 != C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.f12133formularize;
                if (j == C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f12131cutely == j) {
            return;
        }
        this.f12131cutely = j;
        this.f12134impassible = j;
        this.f12140polloi = C.TIME_UNSET;
        this.f12138molybdenite = C.TIME_UNSET;
        this.f12139monoploid = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.coi
    public long dern() {
        return this.f12134impassible;
    }

    @Override // androidx.media3.exoplayer.coi
    public void marial(long j) {
        this.f12142taiyuan = j;
        competently();
    }

    @Override // androidx.media3.exoplayer.coi
    public float saneness(long j, long j2) {
        if (this.f12135impromptu == C.TIME_UNSET) {
            return 1.0f;
        }
        taiyuan(j, j2);
        if (this.f12139monoploid != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.f12139monoploid < this.f12132dern) {
            return this.f12127arytenoidectomy;
        }
        this.f12139monoploid = SystemClock.elapsedRealtime();
        beachfront(j);
        long j3 = j - this.f12134impassible;
        if (Math.abs(j3) < this.f12137marial) {
            this.f12127arytenoidectomy = 1.0f;
        } else {
            this.f12127arytenoidectomy = decarock.grimness.triweekly((this.f12144wireman * j3) + 1.0f, this.f12136kowloon, this.f12143triweekly);
        }
        return this.f12127arytenoidectomy;
    }

    public final void taiyuan(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f12140polloi;
        if (j4 == C.TIME_UNSET) {
            this.f12140polloi = j3;
            this.f12138molybdenite = 0L;
        } else {
            long jMax = Math.max(j3, impromptu(j4, j3, this.f12130competently));
            this.f12140polloi = jMax;
            this.f12138molybdenite = impromptu(this.f12138molybdenite, Math.abs(j3 - jMax), this.f12130competently);
        }
    }

    @Override // androidx.media3.exoplayer.coi
    public void wireman() {
        long j = this.f12134impassible;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.f12129beachfront;
        this.f12134impassible = j2;
        long j3 = this.f12133formularize;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.f12134impassible = j3;
        }
        this.f12139monoploid = C.TIME_UNSET;
    }

    public monoploid(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f12128attabal = f;
        this.f12141saneness = f2;
        this.f12132dern = j;
        this.f12144wireman = f3;
        this.f12137marial = j2;
        this.f12129beachfront = j3;
        this.f12130competently = f4;
        this.f12135impromptu = C.TIME_UNSET;
        this.f12142taiyuan = C.TIME_UNSET;
        this.f12126apical = C.TIME_UNSET;
        this.f12133formularize = C.TIME_UNSET;
        this.f12136kowloon = f;
        this.f12143triweekly = f2;
        this.f12127arytenoidectomy = 1.0f;
        this.f12139monoploid = C.TIME_UNSET;
        this.f12131cutely = C.TIME_UNSET;
        this.f12134impassible = C.TIME_UNSET;
        this.f12140polloi = C.TIME_UNSET;
        this.f12138molybdenite = C.TIME_UNSET;
    }
}
