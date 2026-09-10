package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public interface VariableDescriptor extends ValueDescriptor {
    boolean I();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    VariableDescriptor b(TypeSubstitutor typeSubstitutor);

    ConstantValue h0();

    boolean isConst();

    boolean s0();
}
