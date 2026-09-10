package estragon;

import decarock.grimness;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import strother.apical;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class cutely implements apical {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long[] f25950arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<wireman> f25951kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final long[] f25952monoploid;

    public cutely(List<wireman> list) {
        this.f25951kowloon = Collections.unmodifiableList(new ArrayList(list));
        this.f25950arytenoidectomy = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            wireman wiremanVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f25950arytenoidectomy;
            jArr[i2] = wiremanVar.f26000saneness;
            jArr[i2 + 1] = wiremanVar.f25999dern;
        }
        long[] jArr2 = this.f25950arytenoidectomy;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f25952monoploid = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // strother.apical
    public List<libya.attabal> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f25951kowloon.size(); i++) {
            long[] jArr = this.f25950arytenoidectomy;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                wireman wiremanVar = this.f25951kowloon.get(i);
                libya.attabal attabalVar = wiremanVar.f25998attabal;
                if (attabalVar.f32904marial == -3.4028235E38f) {
                    arrayList2.add(wiremanVar);
                } else {
                    arrayList.add(attabalVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: estragon.taiyuan
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((wireman) obj).f26000saneness, ((wireman) obj2).f26000saneness);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((wireman) arrayList2.get(i3)).f25998attabal.attabal().impromptu((-1) - i3, 1).attabal());
        }
        return arrayList;
    }

    @Override // strother.apical
    public long getEventTime(int i) {
        decarock.attabal.attabal(i >= 0);
        decarock.attabal.attabal(i < this.f25952monoploid.length);
        return this.f25952monoploid[i];
    }

    @Override // strother.apical
    public int getEventTimeCount() {
        return this.f25952monoploid.length;
    }

    @Override // strother.apical
    public int getNextEventTimeIndex(long j) {
        int iWireman = grimness.wireman(this.f25952monoploid, j, false, false);
        if (iWireman < this.f25952monoploid.length) {
            return iWireman;
        }
        return -1;
    }
}
