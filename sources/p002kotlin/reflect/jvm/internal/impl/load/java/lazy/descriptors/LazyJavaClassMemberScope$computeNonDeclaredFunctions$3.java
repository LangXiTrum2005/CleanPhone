package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import byname.marial;
import java.util.Collection;
import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReference implements Function1<marial, Collection<? extends hydrovane>> {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(Object obj) {
        super(1, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "searchMethodsByNameWithoutBuiltinMagic";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(LazyJavaClassMemberScope.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Collection<hydrovane> invoke(marial p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((LazyJavaClassMemberScope) this.receiver).mastfed(p0);
    }
}
