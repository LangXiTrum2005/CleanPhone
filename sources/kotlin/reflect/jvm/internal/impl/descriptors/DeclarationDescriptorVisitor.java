package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
public interface DeclarationDescriptorVisitor<R, D> {
    Object a(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, Object obj);

    Object b(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, Object obj);

    Object c(ModuleAwareClassDescriptor moduleAwareClassDescriptor, Object obj);

    Object d(Object obj, ModuleDescriptorImpl moduleDescriptorImpl);

    Object e(PropertySetterDescriptorImpl propertySetterDescriptorImpl, Object obj);

    Object f(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, Object obj);

    Object g(PropertyDescriptorImpl propertyDescriptorImpl, Object obj);

    Object h(ValueParameterDescriptorImpl valueParameterDescriptorImpl, Object obj);

    Object i(PackageFragmentDescriptorImpl packageFragmentDescriptorImpl, Object obj);

    Object j(AbstractReceiverParameterDescriptor abstractReceiverParameterDescriptor, Object obj);

    Object k(ClassConstructorDescriptorImpl classConstructorDescriptorImpl, Object obj);

    Object l(FunctionDescriptor functionDescriptor, Object obj);

    Object m(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, Object obj);
}
