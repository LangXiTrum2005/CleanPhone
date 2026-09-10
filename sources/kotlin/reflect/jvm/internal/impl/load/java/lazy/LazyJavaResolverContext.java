package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaResolverContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaResolverComponents f43840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeParameterResolver f43841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43842c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JavaTypeResolver f43843e;

    public LazyJavaResolverContext(JavaResolverComponents javaResolverComponents, TypeParameterResolver typeParameterResolver, Lazy lazy) {
        Intrinsics.f(typeParameterResolver, "typeParameterResolver");
        this.f43840a = javaResolverComponents;
        this.f43841b = typeParameterResolver;
        this.f43842c = lazy;
        this.d = lazy;
        this.f43843e = new JavaTypeResolver(this, typeParameterResolver);
    }
}
