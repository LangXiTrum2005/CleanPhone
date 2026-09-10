package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DescriptorVisibility {
    public abstract Visibility a();

    public abstract String b();

    public abstract boolean c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);

    public abstract DescriptorVisibility d();

    public final String toString() {
        return a().b();
    }
}
