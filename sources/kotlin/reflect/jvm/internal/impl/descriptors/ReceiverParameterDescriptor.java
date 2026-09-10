package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    AbstractReceiverParameterDescriptor b(TypeSubstitutor typeSubstitutor);

    ReceiverValue getValue();
}
