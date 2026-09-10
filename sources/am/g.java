package am;

import cl.x0;
import pm.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f3701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f3702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f3703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f3704i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3705e;

    static {
        int i10 = 1;
        f3701f = new g(i10, 0);
        f3702g = new g(i10, 1);
        f3703h = new g(i10, 2);
        f3704i = new g(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11) {
        super(i10);
        this.f3705e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f3705e) {
            case 0:
                return "";
            case 1:
                y it = (y) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return it;
            case 2:
                kotlin.jvm.internal.n.f((x0) obj, "it");
                return "...";
            default:
                y it2 = (y) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return it2;
        }
    }
}
