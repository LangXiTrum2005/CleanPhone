package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;

/* JADX INFO: compiled from: MemberComparator.java */
/* JADX INFO: loaded from: classes5.dex */
public class competently implements Comparator<apical> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final competently f31313kowloon = new competently();

    public static int dern(apical apicalVar) {
        if (marial.stratoscope(apicalVar)) {
            return 8;
        }
        if (apicalVar instanceof cutely) {
            return 7;
        }
        if (apicalVar instanceof saran) {
            return ((saran) apicalVar).polder() == null ? 6 : 5;
        }
        if (apicalVar instanceof dovishness) {
            return ((dovishness) apicalVar).polder() == null ? 4 : 3;
        }
        if (apicalVar instanceof wireman) {
            return 2;
        }
        return apicalVar instanceof overspeculate ? 1 : 0;
    }

    public static Integer saneness(apical apicalVar, apical apicalVar2) {
        int iDern = dern(apicalVar2) - dern(apicalVar);
        if (iDern != 0) {
            return Integer.valueOf(iDern);
        }
        if (marial.stratoscope(apicalVar) && marial.stratoscope(apicalVar2)) {
            return 0;
        }
        int iCompareTo = apicalVar.getName().compareTo(apicalVar2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compare(apical apicalVar, apical apicalVar2) {
        Integer numSaneness = saneness(apicalVar, apicalVar2);
        if (numSaneness != null) {
            return numSaneness.intValue();
        }
        return 0;
    }
}
