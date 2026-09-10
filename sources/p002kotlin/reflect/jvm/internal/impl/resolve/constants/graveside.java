package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.merc;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class graveside extends competently<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public graveside(String value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
    public merc attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        merc mercVarOverspeculate = module.apical().overspeculate();
        Intrinsics.checkNotNullExpressionValue(mercVarOverspeculate, "getStringType(...)");
        return mercVarOverspeculate;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public String toString() {
        return '\"' + saneness() + '\"';
    }
}
