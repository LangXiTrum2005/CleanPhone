package fl;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends e implements pl.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f40992b;

    public g(yl.f fVar, Object[] objArr) {
        super(fVar);
        this.f40992b = objArr;
    }

    public final ArrayList a() {
        e oVar;
        Object[] objArr = this.f40992b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.n.c(obj);
            Class<?> cls = obj.getClass();
            List list = c.f40980a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new s(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                oVar = new f(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                oVar = new g(null, (Object[]) obj);
            } else {
                oVar = obj instanceof Class ? new o(null, (Class) obj) : new u(null, obj);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }
}
