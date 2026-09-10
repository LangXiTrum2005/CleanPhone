package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    FqName c();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ModuleDescriptor d();

    MemberScope n();
}
