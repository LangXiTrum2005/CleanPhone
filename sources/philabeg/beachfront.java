package philabeg;

import java.util.Collections;
import java.util.List;
import strother.apical;

/* JADX INFO: compiled from: CeaSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront implements apical {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<libya.attabal> f35217kowloon;

    public beachfront(List<libya.attabal> list) {
        this.f35217kowloon = list;
    }

    @Override // strother.apical
    public List<libya.attabal> getCues(long j) {
        return j >= 0 ? this.f35217kowloon : Collections.EMPTY_LIST;
    }

    @Override // strother.apical
    public long getEventTime(int i) {
        decarock.attabal.attabal(i == 0);
        return 0L;
    }

    @Override // strother.apical
    public int getEventTimeCount() {
        return 1;
    }

    @Override // strother.apical
    public int getNextEventTimeIndex(long j) {
        return j < 0 ? 0 : -1;
    }
}
