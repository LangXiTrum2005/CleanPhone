package fl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f40974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f40975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f40976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f40977i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40978e;

    static {
        int i10 = 1;
        f40974f = new b(i10, 0);
        f40975g = new b(i10, 1);
        f40976h = new b(i10, 2);
        f40977i = new b(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f40978e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f40978e) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                kotlin.jvm.internal.n.f(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it2 = (ParameterizedType) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                Type[] actualTypeArguments = it2.getActualTypeArguments();
                kotlin.jvm.internal.n.e(actualTypeArguments, "it.actualTypeArguments");
                return xj.k.b0(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!yl.f.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return yl.f.e(simpleName);
                }
                return null;
        }
    }
}
