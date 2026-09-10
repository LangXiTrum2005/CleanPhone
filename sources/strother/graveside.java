package strother;

import android.util.SparseArray;
import cybernatic.merc;
import cybernatic.privatdozent;

/* JADX INFO: compiled from: SubtitleTranscodingExtractorOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class graveside implements cybernatic.polloi {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final polloi.attabal f38189arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final cybernatic.polloi f38190kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final SparseArray<dovishness> f38191monoploid = new SparseArray<>();

    public graveside(cybernatic.polloi polloiVar, polloi.attabal attabalVar) {
        this.f38190kowloon = polloiVar;
        this.f38189arytenoidectomy = attabalVar;
    }

    public void attabal() {
        for (int i = 0; i < this.f38191monoploid.size(); i++) {
            this.f38191monoploid.valueAt(i).cutely();
        }
    }

    @Override // cybernatic.polloi
    public void beachfront(merc mercVar) {
        this.f38190kowloon.beachfront(mercVar);
    }

    @Override // cybernatic.polloi
    public void endTracks() {
        this.f38190kowloon.endTracks();
    }

    @Override // cybernatic.polloi
    public privatdozent track(int i, int i2) {
        if (i2 != 3) {
            return this.f38190kowloon.track(i, i2);
        }
        dovishness dovishnessVar = this.f38191monoploid.get(i);
        if (dovishnessVar != null) {
            return dovishnessVar;
        }
        dovishness dovishnessVar2 = new dovishness(this.f38190kowloon.track(i, i2), this.f38189arytenoidectomy);
        this.f38191monoploid.put(i, dovishnessVar2);
        return dovishnessVar2;
    }
}
