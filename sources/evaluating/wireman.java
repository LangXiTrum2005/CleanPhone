package evaluating;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "value", "marial", "(I)I", "bitCount", "beachfront", "(II)I", "from", "until", "", "dern", "(II)V", "", "wireman", "(JJ)V", "", "saneness", "(DD)V", "", "", "attabal", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {
    public static final String attabal(Object from, Object until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final int beachfront(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final void dern(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(attabal(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final int marial(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final void saneness(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(attabal(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }

    public static final void wireman(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(attabal(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }
}
