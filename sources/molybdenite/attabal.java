package molybdenite;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018\"\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001d"}, d2 = {"", "need", "marial", "(I)I", "beachfront", "wireman", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "dern", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", "attabal", "([III)I", "", "", "saneness", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f33567attabal = new int[0];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final long[] f33569saneness = new long[0];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Object[] f33568dern = new Object[0];

    public static final int attabal(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = array[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int beachfront(int i) {
        return wireman(i * 8) / 8;
    }

    public static final boolean dern(Object obj, Object obj2) {
        return Intrinsics.wireman(obj, obj2);
    }

    public static final int marial(int i) {
        return wireman(i * 4) / 4;
    }

    public static final int saneness(long[] array, int i, long j) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = array[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int wireman(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
