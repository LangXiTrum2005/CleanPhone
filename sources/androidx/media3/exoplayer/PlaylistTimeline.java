package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5977e;
    public final int f;
    public final int[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f5978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Timeline[] f5979i;
    public final Object[] j;
    public final HashMap k;

    public PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(shuffleOrder);
        int length = timelineArr.length;
        this.f5979i = timelineArr;
        this.g = new int[length];
        this.f5978h = new int[length];
        this.j = objArr;
        this.k = new HashMap();
        int length2 = timelineArr.length;
        int i2 = 0;
        int iO = 0;
        int iH = 0;
        int i3 = 0;
        while (i2 < length2) {
            Timeline timeline = timelineArr[i2];
            this.f5979i[i3] = timeline;
            this.f5978h[i3] = iO;
            this.g[i3] = iH;
            iO += timeline.o();
            iH += this.f5979i[i3].h();
            this.k.put(objArr[i3], Integer.valueOf(i3));
            i2++;
            i3++;
        }
        this.f5977e = iO;
        this.f = iH;
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return this.f;
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return this.f5977e;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int q(Object obj) {
        Integer num = (Integer) this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int r(int i2) {
        return Util.d(this.g, i2 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int s(int i2) {
        return Util.d(this.f5978h, i2 + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final Object t(int i2) {
        return this.j[i2];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int u(int i2) {
        return this.g[i2];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final int v(int i2) {
        return this.f5978h[i2];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    public final Timeline x(int i2) {
        return this.f5979i[i2];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlaylistTimeline(ArrayList arrayList, ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            timelineArr[i3] = ((MediaSourceInfoHolder) it.next()).b();
            i3++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i2] = ((MediaSourceInfoHolder) it2.next()).a();
            i2++;
        }
        this(timelineArr, objArr, shuffleOrder);
    }
}
