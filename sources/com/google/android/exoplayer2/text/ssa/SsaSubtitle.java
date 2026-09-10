package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class SsaSubtitle implements Subtitle {
    public final ArrayList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f18587Y;

    public SsaSubtitle(ArrayList arrayList, ArrayList arrayList2) {
        this.X = arrayList;
        this.f18587Y = arrayList2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List getCues(long j) {
        int iD = Util.d(this.f18587Y, Long.valueOf(j), true, false);
        return iD == -1 ? Collections.EMPTY_LIST : (List) this.X.get(iD);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 >= 0);
        ArrayList arrayList = this.f18587Y;
        Assertions.b(i2 < arrayList.size());
        return ((Long) arrayList.get(i2)).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return this.f18587Y.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        int i2;
        Long lValueOf = Long.valueOf(j);
        int i3 = Util.f18979a;
        ArrayList arrayList = this.f18587Y;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i2 = iBinarySearch;
        }
        if (i2 < arrayList.size()) {
            return i2;
        }
        return -1;
    }
}
