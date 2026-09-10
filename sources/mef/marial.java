package mef;

import cybernatic.merc;
import cybernatic.polder;
import decarock.grimness;

/* JADX INFO: compiled from: WavSeekMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f33254attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f33255dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final long f33256marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f33257saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f33258wireman;

    public marial(dern dernVar, int i, long j, long j2) {
        this.f33254attabal = dernVar;
        this.f33257saneness = i;
        this.f33255dern = j;
        long j3 = (j2 - j) / ((long) dernVar.f33251marial);
        this.f33258wireman = j3;
        this.f33256marial = attabal(j3);
    }

    public final long attabal(long j) {
        return grimness.deadwork(j * ((long) this.f33257saneness), 1000000L, this.f33254attabal.f33250dern);
    }

    @Override // cybernatic.merc
    public long getDurationUs() {
        return this.f33256marial;
    }

    @Override // cybernatic.merc
    public merc.attabal getSeekPoints(long j) {
        long jArytenoidectomy = grimness.arytenoidectomy((((long) this.f33254attabal.f33250dern) * j) / (((long) this.f33257saneness) * 1000000), 0L, this.f33258wireman - 1);
        long j2 = this.f33255dern + (((long) this.f33254attabal.f33251marial) * jArytenoidectomy);
        long jAttabal = attabal(jArytenoidectomy);
        polder polderVar = new polder(jAttabal, j2);
        if (jAttabal >= j || jArytenoidectomy == this.f33258wireman - 1) {
            return new merc.attabal(polderVar);
        }
        long j3 = jArytenoidectomy + 1;
        return new merc.attabal(polderVar, new polder(attabal(j3), this.f33255dern + (((long) this.f33254attabal.f33251marial) * j3)));
    }

    @Override // cybernatic.merc
    public boolean isSeekable() {
        return true;
    }
}
