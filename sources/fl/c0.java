package fl;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends r implements pl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f40984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Annotation[] f40985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40987d;

    public c0(a0 a0Var, Annotation[] reflectAnnotations, String str, boolean z10) {
        kotlin.jvm.internal.n.f(reflectAnnotations, "reflectAnnotations");
        this.f40984a = a0Var;
        this.f40985b = reflectAnnotations;
        this.f40986c = str;
        this.f40987d = z10;
    }

    @Override // pl.b
    public final d a(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        return d0.c.j(this.f40985b, fqName);
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        return d0.c.m(this.f40985b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0.class.getName());
        sb2.append(": ");
        sb2.append(this.f40987d ? "vararg " : "");
        String str = this.f40986c;
        sb2.append(str != null ? yl.f.d(str) : null);
        sb2.append(": ");
        sb2.append(this.f40984a);
        return sb2.toString();
    }
}
