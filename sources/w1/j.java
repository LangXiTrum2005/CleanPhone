package w1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j0 f52816m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str, long j10, long j11, String str2, String str3) {
        this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j10, j11, false, n1.f47281e);
        f0 f0Var = j0.f47265b;
    }

    public j(String str, j jVar, String str2, long j10, int i10, long j11, i1.m mVar, String str3, String str4, long j12, long j13, boolean z10, List list) {
        super(str, jVar, j10, i10, j11, mVar, str3, str4, j12, j13, z10);
        this.l = str2;
        this.f52816m = j0.x(list);
    }
}
