package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class OverridingStrategy {
    public abstract void a(CallableMemberDescriptor callableMemberDescriptor);

    public void b(CallableMemberDescriptor member, Collection collection) {
        Intrinsics.f(member, "member");
        member.x0(collection);
    }
}
