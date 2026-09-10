package f3;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import n2.g;
import n2.s;
import n2.t;
import n2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f40541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f40542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40544d;

    public c(SparseArray sparseArray, long j10, int i10, long j11, long j12) {
        g gVar;
        int i11;
        this.f40542b = sparseArray;
        this.f40543c = j10;
        this.f40544d = i10;
        List list = (List) sparseArray.get(i10);
        if (list == null || list.isEmpty()) {
            gVar = null;
        } else {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) list.get(i13);
                jArrCopyOf3[i13] = bVar.f40538a;
                jArrCopyOf[i13] = bVar.f40539b;
            }
            while (true) {
                i11 = size - 1;
                if (i12 >= i11) {
                    break;
                }
                int i14 = i12 + 1;
                iArrCopyOf[i12] = (int) (jArrCopyOf[i14] - jArrCopyOf[i12]);
                jArrCopyOf2[i12] = jArrCopyOf3[i14] - jArrCopyOf3[i12];
                i12 = i14;
            }
            int i15 = i11;
            while (i15 > 0 && jArrCopyOf3[i15] >= j10) {
                i15--;
            }
            iArrCopyOf[i15] = (int) ((j11 + j12) - jArrCopyOf[i15]);
            jArrCopyOf2[i15] = j10 - jArrCopyOf3[i15];
            if (i15 < i11) {
                l1.a.s("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i16 = i15 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
            }
            gVar = new g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f40541a = gVar;
    }

    @Override // n2.t
    public final long getDurationUs() {
        return this.f40543c;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        g gVar = this.f40541a;
        if (gVar != null) {
            return gVar.getSeekPoints(j10);
        }
        u uVar = u.f46492c;
        return new s(uVar, uVar);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        List list = (List) this.f40542b.get(this.f40544d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
