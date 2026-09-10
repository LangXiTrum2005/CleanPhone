package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import genesic.cord;
import genesic.preprohormone;
import java.util.Map;
import lyreflower.attabal;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.marial;
import yeast.competently;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaTypeParameterResolver implements competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f30448attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f30449dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final competently<preprohormone, marial> f30450marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final apical f30451saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<preprohormone, Integer> f30452wireman;

    public LazyJavaTypeParameterResolver(wireman c, apical containingDeclaration, cord typeParameterOwner, int i) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f30448attabal = c;
        this.f30451saneness = containingDeclaration;
        this.f30449dern = i;
        this.f30452wireman = attabal.wireman(typeParameterOwner.getTypeParameters());
        this.f30450marial = c.marial().competently(new Function1<preprohormone, marial>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final marial invoke(preprohormone typeParameter) {
                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                Integer num = (Integer) this.this$0.f30452wireman.get(typeParameter);
                if (num == null) {
                    return null;
                }
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.this$0;
                return new marial(ContextKt.impromptu(ContextKt.saneness(lazyJavaTypeParameterResolver.f30448attabal, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.f30451saneness.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f30449dern + num.intValue(), lazyJavaTypeParameterResolver.f30451saneness);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.lazy.competently
    public clubfoot attabal(preprohormone javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        marial marialVarInvoke = this.f30450marial.invoke(javaTypeParameter);
        return marialVarInvoke != null ? marialVarInvoke : this.f30448attabal.beachfront().attabal(javaTypeParameter);
    }
}
