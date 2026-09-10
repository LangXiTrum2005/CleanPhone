package rsp;

import decarock.grimness;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import strother.apical;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu implements apical {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long[] f36967arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final dern f36968kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Map<String, String> f36969molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Map<String, competently> f36970monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final Map<String, marial> f36971polloi;

    public impromptu(dern dernVar, Map<String, competently> map, Map<String, marial> map2, Map<String, String> map3) {
        this.f36968kowloon = dernVar;
        this.f36971polloi = map2;
        this.f36969molybdenite = map3;
        this.f36970monoploid = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f36967arytenoidectomy = dernVar.cutely();
    }

    @Override // strother.apical
    public List<libya.attabal> getCues(long j) {
        return this.f36968kowloon.impromptu(j, this.f36970monoploid, this.f36971polloi, this.f36969molybdenite);
    }

    @Override // strother.apical
    public long getEventTime(int i) {
        return this.f36967arytenoidectomy[i];
    }

    @Override // strother.apical
    public int getEventTimeCount() {
        return this.f36967arytenoidectomy.length;
    }

    @Override // strother.apical
    public int getNextEventTimeIndex(long j) {
        int iWireman = grimness.wireman(this.f36967arytenoidectomy, j, false, false);
        if (iWireman < this.f36967arytenoidectomy.length) {
            return iWireman;
        }
        return -1;
    }
}
