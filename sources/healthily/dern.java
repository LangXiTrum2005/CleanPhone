package healthily;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.monoploid;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f27609attabal = new dern();

    public final p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront attabal(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (!cls.isPrimitive()) {
            byname.saneness sanenessVarAttabal = ReflectClassUtilKt.attabal(cls);
            p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern dernVar = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern.f29852attabal;
            byname.dern dernVarSaneness = sanenessVarAttabal.saneness();
            Intrinsics.checkNotNullExpressionValue(dernVarSaneness, "asSingleFqName(...)");
            byname.saneness sanenessVarImpassible = dernVar.impassible(dernVarSaneness);
            if (sanenessVarImpassible != null) {
                sanenessVarAttabal = sanenessVarImpassible;
            }
            return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront(sanenessVarAttabal, i);
        }
        if (Intrinsics.wireman(cls, Void.TYPE)) {
            byname.saneness sanenessVarImpassible2 = byname.saneness.impassible(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29698beachfront.formularize());
            Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible2, "topLevel(...)");
            return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront(sanenessVarImpassible2, i);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
        if (i > 0) {
            byname.saneness sanenessVarImpassible3 = byname.saneness.impassible(primitiveType.getArrayTypeFqName());
            Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible3, "topLevel(...)");
            return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront(sanenessVarImpassible3, i - 1);
        }
        byname.saneness sanenessVarImpassible4 = byname.saneness.impassible(primitiveType.getTypeFqName());
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible4, "topLevel(...)");
        return new p002kotlin.reflect.jvm.internal.impl.resolve.constants.beachfront(sanenessVarImpassible4, i);
    }

    public final void beachfront(monoploid.dern dernVar, Annotation annotation) throws InvocationTargetException {
        Class<?> clsSaneness = gibeonite.attabal.saneness(gibeonite.attabal.attabal(annotation));
        monoploid.attabal attabalVarDern = dernVar.dern(ReflectClassUtilKt.attabal(clsSaneness), new saneness(annotation));
        if (attabalVarDern != null) {
            f27609attabal.impromptu(attabalVarDern, annotation, clsSaneness);
        }
    }

    public final void competently(monoploid.attabal attabalVar, byname.marial marialVar, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.wireman(enclosingClass, Class.class)) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            attabalVar.beachfront(marialVar, attabal((Class) obj));
            return;
        }
        if (taiyuan.f27614attabal.contains(enclosingClass)) {
            attabalVar.marial(marialVar, obj);
            return;
        }
        if (ReflectClassUtilKt.impromptu(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            Intrinsics.beachfront(enclosingClass);
            byname.saneness sanenessVarAttabal = ReflectClassUtilKt.attabal(enclosingClass);
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            byname.marial marialVarCutely = byname.marial.cutely(((Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            attabalVar.saneness(marialVar, sanenessVarAttabal, marialVarCutely);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) polloi.czestochowa(interfaces);
            Intrinsics.beachfront(cls);
            monoploid.attabal attabalVarWireman = attabalVar.wireman(marialVar, ReflectClassUtilKt.attabal(cls));
            if (attabalVarWireman == null) {
                return;
            }
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Annotation");
            impromptu(attabalVarWireman, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        monoploid.saneness sanenessVarDern = attabalVar.dern(marialVar);
        if (sanenessVarDern == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i = 0;
        if (componentType.isEnum()) {
            Intrinsics.beachfront(componentType);
            byname.saneness sanenessVarAttabal2 = ReflectClassUtilKt.attabal(componentType);
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                Object obj2 = objArr[i];
                Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                byname.marial marialVarCutely2 = byname.marial.cutely(((Enum) obj2).name());
                Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "identifier(...)");
                sanenessVarDern.saneness(sanenessVarAttabal2, marialVarCutely2);
                i++;
            }
        } else if (Intrinsics.wireman(componentType, Class.class)) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i < length2) {
                Object obj3 = objArr2[i];
                Intrinsics.competently(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                sanenessVarDern.wireman(attabal((Class) obj3));
                i++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i < length3) {
                Object obj4 = objArr3[i];
                Intrinsics.beachfront(componentType);
                monoploid.attabal attabalVarMarial = sanenessVarDern.marial(ReflectClassUtilKt.attabal(componentType));
                if (attabalVarMarial != null) {
                    Intrinsics.competently(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    impromptu(attabalVarMarial, (Annotation) obj4, componentType);
                }
                i++;
            }
        } else {
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i < length4) {
                sanenessVarDern.dern(objArr4[i]);
                i++;
            }
        }
        sanenessVarDern.attabal();
    }

    public final void dern(Class<?> cls, monoploid.wireman wiremanVar) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        int i;
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        int length = declaredConstructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor<?> constructor = declaredConstructors[i2];
            byname.marial marialVar = byname.competently.f15245taiyuan;
            impassible impassibleVar = impassible.f27612attabal;
            Intrinsics.beachfront(constructor);
            monoploid.marial marialVarAttabal = wiremanVar.attabal(marialVar, impassibleVar.attabal(constructor));
            if (marialVarAttabal == null) {
                constructorArr = declaredConstructors;
                i = length;
            } else {
                Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.beachfront(annotation);
                    beachfront(marialVarAttabal, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.beachfront(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length2 = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        Annotation[] annotationArr = parameterAnnotations[i3];
                        Intrinsics.beachfront(annotationArr);
                        int length4 = annotationArr.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            Annotation annotation2 = annotationArr[i4];
                            Class<?> clsSaneness = gibeonite.attabal.saneness(gibeonite.attabal.attabal(annotation2));
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            byname.saneness sanenessVarAttabal = ReflectClassUtilKt.attabal(clsSaneness);
                            int i5 = length;
                            Intrinsics.beachfront(annotation2);
                            monoploid.attabal attabalVarSaneness = marialVarAttabal.saneness(i3 + length2, sanenessVarAttabal, new saneness(annotation2));
                            if (attabalVarSaneness != null) {
                                f27609attabal.impromptu(attabalVarSaneness, annotation2, clsSaneness);
                            }
                            i4++;
                            declaredConstructors = constructorArr2;
                            length = i5;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length;
                marialVarAttabal.attabal();
            }
            i2++;
            declaredConstructors = constructorArr;
            length = i;
        }
    }

    public final void impromptu(monoploid.attabal attabalVar, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.beachfront(objInvoke);
                byname.marial marialVarCutely = byname.marial.cutely(method.getName());
                Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
                competently(attabalVar, marialVarCutely, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        attabalVar.attabal();
    }

    public final void marial(Class<?> cls, monoploid.wireman wiremanVar) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            byname.marial marialVarCutely = byname.marial.cutely(method.getName());
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            impassible impassibleVar = impassible.f27612attabal;
            Intrinsics.beachfront(method);
            monoploid.marial marialVarAttabal = wiremanVar.attabal(marialVarCutely, impassibleVar.dern(method));
            if (marialVarAttabal != null) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.beachfront(annotation);
                    beachfront(marialVarAttabal, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    Annotation[] annotationArr2 = annotationArr[i];
                    Intrinsics.beachfront(annotationArr2);
                    for (Annotation annotation2 : annotationArr2) {
                        Class<?> clsSaneness = gibeonite.attabal.saneness(gibeonite.attabal.attabal(annotation2));
                        byname.saneness sanenessVarAttabal = ReflectClassUtilKt.attabal(clsSaneness);
                        Intrinsics.beachfront(annotation2);
                        monoploid.attabal attabalVarSaneness = marialVarAttabal.saneness(i, sanenessVarAttabal, new saneness(annotation2));
                        if (attabalVarSaneness != null) {
                            f27609attabal.impromptu(attabalVarSaneness, annotation2, clsSaneness);
                        }
                    }
                }
                marialVarAttabal.attabal();
            }
        }
    }

    public final void saneness(Class<?> klass, monoploid.dern visitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.beachfront(annotation);
            beachfront(visitor, annotation);
        }
        visitor.attabal();
    }

    public final void taiyuan(Class<?> klass, monoploid.wireman memberVisitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        marial(klass, memberVisitor);
        dern(klass, memberVisitor);
        wireman(klass, memberVisitor);
    }

    public final void wireman(Class<?> cls, monoploid.wireman wiremanVar) throws InvocationTargetException {
        Field[] declaredFields = cls.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            byname.marial marialVarCutely = byname.marial.cutely(field.getName());
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            impassible impassibleVar = impassible.f27612attabal;
            Intrinsics.beachfront(field);
            monoploid.dern dernVarSaneness = wiremanVar.saneness(marialVarCutely, impassibleVar.saneness(field), null);
            if (dernVarSaneness != null) {
                Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.beachfront(annotation);
                    beachfront(dernVarSaneness, annotation);
                }
                dernVarSaneness.attabal();
            }
        }
    }
}
