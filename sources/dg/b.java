package dg;

import java.util.List;
import kotlin.jvm.internal.n;
import wj.r;
import xj.o;
import zf.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38851a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38853c;

    public /* synthetic */ b(int i10, List list) {
        this.f38852b = i10;
        this.f38853c = list;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f38851a) {
            case 0:
                List sources = (List) this.f38853c;
                n.f(sources, "$sources");
                return Boolean.valueOf(this.f38852b < o.P(sources));
            default:
                g this$0 = (g) this.f38853c;
                n.f(this$0, "this$0");
                wf.b bVar = this$0.f54944d;
                bVar.f53179a.releaseOutputBuffer(this.f38852b, false);
                bVar.f(bVar.b() - 1);
                return r.f53297a;
        }
    }

    public /* synthetic */ b(g gVar, int i10) {
        this.f38853c = gVar;
        this.f38852b = i10;
    }
}
