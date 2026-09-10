package xi;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f53824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f53826c;

    public p(f fVar, String str) {
        this(fVar, str, v.f53830b);
    }

    public final void a(String str, Object obj, o oVar) {
        this.f53824a.m(this.f53825b, this.f53826c.d(new m(str, obj)), oVar == null ? null : new a(1, this, oVar));
    }

    public final void b(n nVar) {
        this.f53824a.a(this.f53825b, nVar == null ? null : new wi.b(false, this, nVar));
    }

    public p(f fVar, String str, q qVar) {
        this.f53824a = fVar;
        this.f53825b = str;
        this.f53826c = qVar;
    }
}
