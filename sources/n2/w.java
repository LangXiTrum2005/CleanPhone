package n2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements t {
    @Override // n2.t
    public final long getDurationUs() {
        return C.TIME_UNSET;
    }

    @Override // n2.t
    public final s getSeekPoints(long j10) {
        u uVar = new u(j10, 0L);
        return new s(uVar, uVar);
    }

    @Override // n2.t
    public final boolean isSeekable() {
        return true;
    }
}
