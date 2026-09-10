package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/CombinedLoadStates;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CombinedLoadStates {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedLoadStates.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.a(null, null) && Intrinsics.a(null, null) && Intrinsics.a(null, null) && Intrinsics.a(null, null) && Intrinsics.a(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + ((Object) null) + ", prepend=" + ((Object) null) + ", append=" + ((Object) null) + ", source=" + ((Object) null) + ", mediator=" + ((Object) null) + ')';
    }
}
