package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes7.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f43587e;
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractClassDescriptor f43588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KotlinTypeRefiner f43590c;
    public final NotNullLazyValue d;

    public static final class Companion {
    }

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        f43587e = new Companion();
    }

    public ScopesHolderForClass(AbstractClassDescriptor abstractClassDescriptor, LockBasedStorageManager lockBasedStorageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f43588a = abstractClassDescriptor;
        this.f43589b = function1;
        this.f43590c = kotlinTypeRefiner;
        this.d = lockBasedStorageManager.a(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$scopeForOwnerModule$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScopesHolderForClass scopesHolderForClass = this.X;
                return (MemberScope) scopesHolderForClass.f43589b.invoke(scopesHolderForClass.f43590c);
            }
        });
    }

    public final MemberScope a(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.c(DescriptorUtilsKt.j(this.f43588a));
        return (MemberScope) StorageKt.a(this.d, f[0]);
    }
}
