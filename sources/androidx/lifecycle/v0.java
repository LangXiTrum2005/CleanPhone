package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4600a = xj.o.Q(Application.class, o0.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f4601b = j1.f.C(o0.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.n.f(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.n.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.n.e(parameterTypes, "constructor.parameterTypes");
            List listC0 = xj.k.C0(parameterTypes);
            if (signature.equals(listC0)) {
                return constructor;
            }
            if (signature.size() == listC0.size() && listC0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final x0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (x0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(defpackage.e.l(cls, "Failed to access "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(defpackage.e.l(cls, "An exception happened in constructor of "), e12.getCause());
        }
    }
}
