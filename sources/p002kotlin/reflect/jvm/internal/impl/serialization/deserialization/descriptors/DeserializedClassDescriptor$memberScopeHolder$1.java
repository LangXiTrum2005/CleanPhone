package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements Function1<beachfront, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "<init>";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(beachfront p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p0);
    }
}
