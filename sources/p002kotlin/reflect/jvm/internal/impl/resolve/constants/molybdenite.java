package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class molybdenite extends impassible<Short> {
    public molybdenite(short s) {
        super(Short.valueOf(s));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public merc attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        merc mercVarPeridotite = module.apical().peridotite();
        Intrinsics.checkNotNullExpressionValue(mercVarPeridotite, "getShortType(...)");
        return mercVarPeridotite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public String toString() {
        return saneness().intValue() + ".toShort()";
    }
}
