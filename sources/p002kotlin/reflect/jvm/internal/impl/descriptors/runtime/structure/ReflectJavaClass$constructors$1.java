package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class ReflectJavaClass$constructors$1 extends FunctionReference implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$constructors$1 INSTANCE = new ReflectJavaClass$constructors$1();

    public ReflectJavaClass$constructors$1() {
        super(1);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "isSynthetic";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(Member.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Boolean invoke(Member p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
