package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import cybernatic.privatdozent;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* JADX INFO: compiled from: PassthroughSectionPayloadReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class rotuma implements oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public androidx.media3.common.polloi f27063attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public privatdozent f27064dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public decarock.kattegat f27065saneness;

    public rotuma(String str) {
        this.f27063attabal = new androidx.media3.common.polloi.saneness().sensatory(str).polder();
    }

    @Override // ghoulish.oilcan
    public void attabal(decarock.stratoscope stratoscopeVar) {
        dern();
        long jMarial = this.f27065saneness.marial();
        long jBeachfront = this.f27065saneness.beachfront();
        if (jMarial == C.TIME_UNSET || jBeachfront == C.TIME_UNSET) {
            return;
        }
        androidx.media3.common.polloi polloiVar = this.f27063attabal;
        if (jBeachfront != polloiVar.f11204molybdenite) {
            androidx.media3.common.polloi polloiVarPolder = polloiVar.attabal().igbo(jBeachfront).polder();
            this.f27063attabal = polloiVarPolder;
            this.f27064dern.dern(polloiVarPolder);
        }
        int iAttabal = stratoscopeVar.attabal();
        this.f27064dern.saneness(stratoscopeVar, iAttabal);
        this.f27064dern.wireman(jMarial, 1, iAttabal, 0, null);
    }

    @EnsuresNonNull({"timestampAdjuster", AgentOptions.OUTPUT})
    public final void dern() {
        decarock.attabal.taiyuan(this.f27065saneness);
        decarock.grimness.impromptu(this.f27064dern);
    }

    @Override // ghoulish.oilcan
    public void saneness(decarock.kattegat kattegatVar, cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        this.f27065saneness = kattegatVar;
        wiremanVar.attabal();
        privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 5);
        this.f27064dern = privatdozentVarTrack;
        privatdozentVarTrack.dern(this.f27063attabal);
    }
}
