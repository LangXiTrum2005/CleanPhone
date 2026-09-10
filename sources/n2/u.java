package n2;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f46492c = new u(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46494b;

    public u(long j10, long j11) {
        this.f46493a = j10;
        this.f46494b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f46493a == uVar.f46493a && this.f46494b == uVar.f46494b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f46493a) * 31) + ((int) this.f46494b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f46493a);
        sb2.append(", position=");
        return defpackage.e.r(sb2, this.f46494b, X3.j.f27836e);
    }
}
