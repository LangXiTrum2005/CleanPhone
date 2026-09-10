package cybernatic;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: SingleSampleExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class seminary implements arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f24773attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public polloi f24774beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public privatdozent f24775competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f24776dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f24777marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f24778saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f24779wireman;

    public seminary(int i, int i2, String str) {
        this.f24773attabal = i;
        this.f24778saneness = i2;
        this.f24776dern = str;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        decarock.attabal.competently((this.f24773attabal == -1 || this.f24778saneness == -1) ? false : true);
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(this.f24778saneness);
        monoploidVar.peekFully(stratoscopeVar.marial(), 0, this.f24778saneness);
        return stratoscopeVar.saran() == this.f24773attabal;
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        int i = this.f24777marial;
        if (i == 1) {
            competently(monoploidVar);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final void competently(monoploid monoploidVar) throws IOException {
        int iMarial = ((privatdozent) decarock.attabal.marial(this.f24775competently)).marial(monoploidVar, 1024, true);
        if (iMarial != -1) {
            this.f24779wireman += iMarial;
            return;
        }
        this.f24777marial = 2;
        this.f24775competently.wireman(0L, 1, this.f24779wireman, 0, null);
        this.f24779wireman = 0;
    }

    @RequiresNonNull({"this.extractorOutput"})
    public final void dern(String str) {
        privatdozent privatdozentVarTrack = this.f24774beachfront.track(1024, 4);
        this.f24775competently = privatdozentVarTrack;
        privatdozentVarTrack.dern(new androidx.media3.common.polloi.saneness().sensatory(str).polder());
        this.f24774beachfront.endTracks();
        this.f24774beachfront.beachfront(new grimness(C.TIME_UNSET));
        this.f24777marial = 1;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f24774beachfront = polloiVar;
        dern(this.f24776dern);
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        if (j == 0 || this.f24777marial == 1) {
            this.f24777marial = 1;
            this.f24779wireman = 0;
        }
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
