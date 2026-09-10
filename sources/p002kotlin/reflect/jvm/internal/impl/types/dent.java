package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal;

/* JADX INFO: compiled from: TypeCapabilities.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dent {
    public static final formularize attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        attabal attabalVarHomozygous = oilcanVar.homozygous();
        formularize formularizeVar = attabalVarHomozygous instanceof formularize ? (formularize) attabalVarHomozygous : null;
        if (formularizeVar == null || !formularizeVar.unconsolidated()) {
            return null;
        }
        return formularizeVar;
    }

    public static final boolean saneness(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        attabal attabalVarHomozygous = oilcanVar.homozygous();
        formularize formularizeVar = attabalVarHomozygous instanceof formularize ? (formularize) attabalVarHomozygous : null;
        if (formularizeVar != null) {
            return formularizeVar.unconsolidated();
        }
        return false;
    }
}
