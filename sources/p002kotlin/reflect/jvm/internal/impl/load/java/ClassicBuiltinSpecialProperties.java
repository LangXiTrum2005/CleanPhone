package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.Collection;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: ClassicBuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ClassicBuiltinSpecialProperties {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ClassicBuiltinSpecialProperties f30285attabal = new ClassicBuiltinSpecialProperties();

    public final String attabal(CallableMemberDescriptor callableMemberDescriptor) {
        marial marialVar;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        beachfront.coffeecake(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorBeachfront = DescriptorUtilsKt.beachfront(DescriptorUtilsKt.graveside(callableMemberDescriptor), false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(CallableMemberDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.f30285attabal.saneness(it));
            }
        }, 1, null);
        if (callableMemberDescriptorBeachfront == null || (marialVar = dern.f30398attabal.attabal().get(DescriptorUtilsKt.formularize(callableMemberDescriptorBeachfront))) == null) {
            return null;
        }
        return marialVar.dern();
    }

    public final boolean dern(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt.permissivist(dern.f30398attabal.dern(), DescriptorUtilsKt.impromptu(callableMemberDescriptor)) && callableMemberDescriptor.beachfront().isEmpty()) {
            return true;
        }
        if (!beachfront.coffeecake(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor.wireman();
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection2 = collectionWireman;
        if (collection2.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection2) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = f30285attabal;
            Intrinsics.beachfront(callableMemberDescriptor2);
            if (classicBuiltinSpecialProperties.saneness(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean saneness(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (dern.f30398attabal.wireman().contains(callableMemberDescriptor.getName())) {
            return dern(callableMemberDescriptor);
        }
        return false;
    }
}
