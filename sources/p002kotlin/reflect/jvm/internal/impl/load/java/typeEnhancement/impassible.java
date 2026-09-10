package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import byname.dern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.java.graveside;
import p002kotlin.reflect.jvm.internal.impl.types.lerp;
import presbytery.competently;

/* JADX INFO: compiled from: typeEnhancementUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impassible {
    public static final wireman attabal(wireman wiremanVar, Collection<wireman> superQualifiers, boolean z, boolean z2, boolean z3) {
        NullabilityQualifier nullabilityQualifierMarial;
        boolean z4;
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<wireman> collection2 = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            NullabilityQualifier nullabilityQualifierSaneness = saneness((wireman) it.next());
            if (nullabilityQualifierSaneness != null) {
                arrayList.add(nullabilityQualifierSaneness);
            }
        }
        NullabilityQualifier nullabilityQualifierMarial2 = marial(CollectionsKt.prefect(arrayList), saneness(wiremanVar), z);
        if (nullabilityQualifierMarial2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier nullabilityQualifierWireman = ((wireman) it2.next()).wireman();
                if (nullabilityQualifierWireman != null) {
                    arrayList2.add(nullabilityQualifierWireman);
                }
            }
            nullabilityQualifierMarial = marial(CollectionsKt.prefect(arrayList2), wiremanVar.wireman(), z);
        } else {
            nullabilityQualifierMarial = nullabilityQualifierMarial2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier mutabilityQualifierDern = ((wireman) it3.next()).dern();
            if (mutabilityQualifierDern != null) {
                arrayList3.add(mutabilityQualifierDern);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) wireman(CollectionsKt.prefect(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, wiremanVar.dern(), z);
        NullabilityQualifier nullabilityQualifier = null;
        if (nullabilityQualifierMarial != null && !z3 && (!z2 || nullabilityQualifierMarial != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier = nullabilityQualifierMarial;
        }
        boolean z5 = false;
        if (nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            z4 = false;
        } else {
            if (!wiremanVar.saneness()) {
                if (!collection2.isEmpty()) {
                    Iterator<T> it4 = collection2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((wireman) it4.next()).saneness()) {
                            }
                        }
                    }
                }
                z4 = false;
            }
            z4 = true;
        }
        if (nullabilityQualifier != null && nullabilityQualifierMarial2 != nullabilityQualifierMarial) {
            z5 = true;
        }
        return new wireman(nullabilityQualifier, mutabilityQualifier, z4, z5);
    }

    public static final boolean dern(lerp lerpVar, competently type) {
        Intrinsics.checkNotNullParameter(lerpVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        dern ENHANCED_NULLABILITY_ANNOTATION = graveside.f30423dovishness;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return lerpVar.restrictive(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    public static final NullabilityQualifier marial(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) wireman(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }

    public static final NullabilityQualifier saneness(wireman wiremanVar) {
        if (wiremanVar.marial()) {
            return null;
        }
        return wiremanVar.wireman();
    }

    public static final <T> T wireman(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set<? extends T> setPrefect;
        T t4;
        if (!z) {
            if (t3 != null && (setPrefect = CollectionsKt.prefect(starveling.formularize(set, t3))) != null) {
                set = setPrefect;
            }
            return (T) CollectionsKt.technofreak(set);
        }
        if (set.contains(t)) {
            t4 = t;
        } else {
            t4 = set.contains(t2) ? t2 : null;
        }
        if (Intrinsics.wireman(t4, t) && Intrinsics.wireman(t3, t2)) {
            return null;
        }
        return t3 == null ? t4 : t3;
    }
}
