package tm;

import jk.b;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import nm.s;
import pm.a1;
import zk.g;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends o implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f51589g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51590e;

    static {
        int i10 = 1;
        f51588f = new a(i10, 0);
        f51589g = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f51590e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f51590e) {
            case 0:
                a1 it = (a1) obj;
                n.f(it, "it");
                g gVarE = it.P().e();
                boolean z10 = false;
                if (gVarE != null && (gVarE instanceof m0) && (((m0) gVarE).e() instanceof s)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                a1 it2 = (a1) obj;
                n.f(it2, "it");
                g gVarE2 = it2.P().e();
                boolean z11 = false;
                if (gVarE2 != null && ((gVarE2 instanceof s) || (gVarE2 instanceof m0))) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }
}
