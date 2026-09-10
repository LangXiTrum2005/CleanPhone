package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static z0 f4624c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f4625b;

    public z0(Application application) {
        this.f4625b = application;
    }

    @Override // androidx.lifecycle.b1, androidx.lifecycle.a1
    public final x0 a(Class cls) {
        Application application = this.f4625b;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class cls, e1.c cVar) {
        if (this.f4625b != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f39019a.get(y0.f4620a);
        if (application != null) {
            return c(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }

    public final x0 c(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            x0 x0Var = (x0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.n.e(x0Var, "{\n                try {\n…          }\n            }");
            return x0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(defpackage.e.l(cls, "Cannot create an instance of "), e13);
        }
    }
}
