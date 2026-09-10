package cc;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6124b;

    public j0(String str, byte[] bArr) {
        this.f6123a = str;
        this.f6124b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            w1 w1Var = (w1) obj;
            j0 j0Var = (j0) w1Var;
            if (this.f6123a.equals(j0Var.f6123a)) {
                if (Arrays.equals(this.f6124b, w1Var instanceof j0 ? ((j0) w1Var).f6124b : j0Var.f6124b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6124b) ^ ((this.f6123a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f6123a + ", contents=" + Arrays.toString(this.f6124b) + "}";
    }
}
