package ih;

import com.bumptech.glide.d;
import dh.g;
import java.util.ArrayList;
import sg.c;
import xj.n;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f43031a = g.f38896b;

    public static ArrayList a(int i10, long j10) {
        if (i10 <= 1) {
            i10 = 2;
        }
        double d10 = j10 / ((double) (i10 - 1));
        pk.c cVarO = d.O(0, i10);
        ArrayList arrayList = new ArrayList(p.W(cVarO, 10));
        pk.b it = cVarO.iterator();
        while (it.f48398c) {
            double dNextInt = ((double) it.nextInt()) * d10;
            if (Double.isNaN(dNextInt)) {
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            long jRound = Math.round(dNextInt);
            if (jRound > j10) {
                jRound = j10;
            }
            arrayList.add(Long.valueOf(jRound));
        }
        return arrayList;
    }

    public static ArrayList b(long j10, long j11) {
        long jMax = Math.max(1L, j11);
        ArrayList arrayList = new ArrayList();
        for (long j12 = 0; j12 < j10; j12 += jMax) {
            arrayList.add(Long.valueOf(j12));
        }
        if (!arrayList.isEmpty() && ((Number) n.w0(arrayList)).longValue() == j10) {
            return arrayList;
        }
        arrayList.add(Long.valueOf(j10));
        return arrayList;
    }
}
