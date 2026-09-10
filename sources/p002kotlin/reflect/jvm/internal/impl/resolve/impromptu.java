package p002kotlin.reflect.jvm.internal.impl.resolve;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class impromptu extends taiyuan {
    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
    public void dern(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        marial(fromSuper, fromCurrent);
    }

    public abstract void marial(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.taiyuan
    public void saneness(CallableMemberDescriptor first, CallableMemberDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        marial(first, second);
    }
}
