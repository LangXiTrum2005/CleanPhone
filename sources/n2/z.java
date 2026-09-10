package n2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f46505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f46507d;

    public z(int i10, byte[] bArr, int i11, int i12) {
        this.f46504a = i10;
        this.f46505b = bArr;
        this.f46506c = i11;
        this.f46507d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f46504a == zVar.f46504a && this.f46506c == zVar.f46506c && this.f46507d == zVar.f46507d && Arrays.equals(this.f46505b, zVar.f46505b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f46505b) + (this.f46504a * 31)) * 31) + this.f46506c) * 31) + this.f46507d;
    }
}
