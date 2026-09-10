package strother;

import cybernatic.restrictive;
import java.io.IOException;

/* JADX INFO: compiled from: SubtitleTranscodingExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class molybdenite implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cybernatic.arytenoidectomy f38198attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public graveside f38199dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final polloi.attabal f38200saneness;

    public molybdenite(cybernatic.arytenoidectomy arytenoidectomyVar, polloi.attabal attabalVar) {
        this.f38198attabal = arytenoidectomyVar;
        this.f38200saneness = attabalVar;
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(cybernatic.monoploid monoploidVar) throws IOException {
        return this.f38198attabal.attabal(monoploidVar);
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        return this.f38198attabal.beachfront(monoploidVar, restrictiveVar);
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        graveside gravesideVar = new graveside(polloiVar, this.f38200saneness);
        this.f38199dern = gravesideVar;
        this.f38198attabal.marial(gravesideVar);
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
        this.f38198attabal.release();
    }

    @Override // cybernatic.arytenoidectomy
    public cybernatic.arytenoidectomy saneness() {
        return this.f38198attabal;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        graveside gravesideVar = this.f38199dern;
        if (gravesideVar != null) {
            gravesideVar.attabal();
        }
        this.f38198attabal.seek(j, j2);
    }
}
