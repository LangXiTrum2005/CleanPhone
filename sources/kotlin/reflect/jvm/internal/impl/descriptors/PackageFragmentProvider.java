package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public interface PackageFragmentProvider {
    List a(FqName fqName);

    Collection m(FqName fqName, Function1 function1);
}
