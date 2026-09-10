package bl;

import java.util.Collection;
import kotlin.jvm.internal.n;
import nm.r;
import xj.v;
import yl.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5718b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5719c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5720d = new a(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5721e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5722a;

    public /* synthetic */ a(int i10) {
        this.f5722a = i10;
    }

    @Override // bl.d
    public boolean a(zk.e classDescriptor, r rVar) {
        switch (this.f5722a) {
            case 1:
                n.f(classDescriptor, "classDescriptor");
                return true;
            default:
                n.f(classDescriptor, "classDescriptor");
                return !rVar.getAnnotations().c(e.f5723a);
        }
    }

    @Override // bl.b
    public Collection b(zk.e eVar) {
        return v.f53866a;
    }

    @Override // bl.b
    public Collection c(zk.e classDescriptor) {
        n.f(classDescriptor, "classDescriptor");
        return v.f53866a;
    }

    @Override // bl.b
    public Collection d(zk.e eVar) {
        return v.f53866a;
    }

    @Override // bl.b
    public Collection e(f name, zk.e classDescriptor) {
        n.f(name, "name");
        n.f(classDescriptor, "classDescriptor");
        return v.f53866a;
    }
}
