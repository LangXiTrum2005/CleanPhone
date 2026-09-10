package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.Map;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final BuiltinMethodsWithDifferentJvmName f30283kowloon = new BuiltinMethodsWithDifferentJvmName();

    public final boolean apical(hydrovane hydrovaneVar) {
        Intrinsics.checkNotNullParameter(hydrovaneVar, "<this>");
        return Intrinsics.wireman(hydrovaneVar.getName().dern(), "removeAt") && Intrinsics.wireman(dovishness.wireman(hydrovaneVar), SpecialGenericSignatures.f30303attabal.impromptu().wireman());
    }

    public final boolean cutely(final hydrovane functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return beachfront.coffeecake(functionDescriptor) && DescriptorUtilsKt.beachfront(functionDescriptor, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(CallableMemberDescriptor it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(SpecialGenericSignatures.f30303attabal.cutely().containsKey(dovishness.wireman(functionDescriptor)));
            }
        }, 1, null) != null;
    }

    public final marial taiyuan(hydrovane functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        Map<String, marial> mapCutely = SpecialGenericSignatures.f30303attabal.cutely();
        String strWireman = dovishness.wireman(functionDescriptor);
        if (strWireman == null) {
            return null;
        }
        return mapCutely.get(strWireman);
    }
}
