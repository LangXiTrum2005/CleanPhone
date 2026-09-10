package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: flexibleTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class stratoscope {
    public static final preprohormone attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        Intrinsics.competently(empressVarHomozygous, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (preprohormone) empressVarHomozygous;
    }

    public static final merc dern(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            return ((preprohormone) empressVarHomozygous).sakeen();
        }
        if (empressVarHomozygous instanceof merc) {
            return (merc) empressVarHomozygous;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean saneness(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return oilcanVar.homozygous() instanceof preprohormone;
    }

    public static final merc wireman(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            return ((preprohormone) empressVarHomozygous).immediately();
        }
        if (empressVarHomozygous instanceof merc) {
            return (merc) empressVarHomozygous;
        }
        throw new NoWhenBranchMatchedException();
    }
}
