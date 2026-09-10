package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: Ac4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial implements cybernatic.arytenoidectomy {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final cybernatic.adultoid f26950wireman = new cybernatic.adultoid() { // from class: ghoulish.wireman
        @Override // cybernatic.adultoid
        public final cybernatic.arytenoidectomy[] createExtractors() {
            return marial.dern();
        }
    };

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f26952dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f26951attabal = new beachfront();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final decarock.stratoscope f26953saneness = new decarock.stratoscope(16384);

    public static /* synthetic */ cybernatic.arytenoidectomy[] dern() {
        return new cybernatic.arytenoidectomy[]{new marial()};
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
            monoploidVar.peekFully(stratoscopeVar.marial(), 0, 7);
            stratoscopeVar.mathsort(0);
            int iSaran = stratoscopeVar.saran();
            if (iSaran == 44096 || iSaran == 44097) {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iMarial = cybernatic.dern.marial(stratoscopeVar.marial(), iSaran);
                if (iMarial == -1) {
                    return false;
                }
                monoploidVar.advancePeekPosition(iMarial - 7);
            } else {
                monoploidVar.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                monoploidVar.advancePeekPosition(i3);
                i2 = 0;
            }
        }
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(cybernatic.monoploid monoploidVar, cybernatic.restrictive restrictiveVar) throws IOException {
        int i = monoploidVar.read(this.f26953saneness.marial(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.f26953saneness.mathsort(0);
        this.f26953saneness.peridotite(i);
        if (!this.f26952dern) {
            this.f26951attabal.wireman(0L, 4);
            this.f26952dern = true;
        }
        this.f26951attabal.attabal(this.f26953saneness);
        return 0;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(cybernatic.polloi polloiVar) {
        this.f26951attabal.saneness(polloiVar, new polder.wireman(0, 1));
        polloiVar.endTracks();
        polloiVar.beachfront(new cybernatic.merc.saneness(C.TIME_UNSET));
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        this.f26952dern = false;
        this.f26951attabal.seek();
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
