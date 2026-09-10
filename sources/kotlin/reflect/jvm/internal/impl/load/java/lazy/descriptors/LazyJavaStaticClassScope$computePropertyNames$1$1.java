package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes7.dex */
final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements Function1<MemberScope, Collection<? extends Name>> {
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 X = new LazyJavaStaticClassScope$computePropertyNames$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MemberScope it = (MemberScope) obj;
        Intrinsics.f(it, "it");
        return it.c();
    }
}
