package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "ResultColumn", "Match", "Solution", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AmbiguousColumnResolver {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Match {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResultColumn {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ((ResultColumn) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ResultColumn(name=null, index=0)";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "Companion", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Solution implements Comparable<Solution> {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Solution solution) {
            Solution other = solution;
            Intrinsics.f(other, "other");
            int iH = Intrinsics.h(Integer.MAX_VALUE, Integer.MAX_VALUE);
            return iH != 0 ? iH : Intrinsics.h(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }
}
