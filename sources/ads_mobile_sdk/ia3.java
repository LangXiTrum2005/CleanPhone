package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;

/* JADX INFO: loaded from: classes.dex */
public final class ia3 {
    public final ha3 a;
    public final int b;
    public final int c;
    public final boolean d;

    public /* synthetic */ ia3(ha3 ha3Var, int i, int i2, int i3) {
        this(ha3Var, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, false);
    }

    public final boolean a() {
        return this.a == ha3.DEFAULT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia3)) {
            return false;
        }
        ia3 ia3Var = (ia3) obj;
        return this.a == ia3Var.a && this.b == ia3Var.b && this.c == ia3Var.c && this.d == ia3Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.c, bonny.attabal(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iAttabal + r1;
    }

    public final String toString() {
        return "WebViewSize(type=" + this.a + ", widthInPixels=" + this.b + ", heightInPixels=" + this.c + ", isFluidHeight=" + this.d + ")";
    }

    public ia3(ha3 type, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = type;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
