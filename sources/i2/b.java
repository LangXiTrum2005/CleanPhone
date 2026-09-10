package i2;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.q0;
import java.util.ArrayList;
import java.util.List;
import l1.y;
import oa.e0;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2.d f42728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f42729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f42730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f42731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42732k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f42733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f42734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j0 f42735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l1.u f42736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f42737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f42738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f42739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g2.m f42741u;

    public b(q0 q0Var, int[] iArr, j2.d dVar, long j10, long j11, long j12, j0 j0Var) {
        super(q0Var, iArr);
        if (j12 < j10) {
            l1.a.s("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f42728g = dVar;
        this.f42729h = j10 * 1000;
        this.f42730i = j11 * 1000;
        this.f42731j = j12 * 1000;
        this.f42732k = 1279;
        this.l = 719;
        this.f42733m = 0.7f;
        this.f42734n = 0.75f;
        this.f42735o = j0.x(j0Var);
        this.f42736p = l1.u.f44822a;
        this.f42737q = 1.0f;
        this.f42739s = 0;
        this.f42740t = C.TIME_UNSET;
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e0 e0Var = (e0) arrayList.get(i10);
            if (e0Var != null) {
                e0Var.b(new a(j10, jArr[i10]));
            }
        }
    }

    public static long k(List list) {
        if (!list.isEmpty()) {
            g2.m mVar = (g2.m) oa.q.k(list);
            long j10 = mVar.f41372g;
            if (j10 != C.TIME_UNSET) {
                long j11 = mVar.f41373h;
                if (j11 != C.TIME_UNSET) {
                    return j11 - j10;
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // i2.r
    public final void b(long j10, long j11, long j12, List list, g2.n[] nVarArr) {
        long jK;
        this.f42736p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f42738r;
        if (i10 >= nVarArr.length || !nVarArr[i10].next()) {
            int length = nVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jK = k(list);
                    break;
                }
                g2.n nVar = nVarArr[i11];
                if (nVar.next()) {
                    jK = nVar.d() - nVar.c();
                    break;
                }
                i11++;
            }
        } else {
            g2.n nVar2 = nVarArr[this.f42738r];
            jK = nVar2.d() - nVar2.c();
        }
        int i12 = this.f42739s;
        if (i12 == 0) {
            this.f42739s = 1;
            this.f42738r = j(jElapsedRealtime);
            return;
        }
        int i13 = this.f42738r;
        int iF = list.isEmpty() ? -1 : f(((g2.m) oa.q.k(list)).f41369d);
        if (iF != -1) {
            i12 = ((g2.m) oa.q.k(list)).f41370e;
            i13 = iF;
        }
        int iJ = j(jElapsedRealtime);
        if (iJ != i13 && !a(i13, jElapsedRealtime)) {
            i1.p[] pVarArr = this.f42745d;
            i1.p pVar = pVarArr[i13];
            i1.p pVar2 = pVarArr[iJ];
            long jMin = this.f42729h;
            if (j12 != C.TIME_UNSET) {
                jMin = Math.min((long) ((jK != C.TIME_UNSET ? j12 - jK : j12) * this.f42734n), jMin);
            }
            int i14 = pVar2.f42640j;
            int i15 = pVar.f42640j;
            if ((i14 > i15 && j11 < jMin) || (i14 < i15 && j11 >= this.f42730i)) {
                iJ = i13;
            }
        }
        if (iJ != i13) {
            i12 = 3;
        }
        this.f42739s = i12;
        this.f42738r = iJ;
    }

    @Override // i2.c, i2.r
    public final void disable() {
        this.f42741u = null;
    }

    @Override // i2.c, i2.r
    public final void enable() {
        this.f42740t = C.TIME_UNSET;
        this.f42741u = null;
    }

    @Override // i2.c, i2.r
    public final int evaluateQueueSize(long j10, List list) {
        int i10;
        int i11;
        this.f42736p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f42740t;
        if (j11 != C.TIME_UNSET && jElapsedRealtime - j11 < 1000 && (list.isEmpty() || ((g2.m) oa.q.k(list)).equals(this.f42741u))) {
            return list.size();
        }
        this.f42740t = jElapsedRealtime;
        this.f42741u = list.isEmpty() ? null : (g2.m) oa.q.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jD = y.D(((g2.m) list.get(size - 1)).f41372g - j10, this.f42737q);
        long j12 = this.f42731j;
        if (jD >= j12) {
            k(list);
            i1.p pVar = this.f42745d[j(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                g2.m mVar = (g2.m) list.get(i12);
                i1.p pVar2 = mVar.f41369d;
                if (y.D(mVar.f41372g - j10, this.f42737q) >= j12 && pVar2.f42640j < pVar.f42640j && (i10 = pVar2.f42651v) != -1 && i10 <= this.l && (i11 = pVar2.f42650u) != -1 && i11 <= this.f42732k && i10 < pVar.f42651v) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override // i2.r
    public final int getSelectedIndex() {
        return this.f42738r;
    }

    @Override // i2.r
    public final Object getSelectionData() {
        return null;
    }

    @Override // i2.r
    public final int getSelectionReason() {
        return this.f42739s;
    }

    public final int j(long j10) {
        long j11;
        j2.g gVar = (j2.g) this.f42728g;
        synchronized (gVar) {
            j11 = gVar.l;
        }
        long j12 = (long) (j11 * this.f42733m);
        this.f42728g.getClass();
        long j13 = (long) (j12 / this.f42737q);
        if (!this.f42735o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f42735o.size() - 1 && ((a) this.f42735o.get(i10)).f42726a < j13) {
                i10++;
            }
            a aVar = (a) this.f42735o.get(i10 - 1);
            a aVar2 = (a) this.f42735o.get(i10);
            long j14 = aVar.f42726a;
            float f10 = (j13 - j14) / (aVar2.f42726a - j14);
            long j15 = aVar.f42727b;
            j13 = j15 + ((long) (f10 * (aVar2.f42727b - j15)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f42743b; i12++) {
            if (j10 == Long.MIN_VALUE || !a(i12, j10)) {
                if (this.f42745d[i12].f42640j <= j13) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    @Override // i2.c, i2.r
    public final void onPlaybackSpeed(float f10) {
        this.f42737q = f10;
    }
}
