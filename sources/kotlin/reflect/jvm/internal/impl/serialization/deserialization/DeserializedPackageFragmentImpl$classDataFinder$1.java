package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements Function1<ClassId, SourceElement> {
    public final /* synthetic */ DeserializedPackageFragmentImpl X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.X = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassId it = (ClassId) obj;
        Intrinsics.f(it, "it");
        this.X.getClass();
        return SourceElement.f43591a;
    }
}
