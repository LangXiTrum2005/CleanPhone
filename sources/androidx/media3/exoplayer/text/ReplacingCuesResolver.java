package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class ReplacingCuesResolver implements CuesResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6501a = new ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final ImmutableList a(long j) {
        int iF = f(j);
        if (iF == 0) {
            return ImmutableList.x();
        }
        CuesWithTiming cuesWithTiming = (CuesWithTiming) this.f6501a.get(iF - 1);
        long j2 = cuesWithTiming.d;
        return (j2 == -9223372036854775807L || j < j2) ? cuesWithTiming.f7204a : ImmutableList.x();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final boolean b(CuesWithTiming cuesWithTiming, long j) {
        boolean z2;
        long j2 = cuesWithTiming.f7205b;
        Assertions.b(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = cuesWithTiming.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        ArrayList arrayList = this.f6501a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((CuesWithTiming) arrayList.get(size)).f7205b) {
                arrayList.add(size + 1, cuesWithTiming);
                return z2;
            }
            if (((CuesWithTiming) arrayList.get(size)).f7205b <= j) {
                z2 = false;
            }
        }
        arrayList.add(0, cuesWithTiming);
        return z2;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long c(long j) {
        ArrayList arrayList = this.f6501a;
        if (arrayList.isEmpty() || j < ((CuesWithTiming) arrayList.get(0)).f7205b) {
            return -9223372036854775807L;
        }
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            long j2 = ((CuesWithTiming) arrayList.get(i2)).f7205b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i2 - 1);
                long j3 = cuesWithTiming.d;
                return (j3 == -9223372036854775807L || j3 > j) ? cuesWithTiming.f7205b : j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Iterables.c(arrayList);
        long j4 = cuesWithTiming2.d;
        return (j4 == -9223372036854775807L || j < j4) ? cuesWithTiming2.f7205b : j4;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.f6501a.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long d(long j) {
        ArrayList arrayList = this.f6501a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).f7205b) {
            return ((CuesWithTiming) arrayList.get(0)).f7205b;
        }
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i2);
            if (j < cuesWithTiming.f7205b) {
                long j2 = ((CuesWithTiming) arrayList.get(i2 - 1)).d;
                long j3 = cuesWithTiming.f7205b;
                return (j2 == -9223372036854775807L || j2 <= j || j2 >= j3) ? j3 : j2;
            }
        }
        long j4 = ((CuesWithTiming) Iterables.c(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void e(long j) {
        int iF = f(j);
        if (iF > 0) {
            this.f6501a.subList(0, iF).clear();
        }
    }

    public final int f(long j) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f6501a;
            if (i2 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((CuesWithTiming) arrayList.get(i2)).f7205b) {
                return i2;
            }
            i2++;
        }
    }
}
