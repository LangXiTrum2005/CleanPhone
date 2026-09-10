package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public interface ModuleDescriptor extends DeclarationDescriptor {

    public static final class DefaultImpls {
    }

    Object B0(ModuleCapability moduleCapability);

    boolean F(ModuleDescriptor moduleDescriptor);

    PackageViewDescriptor e0(FqName fqName);

    KotlinBuiltIns k();

    Collection m(FqName fqName, Function1 function1);

    List t0();
}
