package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingStrategy.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class taiyuan {
    public abstract void attabal(CallableMemberDescriptor callableMemberDescriptor);

    public abstract void dern(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public abstract void saneness(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    public void wireman(CallableMemberDescriptor member, Collection<? extends CallableMemberDescriptor> overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.achondroplasia(overridden);
    }
}
