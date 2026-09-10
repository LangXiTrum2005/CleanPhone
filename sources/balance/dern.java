package balance;

import android.util.Pair;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.merc;
import cybernatic.polder;
import decarock.grimness;

/* JADX INFO: compiled from: MlltSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long[] f14887attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f14888dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f14889saneness;

    public dern(long[] jArr, long[] jArr2, long j) {
        this.f14887attabal = jArr;
        this.f14889saneness = jArr2;
        this.f14888dern = j == C.TIME_UNSET ? grimness.outmarry(jArr2[jArr2.length - 1]) : j;
    }

    public static dern attabal(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.f13079molybdenite.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.f13080monoploid + mlltFrame.f13079molybdenite[i3]);
            j3 += (long) (mlltFrame.f13081polloi + mlltFrame.f13078graveside[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new dern(jArr, jArr2, j2);
    }

    public static Pair<Long, Long> saneness(long j, long[] jArr, long[] jArr2) {
        int iCompetently = grimness.competently(jArr, j, true, true);
        long j2 = jArr[iCompetently];
        long j3 = jArr2[iCompetently];
        int i = iCompetently + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // balance.competently
    public int competently() {
        return -2147483647;
    }

    @Override // balance.competently
    public long dern() {
        return -1L;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f14888dern;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        Pair<Long, Long> pairSaneness = saneness(grimness.sultanate(grimness.arytenoidectomy(j, 0L, this.f14888dern)), this.f14889saneness, this.f14887attabal);
        return new merc.attabal(new polder(grimness.outmarry(((Long) pairSaneness.first).longValue()), ((Long) pairSaneness.second).longValue()));
    }

    @Override // balance.competently
    public long getTimeUs(long j) {
        return grimness.outmarry(((Long) saneness(j, this.f14887attabal, this.f14889saneness).second).longValue());
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }
}
