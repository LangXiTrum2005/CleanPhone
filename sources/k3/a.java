package k3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f44268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f44270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f44271d;

    public a(List list, long j10, long j11) {
        this.f44268a = j0.x(list);
        this.f44269b = j10;
        this.f44270c = j11;
        long j12 = C.TIME_UNSET;
        if (j10 != C.TIME_UNSET && j11 != C.TIME_UNSET) {
            j12 = j10 + j11;
        }
        this.f44271d = j12;
    }
}
