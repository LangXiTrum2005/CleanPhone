package rm;

import d5.u;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.n;
import pm.n0;
import qk.i0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49698a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f49699b = c.f49657a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49700c = new a(yl.f.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f49701d = c(h.CYCLIC_SUPERTYPES, new String[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f49702e = c(h.ERROR_PROPERTY_TYPE, new String[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f49703f = i0.k0(new d());

    public static final e a(int i10, boolean z10, String... formatParams) {
        u.n(i10, "kind");
        n.f(formatParams, "formatParams");
        if (!z10) {
            return new e(i10, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        n.f(formatParams2, "formatParams");
        return new j(i10, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final e b(int i10, String... strArr) {
        u.n(i10, "kind");
        return a(i10, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f c(h kind, String... strArr) {
        n.f(kind, "kind");
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        n.f(formatParams, "formatParams");
        return e(kind, v.f53866a, d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static g d(h kind, String... formatParams) {
        n.f(kind, "kind");
        n.f(formatParams, "formatParams");
        return new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static f e(h kind, List list, n0 n0Var, String... formatParams) {
        n.f(kind, "kind");
        n.f(formatParams, "formatParams");
        return new f(n0Var, b(7, n0Var.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(zk.j jVar) {
        if (jVar != null) {
            return (jVar instanceof a) || (jVar.e() instanceof a) || jVar == f49699b;
        }
        return false;
    }
}
