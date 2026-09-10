package cc;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6262f;

    public r1(int i10, int i11, long j10, long j11, boolean z10, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f6257a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f6258b = i11;
        this.f6259c = j10;
        this.f6260d = j11;
        this.f6261e = z10;
        this.f6262f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.f6257a != r1Var.f6257a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f6258b != r1Var.f6258b || this.f6259c != r1Var.f6259c || this.f6260d != r1Var.f6260d || this.f6261e != r1Var.f6261e || this.f6262f != r1Var.f6262f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f6257a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f6258b) * 1000003;
        long j10 = this.f6259c;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f6260d;
        return ((((this.f6262f ^ ((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f6261e ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f6257a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f6258b);
        sb2.append(", totalRam=");
        sb2.append(this.f6259c);
        sb2.append(", diskSpace=");
        sb2.append(this.f6260d);
        sb2.append(", isEmulator=");
        sb2.append(this.f6261e);
        sb2.append(", state=");
        sb2.append(this.f6262f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return defpackage.e.q(Build.PRODUCT, "}", sb2);
    }
}
