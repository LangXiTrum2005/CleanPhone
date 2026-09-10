package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1 extends NonReportingOverrideStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44448a;

    public DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1(ArrayList arrayList) {
        this.f44448a = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
    public final void a(CallableMemberDescriptor fakeOverride) {
        Intrinsics.f(fakeOverride, "fakeOverride");
        OverridingUtil.r(fakeOverride, null);
        this.f44448a.add(fakeOverride);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
    public final void c(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor fromCurrent) {
        Intrinsics.f(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) fromCurrent).L0(DeserializedDeclarationsFromSupertypeConflictDataKey.f43570a, callableMemberDescriptor);
        }
    }
}
