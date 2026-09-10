package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class adultoid extends preprohormone<Byte> {
    public adultoid(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public oilcan attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        wireman wiremanVarAttabal = FindClassInModuleKt.attabal(module, competently.attabal.f29775unconsolidated);
        merc mercVarImpassible = wiremanVarAttabal != null ? wiremanVarAttabal.impassible() : null;
        return mercVarImpassible == null ? prescient.competently.wireman(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UByte") : mercVarImpassible;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public String toString() {
        return saneness().intValue() + ".toUByte()";
    }
}
