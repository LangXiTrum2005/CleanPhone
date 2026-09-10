package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReference implements Function1<KotlinTypeMarker, UnwrappedType> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        return "prepareType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(KotlinTypePreparator.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinTypeMarker p0 = (KotlinTypeMarker) obj;
        Intrinsics.f(p0, "p0");
        return ((KotlinTypePreparator) this.receiver).a(p0);
    }
}
