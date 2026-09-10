package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassDescriptor f43897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f43898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Lambda f43899c;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(LazyJavaClassDescriptor lazyJavaClassDescriptor, LinkedHashSet linkedHashSet, Function1 function1) {
        this.f43897a = lazyJavaClassDescriptor;
        this.f43898b = linkedHashSet;
        this.f43899c = (Lambda) function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final /* bridge */ /* synthetic */ Object a() {
        return Unit.f43263a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    public final boolean c(Object obj) {
        ClassDescriptor current = (ClassDescriptor) obj;
        Intrinsics.f(current, "current");
        if (current == this.f43897a) {
            return true;
        }
        MemberScope memberScopeF0 = current.f0();
        Intrinsics.e(memberScopeF0, "current.staticScope");
        if (!(memberScopeF0 instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.f43898b.addAll((Collection) this.f43899c.invoke(memberScopeF0));
        return false;
    }
}
