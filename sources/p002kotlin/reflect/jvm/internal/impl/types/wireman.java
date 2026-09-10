package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import presbytery.competently;
import presbytery.cutely;
import presbytery.impassible;
import presbytery.impromptu;
import presbytery.marial;

/* JADX INFO: compiled from: AbstractStrictEqualityTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f31827attabal = new wireman();

    public final boolean attabal(impassible impassibleVar, impromptu impromptuVar, impromptu impromptuVar2) {
        if (impassibleVar.rotuma(impromptuVar) == impassibleVar.rotuma(impromptuVar2) && impassibleVar.adultoid(impromptuVar) == impassibleVar.adultoid(impromptuVar2)) {
            if ((impassibleVar.cutely(impromptuVar) == null) == (impassibleVar.cutely(impromptuVar2) == null) && impassibleVar.unconsolidated(impassibleVar.attabal(impromptuVar), impassibleVar.attabal(impromptuVar2))) {
                if (impassibleVar.preterite(impromptuVar, impromptuVar2)) {
                    return true;
                }
                int iRotuma = impassibleVar.rotuma(impromptuVar);
                for (int i = 0; i < iRotuma; i++) {
                    cutely cutelyVarPeridotite = impassibleVar.peridotite(impromptuVar, i);
                    cutely cutelyVarPeridotite2 = impassibleVar.peridotite(impromptuVar2, i);
                    if (impassibleVar.preprohormone(cutelyVarPeridotite) != impassibleVar.preprohormone(cutelyVarPeridotite2)) {
                        return false;
                    }
                    if (!impassibleVar.preprohormone(cutelyVarPeridotite) && (impassibleVar.dovishness(cutelyVarPeridotite) != impassibleVar.dovishness(cutelyVarPeridotite2) || !dern(impassibleVar, impassibleVar.wostteth(cutelyVarPeridotite), impassibleVar.wostteth(cutelyVarPeridotite2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean dern(impassible impassibleVar, competently competentlyVar, competently competentlyVar2) {
        if (competentlyVar == competentlyVar2) {
            return true;
        }
        impromptu impromptuVarBeachfront = impassibleVar.beachfront(competentlyVar);
        impromptu impromptuVarBeachfront2 = impassibleVar.beachfront(competentlyVar2);
        if (impromptuVarBeachfront != null && impromptuVarBeachfront2 != null) {
            return attabal(impassibleVar, impromptuVarBeachfront, impromptuVarBeachfront2);
        }
        marial marialVarStratoscope = impassibleVar.stratoscope(competentlyVar);
        marial marialVarStratoscope2 = impassibleVar.stratoscope(competentlyVar2);
        return marialVarStratoscope != null && marialVarStratoscope2 != null && attabal(impassibleVar, impassibleVar.wireman(marialVarStratoscope), impassibleVar.wireman(marialVarStratoscope2)) && attabal(impassibleVar, impassibleVar.competently(marialVarStratoscope), impassibleVar.competently(marialVarStratoscope2));
    }

    public final boolean saneness(impassible context, competently a, competently b) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return dern(context, a, b);
    }
}
