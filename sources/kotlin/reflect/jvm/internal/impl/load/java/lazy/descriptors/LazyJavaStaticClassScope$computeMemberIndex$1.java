package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* JADX INFO: loaded from: classes7.dex */
final class LazyJavaStaticClassScope$computeMemberIndex$1 extends Lambda implements Function1<JavaMember, Boolean> {
    public static final LazyJavaStaticClassScope$computeMemberIndex$1 X = new LazyJavaStaticClassScope$computeMemberIndex$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JavaMember it = (JavaMember) obj;
        Intrinsics.f(it, "it");
        return Boolean.valueOf(it.f());
    }
}
