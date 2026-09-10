package bm;

import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f5732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk.c f5733b;

    public j(m mVar, zk.c cVar) {
        this.f5732a = mVar;
        this.f5733b = cVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        zk.c second = (zk.c) obj;
        n.f(second, "second");
        this.f5732a.d(this.f5733b, second);
        return r.f53297a;
    }
}
