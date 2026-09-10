package cg;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ec.a f6381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f6382c;

    public a(String str) {
        this.f6380a = str;
        this.f6381b = new ec.a(str);
    }

    public abstract p c(n nVar);

    public abstract c d();

    public final c e() {
        c cVar = this.f6382c;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.n.l("next");
        throw null;
    }

    public void f(c next) {
        kotlin.jvm.internal.n.f(next, "next");
        this.f6382c = next;
    }

    public void g() {
    }
}
