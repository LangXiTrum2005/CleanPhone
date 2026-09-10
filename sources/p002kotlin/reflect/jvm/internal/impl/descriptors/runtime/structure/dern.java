package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f30243attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static attabal f30244saneness;

    /* JADX INFO: compiled from: ReflectJavaMember.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Method f30245attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Method f30246saneness;

        public attabal(Method method, Method method2) {
            this.f30245attabal = method;
            this.f30246saneness = method2;
        }

        public final Method attabal() {
            return this.f30246saneness;
        }

        public final Method saneness() {
            return this.f30245attabal;
        }
    }

    public final attabal attabal(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new attabal(cls.getMethod("getParameters", null), ReflectClassUtilKt.beachfront(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new attabal(null, null);
        }
    }

    public final List<String> saneness(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodAttabal;
        Intrinsics.checkNotNullParameter(member, "member");
        attabal attabalVarAttabal = f30244saneness;
        if (attabalVarAttabal == null) {
            synchronized (this) {
                attabalVarAttabal = f30244saneness;
                if (attabalVarAttabal == null) {
                    attabalVarAttabal = f30243attabal.attabal(member);
                    f30244saneness = attabalVarAttabal;
                }
            }
        }
        Method methodSaneness = attabalVarAttabal.saneness();
        if (methodSaneness == null || (methodAttabal = attabalVarAttabal.attabal()) == null) {
            return null;
        }
        Object objInvoke = methodSaneness.invoke(member, null);
        Intrinsics.competently(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodAttabal.invoke(obj, null);
            Intrinsics.competently(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
