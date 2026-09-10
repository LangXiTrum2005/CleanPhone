package kotlinx.coroutines.flow;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StartedWhileSubscribed implements SharingStarted {
    public final boolean equals(Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        startedWhileSubscribed.getClass();
        startedWhileSubscribed.getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        listBuilder.add("replayExpiration=0ms");
        return a.p(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.D(CollectionsKt.m(listBuilder), null, null, null, null, 63), ')');
    }
}
