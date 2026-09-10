package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReference implements Function1<Name, SimpleType> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        return "getValueClassPropertyType";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(DeserializedClassDescriptor.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Name p0 = (Name) obj;
        Intrinsics.f(p0, "p0");
        return ((DeserializedClassDescriptor) this.receiver).H0(p0);
    }
}
