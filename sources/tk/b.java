package tk;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f50945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f50946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f50947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f50948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f50949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f50950k;
    public static final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f50951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f50952n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f50953e;

    static {
        int i10 = 1;
        f50945f = new b(i10, 0);
        f50946g = new b(i10, 1);
        f50947h = new b(i10, 2);
        f50948i = new b(i10, 3);
        f50949j = new b(i10, 4);
        f50950k = new b(i10, 5);
        l = new b(i10, 6);
        f50951m = new b(i10, 7);
        f50952n = new b(i10, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f50953e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f50953e) {
            case 0:
                Class it = (Class) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return new z(it);
            case 1:
                Class it2 = (Class) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return new q0(it2);
            case 2:
                Class<?> returnType = ((Method) obj).getReturnType();
                kotlin.jvm.internal.n.e(returnType, "it.returnType");
                return fl.c.b(returnType);
            case 3:
                Class it3 = (Class) obj;
                kotlin.jvm.internal.n.e(it3, "it");
                return fl.c.b(it3);
            case 4:
                zk.s descriptor = (zk.s) obj;
                kotlin.jvm.internal.n.f(descriptor, "descriptor");
                return am.h.f3708e.w(descriptor) + " | " + t1.c(descriptor).c();
            case 5:
                zk.h0 descriptor2 = (zk.h0) obj;
                kotlin.jvm.internal.n.f(descriptor2, "descriptor");
                return am.h.f3708e.w(descriptor2) + " | " + t1.b(descriptor2).c();
            case 6:
                am.h hVar = s1.f51061a;
                pm.y type = ((cl.x0) obj).getType();
                kotlin.jvm.internal.n.e(type, "it.type");
                return s1.d(type);
            case 7:
                am.h hVar2 = s1.f51061a;
                pm.y type2 = ((cl.x0) obj).getType();
                kotlin.jvm.internal.n.e(type2, "it.type");
                return s1.d(type2);
            default:
                Class it4 = (Class) obj;
                kotlin.jvm.internal.n.e(it4, "it");
                return fl.c.b(it4);
        }
    }
}
