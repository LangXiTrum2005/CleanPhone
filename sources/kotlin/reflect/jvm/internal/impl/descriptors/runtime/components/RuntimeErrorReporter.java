package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* JADX INFO: loaded from: classes7.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RuntimeErrorReporter f43677b = new RuntimeErrorReporter();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void a(ClassDescriptor descriptor, ArrayList arrayList) {
        Intrinsics.f(descriptor, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    public final void b(CallableMemberDescriptor descriptor) {
        Intrinsics.f(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
