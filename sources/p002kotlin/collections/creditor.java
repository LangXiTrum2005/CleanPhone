package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashSet;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "marial", "()Ljava/util/Set;", "", "elements", "impromptu", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "beachfront", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "competently", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class creditor extends privatdozent {
    public static <T> LinkedHashSet<T> beachfront(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) polloi.igbo(elements, new LinkedHashSet(polder.marial(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> competently(Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : privatdozent.wireman(set.iterator().next());
        }
        return marial();
    }

    public static <T> Set<T> impromptu(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return polloi.lampshade(elements);
    }

    public static <T> Set<T> marial() {
        return EmptySet.INSTANCE;
    }
}
