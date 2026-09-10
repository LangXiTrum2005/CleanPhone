package uk;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends u {
    /* JADX WARN: Illegal instructions before constructor call */
    public l(Field field, boolean z10) {
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.n.e(genericType, "field.genericType");
        super(field, genericType, z10 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // uk.f
    public Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        c(args);
        return ((Field) this.f52243a).get(this.f52245c != null ? xj.k.o0(args) : null);
    }
}
