package f3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40540c;

    public b(long j10, long j11, long j12) {
        this.f40538a = j10;
        this.f40539b = j11;
        this.f40540c = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f40538a, ((b) obj).f40538a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f40538a == bVar.f40538a && this.f40539b == bVar.f40539b && this.f40540c == bVar.f40540c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f40538a), Long.valueOf(this.f40539b), Long.valueOf(this.f40540c));
    }
}
