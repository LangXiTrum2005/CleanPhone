package civitan;

import java.util.Collection;
import java.util.LinkedHashSet;
import lyreflower.marial;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: scopeUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> attabal(Collection<? extends T> collection2, Collection<? extends T> collection3) {
        Intrinsics.checkNotNullParameter(collection3, "collection");
        if (collection3.isEmpty()) {
            return collection2;
        }
        if (collection2 == 0) {
            return collection3;
        }
        if (collection2 instanceof LinkedHashSet) {
            ((LinkedHashSet) collection2).addAll(collection3);
            return collection2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection2);
        linkedHashSet.addAll(collection3);
        return linkedHashSet;
    }

    public static final marial<MemberScope> saneness(Iterable<? extends MemberScope> scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        marial<MemberScope> marialVar = new marial<>();
        for (MemberScope memberScope : scopes) {
            MemberScope memberScope2 = memberScope;
            if (memberScope2 != null && memberScope2 != MemberScope.attabal.f31367saneness) {
                marialVar.add(memberScope);
            }
        }
        return marialVar;
    }
}
