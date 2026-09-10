package androidx.media3.exoplayer.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class MergingCuesResolver implements CuesResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ordering f6499b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6500a = new ArrayList();

    static {
        final int i2 = 0;
        final int i3 = 1;
        f6499b = Ordering.d().i(new Function() { // from class: androidx.media3.exoplayer.text.a
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i2) {
                    case 0:
                        Ordering ordering = MergingCuesResolver.f6499b;
                        return Long.valueOf(cuesWithTiming.f7205b);
                    default:
                        Ordering ordering2 = MergingCuesResolver.f6499b;
                        return Long.valueOf(cuesWithTiming.f7206c);
                }
            }
        }).a(Ordering.d().j().i(new Function() { // from class: androidx.media3.exoplayer.text.a
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                switch (i3) {
                    case 0:
                        Ordering ordering = MergingCuesResolver.f6499b;
                        return Long.valueOf(cuesWithTiming.f7205b);
                    default:
                        Ordering ordering2 = MergingCuesResolver.f6499b;
                        return Long.valueOf(cuesWithTiming.f7206c);
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final ImmutableList a(long j) {
        ArrayList arrayList = this.f6500a;
        if (!arrayList.isEmpty()) {
            if (j >= ((CuesWithTiming) arrayList.get(0)).f7205b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    CuesWithTiming cuesWithTiming = (CuesWithTiming) arrayList.get(i2);
                    if (j >= cuesWithTiming.f7205b && j < cuesWithTiming.d) {
                        arrayList2.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.f7205b) {
                        break;
                    }
                }
                ImmutableList immutableListD = ImmutableList.D(f6499b, arrayList2);
                ImmutableList.Builder builderS = ImmutableList.s();
                for (int i3 = 0; i3 < immutableListD.size(); i3++) {
                    builderS.f(((CuesWithTiming) immutableListD.get(i3)).f7204a);
                }
                return builderS.j();
            }
        }
        return ImmutableList.x();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final boolean b(CuesWithTiming cuesWithTiming, long j) {
        long j2 = cuesWithTiming.f7205b;
        Assertions.b(j2 != -9223372036854775807L);
        Assertions.b(cuesWithTiming.f7206c != -9223372036854775807L);
        boolean z2 = j2 <= j && j < cuesWithTiming.d;
        ArrayList arrayList = this.f6500a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((CuesWithTiming) arrayList.get(size)).f7205b) {
                arrayList.add(size + 1, cuesWithTiming);
                return z2;
            }
        }
        arrayList.add(0, cuesWithTiming);
        return z2;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long c(long j) {
        ArrayList arrayList = this.f6500a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((CuesWithTiming) arrayList.get(0)).f7205b) {
            return -9223372036854775807L;
        }
        long jMax = ((CuesWithTiming) arrayList.get(0)).f7205b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            long j2 = ((CuesWithTiming) arrayList.get(i2)).f7205b;
            long j3 = ((CuesWithTiming) arrayList.get(i2)).d;
            if (j3 > j) {
                if (j2 > j) {
                    break;
                }
                jMax = Math.max(jMax, j2);
            } else {
                jMax = Math.max(jMax, j3);
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void clear() {
        this.f6500a.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final long d(long j) {
        int i2 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f6500a;
            if (i2 >= arrayList.size()) {
                break;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i2)).f7205b;
            long j3 = ((CuesWithTiming) arrayList.get(i2)).d;
            if (j < j2) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j2);
                    break;
                }
                jMin = j2;
                break;
            }
            if (j < j3) {
                jMin = jMin == -9223372036854775807L ? j3 : Math.min(jMin, j3);
            }
            i2++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public final void e(long j) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f6500a;
            if (i2 >= arrayList.size()) {
                return;
            }
            long j2 = ((CuesWithTiming) arrayList.get(i2)).f7205b;
            if (j > j2 && j > ((CuesWithTiming) arrayList.get(i2)).d) {
                arrayList.remove(i2);
                i2--;
            } else if (j < j2) {
                return;
            }
            i2++;
        }
    }
}
