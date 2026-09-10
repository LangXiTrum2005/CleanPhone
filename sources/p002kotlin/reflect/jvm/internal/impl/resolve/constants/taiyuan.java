package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import byname.marial;
import byname.saneness;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import patroclinal.formularize;
import prescient.competently;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan extends competently<Pair<? extends saneness, ? extends marial>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness f31331attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final marial f31332saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taiyuan(saneness enumClassId, marial enumEntryName) {
        super(formularize.attabal(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f31331attabal = enumClassId;
        this.f31332saneness = enumEntryName;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public oilcan attabal(trm module) {
        Intrinsics.checkNotNullParameter(module, "module");
        wireman wiremanVarAttabal = FindClassInModuleKt.attabal(module, this.f31331attabal);
        merc mercVarImpassible = null;
        if (wiremanVarAttabal != null) {
            if (!p002kotlin.reflect.jvm.internal.impl.resolve.marial.cuirassed(wiremanVarAttabal)) {
                wiremanVarAttabal = null;
            }
            if (wiremanVarAttabal != null) {
                mercVarImpassible = wiremanVarAttabal.impassible();
            }
        }
        if (mercVarImpassible != null) {
            return mercVarImpassible;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = this.f31331attabal.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = this.f31332saneness.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return competently.wireman(errorTypeKind, string, string2);
    }

    public final marial dern() {
        return this.f31332saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31331attabal.cutely());
        sb.append('.');
        sb.append(this.f31332saneness);
        return sb.toString();
    }
}
