package livable;

import cybernatic.cuirassed;
import cybernatic.merc;
import cybernatic.polder;
import cybernatic.polloi;
import cybernatic.privatdozent;

/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements polloi {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final polloi f33100arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final long f33101kowloon;

    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    public class attabal extends cuirassed {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ merc f33103saneness;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(merc mercVar, merc mercVar2) {
            super(mercVar);
            this.f33103saneness = mercVar2;
        }

        @Override // cybernatic.cuirassed, cybernatic.merc
        public merc.attabal getSeekPoints(long j) {
            merc.attabal seekPoints = this.f33103saneness.getSeekPoints(j);
            polder polderVar = seekPoints.f24716attabal;
            polder polderVar2 = new polder(polderVar.f24722attabal, polderVar.f24723saneness + marial.this.f33101kowloon);
            polder polderVar3 = seekPoints.f24717saneness;
            return new merc.attabal(polderVar2, new polder(polderVar3.f24722attabal, polderVar3.f24723saneness + marial.this.f33101kowloon));
        }
    }

    public marial(long j, polloi polloiVar) {
        this.f33101kowloon = j;
        this.f33100arytenoidectomy = polloiVar;
    }

    @Override // cybernatic.polloi
    public void beachfront(merc mercVar) {
        this.f33100arytenoidectomy.beachfront(new attabal(mercVar, mercVar));
    }

    @Override // cybernatic.polloi
    public void endTracks() {
        this.f33100arytenoidectomy.endTracks();
    }

    @Override // cybernatic.polloi
    public privatdozent track(int i, int i2) {
        return this.f33100arytenoidectomy.track(i, i2);
    }
}
