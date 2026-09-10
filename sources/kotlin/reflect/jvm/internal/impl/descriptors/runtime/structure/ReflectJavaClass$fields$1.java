package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 X = new ReflectJavaClass$fields$1(1);

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "isSynthetic";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.b(Member.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member p0 = (Member) obj;
        Intrinsics.f(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
