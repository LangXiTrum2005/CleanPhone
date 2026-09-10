package q8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f48870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f48871b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f48870a = bArr;
        this.f48871b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z10 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f48870a, z10 ? pVar.f48870a : pVar.f48870a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f48871b, z10 ? pVar2.f48871b : pVar2.f48871b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48871b) ^ ((Arrays.hashCode(this.f48870a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f48870a) + ", encryptedBlob=" + Arrays.toString(this.f48871b) + "}";
    }
}
