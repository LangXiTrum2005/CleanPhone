package trm;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.snapshots.formularize;
import androidx.compose.runtime.snapshots.polder;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import dovishness.marial;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0016\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ldovishness/marial;", "Ltrm/saneness;", "Landroidx/compose/runtime/snapshots/formularize;", "parent", "", "readonly", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Ltrm/attabal;", "", "beachfront", "(Ldovishness/marial;Landroidx/compose/runtime/snapshots/formularize;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "competently", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "result", "observerMap", "dern", "(Ldovishness/marial;Landroidx/compose/runtime/snapshots/formularize;Landroidx/compose/runtime/snapshots/formularize;Ljava/util/Map;)V", "snapshot", "marial", "(Landroidx/compose/runtime/snapshots/formularize;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/polder;", "changes", "wireman", "(Landroidx/compose/runtime/snapshots/formularize;Landroidx/collection/ScatterSet;)V", "attabal", "Ldovishness/marial;", "getObservers$annotations", "()V", "observers", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static marial<? extends saneness> f38993attabal;

    public static final Pair<attabal, Map<saneness, attabal>> beachfront(marial<? extends saneness> marialVar, formularize formularizeVar, boolean z, Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
        int size = marialVar.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            saneness sanenessVar = marialVar.get(i);
            attabal attabalVarAttabal = sanenessVar.attabal(formularizeVar, z);
            if (attabalVarAttabal != null) {
                function1 = competently(attabalVarAttabal.attabal(), function1);
                function2 = competently(attabalVarAttabal.saneness(), function2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(sanenessVar, attabalVarAttabal);
            }
        }
        return patroclinal.formularize.attabal(new attabal(function1, function2), linkedHashMap);
    }

    public static final Function1<Object, Unit> competently(final Function1<Object, Unit> function1, final Function1<Object, Unit> function2) {
        if (function1 == null || function2 == null) {
            return function1 == null ? function2 : function1;
        }
        return new Function1() { // from class: trm.dern
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wireman.impromptu(function1, function2, obj);
            }
        };
    }

    public static final void dern(marial<? extends saneness> marialVar, formularize formularizeVar, formularize formularizeVar2, Map<saneness, attabal> map) {
        int size = marialVar.size();
        for (int i = 0; i < size; i++) {
            saneness sanenessVar = marialVar.get(i);
            sanenessVar.dern(formularizeVar2, formularizeVar, map != null ? map.get(sanenessVar) : null);
        }
    }

    public static final Unit impromptu(Function1 function1, Function1 function2, Object obj) {
        function1.invoke(obj);
        function2.invoke(obj);
        return Unit.f29295attabal;
    }

    public static final void marial(formularize formularizeVar) {
        marial<? extends saneness> marialVar = f38993attabal;
        if (marialVar != null) {
            int size = marialVar.size();
            for (int i = 0; i < size; i++) {
                marialVar.get(i).wireman(formularizeVar);
            }
        }
    }

    public static final void wireman(formularize formularizeVar, ScatterSet<polder> scatterSet) {
        Set<? extends Object> setMarial;
        marial<? extends saneness> marialVar = f38993attabal;
        if (marialVar == null || marialVar.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setMarial = androidx.compose.runtime.collection.marial.attabal(scatterSet)) == null) {
            setMarial = creditor.marial();
        }
        int size = marialVar.size();
        for (int i = 0; i < size; i++) {
            marialVar.get(i).saneness(formularizeVar, setMarial);
        }
    }
}
