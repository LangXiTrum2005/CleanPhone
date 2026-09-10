package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.dern;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompanionObjectMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f29883attabal = new saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Set<byname.saneness> f29884saneness;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(competently.dern((PrimitiveType) it.next()));
        }
        dern dernVarFormularize = competently.attabal.f29726impromptu.formularize();
        Intrinsics.checkNotNullExpressionValue(dernVarFormularize, "toSafe(...)");
        List listClaque = CollectionsKt.claque(arrayList, dernVarFormularize);
        dern dernVarFormularize2 = competently.attabal.f29708cutely.formularize();
        Intrinsics.checkNotNullExpressionValue(dernVarFormularize2, "toSafe(...)");
        List listClaque2 = CollectionsKt.claque(listClaque, dernVarFormularize2);
        dern dernVarFormularize3 = competently.attabal.f29739molybdenite.formularize();
        Intrinsics.checkNotNullExpressionValue(dernVarFormularize3, "toSafe(...)");
        List listClaque3 = CollectionsKt.claque(listClaque2, dernVarFormularize3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = listClaque3.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(byname.saneness.impassible((dern) it2.next()));
        }
        f29884saneness = linkedHashSet;
    }

    public final Set<byname.saneness> attabal() {
        return f29884saneness;
    }

    public final Set<byname.saneness> saneness() {
        return f29884saneness;
    }
}
