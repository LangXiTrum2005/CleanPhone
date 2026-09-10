package balance;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.merc;
import cybernatic.polder;
import cybernatic.sealless;
import decarock.grimness;

/* JADX INFO: compiled from: XingSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f14880attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f14881beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long[] f14882competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f14883dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f14884marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f14885saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f14886wireman;

    public cutely(long j, int i, long j2, int i2) {
        this(j, i, j2, i2, -1L, null);
    }

    public static cutely attabal(taiyuan taiyuanVar, long j) {
        long[] jArr;
        long jAttabal = taiyuanVar.attabal();
        if (jAttabal == C.TIME_UNSET) {
            return null;
        }
        long j2 = taiyuanVar.f14902dern;
        if (j2 == -1 || (jArr = taiyuanVar.f14901beachfront) == null) {
            sealless.attabal attabalVar = taiyuanVar.f14900attabal;
            return new cutely(j, attabalVar.f24769dern, jAttabal, attabalVar.f24767beachfront);
        }
        sealless.attabal attabalVar2 = taiyuanVar.f14900attabal;
        return new cutely(j, attabalVar2.f24769dern, jAttabal, attabalVar2.f24767beachfront, j2, jArr);
    }

    @Override // balance.competently
    public int competently() {
        return this.f14886wireman;
    }

    @Override // balance.competently
    public long dern() {
        return this.f14881beachfront;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f14883dern;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        if (!isSeekable()) {
            return new merc.attabal(new polder(0L, this.f14880attabal + ((long) this.f14885saneness)));
        }
        long jArytenoidectomy = grimness.arytenoidectomy(j, 0L, this.f14883dern);
        double d = (jArytenoidectomy * 100.0d) / this.f14883dern;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) decarock.attabal.taiyuan(this.f14882competently);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new merc.attabal(new polder(jArytenoidectomy, this.f14880attabal + grimness.arytenoidectomy(Math.round((d2 / 256.0d) * this.f14884marial), this.f14885saneness, this.f14884marial - 1)));
    }

    @Override // balance.competently
    public long getTimeUs(long j) {
        long j2 = j - this.f14880attabal;
        if (!isSeekable() || j2 <= this.f14885saneness) {
            return 0L;
        }
        long[] jArr = (long[]) decarock.attabal.taiyuan(this.f14882competently);
        double d = (j2 * 256.0d) / this.f14884marial;
        int iCompetently = grimness.competently(jArr, (long) d, true, true);
        long jSaneness = saneness(iCompetently);
        long j3 = jArr[iCompetently];
        int i = iCompetently + 1;
        long jSaneness2 = saneness(i);
        long j4 = iCompetently == 99 ? 256L : jArr[i];
        return jSaneness + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jSaneness2 - jSaneness));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return this.f14882competently != null;
    }

    public final long saneness(int i) {
        return (this.f14883dern * ((long) i)) / 100;
    }

    public cutely(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f14880attabal = j;
        this.f14885saneness = i;
        this.f14883dern = j2;
        this.f14886wireman = i2;
        this.f14884marial = j3;
        this.f14882competently = jArr;
        this.f14881beachfront = j3 != -1 ? j + j3 : -1L;
    }
}
