package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements Function1<KotlinTypeRefiner, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(KotlinTypeRefiner p0) {
        Intrinsics.f(p0, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p0);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }
}
