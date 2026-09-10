package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.o f52714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52715b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, jk.b bVar) {
        this.f52714a = (kotlin.jvm.internal.o) bVar;
        this.f52715b = "must return ".concat(str);
    }

    @Override // vm.e
    public final String a(kl.e eVar) {
        return go.c.w(this, eVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // vm.e
    public final boolean b(kl.e eVar) {
        return kotlin.jvm.internal.n.a(eVar.f6639g, this.f52714a.invoke(fm.e.e(eVar)));
    }

    @Override // vm.e
    public final String getDescription() {
        return this.f52715b;
    }
}
