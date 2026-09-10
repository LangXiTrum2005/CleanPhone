package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.cultivated;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan {
    public static final List<timberyard> attabal(empress empressVar, CaptureStatus captureStatus) {
        if (empressVar.dhss().size() != empressVar.setterwort().getParameters().size()) {
            return null;
        }
        List<timberyard> listDhss = empressVar.dhss();
        List<timberyard> list = listDhss;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((timberyard) it.next()).dern() != Variance.INVARIANT) {
                    List<clubfoot> parameters = empressVar.setterwort().getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    List<Pair> listFastrack = CollectionsKt.fastrack(list, parameters);
                    ArrayList arrayList = new ArrayList(dovishness.gintrap(listFastrack, 10));
                    for (Pair pair : listFastrack) {
                        timberyard timberyardVarAttabal = (timberyard) pair.component1();
                        clubfoot clubfootVar = (clubfoot) pair.component2();
                        if (timberyardVarAttabal.dern() != Variance.INVARIANT) {
                            empress empressVarHomozygous = (timberyardVarAttabal.saneness() || timberyardVarAttabal.dern() != Variance.IN_VARIANCE) ? null : timberyardVarAttabal.getType().homozygous();
                            Intrinsics.beachfront(clubfootVar);
                            timberyardVarAttabal = TypeUtilsKt.attabal(new impromptu(captureStatus, empressVarHomozygous, timberyardVarAttabal, clubfootVar));
                        }
                        arrayList.add(timberyardVarAttabal);
                    }
                    TypeSubstitutor typeSubstitutorDern = cultivated.f31745dern.saneness(empressVar.setterwort(), arrayList).dern();
                    int size = listDhss.size();
                    for (int i = 0; i < size; i++) {
                        timberyard timberyardVar = listDhss.get(i);
                        timberyard timberyardVar2 = (timberyard) arrayList.get(i);
                        if (timberyardVar.dern() != Variance.INVARIANT) {
                            List<oilcan> upperBounds = empressVar.setterwort().getParameters().get(i).getUpperBounds();
                            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(KotlinTypePreparator.attabal.f31707attabal.attabal(typeSubstitutorDern.triweekly((oilcan) it2.next(), Variance.INVARIANT).homozygous()));
                            }
                            if (!timberyardVar.saneness() && timberyardVar.dern() == Variance.OUT_VARIANCE) {
                                arrayList2.add(KotlinTypePreparator.attabal.f31707attabal.attabal(timberyardVar.getType().homozygous()));
                            }
                            oilcan type = timberyardVar2.getType();
                            Intrinsics.competently(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((impromptu) type).setterwort().taiyuan(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final merc dern(empress empressVar, List<? extends timberyard> list) {
        return KotlinTypeFactory.formularize(empressVar.vesuvio(), empressVar.setterwort(), list, empressVar.mastfed(), null, 16, null);
    }

    public static final merc saneness(merc type, CaptureStatus status) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        List<timberyard> listAttabal = attabal(type, status);
        if (listAttabal != null) {
            return dern(type, listAttabal);
        }
        return null;
    }
}
