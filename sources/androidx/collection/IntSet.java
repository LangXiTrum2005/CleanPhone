package androidx.collection;

import com.p004ironsource.d9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/IntSet;", "", "Landroidx/collection/MutableIntSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IntSet {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntSet)) {
            return false;
        }
        ((IntSet) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        new StringBuilder().append((CharSequence) d9.i.d);
        throw null;
    }
}
