package strother;

import java.util.List;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class arytenoidectomy extends miliaria.marial implements apical {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f38174graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public apical f38175molybdenite;

    @Override // miliaria.marial, miliaria.attabal
    public void dern() {
        super.dern();
        this.f38175molybdenite = null;
    }

    @Override // strother.apical
    public List<libya.attabal> getCues(long j) {
        return ((apical) decarock.attabal.marial(this.f38175molybdenite)).getCues(j - this.f38174graveside);
    }

    @Override // strother.apical
    public long getEventTime(int i) {
        return ((apical) decarock.attabal.marial(this.f38175molybdenite)).getEventTime(i) + this.f38174graveside;
    }

    @Override // strother.apical
    public int getEventTimeCount() {
        return ((apical) decarock.attabal.marial(this.f38175molybdenite)).getEventTimeCount();
    }

    @Override // strother.apical
    public int getNextEventTimeIndex(long j) {
        return ((apical) decarock.attabal.marial(this.f38175molybdenite)).getNextEventTimeIndex(j - this.f38174graveside);
    }

    public void kowloon(long j, apical apicalVar, long j2) {
        this.f33454arytenoidectomy = j;
        this.f38175molybdenite = apicalVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f38174graveside = j;
    }
}
