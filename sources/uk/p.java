package uk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52238e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f52239f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(Method method, boolean z10, int i10) {
        z10 = (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.n.e(genericParameterTypes, "method.genericParameterTypes");
        this(method, z10, genericParameterTypes);
    }

    @Override // uk.u
    public void c(Object[] args) {
        switch (this.f52238e) {
            case 0:
                kotlin.jvm.internal.n.f(args, "args");
                com.google.android.gms.internal.auth.o.c(this, args);
                if (this.f52239f && xj.k.x0(args) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.c(args);
                return;
        }
    }

    @Override // uk.f
    public Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.n.f(args, "args");
        c(args);
        ((Field) this.f52243a).set(this.f52245c != null ? xj.k.o0(args) : null, xj.k.x0(args));
        return wj.r.f53297a;
    }

    public Object e(Object obj, Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        return this.f52239f ? wj.r.f53297a : ((Method) this.f52243a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(Method method, boolean z10, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.n.e(genericReturnType, "method.genericReturnType");
        super(method, genericReturnType, z10 ? method.getDeclaringClass() : null, typeArr);
        this.f52239f = genericReturnType.equals(Void.TYPE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(Field field, boolean z10, boolean z11) {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.n.e(TYPE, "TYPE");
        Class<?> declaringClass = z11 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.n.e(genericType, "field.genericType");
        super(field, TYPE, declaringClass, new Type[]{genericType});
        this.f52239f = z10;
    }
}
