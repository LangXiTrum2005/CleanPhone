package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassicBuiltinSpecialProperties {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static String a(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        KotlinBuiltIns.y(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorB = DescriptorUtilsKt.b(DescriptorUtilsKt.l(callableMemberDescriptor), ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1.X);
        if (callableMemberDescriptorB == null || (name = (Name) BuiltinSpecialProperties.f43733a.get(DescriptorUtilsKt.g(callableMemberDescriptorB))) == null) {
            return null;
        }
        return name.b();
    }

    public static boolean b(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.f(callableMemberDescriptor, "callableMemberDescriptor");
        if (!BuiltinSpecialProperties.d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (CollectionsKt.o(BuiltinSpecialProperties.f43735c, DescriptorUtilsKt.c(callableMemberDescriptor)) && callableMemberDescriptor.e().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.y(callableMemberDescriptor)) {
            return false;
        }
        Collection overriddenDescriptors = callableMemberDescriptor.l();
        Intrinsics.e(overriddenDescriptors, "overriddenDescriptors");
        Collection<CallableMemberDescriptor> collection = overriddenDescriptors;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor it : collection) {
            Intrinsics.e(it, "it");
            if (b(it)) {
                return true;
            }
        }
        return false;
    }
}
