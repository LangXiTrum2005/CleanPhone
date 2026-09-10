package c3;

import go.k;
import i1.b0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5922a;

    public b(ArrayList arrayList) {
        this.f5922a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f5920b;
            for (int i10 = 1; i10 < arrayList.size(); i10++) {
                if (((a) arrayList.get(i10)).f5919a < j10) {
                    z10 = true;
                    break;
                }
                j10 = ((a) arrayList.get(i10)).f5920b;
            }
        }
        k.i(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f5922a.equals(((b) obj).f5922a);
    }

    public final int hashCode() {
        return this.f5922a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f5922a;
    }
}
