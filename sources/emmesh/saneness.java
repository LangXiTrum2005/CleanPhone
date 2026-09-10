package emmesh;

import java.util.Iterator;
import java.util.List;
import kurbash.arytenoidectomy;
import kurbash.beachfront;
import kurbash.monoploid;
import kurbash.wireman;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.KTypeImpl;
import p002kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;

/* JADX INFO: compiled from: KTypesJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkurbash/arytenoidectomy;", "Lkurbash/wireman;", "saneness", "(Lkurbash/arytenoidectomy;)Lkurbash/wireman;", "getJvmErasure$annotations", "(Lkurbash/arytenoidectomy;)V", "jvmErasure", "Lkurbash/beachfront;", "attabal", "(Lkurbash/beachfront;)Lkurbash/wireman;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class saneness {
    public static final wireman<?> attabal(beachfront beachfrontVar) {
        Object obj;
        wireman<?> wiremanVarSaneness;
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        if (beachfrontVar instanceof wireman) {
            return (wireman) beachfrontVar;
        }
        if (!(beachfrontVar instanceof monoploid)) {
            throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + beachfrontVar);
        }
        List<arytenoidectomy> upperBounds = ((monoploid) beachfrontVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            arytenoidectomy arytenoidectomyVar = (arytenoidectomy) next;
            Intrinsics.competently(arytenoidectomyVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((KTypeImpl) arytenoidectomyVar).getType().setterwort().wireman();
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman : null;
            if (wiremanVar != null && wiremanVar.getKind() != ClassKind.INTERFACE && wiremanVar.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        arytenoidectomy arytenoidectomyVar2 = (arytenoidectomy) obj;
        if (arytenoidectomyVar2 == null) {
            arytenoidectomyVar2 = (arytenoidectomy) CollectionsKt.firstOrNull(upperBounds);
        }
        return (arytenoidectomyVar2 == null || (wiremanVarSaneness = saneness(arytenoidectomyVar2)) == null) ? polloi.saneness(Object.class) : wiremanVarSaneness;
    }

    public static final wireman<?> saneness(arytenoidectomy arytenoidectomyVar) {
        wireman<?> wiremanVarAttabal;
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<this>");
        beachfront classifier = arytenoidectomyVar.getClassifier();
        if (classifier != null && (wiremanVarAttabal = attabal(classifier)) != null) {
            return wiremanVarAttabal;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + arytenoidectomyVar);
    }
}
