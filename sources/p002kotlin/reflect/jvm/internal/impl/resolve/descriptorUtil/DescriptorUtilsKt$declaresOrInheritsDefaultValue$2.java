package p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kurbash.competently;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReference;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends FunctionReference implements Function1<cultivated, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    public DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public final String getName() {
        return "declaresDefaultValue";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final competently getOwner() {
        return polloi.saneness(cultivated.class);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Boolean invoke(cultivated p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.lightstruck());
    }
}
