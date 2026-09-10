package nl;

import d5.u;
import java.util.Set;
import kotlin.jvm.internal.n;
import pm.c0;
import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f46789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f46791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f46792f;

    public a(int i10, int i11, boolean z10, boolean z11, Set set, c0 c0Var) {
        u.n(i10, "howThisTypeIsUsed");
        u.n(i11, "flexibility");
        this.f46787a = i10;
        this.f46788b = i11;
        this.f46789c = z10;
        this.f46790d = z11;
        this.f46791e = set;
        this.f46792f = c0Var;
    }

    public static a a(a aVar, int i10, boolean z10, Set set, c0 c0Var, int i11) {
        int i12 = aVar.f46787a;
        if ((i11 & 2) != 0) {
            i10 = aVar.f46788b;
        }
        int i13 = i10;
        if ((i11 & 4) != 0) {
            z10 = aVar.f46789c;
        }
        boolean z11 = z10;
        boolean z12 = aVar.f46790d;
        if ((i11 & 16) != 0) {
            set = aVar.f46791e;
        }
        Set set2 = set;
        if ((i11 & 32) != 0) {
            c0Var = aVar.f46792f;
        }
        aVar.getClass();
        u.n(i12, "howThisTypeIsUsed");
        u.n(i13, "flexibility");
        return new a(i12, i13, z11, z12, set2, c0Var);
    }

    public final a b(int i10) {
        u.n(i10, "flexibility");
        return a(this, i10, false, null, null, 61);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(aVar.f46792f, this.f46792f) && aVar.f46787a == this.f46787a && aVar.f46788b == this.f46788b && aVar.f46789c == this.f46789c && aVar.f46790d == this.f46790d;
    }

    public final int hashCode() {
        c0 c0Var = this.f46792f;
        int iHashCode = c0Var != null ? c0Var.hashCode() : 0;
        int iC = i.c(this.f46787a) + (iHashCode * 31) + iHashCode;
        int iC2 = i.c(this.f46788b) + (iC * 31) + iC;
        int i10 = (iC2 * 31) + (this.f46789c ? 1 : 0) + iC2;
        return (i10 * 31) + (this.f46790d ? 1 : 0) + i10;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("JavaTypeAttributes(howThisTypeIsUsed=");
        int i10 = this.f46787a;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "COMMON";
        } else {
            str = "SUPERTYPE";
        }
        sb2.append(str);
        sb2.append(", flexibility=");
        int i11 = this.f46788b;
        if (i11 == 1) {
            str2 = "INFLEXIBLE";
        } else if (i11 != 2) {
            str2 = i11 != 3 ? "null" : "FLEXIBLE_LOWER_BOUND";
        } else {
            str2 = "FLEXIBLE_UPPER_BOUND";
        }
        sb2.append(str2);
        sb2.append(", isRaw=");
        sb2.append(this.f46789c);
        sb2.append(", isForAnnotationParameter=");
        sb2.append(this.f46790d);
        sb2.append(", visitedTypeParameters=");
        sb2.append(this.f46791e);
        sb2.append(", defaultType=");
        sb2.append(this.f46792f);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ a(int i10, boolean z10, boolean z11, Set set, int i11) {
        this(i10, 1, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : set, null);
    }
}
