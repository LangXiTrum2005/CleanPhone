package balance;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.merc;
import cybernatic.polder;
import decarock.grimness;
import decarock.kowloon;
import java.math.RoundingMode;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f14895attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final kowloon f14896dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public long f14897marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kowloon f14898saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f14899wireman;

    public saneness(long j, long j2, long j3) {
        this.f14897marial = j;
        this.f14895attabal = j3;
        kowloon kowloonVar = new kowloon();
        this.f14898saneness = kowloonVar;
        kowloon kowloonVar2 = new kowloon();
        this.f14896dern = kowloonVar2;
        kowloonVar.attabal(0L);
        kowloonVar2.attabal(j2);
        int i = -2147483647;
        if (j == C.TIME_UNSET) {
            this.f14899wireman = -2147483647;
            return;
        }
        long jSakeen = grimness.sakeen(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jSakeen > 0 && jSakeen <= 2147483647L) {
            i = (int) jSakeen;
        }
        this.f14899wireman = i;
    }

    public boolean attabal(long j) {
        kowloon kowloonVar = this.f14898saneness;
        return j - kowloonVar.saneness(kowloonVar.dern() - 1) < 100000;
    }

    @Override // balance.competently
    public int competently() {
        return this.f14899wireman;
    }

    @Override // balance.competently
    public long dern() {
        return this.f14895attabal;
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f14897marial;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        int iMarial = grimness.marial(this.f14898saneness, j, true, true);
        polder polderVar = new polder(this.f14898saneness.saneness(iMarial), this.f14896dern.saneness(iMarial));
        if (polderVar.f24722attabal == j || iMarial == this.f14898saneness.dern() - 1) {
            return new merc.attabal(polderVar);
        }
        int i = iMarial + 1;
        return new merc.attabal(polderVar, new polder(this.f14898saneness.saneness(i), this.f14896dern.saneness(i)));
    }

    @Override // balance.competently
    public long getTimeUs(long j) {
        return this.f14898saneness.saneness(grimness.marial(this.f14896dern, j, true, true));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }

    public void saneness(long j, long j2) {
        if (attabal(j)) {
            return;
        }
        this.f14898saneness.attabal(j);
        this.f14896dern.attabal(j2);
    }

    public void wireman(long j) {
        this.f14897marial = j;
    }
}
