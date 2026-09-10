package strother;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.collect.achondroplasia;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import decarock.grimness;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: CuesWithTimingSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently implements apical {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Ordering<marial> f38176monoploid = Ordering.natural().onResultOf(new com.google.common.base.marial() { // from class: strother.beachfront
        @Override // com.google.common.base.marial
        public final Object apply(Object obj) {
            return Long.valueOf(competently.dern(((marial) obj).f38196saneness));
        }
    });

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final long[] f38177arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ImmutableList<ImmutableList<libya.attabal>> f38178kowloon;

    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    public competently(List<marial> list) {
        if (list.size() == 1) {
            marial marialVar = (marial) achondroplasia.impromptu(list);
            long jDern = dern(marialVar.f38196saneness);
            if (marialVar.f38195dern == C.TIME_UNSET) {
                this.f38178kowloon = ImmutableList.of(marialVar.f38194attabal);
                this.f38177arytenoidectomy = new long[]{jDern};
                return;
            } else {
                this.f38178kowloon = ImmutableList.of((ImmutableList) marialVar.f38194attabal, ImmutableList.of());
                this.f38177arytenoidectomy = new long[]{jDern, marialVar.f38195dern + jDern};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f38177arytenoidectomy = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListSortedCopyOf = ImmutableList.sortedCopyOf(f38176monoploid, list);
        int i = 0;
        for (int i2 = 0; i2 < immutableListSortedCopyOf.size(); i2++) {
            marial marialVar2 = (marial) immutableListSortedCopyOf.get(i2);
            long jDern2 = dern(marialVar2.f38196saneness);
            long j = marialVar2.f38195dern + jDern2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.f38177arytenoidectomy[i3];
                if (j2 < jDern2) {
                    this.f38177arytenoidectomy[i] = jDern2;
                    arrayList.add(marialVar2.f38194attabal);
                    i++;
                } else if (j2 == jDern2 && ((ImmutableList) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, marialVar2.f38194attabal);
                } else {
                    decarock.triweekly.impromptu("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f38177arytenoidectomy[i3] = jDern2;
                    arrayList.set(i3, marialVar2.f38194attabal);
                }
            } else {
                this.f38177arytenoidectomy[i] = jDern2;
                arrayList.add(marialVar2.f38194attabal);
                i++;
            }
            if (marialVar2.f38195dern != C.TIME_UNSET) {
                this.f38177arytenoidectomy[i] = j;
                arrayList.add(ImmutableList.of());
                i++;
            }
        }
        this.f38178kowloon = ImmutableList.copyOf((Collection) arrayList);
    }

    public static long dern(long j) {
        if (j == C.TIME_UNSET) {
            return 0L;
        }
        return j;
    }

    @Override // strother.apical
    public long getEventTime(int i) {
        decarock.attabal.attabal(i < this.f38178kowloon.size());
        return this.f38177arytenoidectomy[i];
    }

    @Override // strother.apical
    public int getEventTimeCount() {
        return this.f38178kowloon.size();
    }

    @Override // strother.apical
    public int getNextEventTimeIndex(long j) {
        int iWireman = grimness.wireman(this.f38177arytenoidectomy, j, false, false);
        if (iWireman < this.f38178kowloon.size()) {
            return iWireman;
        }
        return -1;
    }

    @Override // strother.apical
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public ImmutableList<libya.attabal> getCues(long j) {
        int iCompetently = grimness.competently(this.f38177arytenoidectomy, j, true, false);
        return iCompetently == -1 ? ImmutableList.of() : this.f38178kowloon.get(iCompetently);
    }
}
