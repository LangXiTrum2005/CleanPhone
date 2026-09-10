package no;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f46874a;

    public a(i iVar) {
        this.f46874a = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z10 = obj instanceof a;
        i iVar = this.f46874a;
        return z10 ? iVar.equals(((a) obj).f46874a) : iVar.equals(obj);
    }

    public final int hashCode() {
        return this.f46874a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f46874a, objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        } catch (ReflectiveOperationException e11) {
            throw new RuntimeException("Reflection failed for method " + method, e11);
        }
    }
}
