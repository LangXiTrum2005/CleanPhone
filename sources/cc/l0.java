package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6154a;

    public l0(int i10) {
        this.f6154a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            if (this.f6154a == ((l0) ((y1) obj)).f6154a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6154a ^ 1000003;
    }

    public final String toString() {
        return l1.d.i(new StringBuilder("ProfilingTrigger{trigger="), this.f6154a, "}");
    }
}
