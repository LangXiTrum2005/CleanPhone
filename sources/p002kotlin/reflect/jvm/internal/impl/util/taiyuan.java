package p002kotlin.reflect.jvm.internal.impl.util;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f31910attabal = new taiyuan();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f31911saneness = "second parameter must be of type KProperty<*> or its supertype";

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String attabal(dovishness dovishnessVar) {
        return beachfront.attabal.attabal(this, dovishnessVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public String getDescription() {
        return f31911saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.beachfront
    public boolean saneness(dovishness functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        cultivated cultivatedVar = functionDescriptor.beachfront().get(1);
        ReflectionTypes.saneness sanenessVar = ReflectionTypes.f29628apical;
        Intrinsics.beachfront(cultivatedVar);
        oilcan oilcanVarAttabal = sanenessVar.attabal(DescriptorUtilsKt.arytenoidectomy(cultivatedVar));
        if (oilcanVarAttabal == null) {
            return false;
        }
        oilcan type = cultivatedVar.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return TypeUtilsKt.polloi(oilcanVarAttabal, TypeUtilsKt.dovishness(type));
    }
}
