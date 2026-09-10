package zf;

import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f54927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54928b;

    public /* synthetic */ a(b bVar, int i10) {
        this.f54927a = bVar;
        this.f54928b = i10;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b this$0 = this.f54927a;
        n.f(this$0, "this$0");
        wf.b bVar = this$0.f54931f;
        bVar.f53179a.releaseOutputBuffer(this.f54928b, zBooleanValue);
        bVar.f(bVar.b() - 1);
        return r.f53297a;
    }
}
