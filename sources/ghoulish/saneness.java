package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final cybernatic.adultoid f27066wireman = new cybernatic.adultoid() { // from class: ghoulish.attabal
        @Override // cybernatic.adultoid
        public final cybernatic.arytenoidectomy[] createExtractors() {
            return saneness.dern();
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f27068dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f27067attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f27069saneness = new decarock.stratoscope(2786);

    public static /* synthetic */ cybernatic.arytenoidectomy[] dern() {
        return new cybernatic.arytenoidectomy[]{new saneness()};
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(cybernatic.monoploid monoploidVar) throws IOException {
        decarock.stratoscope stratoscopeVar = new decarock.stratoscope(10);
        int i = 0;
        while (true) {
            monoploidVar.peekFully(stratoscopeVar.marial(), 0, 10);
            stratoscopeVar.mathsort(0);
            if (stratoscopeVar.polder() != 4801587) {
                break;
            }
            stratoscopeVar.splinterproof(3);
            int iKattegat = stratoscopeVar.kattegat();
            i += iKattegat + 10;
            monoploidVar.advancePeekPosition(iKattegat);
        }
        monoploidVar.resetPeekPosition();
        monoploidVar.advancePeekPosition(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            monoploidVar.peekFully(stratoscopeVar.marial(), 0, 6);
            stratoscopeVar.mathsort(0);
            if (stratoscopeVar.saran() != 2935) {
                monoploidVar.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                monoploidVar.advancePeekPosition(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iCompetently = cybernatic.saneness.competently(stratoscopeVar.marial());
                if (iCompetently == -1) {
                    return false;
                }
                monoploidVar.advancePeekPosition(iCompetently - 6);
            }
        }
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        int i = monoploidVar.read(this.f27069saneness.marial(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f27069saneness.mathsort(0);
        this.f27069saneness.peridotite(i);
        if (!this.f27068dern) {
            this.f27067attabal.wireman(0L, 4);
            this.f27068dern = true;
        }
        this.f27067attabal.attabal(this.f27069saneness);
        return 0;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        this.f27067attabal.saneness(polloiVar, new polder.wireman(0, 1));
        polloiVar.endTracks();
        polloiVar.beachfront(new cybernatic.merc.saneness(C.TIME_UNSET));
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        this.f27068dern = false;
        this.f27067attabal.seek();
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
