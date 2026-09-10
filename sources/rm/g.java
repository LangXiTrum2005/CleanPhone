package rm;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;
import pm.n0;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f49670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f49671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49672c;

    public g(h kind, String... formatParams) {
        n.f(kind, "kind");
        n.f(formatParams, "formatParams");
        this.f49670a = kind;
        this.f49671b = formatParams;
        String str = kind.f49696a;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f49672c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // pm.n0
    public final wk.h d() {
        wk.e eVar = wk.e.f53305f;
        return wk.e.f53305f;
    }

    @Override // pm.n0
    public final zk.g e() {
        i.f49698a.getClass();
        return i.f49700c;
    }

    @Override // pm.n0
    public final Collection f() {
        return v.f53866a;
    }

    @Override // pm.n0
    public final boolean g() {
        return false;
    }

    @Override // pm.n0
    public final List getParameters() {
        return v.f53866a;
    }

    public final String toString() {
        return this.f49672c;
    }
}
