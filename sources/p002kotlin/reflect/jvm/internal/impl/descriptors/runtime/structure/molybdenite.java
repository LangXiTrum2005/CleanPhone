package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.polloi;
import genesic.saneness;
import genesic.stratoscope;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class molybdenite extends polloi implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Method f30255attabal;

    public molybdenite(Method member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f30255attabal = member;
    }

    @Override // genesic.polloi
    public saneness arytenoidectomy() {
        Object defaultValue = privatdozent().getDefaultValue();
        if (defaultValue != null) {
            return marial.f30254attabal.attabal(defaultValue, null);
        }
        return null;
    }

    @Override // genesic.polloi
    public List<stratoscope> beachfront() {
        Type[] genericParameterTypes = privatdozent().getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = privatdozent().getParameterAnnotations();
        Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
        return creditor(genericParameterTypes, parameterAnnotations, privatdozent().isVarArgs());
    }

    @Override // genesic.cord
    public List<preprohormone> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = privatdozent().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new preprohormone(typeVariable));
        }
        return arrayList;
    }

    @Override // genesic.polloi
    /* JADX INFO: renamed from: hydrovane, reason: merged with bridge method [inline-methods] */
    public rotuma getReturnType() {
        rotuma.attabal attabalVar = rotuma.f30257attabal;
        Type genericReturnType = privatdozent().getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        return attabalVar.attabal(genericReturnType);
    }

    @Override // genesic.polloi
    public boolean polder() {
        return arytenoidectomy() != null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.polloi
    /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
    public Method privatdozent() {
        return this.f30255attabal;
    }
}
