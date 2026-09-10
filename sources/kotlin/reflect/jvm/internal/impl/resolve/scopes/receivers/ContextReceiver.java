package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeclarationDescriptorNonRootImpl f44362c;
    public final Name d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContextReceiver(CallableDescriptor callableDescriptor, KotlinType receiverType, Name name, ReceiverValue receiverValue) {
        super(receiverType, receiverValue);
        Intrinsics.f(receiverType, "receiverType");
        this.f44362c = (DeclarationDescriptorNonRootImpl) callableDescriptor;
        this.d = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    public final Name a() {
        return this.d;
    }

    public final String toString() {
        return "Cxt { " + this.f44362c + " }";
    }
}
