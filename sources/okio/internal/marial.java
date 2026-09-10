package okio.internal;

import okio.SegmentedByteString;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "value", "fromIndex", "toIndex", "attabal", "([IIII)I", "Lokio/SegmentedByteString;", "pos", "saneness", "(Lokio/SegmentedByteString;I)I", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class marial {
    public static final int attabal(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int saneness(SegmentedByteString segmentedByteString, int i) {
        Intrinsics.checkNotNullParameter(segmentedByteString, "<this>");
        int iAttabal = attabal(segmentedByteString.getDirectory(), i + 1, 0, segmentedByteString.getSegments().length);
        return iAttabal >= 0 ? iAttabal : ~iAttabal;
    }
}
