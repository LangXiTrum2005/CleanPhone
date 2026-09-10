package ghoulish;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.privatdozent;
import java.util.List;

/* JADX INFO: compiled from: SeiReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<androidx.media3.common.polloi> f27070attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final privatdozent[] f27071saneness;

    public sealless(List<androidx.media3.common.polloi> list) {
        this.f27070attabal = list;
        this.f27071saneness = new privatdozent[list.size()];
    }

    public void attabal(long j, decarock.stratoscope stratoscopeVar) {
        cybernatic.beachfront.attabal(j, stratoscopeVar, this.f27071saneness);
    }

    public void saneness(cybernatic.polloi polloiVar, polder.wireman wiremanVar) {
        for (int i = 0; i < this.f27071saneness.length; i++) {
            wiremanVar.attabal();
            privatdozent privatdozentVarTrack = polloiVar.track(wiremanVar.dern(), 3);
            androidx.media3.common.polloi polloiVar2 = this.f27070attabal.get(i);
            String str = polloiVar2.f11218triweekly;
            decarock.attabal.saneness(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String strSaneness = polloiVar2.f11187attabal;
            if (strSaneness == null) {
                strSaneness = wiremanVar.saneness();
            }
            privatdozentVarTrack.dern(new androidx.media3.common.polloi.saneness().cultivated(strSaneness).sensatory(str).preterite(polloiVar2.f11202marial).treadless(polloiVar2.f11220wireman).seminary(polloiVar2.f11200kattegat).premeiotic(polloiVar2.f11205monoploid).polder());
            this.f27071saneness[i] = privatdozentVarTrack;
        }
    }
}
