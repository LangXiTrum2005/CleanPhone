package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* JADX INFO: loaded from: classes7.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    DeclarationDescriptor a();

    DeclarationDescriptor d();

    Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj);
}
