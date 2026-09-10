package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: DeserializedClassDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$1 extends FunctionReference implements Function1<ProtoBuf$Type, merc> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$1(Object obj) {
        super(1, obj);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "simpleType";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(Intrinsics.attabal.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "computeValueClassRepresentation$simpleType(Lorg/jetbrains/kotlin/serialization/deserialization/TypeDeserializer;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;)Lorg/jetbrains/kotlin/types/SimpleType;";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final merc invoke(ProtoBuf$Type p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return TypeDeserializer.triweekly((TypeDeserializer) this.receiver, p0, false, 2, null);
    }
}
