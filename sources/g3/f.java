package g3;

import i1.b0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f41458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f41459c;

    public f(float f10, e eVar, e eVar2) {
        this.f41457a = f10;
        this.f41458b = eVar;
        this.f41459c = eVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f41457a, fVar.f41457a) == 0 && Objects.equals(this.f41458b, fVar.f41458b) && Objects.equals(this.f41459c, fVar.f41459c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f41457a) * 31;
        e eVar = this.f41458b;
        int iHashCode2 = (iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31;
        e eVar2 = this.f41459c;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.f41457a + ", field 1=" + this.f41458b + ", field 2=" + this.f41459c;
    }
}
