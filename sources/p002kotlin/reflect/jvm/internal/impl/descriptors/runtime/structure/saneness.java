package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f30258attabal = new saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static attabal f30259saneness;

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f30260attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Method f30261dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Method f30262saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Method f30263wireman;

        public attabal(Method method, Method method2, Method method3, Method method4) {
            this.f30260attabal = method;
            this.f30262saneness = method2;
            this.f30261dern = method3;
            this.f30263wireman = method4;
        }

        public final Method attabal() {
            return this.f30262saneness;
        }

        public final Method dern() {
            return this.f30261dern;
        }

        public final Method saneness() {
            return this.f30263wireman;
        }

        public final Method wireman() {
            return this.f30260attabal;
        }
    }

    public final attabal attabal() {
        try {
            return new attabal(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new attabal(null, null, null, null);
        }
    }

    public final Boolean beachfront(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodWireman = saneness().wireman();
        if (methodWireman == null) {
            return null;
        }
        Object objInvoke = methodWireman.invoke(clazz, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Class<?>[] dern(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodAttabal = saneness().attabal();
        if (methodAttabal == null) {
            return null;
        }
        Object objInvoke = methodAttabal.invoke(clazz, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Boolean marial(Class<?> clazz) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodDern = saneness().dern();
        if (methodDern == null) {
            return null;
        }
        Object objInvoke = methodDern.invoke(clazz, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final attabal saneness() {
        attabal attabalVar = f30259saneness;
        if (attabalVar != null) {
            return attabalVar;
        }
        attabal attabalVarAttabal = attabal();
        f30259saneness = attabalVarAttabal;
        return attabalVarAttabal;
    }

    public final Object[] wireman(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Method methodSaneness = saneness().saneness();
        if (methodSaneness == null) {
            return null;
        }
        return (Object[]) methodSaneness.invoke(clazz, null);
    }
}
