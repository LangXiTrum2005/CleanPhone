package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitleReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize implements impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<polder.attabal> f26881attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public long f26882beachfront = C.TIME_UNSET;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f26883dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f26884marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final privatdozent[] f26885saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f26886wireman;

    public formularize(List<polder.attabal> list) {
        this.f26881attabal = list;
        this.f26885saneness = new privatdozent[list.size()];
    }

    @Override // ghoulish.impassible
    public void attabal(decarock.stratoscope stratoscopeVar) {
        if (this.f26883dern) {
            if (this.f26886wireman != 2 || marial(stratoscopeVar, 32)) {
                if (this.f26886wireman != 1 || marial(stratoscopeVar, 0)) {
                    int iBeachfront = stratoscopeVar.beachfront();
                    int iAttabal = stratoscopeVar.attabal();
                    for (privatdozent privatdozentVar : this.f26885saneness) {
                        stratoscopeVar.mathsort(iBeachfront);
                        privatdozentVar.saneness(stratoscopeVar, iAttabal);
                    }
                    this.f26884marial += iAttabal;
                }
            }
        }
    }

    @Override // ghoulish.impassible
    public void dern(boolean z) {
        if (this.f26883dern) {
            decarock.attabal.competently(this.f26882beachfront != C.TIME_UNSET);
            for (privatdozent privatdozentVar : this.f26885saneness) {
                privatdozentVar.wireman(this.f26882beachfront, 1, this.f26884marial, 0, null);
            }
            this.f26883dern = false;
        }
    }

    public final boolean marial(decarock.stratoscope stratoscopeVar, int i) {
        if (stratoscopeVar.attabal() == 0) {
            return false;
        }
        if (stratoscopeVar.supplicat() != i) {
            this.f26883dern = false;
        }
        this.f26886wireman--;
        return this.f26883dern;
    }

    @Override // ghoulish.impassible
    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        for (int i = 0; i < this.f26885saneness.length; i++) {
            polder.attabal attabalVar = this.f26881attabal.get(i);
            wiremanVar.attabal();
            privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 3);
            privatdozentVarTrack.dern(new androidx.media3.common.polloi.saneness().cultivated(wiremanVar.saneness()).sensatory(MimeTypes.APPLICATION_DVBSUBS).premeiotic(Collections.singletonList(attabalVar.f27033dern)).treadless(attabalVar.f27032attabal).polder());
            this.f26885saneness[i] = privatdozentVarTrack;
        }
    }

    @Override // ghoulish.impassible
    public void seek() {
        this.f26883dern = false;
        this.f26882beachfront = C.TIME_UNSET;
    }

    @Override // ghoulish.impassible
    public void wireman(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f26883dern = true;
        this.f26882beachfront = j;
        this.f26884marial = 0;
        this.f26886wireman = 2;
    }
}
