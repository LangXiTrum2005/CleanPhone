package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends IOException {
    public g(int i10) {
        this(i10, C.TIME_UNSET, C.TIME_UNSET);
    }

    public g(int i10, long j10, long j11) {
        String str;
        StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
        if (i10 != 0) {
            if (i10 == 1) {
                str = "not seekable to start";
            } else if (i10 != 2) {
                str = "unknown";
            } else {
                go.k.t((j10 == C.TIME_UNSET || j11 == C.TIME_UNSET) ? false : true);
                str = "start exceeds end. Start time: " + j10 + ", End time: " + j11;
            }
        } else {
            str = "invalid period count";
        }
        sb2.append(str);
        super(sb2.toString());
    }
}
