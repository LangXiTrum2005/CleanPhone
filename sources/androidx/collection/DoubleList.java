package androidx.collection;

import com.p004ironsource.d9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/DoubleList;", "", "Landroidx/collection/MutableDoubleList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DoubleList {
    public final boolean equals(Object obj) {
        if (!(obj instanceof DoubleList)) {
            return false;
        }
        ((DoubleList) obj).getClass();
        IntRange intRangeE = RangesKt.e(0, 0);
        if (intRangeE.X > intRangeE.f43343Y) {
            return true;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) d9.i.d);
        sb.append((CharSequence) d9.i.f24752e);
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }
}
