package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.saneness;
import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;

/* JADX INFO: compiled from: findClassInModule.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends FunctionReference implements Function1<saneness, saneness> {
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 INSTANCE = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1();

    public FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1() {
        super(1);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(saneness.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final saneness invoke(saneness p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.competently();
    }
}
