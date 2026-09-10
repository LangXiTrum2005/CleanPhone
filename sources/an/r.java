package an;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements zm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3793b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f3792a = i10;
        this.f3793b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [ck.h, jk.c] */
    @Override // zm.i
    public final Iterator iterator() {
        switch (this.f3792a) {
            case 0:
                return new d((CharSequence) this.f3793b);
            case 1:
                return new hk.l(this);
            case 2:
                return kotlin.jvm.internal.m.a((Object[]) this.f3793b);
            case 3:
                return ((Iterable) this.f3793b).iterator();
            case 4:
                return no.b.y((ck.h) this.f3793b);
            case 5:
                return (Iterator) this.f3793b;
            case 6:
                return new ym.h(this.f3793b, 1);
            default:
                return new zm.h(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(jk.c cVar) {
        this.f3792a = 4;
        this.f3793b = (ck.h) cVar;
    }
}
