package il;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.c f43042a = new yl.c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.c f43043b = new yl.c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final yl.c f43044c = new yl.c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final yl.c f43045d = new yl.c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f43046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f43047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final LinkedHashMap f43048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f43049h;

    static {
        a aVar = a.TYPE_PARAMETER_BOUNDS;
        a aVar2 = a.TYPE_USE;
        a aVar3 = a.FIELD;
        a aVar4 = a.METHOD_RETURN_TYPE;
        a aVar5 = a.VALUE_PARAMETER;
        List listQ = xj.o.Q(aVar3, aVar4, aVar5, aVar, aVar2);
        f43046e = listQ;
        yl.c cVar = z.f43138c;
        ql.g gVar = ql.g.f49145c;
        List list = listQ;
        Map mapQ = xj.b0.Q(new wj.f(cVar, new n(new ql.h(gVar), list, false)), new wj.f(z.f43141f, new n(new ql.h(gVar), list, false)));
        f43047f = mapQ;
        f43048g = xj.b0.T(xj.b0.Q(new wj.f(new yl.c("javax.annotation.ParametersAreNullableByDefault"), new n(new ql.h(ql.g.f49144b), j1.f.C(aVar5))), new wj.f(new yl.c("javax.annotation.ParametersAreNonnullByDefault"), new n(new ql.h(gVar), j1.f.C(aVar5)))), mapQ);
        f43049h = xj.k.E0(new yl.c[]{z.f43143h, z.f43144i});
    }
}
