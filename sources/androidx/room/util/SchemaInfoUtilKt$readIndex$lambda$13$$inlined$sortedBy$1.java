package androidx.room.util;

import java.util.Comparator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class SchemaInfoUtilKt$readIndex$lambda$13$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
