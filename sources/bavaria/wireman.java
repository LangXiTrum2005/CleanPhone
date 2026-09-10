package bavaria;

import androidx.media3.common.ParserException;
import cybernatic.adultoid;
import cybernatic.arytenoidectomy;
import cybernatic.monoploid;
import cybernatic.polloi;
import cybernatic.privatdozent;
import cybernatic.restrictive;
import decarock.stratoscope;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman implements arytenoidectomy {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final adultoid f15024wireman = new adultoid() { // from class: bavaria.dern
        @Override // cybernatic.adultoid
        public final arytenoidectomy[] createExtractors() {
            return wireman.dern();
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public polloi f15025attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f15026dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public taiyuan f15027saneness;

    public static stratoscope competently(stratoscope stratoscopeVar) {
        stratoscopeVar.mathsort(0);
        return stratoscopeVar;
    }

    public static /* synthetic */ arytenoidectomy[] dern() {
        return new arytenoidectomy[]{new wireman()};
    }

    @Override // cybernatic.arytenoidectomy
    public boolean attabal(monoploid monoploidVar) throws IOException {
        try {
            return impromptu(monoploidVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // cybernatic.arytenoidectomy
    public int beachfront(monoploid monoploidVar, restrictive restrictiveVar) throws IOException {
        decarock.attabal.taiyuan(this.f15025attabal);
        if (this.f15027saneness == null) {
            if (!impromptu(monoploidVar)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            monoploidVar.resetPeekPosition();
        }
        if (!this.f15026dern) {
            privatdozent privatdozentVarTrack = this.f15025attabal.track(0, 1);
            this.f15025attabal.endTracks();
            this.f15027saneness.wireman(this.f15025attabal, privatdozentVarTrack);
            this.f15026dern = true;
        }
        return this.f15027saneness.competently(monoploidVar, restrictiveVar);
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean impromptu(monoploid monoploidVar) throws IOException {
        beachfront beachfrontVar = new beachfront();
        if (beachfrontVar.attabal(monoploidVar, true) && (beachfrontVar.f14982saneness & 2) == 2) {
            int iMin = Math.min(beachfrontVar.f14983taiyuan, 8);
            stratoscope stratoscopeVar = new stratoscope(iMin);
            monoploidVar.peekFully(stratoscopeVar.marial(), 0, iMin);
            if (saneness.arytenoidectomy(competently(stratoscopeVar))) {
                this.f15027saneness = new saneness();
            } else if (cutely.polloi(competently(stratoscopeVar))) {
                this.f15027saneness = new cutely();
            } else if (impromptu.kowloon(competently(stratoscopeVar))) {
                this.f15027saneness = new impromptu();
            }
            return true;
        }
        return false;
    }

    @Override // cybernatic.arytenoidectomy
    public void marial(polloi polloiVar) {
        this.f15025attabal = polloiVar;
    }

    @Override // cybernatic.arytenoidectomy
    public void seek(long j, long j2) {
        taiyuan taiyuanVar = this.f15027saneness;
        if (taiyuanVar != null) {
            taiyuanVar.impassible(j, j2);
        }
    }

    @Override // cybernatic.arytenoidectomy
    public void release() {
    }
}
