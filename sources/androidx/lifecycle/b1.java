package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b1 f4527a;

    @Override // androidx.lifecycle.a1
    public x0 a(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.n.e(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (x0) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e12);
        }
    }
}
