package androidx.media3.exoplayer;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes.dex */
public final class molybdenite implements underbelly {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final attabal f12120arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f12121graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final sakeen f12122kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f12123molybdenite = true;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public homozygous f12124monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public underbelly f12125polloi;

    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface attabal {
        void onPlaybackParametersChanged(androidx.media3.common.preprohormone preprohormoneVar);
    }

    public molybdenite(attabal attabalVar, decarock.wireman wiremanVar) {
        this.f12120arytenoidectomy = attabalVar;
        this.f12122kowloon = new sakeen(wiremanVar);
    }

    public void attabal(homozygous homozygousVar) {
        if (homozygousVar == this.f12124monoploid) {
            this.f12125polloi = null;
            this.f12124monoploid = null;
            this.f12123molybdenite = true;
        }
    }

    public void beachfront() {
        this.f12121graveside = true;
        this.f12122kowloon.dern();
    }

    public void competently() {
        this.f12121graveside = false;
        this.f12122kowloon.wireman();
    }

    public void dern(homozygous homozygousVar) throws ExoPlaybackException {
        underbelly underbellyVar;
        underbelly mediaClock = homozygousVar.getMediaClock();
        if (mediaClock == null || mediaClock == (underbellyVar = this.f12125polloi)) {
            return;
        }
        if (underbellyVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f12125polloi = mediaClock;
        this.f12124monoploid = homozygousVar;
        mediaClock.saneness(this.f12122kowloon.getPlaybackParameters());
    }

    @Override // androidx.media3.exoplayer.underbelly
    public androidx.media3.common.preprohormone getPlaybackParameters() {
        underbelly underbellyVar = this.f12125polloi;
        return underbellyVar != null ? underbellyVar.getPlaybackParameters() : this.f12122kowloon.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.underbelly
    public long getPositionUs() {
        return this.f12123molybdenite ? this.f12122kowloon.getPositionUs() : ((underbelly) decarock.attabal.marial(this.f12125polloi)).getPositionUs();
    }

    @Override // androidx.media3.exoplayer.underbelly
    public boolean impassible() {
        return this.f12123molybdenite ? this.f12122kowloon.impassible() : ((underbelly) decarock.attabal.marial(this.f12125polloi)).impassible();
    }

    public long impromptu(boolean z) {
        taiyuan(z);
        return getPositionUs();
    }

    public final boolean marial(boolean z) {
        homozygous homozygousVar = this.f12124monoploid;
        if (homozygousVar == null || homozygousVar.isEnded()) {
            return true;
        }
        if (z && this.f12124monoploid.getState() != 2) {
            return true;
        }
        if (this.f12124monoploid.isReady()) {
            return false;
        }
        return z || this.f12124monoploid.hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.underbelly
    public void saneness(androidx.media3.common.preprohormone preprohormoneVar) {
        underbelly underbellyVar = this.f12125polloi;
        if (underbellyVar != null) {
            underbellyVar.saneness(preprohormoneVar);
            preprohormoneVar = this.f12125polloi.getPlaybackParameters();
        }
        this.f12122kowloon.saneness(preprohormoneVar);
    }

    public final void taiyuan(boolean z) {
        if (marial(z)) {
            this.f12123molybdenite = true;
            if (this.f12121graveside) {
                this.f12122kowloon.dern();
                return;
            }
            return;
        }
        underbelly underbellyVar = (underbelly) decarock.attabal.marial(this.f12125polloi);
        long positionUs = underbellyVar.getPositionUs();
        if (this.f12123molybdenite) {
            if (positionUs < this.f12122kowloon.getPositionUs()) {
                this.f12122kowloon.wireman();
                return;
            } else {
                this.f12123molybdenite = false;
                if (this.f12121graveside) {
                    this.f12122kowloon.dern();
                }
            }
        }
        this.f12122kowloon.attabal(positionUs);
        androidx.media3.common.preprohormone playbackParameters = underbellyVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f12122kowloon.getPlaybackParameters())) {
            return;
        }
        this.f12122kowloon.saneness(playbackParameters);
        this.f12120arytenoidectomy.onPlaybackParametersChanged(playbackParameters);
    }

    public void wireman(long j) {
        this.f12122kowloon.attabal(j);
    }
}
