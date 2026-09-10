package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30227attabal = new attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static C0676attabal f30228saneness;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ReflectJavaRecordComponent.kt */
    public static final class C0676attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f30229attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Method f30230saneness;

        public C0676attabal(Method method, Method method2) {
            this.f30229attabal = method;
            this.f30230saneness = method2;
        }

        public final Method attabal() {
            return this.f30230saneness;
        }

        public final Method saneness() {
            return this.f30229attabal;
        }
    }

    public final C0676attabal attabal(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0676attabal(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0676attabal(null, null);
        }
    }

    public final Method dern(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method methodAttabal = saneness(recordComponent).attabal();
        if (methodAttabal == null) {
            return null;
        }
        Object objInvoke = methodAttabal.invoke(recordComponent, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final C0676attabal saneness(Object obj) {
        C0676attabal c0676attabal = f30228saneness;
        if (c0676attabal != null) {
            return c0676attabal;
        }
        C0676attabal c0676attabalAttabal = attabal(obj);
        f30228saneness = c0676attabalAttabal;
        return c0676attabalAttabal;
    }

    public final Class<?> wireman(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method methodSaneness = saneness(recordComponent).saneness();
        if (methodSaneness == null) {
            return null;
        }
        Object objInvoke = methodSaneness.invoke(recordComponent, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
