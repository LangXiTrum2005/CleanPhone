package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;

/* JADX INFO: compiled from: Id3Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi implements impassible {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f27046beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f27047dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f27048marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public privatdozent f27049saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final decarock.stratoscope f27045attabal = new decarock.stratoscope(10);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f27050wireman = C.TIME_UNSET;

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        decarock.attabal.taiyuan(this.f27049saneness);
        if (this.f27047dern) {
            int iAttabal = stratoscopeVar.attabal();
            int i = this.f27046beachfront;
            if (i < 10) {
                int iMin = Math.min(iAttabal, 10 - i);
                System.arraycopy(stratoscopeVar.marial(), stratoscopeVar.beachfront(), this.f27045attabal.marial(), this.f27046beachfront, iMin);
                if (this.f27046beachfront + iMin == 10) {
                    this.f27045attabal.mathsort(0);
                    if (73 != this.f27045attabal.supplicat() || 68 != this.f27045attabal.supplicat() || 51 != this.f27045attabal.supplicat()) {
                        decarock.triweekly.impromptu("Id3Reader", "Discarding invalid ID3 tag");
                        this.f27047dern = false;
                        return;
                    } else {
                        this.f27045attabal.splinterproof(3);
                        this.f27048marial = this.f27045attabal.kattegat() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iAttabal, this.f27048marial - this.f27046beachfront);
            this.f27049saneness.saneness(stratoscopeVar, iMin2);
            this.f27046beachfront += iMin2;
        }
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
        int i;
        decarock.attabal.taiyuan(this.f27049saneness);
        if (this.f27047dern && (i = this.f27048marial) != 0 && this.f27046beachfront == i) {
            decarock.attabal.competently(this.f27050wireman != C.TIME_UNSET);
            this.f27049saneness.wireman(this.f27050wireman, 1, this.f27048marial, 0, null);
            this.f27047dern = false;
        }
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        wiremanVar.attabal();
        privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 5);
        this.f27049saneness = privatdozentVarTrack;
        privatdozentVarTrack.dern(new androidx.media3.common.polloi.saneness().cultivated(wiremanVar.saneness()).sensatory(MimeTypes.APPLICATION_ID3).polder());
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f27047dern = false;
        this.f27050wireman = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f27047dern = true;
        this.f27050wireman = j;
        this.f27048marial = 0;
        this.f27046beachfront = 0;
    }
}
