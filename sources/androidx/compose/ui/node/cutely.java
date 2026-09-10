package androidx.compose.ui.node;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/cutely;", "", "", "packedValue", "saneness", "(J)J", C3414a2.d, "", "attabal", "(JJ)I", "", "dern", "(J)F", "distance", "", "wireman", "(J)Z", "isInLayer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cutely {
    public static final int attabal(long j, long j2) {
        boolean zWireman = wireman(j);
        if (zWireman != wireman(j2)) {
            return zWireman ? -1 : 1;
        }
        return (int) Math.signum(dern(j) - dern(j2));
    }

    public static final float dern(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean wireman(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    public static long saneness(long j) {
        return j;
    }
}
