package m1;

import i1.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45772a;

    public b(int i10) {
        this.f45772a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f45772a == ((b) obj).f45772a;
    }

    public final int hashCode() {
        return this.f45772a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f45772a;
    }
}
