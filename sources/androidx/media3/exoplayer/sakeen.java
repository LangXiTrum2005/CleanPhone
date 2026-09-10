package androidx.media3.exoplayer;

/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class sakeen implements underbelly {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f12303arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final decarock.wireman f12304kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public androidx.media3.common.preprohormone f12305molybdenite = androidx.media3.common.preprohormone.f11260wireman;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public long f12306monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public long f12307polloi;

    public sakeen(decarock.wireman wiremanVar) {
        this.f12304kowloon = wiremanVar;
    }

    public void attabal(long j) {
        this.f12306monoploid = j;
        if (this.f12303arytenoidectomy) {
            this.f12307polloi = this.f12304kowloon.elapsedRealtime();
        }
    }

    public void dern() {
        if (this.f12303arytenoidectomy) {
            return;
        }
        this.f12307polloi = this.f12304kowloon.elapsedRealtime();
        this.f12303arytenoidectomy = true;
    }

    @Override // androidx.media3.exoplayer.underbelly
    public androidx.media3.common.preprohormone getPlaybackParameters() {
        return this.f12305molybdenite;
    }

    @Override // androidx.media3.exoplayer.underbelly
    public long getPositionUs() {
        long j = this.f12306monoploid;
        if (!this.f12303arytenoidectomy) {
            return j;
        }
        long jElapsedRealtime = this.f12304kowloon.elapsedRealtime() - this.f12307polloi;
        androidx.media3.common.preprohormone preprohormoneVar = this.f12305molybdenite;
        return j + (preprohormoneVar.f11261attabal == 1.0f ? decarock.grimness.outmarry(jElapsedRealtime) : preprohormoneVar.attabal(jElapsedRealtime));
    }

    @Override // androidx.media3.exoplayer.underbelly
    public void saneness(androidx.media3.common.preprohormone preprohormoneVar) {
        if (this.f12303arytenoidectomy) {
            attabal(getPositionUs());
        }
        this.f12305molybdenite = preprohormoneVar;
    }

    public void wireman() {
        if (this.f12303arytenoidectomy) {
            attabal(getPositionUs());
            this.f12303arytenoidectomy = false;
        }
    }
}
