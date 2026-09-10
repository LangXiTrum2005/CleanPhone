package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositionLocalMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/palmyra;", "Landroidx/compose/runtime/preprohormone;", X3.i.W, "", "attabal", "(Landroidx/compose/runtime/palmyra;Landroidx/compose/runtime/preprohormone;)Z", "saneness", "(Landroidx/compose/runtime/palmyra;Landroidx/compose/runtime/preprohormone;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/claque;", "values", "parentScope", "previous", "dern", "([Landroidx/compose/runtime/claque;Landroidx/compose/runtime/palmyra;Landroidx/compose/runtime/palmyra;)Landroidx/compose/runtime/palmyra;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class oilcan {
    public static final <T> boolean attabal(palmyra palmyraVar, preprohormone<T> preprohormoneVar) {
        Intrinsics.competently(preprohormoneVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return palmyraVar.containsKey(preprohormoneVar);
    }

    public static final palmyra dern(claque<?>[] claqueVarArr, palmyra palmyraVar, palmyra palmyraVar2) {
        cuirassed.impromptu.attabal attabalVarArytenoidectomy = cuirassed.taiyuan.attabal().arytenoidectomy();
        for (claque<?> claqueVar : claqueVarArr) {
            preprohormone<?> preprohormoneVarSaneness = claqueVar.saneness();
            Intrinsics.competently(preprohormoneVarSaneness, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            unconsolidated unconsolidatedVar = (unconsolidated) preprohormoneVarSaneness;
            if (claqueVar.getCanOverride() || !attabal(palmyraVar, unconsolidatedVar)) {
                hydromechanics hydromechanicsVar = (hydromechanics) palmyraVar2.get(unconsolidatedVar);
                Intrinsics.competently(claqueVar, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                attabalVarArytenoidectomy.put(unconsolidatedVar, unconsolidatedVar.saneness(claqueVar, hydromechanicsVar));
            }
        }
        return attabalVarArytenoidectomy.competently();
    }

    public static final <T> T saneness(palmyra palmyraVar, preprohormone<T> preprohormoneVar) {
        Intrinsics.competently(preprohormoneVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        hydromechanics<T> hydromechanicsVarAttabal = (hydromechanics<T>) palmyraVar.get(preprohormoneVar);
        if (hydromechanicsVarAttabal == null) {
            hydromechanicsVarAttabal = preprohormoneVar.attabal();
        }
        return (T) hydromechanicsVarAttabal.attabal(palmyraVar);
    }

    public static /* synthetic */ palmyra wireman(claque[] claqueVarArr, palmyra palmyraVar, palmyra palmyraVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            palmyraVar2 = cuirassed.taiyuan.attabal();
        }
        return dern(claqueVarArr, palmyraVar, palmyraVar2);
    }
}
