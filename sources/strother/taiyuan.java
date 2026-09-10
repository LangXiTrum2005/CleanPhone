package strother;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: LegacySubtitleUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {
    public static int attabal(apical apicalVar, long j) {
        if (j == C.TIME_UNSET) {
            return 0;
        }
        int nextEventTimeIndex = apicalVar.getNextEventTimeIndex(j);
        if (nextEventTimeIndex == -1) {
            nextEventTimeIndex = apicalVar.getEventTimeCount();
        }
        return (nextEventTimeIndex <= 0 || apicalVar.getEventTime(nextEventTimeIndex + (-1)) != j) ? nextEventTimeIndex : nextEventTimeIndex - 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void dern(apical apicalVar, polloi.saneness sanenessVar, decarock.impromptu<marial> impromptuVar) {
        boolean z;
        int iAttabal = attabal(apicalVar, sanenessVar.f38204attabal);
        if (sanenessVar.f38204attabal == C.TIME_UNSET || iAttabal >= apicalVar.getEventTimeCount()) {
            z = false;
        } else {
            List<libya.attabal> cues = apicalVar.getCues(sanenessVar.f38204attabal);
            long eventTime = apicalVar.getEventTime(iAttabal);
            if (cues.isEmpty()) {
                z = false;
            } else {
                long j = sanenessVar.f38204attabal;
                if (j < eventTime) {
                    impromptuVar.accept(new marial(cues, j, eventTime - j));
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        for (int i = iAttabal; i < apicalVar.getEventTimeCount(); i++) {
            saneness(apicalVar, i, impromptuVar);
        }
        if (sanenessVar.f38205saneness) {
            if (z) {
                iAttabal--;
            }
            for (int i2 = 0; i2 < iAttabal; i2++) {
                saneness(apicalVar, i2, impromptuVar);
            }
            if (z) {
                impromptuVar.accept(new marial(apicalVar.getCues(sanenessVar.f38204attabal), apicalVar.getEventTime(iAttabal), sanenessVar.f38204attabal - apicalVar.getEventTime(iAttabal)));
            }
        }
    }

    public static void saneness(apical apicalVar, int i, decarock.impromptu<marial> impromptuVar) {
        long eventTime = apicalVar.getEventTime(i);
        List<libya.attabal> cues = apicalVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i == apicalVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = apicalVar.getEventTime(i + 1) - apicalVar.getEventTime(i);
        if (eventTime2 > 0) {
            impromptuVar.accept(new marial(cues, eventTime, eventTime2));
        }
    }
}
