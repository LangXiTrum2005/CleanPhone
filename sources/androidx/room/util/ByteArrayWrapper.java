package androidx.room.util;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/ByteArrayWrapper;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ByteArrayWrapper {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ByteArrayWrapper)) {
            return false;
        }
        ((ByteArrayWrapper) obj).getClass();
        return Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return Arrays.hashCode((byte[]) null);
    }
}
