package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    List a0();

    FqName c();

    boolean isEmpty();

    MemberScope n();

    ModuleDescriptorImpl v0();
}
