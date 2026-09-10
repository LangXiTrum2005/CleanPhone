package androidx.room.util;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class TableInfoKt$toStringCommon$$inlined$sortedBy$2<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(((TableInfo.Index) obj).f8351a, ((TableInfo.Index) obj2).f8351a);
    }
}
