package e9;

import ea.f2;
import java.util.Arrays;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f39183c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39185b;

    static {
        f2 f2Var = new f2(10, false);
        f2Var.f39409b = Boolean.FALSE;
        f39183c = new b(f2Var);
    }

    public b(f2 f2Var) {
        this.f39184a = ((Boolean) f2Var.f39409b).booleanValue();
        this.f39185b = (String) f2Var.f39410c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return c0.l(null, null) && this.f39184a == bVar.f39184a && c0.l(this.f39185b, bVar.f39185b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f39184a), this.f39185b});
    }
}
