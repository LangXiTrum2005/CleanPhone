package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {
    public static final ReflectLambdaKt$reflect$descriptor$1 X = new ReflectLambdaKt$reflect$descriptor$1(2);

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    /* JADX INFO: renamed from: getName */
    public final String getH0() {
        return "loadFunction";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer p0 = (MemberDeserializer) obj;
        ProtoBuf.Function p1 = (ProtoBuf.Function) obj2;
        Intrinsics.f(p0, "p0");
        Intrinsics.f(p1, "p1");
        return p0.e(p1);
    }
}
