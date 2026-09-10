package g8;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f41739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f41740c;

    public h(Integer num, Integer num2, Integer num3) {
        this.f41738a = num;
        this.f41739b = num2;
        this.f41740c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return n.a(this.f41738a, hVar.f41738a) && n.a(this.f41739b, hVar.f41739b) && n.a(this.f41740c, hVar.f41740c);
    }

    public final int hashCode() {
        Integer num = this.f41738a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f41739b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f41740c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "VideoInfo(width=" + this.f41738a + ", height=" + this.f41739b + ", duration=" + this.f41740c + ")";
    }
}
