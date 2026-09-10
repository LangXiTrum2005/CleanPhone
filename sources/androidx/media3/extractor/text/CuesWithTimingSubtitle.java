package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CuesWithTimingSubtitle implements Subtitle {
    public static final Ordering Z = Ordering.d().i(new a(0));
    public final ImmutableList X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long[] f7207Y;

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    public CuesWithTimingSubtitle(List list) {
        int i2 = 0;
        boolean z2 = true;
        if (list.size() == 1) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) Iterables.d(list);
            long j = cuesWithTiming.f7205b;
            long j2 = j == -9223372036854775807L ? 0L : j;
            long j3 = cuesWithTiming.f7206c;
            ImmutableList immutableList = cuesWithTiming.f7204a;
            if (j3 == -9223372036854775807L) {
                this.X = ImmutableList.z(immutableList);
                this.f7207Y = new long[]{j2};
                return;
            } else {
                this.X = ImmutableList.A(immutableList, ImmutableList.x());
                this.f7207Y = new long[]{j2, j3 + j2};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f7207Y = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableListD = ImmutableList.D(Z, list);
        int i3 = 0;
        while (i2 < immutableListD.size()) {
            CuesWithTiming cuesWithTiming2 = (CuesWithTiming) immutableListD.get(i2);
            long j4 = cuesWithTiming2.f7205b;
            j4 = j4 == -9223372036854775807L ? 0L : j4;
            long j5 = cuesWithTiming2.f7206c;
            long j6 = j4 + j5;
            ImmutableList immutableList2 = cuesWithTiming2.f7204a;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j7 = this.f7207Y[i4];
                if (j7 < j4) {
                    this.f7207Y[i3] = j4;
                    arrayList.add(immutableList2);
                    i3++;
                } else if (j7 == j4 && ((ImmutableList) arrayList.get(i4)).isEmpty()) {
                    arrayList.set(i4, immutableList2);
                } else {
                    Log.g("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f7207Y[i4] = j4;
                    arrayList.set(i4, immutableList2);
                }
            } else {
                this.f7207Y[i3] = j4;
                arrayList.add(immutableList2);
                i3++;
            }
            if (j5 != -9223372036854775807L) {
                this.f7207Y[i3] = j6;
                arrayList.add(ImmutableList.x());
                i3++;
            }
            i2++;
            z2 = z2;
        }
        this.X = ImmutableList.u(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.Subtitle
    public final List getCues(long j) {
        int iE = Util.e(this.f7207Y, j, false);
        return iE == -1 ? ImmutableList.x() : (ImmutableList) this.X.get(iE);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long getEventTime(int i2) {
        Assertions.b(i2 < this.X.size());
        return this.f7207Y[i2];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getEventTimeCount() {
        return this.X.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        int iB = Util.b(this.f7207Y, j, false);
        if (iB < this.X.size()) {
            return iB;
        }
        return -1;
    }
}
