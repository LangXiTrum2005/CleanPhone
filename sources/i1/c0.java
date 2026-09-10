package i1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0[] f42527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42528b;

    public c0(b0... b0VarArr) {
        this(C.TIME_UNSET, b0VarArr);
    }

    public final c0 a(b0... b0VarArr) {
        if (b0VarArr.length == 0) {
            return this;
        }
        String str = l1.y.f44830a;
        b0[] b0VarArr2 = this.f42527a;
        Object[] objArrCopyOf = Arrays.copyOf(b0VarArr2, b0VarArr2.length + b0VarArr.length);
        System.arraycopy(b0VarArr, 0, objArrCopyOf, b0VarArr2.length, b0VarArr.length);
        return new c0(this.f42528b, (b0[]) objArrCopyOf);
    }

    public final c0 b(c0 c0Var) {
        return c0Var == null ? this : a(c0Var.f42527a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0.class == obj.getClass()) {
            c0 c0Var = (c0) obj;
            if (Arrays.equals(this.f42527a, c0Var.f42527a) && this.f42528b == c0Var.f42528b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.bumptech.glide.d.A(this.f42528b) + (Arrays.hashCode(this.f42527a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f42527a));
        long j10 = this.f42528b;
        if (j10 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public c0(long j10, b0... b0VarArr) {
        this.f42528b = j10;
        this.f42527a = b0VarArr;
    }

    public c0(List list) {
        this((b0[]) list.toArray(new b0[0]));
    }
}
