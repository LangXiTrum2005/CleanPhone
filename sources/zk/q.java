package zk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f54990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f54991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f54992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f54993i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f54994e;

    static {
        int i10 = 1;
        f54990f = new q(i10, 0);
        f54991g = new q(i10, 1);
        f54992h = new q(i10, 2);
        f54993i = new q(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10, int i11) {
        super(i10);
        this.f54994e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f54994e) {
            case 0:
                kotlin.jvm.internal.n.f((yl.b) obj, "it");
                return 0;
            case 1:
                b0 it = (b0) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return ((cl.h0) it).f6518e;
            case 2:
                j it2 = (j) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return Boolean.valueOf(!(it2 instanceof i));
            default:
                j it3 = (j) obj;
                kotlin.jvm.internal.n.f(it3, "it");
                List typeParameters = ((b) it3).getTypeParameters();
                kotlin.jvm.internal.n.e(typeParameters, "it as CallableDescriptor).typeParameters");
                return xj.n.g0(typeParameters);
        }
    }
}
