package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes7.dex */
public final class ScopeUtilsKt {
    public static final Collection a(Collection collection, Collection collection2) {
        Intrinsics.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final SmartList b(ArrayList arrayList) {
        SmartList smartList = new SmartList();
        for (Object obj : arrayList) {
            MemberScope memberScope = (MemberScope) obj;
            if (memberScope != null && memberScope != MemberScope.Empty.f44351b) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
