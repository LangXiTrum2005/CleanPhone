package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.cord;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {
    public static final Set<marial> attabal(Iterable<? extends MemberScope> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<marial> setBeachfront = it.next().beachfront();
            if (setBeachfront == null) {
                return null;
            }
            cord.stratoscope(hashSet, setBeachfront);
        }
        return hashSet;
    }
}
