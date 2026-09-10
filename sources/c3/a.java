package c3;

import go.k;
import java.util.Locale;
import java.util.Objects;
import l1.y;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5921c;

    public a(long j10, long j11, int i10) {
        k.i(j10 < j11);
        this.f5919a = j10;
        this.f5920b = j11;
        this.f5921c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5919a == aVar.f5919a && this.f5920b == aVar.f5920b && this.f5921c == aVar.f5921c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f5919a), Long.valueOf(this.f5920b), Integer.valueOf(this.f5921c));
    }

    public final String toString() {
        String str = y.f44830a;
        Locale locale = Locale.US;
        StringBuilder sbL = d.l(this.f5919a, "Segment: startTimeMs=", ", endTimeMs=");
        sbL.append(this.f5920b);
        sbL.append(", speedDivisor=");
        sbL.append(this.f5921c);
        return sbL.toString();
    }
}
