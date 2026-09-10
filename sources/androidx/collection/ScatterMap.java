package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScatterMap<K, V> {
    public final boolean a(Object obj) {
        if (obj != null) {
            obj.hashCode();
        }
        throw null;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            obj.hashCode();
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterMap)) {
            return false;
        }
        ((ScatterMap) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }
}
