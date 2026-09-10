package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends FunctionReference implements Function1<ClassId, ClassId> {
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 X = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1(1);

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(ClassId.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassId p0 = (ClassId) obj;
        Intrinsics.f(p0, "p0");
        return p0.f();
    }
}
