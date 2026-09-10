package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes7.dex */
final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements Function0<List<? extends AnnotationDescriptor>> {
    public final /* synthetic */ MemberDeserializer X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ GeneratedMessageLite.ExtendableMessage f44419Y;
    public final /* synthetic */ AnnotatedCallableKind Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.X = memberDeserializer;
        this.f44419Y = extendableMessage;
        this.Z = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listI;
        MemberDeserializer memberDeserializer = this.X;
        ProtoContainer protoContainerA = memberDeserializer.a(memberDeserializer.f44415a.f44403c);
        if (protoContainerA != null) {
            listI = memberDeserializer.f44415a.f44401a.f44394e.i(protoContainerA, this.f44419Y, this.Z);
        } else {
            listI = null;
        }
        return listI == null ? EmptyList.X : listI;
    }
}
