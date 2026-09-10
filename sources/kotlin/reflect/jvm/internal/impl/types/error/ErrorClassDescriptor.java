package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(Name name) {
        ErrorUtils errorUtils = ErrorUtils.f44590a;
        ErrorModuleDescriptor errorModuleDescriptor = ErrorUtils.f44591b;
        Modality modality = Modality.Z;
        ClassKind classKind = ClassKind.X;
        List list = EmptyList.X;
        SourceElement sourceElement = SourceElement.f43591a;
        super(errorModuleDescriptor, name, modality, classKind, list, (LockBasedStorageManager) LockBasedStorageManager.f44473e);
        ClassConstructorDescriptorImpl classConstructorDescriptorImpl = new ClassConstructorDescriptorImpl(this, null, Annotations.Companion.f43614a, true, CallableMemberDescriptor.Kind.X, sourceElement);
        classConstructorDescriptorImpl.R0(list, DescriptorVisibilities.d);
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = classConstructorDescriptorImpl.getName().X;
        Intrinsics.e(str, "errorConstructor.name.toString()");
        ErrorScope errorScopeB = ErrorUtils.b(errorScopeKind, str, "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_CLASS;
        classConstructorDescriptorImpl.h0 = new ErrorType(ErrorUtils.d(errorTypeKind, new String[0]), errorScopeB, errorTypeKind, list, false, new String[0]);
        G0(errorScopeB, SetsKt.h(classConstructorDescriptorImpl), classConstructorDescriptorImpl);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor
    /* JADX INFO: renamed from: F0 */
    public final ClassDescriptor b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public final MemberScope Z(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ERROR_CLASS;
        String str = getName().X;
        Intrinsics.e(str, "name.toString()");
        return ErrorUtils.b(errorScopeKind, str, typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    public final String toString() {
        String strB = getName().b();
        Intrinsics.e(strB, "name.asString()");
        return strB;
    }
}
