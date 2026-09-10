package t1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50367c;

    public f(String str, String str2, String str3) {
        this.f50365a = str;
        this.f50366b = str2;
        this.f50367c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f50365a, fVar.f50365a) && Objects.equals(this.f50366b, fVar.f50366b) && Objects.equals(this.f50367c, fVar.f50367c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f50365a.hashCode() * 31;
        String str = this.f50366b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50367c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
