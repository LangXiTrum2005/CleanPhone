package d3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import l1.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38664c;

    public a(long j10, long j11, int i10) {
        this.f38662a = i10;
        switch (i10) {
            case 1:
                this.f38663b = j10;
                this.f38664c = j11;
                break;
            default:
                this.f38663b = j11;
                this.f38664c = j10;
                break;
        }
    }

    public static long d(long j10, q qVar) {
        long jZ = qVar.z();
        return (128 & jZ) != 0 ? 8589934591L & ((((jZ & 1) << 32) | qVar.B()) + j10) : C.TIME_UNSET;
    }

    @Override // d3.b
    public final String toString() {
        switch (this.f38662a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb2.append(this.f38663b);
                sb2.append(", identifier= ");
                return defpackage.e.r(sb2, this.f38664c, " }");
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.f38663b);
                sb3.append(", playbackPositionUs= ");
                return defpackage.e.r(sb3, this.f38664c, " }");
        }
    }
}
