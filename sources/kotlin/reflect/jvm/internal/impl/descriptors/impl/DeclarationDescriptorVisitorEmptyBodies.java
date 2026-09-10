package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public class DeclarationDescriptorVisitorEmptyBodies<R, D> implements DeclarationDescriptorVisitor<R, D> {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object a(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object c(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object d(Object obj, ModuleDescriptorImpl moduleDescriptorImpl) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object e(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj) {
        return l(propertySetterDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object f(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj) {
        return l(propertyGetterDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object g(PropertyDescriptorImpl propertyDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object h(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object i(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object j(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object k(ClassConstructorDescriptorImpl classConstructorDescriptorImpl, Object obj) {
        return l(classConstructorDescriptorImpl, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object l(FunctionDescriptor functionDescriptor, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public final Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj) {
        return null;
    }
}
