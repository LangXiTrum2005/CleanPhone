package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class UtilsKt {
    public static final void a(LookupTracker.DO_NOTHING do_nothing, LookupLocation from, ClassDescriptor scopeOwner, Name name) {
        Intrinsics.f(do_nothing, "<this>");
        Intrinsics.f(from, "from");
        Intrinsics.f(scopeOwner, "scopeOwner");
        Intrinsics.f(name, "name");
    }

    public static final void b(LookupTracker.DO_NOTHING do_nothing, LookupLocation from, PackageFragmentDescriptor scopeOwner, Name name) {
        Intrinsics.f(do_nothing, "<this>");
        Intrinsics.f(from, "from");
        Intrinsics.f(scopeOwner, "scopeOwner");
        Intrinsics.f(name, "name");
        scopeOwner.c().b();
        Intrinsics.e(name.b(), "name.asString()");
    }
}
