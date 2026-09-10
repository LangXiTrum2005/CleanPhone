package il;

import ea.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.c f43101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.c[] f43102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f2 f43103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f43104d;

    static {
        yl.c cVar = new yl.c("org.jspecify.nullness");
        yl.c cVar2 = new yl.c("org.jspecify.annotations");
        f43101a = cVar2;
        yl.c cVar3 = new yl.c("io.reactivex.rxjava3.annotations");
        yl.c cVar4 = new yl.c("org.checkerframework.checker.nullness.compatqual");
        String strB = cVar3.b();
        f43102b = new yl.c[]{new yl.c(strB.concat(".Nullable")), new yl.c(strB.concat(".NonNull"))};
        yl.c cVar5 = new yl.c("org.jetbrains.annotations");
        s sVar = s.f43105d;
        wj.f fVar = new wj.f(cVar5, sVar);
        wj.f fVar2 = new wj.f(new yl.c("androidx.annotation"), sVar);
        wj.f fVar3 = new wj.f(new yl.c("android.support.annotation"), sVar);
        wj.f fVar4 = new wj.f(new yl.c("android.annotation"), sVar);
        wj.f fVar5 = new wj.f(new yl.c("com.android.annotations"), sVar);
        wj.f fVar6 = new wj.f(new yl.c("org.eclipse.jdt.annotation"), sVar);
        wj.f fVar7 = new wj.f(new yl.c("org.checkerframework.checker.nullness.qual"), sVar);
        wj.f fVar8 = new wj.f(cVar4, sVar);
        wj.f fVar9 = new wj.f(new yl.c("javax.annotation"), sVar);
        wj.f fVar10 = new wj.f(new yl.c("edu.umd.cs.findbugs.annotations"), sVar);
        wj.f fVar11 = new wj.f(new yl.c("io.reactivex.annotations"), sVar);
        yl.c cVar6 = new yl.c("androidx.annotation.RecentlyNullable");
        c0 c0Var = c0.WARN;
        wj.f fVar12 = new wj.f(cVar6, new s(c0Var, 4));
        wj.f fVar13 = new wj.f(new yl.c("androidx.annotation.RecentlyNonNull"), new s(c0Var, 4));
        wj.f fVar14 = new wj.f(new yl.c("lombok"), sVar);
        wj.c cVar7 = new wj.c(1, 9, 0);
        c0 c0Var2 = c0.STRICT;
        f43103c = new f2(xj.b0.Q(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, new wj.f(cVar, new s(c0Var, cVar7, c0Var2)), new wj.f(cVar2, new s(c0Var, new wj.c(1, 9, 0), c0Var2)), new wj.f(cVar3, new s(c0Var, new wj.c(1, 8, 0), c0Var2))));
        f43104d = new s(c0Var, 4);
    }
}
