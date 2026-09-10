package twybill;

import androidx.media3.datasource.cache.Cache;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: LeastRecentlyUsedCacheEvictor.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize implements androidx.media3.datasource.cache.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f39025attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f39026dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final TreeSet<marial> f39027saneness = new TreeSet<>(new Comparator() { // from class: twybill.apical
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return formularize.competently((marial) obj, (marial) obj2);
        }
    });

    public formularize(long j) {
        this.f39025attabal = j;
    }

    public static int competently(marial marialVar, marial marialVar2) {
        long j = marialVar.f39030graveside;
        long j2 = marialVar2.f39030graveside;
        if (j - j2 == 0) {
            return marialVar.compareTo(marialVar2);
        }
        return j < j2 ? -1 : 1;
    }

    @Override // androidx.media3.datasource.cache.Cache.attabal
    public void attabal(Cache cache, marial marialVar) {
        this.f39027saneness.add(marialVar);
        this.f39026dern += marialVar.f39033monoploid;
        impromptu(cache, 0L);
    }

    @Override // androidx.media3.datasource.cache.Cache.attabal
    public void dern(Cache cache, marial marialVar, marial marialVar2) {
        saneness(cache, marialVar);
        attabal(cache, marialVar2);
    }

    public final void impromptu(Cache cache, long j) {
        while (this.f39026dern + j > this.f39025attabal && !this.f39027saneness.isEmpty()) {
            cache.saneness(this.f39027saneness.first());
        }
    }

    @Override // androidx.media3.datasource.cache.saneness
    public void marial(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            impromptu(cache, j2);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache.attabal
    public void saneness(Cache cache, marial marialVar) {
        this.f39027saneness.remove(marialVar);
        this.f39026dern -= marialVar.f39033monoploid;
    }

    @Override // androidx.media3.datasource.cache.saneness
    public boolean wireman() {
        return true;
    }

    @Override // androidx.media3.datasource.cache.saneness
    public void onCacheInitialized() {
    }
}
