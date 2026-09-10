package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.apical;
import genesic.stratoscope;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impassible extends polloi implements apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Constructor<?> f30253attabal;

    public impassible(Constructor<?> member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f30253attabal = member;
    }

    @Override // genesic.apical
    public List<stratoscope> beachfront() {
        Type[] genericParameterTypes = privatdozent().getGenericParameterTypes();
        Intrinsics.beachfront(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return adultoid.formularize();
        }
        Class<?> declaringClass = privatdozent().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) arytenoidectomy.arytenoidectomy(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = privatdozent().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + privatdozent());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            Intrinsics.beachfront(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) arytenoidectomy.arytenoidectomy(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        Intrinsics.beachfront(genericParameterTypes);
        Intrinsics.beachfront(parameterAnnotations);
        return creditor(genericParameterTypes, parameterAnnotations, privatdozent().isVarArgs());
    }

    @Override // genesic.cord
    public List<preprohormone> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = privatdozent().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new preprohormone(typeVariable));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.polloi
    /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
    public Constructor<?> privatdozent() {
        return this.f30253attabal;
    }
}
