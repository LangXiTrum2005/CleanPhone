package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: TypeSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class coffeecake {
    public static final merc attabal(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        empress empressVarHomozygous = oilcanVar.homozygous();
        merc mercVar = empressVarHomozygous instanceof merc ? (merc) empressVarHomozygous : null;
        if (mercVar != null) {
            return mercVar;
        }
        throw new IllegalStateException(("This is should be simple type: " + oilcanVar).toString());
    }

    public static /* synthetic */ merc beachfront(merc mercVar, List list, overspeculate overspeculateVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mercVar.dhss();
        }
        if ((i & 2) != 0) {
            overspeculateVar = mercVar.vesuvio();
        }
        return wireman(mercVar, list, overspeculateVar);
    }

    public static final oilcan dern(oilcan oilcanVar, List<? extends timberyard> newArguments, marial newAnnotations, List<? extends timberyard> newArgumentsForUpperBound) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == oilcanVar.dhss()) && newAnnotations == oilcanVar.getAnnotations()) {
            return oilcanVar;
        }
        overspeculate overspeculateVarVesuvio = oilcanVar.vesuvio();
        if ((newAnnotations instanceof impromptu) && newAnnotations.isEmpty()) {
            newAnnotations = marial.f29950impromptu.saneness();
        }
        overspeculate overspeculateVarAttabal = clubfoot.attabal(overspeculateVarVesuvio, newAnnotations);
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            preprohormone preprohormoneVar = (preprohormone) empressVarHomozygous;
            return KotlinTypeFactory.wireman(wireman(preprohormoneVar.sakeen(), newArguments, overspeculateVarAttabal), wireman(preprohormoneVar.immediately(), newArgumentsForUpperBound, overspeculateVarAttabal));
        }
        if (empressVarHomozygous instanceof merc) {
            return wireman((merc) empressVarHomozygous, newArguments, overspeculateVarAttabal);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ oilcan marial(oilcan oilcanVar, List list, marial marialVar, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oilcanVar.dhss();
        }
        if ((i & 2) != 0) {
            marialVar = oilcanVar.getAnnotations();
        }
        if ((i & 4) != 0) {
            list2 = list;
        }
        return dern(oilcanVar, list, marialVar, list2);
    }

    public static final oilcan saneness(oilcan oilcanVar, List<? extends timberyard> newArguments, marial newAnnotations) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return marial(oilcanVar, newArguments, newAnnotations, null, 4, null);
    }

    public static final merc wireman(merc mercVar, List<? extends timberyard> newArguments, overspeculate newAttributes) {
        Intrinsics.checkNotNullParameter(mercVar, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == mercVar.vesuvio()) {
            return mercVar;
        }
        if (newArguments.isEmpty()) {
            return mercVar.deadwork(newAttributes);
        }
        return mercVar instanceof prescient.marial ? ((prescient.marial) mercVar).prefect(newArguments) : KotlinTypeFactory.formularize(newAttributes, mercVar.setterwort(), newArguments, mercVar.mastfed(), null, 16, null);
    }
}
