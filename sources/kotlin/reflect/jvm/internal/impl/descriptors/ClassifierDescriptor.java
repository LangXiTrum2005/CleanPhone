package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes7.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptor a();

    TypeConstructor h();

    SimpleType o();
}
