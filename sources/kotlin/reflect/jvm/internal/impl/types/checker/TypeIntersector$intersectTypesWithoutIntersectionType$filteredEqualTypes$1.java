package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReference implements Function2<KotlinType, KotlinType, Boolean> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(TypeIntersector.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        KotlinType p0 = (KotlinType) obj;
        KotlinType p1 = (KotlinType) obj2;
        Intrinsics.f(p0, "p0");
        Intrinsics.f(p1, "p1");
        ((TypeIntersector) this.receiver).getClass();
        NewKotlinTypeChecker.f44572b.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.f44574b;
        return Boolean.valueOf(newKotlinTypeCheckerImpl.d(p0, p1) && !newKotlinTypeCheckerImpl.d(p1, p0));
    }
}
