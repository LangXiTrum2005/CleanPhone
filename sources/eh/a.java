package eh;

import java.util.List;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends d0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40044c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pk.e f40045d = new pk.e(0, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f40046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f40047f;

    static {
        pk.e eVar = new pk.e(4L, 10L);
        pk.e eVar2 = new pk.e(10L, 18L);
        pk.e eVar3 = new pk.e(0L, 7L);
        pk.e eVar4 = new pk.e(0L, 5L);
        f40046e = 18L;
        f40047f = o.Q(new wj.f(eVar, eVar3), new wj.f(eVar2, eVar4));
    }

    @Override // d0.c
    public final pk.e o() {
        return f40045d;
    }

    @Override // d0.c
    public final List w() {
        return f40047f;
    }

    @Override // d0.c
    public final long y() {
        return f40046e;
    }
}
