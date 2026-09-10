package u4;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends a.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f51892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f51894e;

    public g(Object value, int i10, a aVar) {
        n.f(value, "value");
        u.n(i10, "verificationMode");
        this.f51892c = value;
        this.f51893d = i10;
        this.f51894e = aVar;
    }

    @Override // a.a
    public final a.a G(String str, jk.b bVar) {
        Object obj = this.f51892c;
        return ((Boolean) bVar.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f51894e, this.f51893d);
    }

    @Override // a.a
    public final Object g() {
        return this.f51892c;
    }
}
