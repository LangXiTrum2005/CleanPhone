package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TypeWithEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class sayid {
    /* JADX WARN: Multi-variable type inference failed */
    public static final oilcan attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        if (oilcanVar instanceof lotta) {
            return ((lotta) oilcanVar).timberyard();
        }
        return null;
    }

    public static final empress dern(empress empressVar, oilcan origin, Function1<? super oilcan, ? extends oilcan> transform) {
        Intrinsics.checkNotNullParameter(empressVar, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(transform, "transform");
        oilcan oilcanVarAttabal = attabal(origin);
        return wireman(empressVar, oilcanVarAttabal != null ? transform.invoke(oilcanVarAttabal) : null);
    }

    public static final empress saneness(empress empressVar, oilcan origin) {
        Intrinsics.checkNotNullParameter(empressVar, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return wireman(empressVar, attabal(origin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final empress wireman(empress empressVar, oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(empressVar, "<this>");
        if (empressVar instanceof lotta) {
            return wireman(((lotta) empressVar).getOrigin(), oilcanVar);
        }
        if (oilcanVar == null || Intrinsics.wireman(oilcanVar, empressVar)) {
            return empressVar;
        }
        if (empressVar instanceof merc) {
            return new grimness((merc) empressVar, oilcanVar);
        }
        if (empressVar instanceof preprohormone) {
            return new cuirassed((preprohormone) empressVar, oilcanVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
