package p002kotlin.reflect.jvm.internal.impl.types.checker;

import kurbash.competently;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReference implements Function2<oilcan, oilcan, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(Object obj) {
        super(2, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "isStrictSupertype";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(TypeIntersector.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Boolean invoke(oilcan p0, oilcan p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return Boolean.valueOf(((TypeIntersector) this.receiver).marial(p0, p1));
    }
}
