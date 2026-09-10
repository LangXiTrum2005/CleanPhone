package rl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.o implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f49617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f49618g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49619e;

    static {
        int i10 = 2;
        f49617f = new b(i10, 0);
        f49618g = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f49619e = i11;
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49619e) {
            case 0:
                a loadConstantFromProperty = (a) obj;
                o it = (o) obj2;
                kotlin.jvm.internal.n.f(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.n.f(it, "it");
                return loadConstantFromProperty.f49616c.get(it);
            default:
                a loadConstantFromProperty2 = (a) obj;
                o it2 = (o) obj2;
                kotlin.jvm.internal.n.f(loadConstantFromProperty2, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.n.f(it2, "it");
                return loadConstantFromProperty2.f49615b.get(it2);
        }
    }
}
