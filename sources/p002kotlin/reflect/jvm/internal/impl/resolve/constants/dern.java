package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern extends competently<Boolean> {
    public dern(boolean z) {
        super(Boolean.valueOf(z));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public merc attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        merc mercVarTriweekly = module.apical().triweekly();
        Intrinsics.checkNotNullExpressionValue(mercVarTriweekly, "getBooleanType(...)");
        return mercVarTriweekly;
    }
}
