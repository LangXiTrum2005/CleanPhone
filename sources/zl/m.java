package zl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f55070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f55072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f55073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f55074e;

    public m(a aVar, Object obj, a aVar2, l lVar, Class cls) {
        if (aVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (lVar.f55068b == i0.f55048f && aVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f55070a = aVar;
        this.f55071b = obj;
        this.f55072c = aVar2;
        this.f55073d = lVar;
        if (!o.class.isAssignableFrom(cls)) {
            this.f55074e = null;
            return;
        }
        try {
            this.f55074e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            throw new RuntimeException(q4.a.j(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e10);
        }
    }

    public final Object a(Object obj) {
        if (this.f55073d.f55068b.f55051a != j0.ENUM) {
            return obj;
        }
        try {
            return this.f55074e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f55073d.f55068b.f55051a == j0.ENUM ? Integer.valueOf(((o) obj).getNumber()) : obj;
    }
}
