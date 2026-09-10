package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Visibility f43560a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        Intrinsics.f(delegate, "delegate");
        this.f43560a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final Visibility a() {
        return this.f43560a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final String b() {
        return this.f43560a.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public final DescriptorVisibility d() {
        return DescriptorVisibilities.g(this.f43560a.c());
    }
}
