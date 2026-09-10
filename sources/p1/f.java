package p1;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import oa.n1;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements j0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1 f48009r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1.o0 f48010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.n0 f48011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2.e f48012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f48013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f48015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f48017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f48018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f48019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f48020k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f48021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f48022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final oa.o0 f48023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ConcurrentHashMap f48024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f48025q;

    static {
        oa.f0 f0Var = oa.j0.f47265b;
        Object[] objArr = {X3.i.f27782b, "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset"};
        oa.q.b(6, objArr);
        f48009r = oa.j0.t(6, objArr);
    }

    public f() {
        j2.e eVar = new j2.e();
        a(1000, 0, "bufferForPlaybackMs", "0");
        a(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f48010a = new i1.o0();
        this.f48011b = new i1.n0();
        this.f48012c = eVar;
        long j10 = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.f48013d = l1.y.M(j10);
        long j11 = 1000;
        this.f48014e = l1.y.M(j11);
        this.f48015f = l1.y.M(j10);
        this.f48016g = l1.y.M(j10);
        this.f48017h = l1.y.M(j11);
        this.f48018i = l1.y.M(j11);
        this.f48019j = l1.y.M(2000);
        this.f48020k = l1.y.M(j11);
        this.l = -1;
        this.f48021m = true;
        this.f48022n = l1.y.M(0);
        this.f48024p = new ConcurrentHashMap();
        this.f48023o = oa.o0.e(s1.f47307g);
        this.f48025q = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        go.k.l(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    public final boolean b(i0 i0Var) {
        int i10;
        boolean z10;
        q1.j jVar = i0Var.f48096a;
        long j10 = i0Var.f48099d;
        e eVar = (e) this.f48024p.get(jVar);
        eVar.getClass();
        e eVar2 = (e) this.f48024p.get(jVar);
        eVar2.getClass();
        synchronized (eVar2) {
            i10 = eVar2.f48000d;
        }
        int i11 = i10 * this.f48012c.f43634b;
        e eVar3 = (e) this.f48024p.get(jVar);
        eVar3.getClass();
        boolean z11 = i11 >= eVar3.f47999c;
        if (jVar.equals(q1.j.f48579c)) {
            return !z11;
        }
        i1.p0 p0Var = i0Var.f48097b;
        i1.v vVar = p0Var.m(p0Var.g(i0Var.f48098c.f40307a, this.f48011b).f42584c, this.f48010a, 0L).f42618c.f42714b;
        if (vVar == null) {
            z10 = false;
        } else {
            String scheme = vVar.f42704a.getScheme();
            if (TextUtils.isEmpty(scheme) || f48009r.contains(scheme)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        long jMin = z10 ? this.f48014e : this.f48013d;
        long j11 = z10 ? this.f48016g : this.f48015f;
        float f10 = i0Var.f48100e;
        if (f10 > 1.0f) {
            jMin = Math.min(l1.y.A(jMin, f10), j11);
        }
        if (j10 < Math.max(jMin, 500000L)) {
            boolean z12 = (z10 ? this.f48021m : false) || !z11;
            eVar.f47998b = z12;
            if (!z12 && j10 < 500000) {
                l1.a.s("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z11) {
            eVar.f47998b = false;
        }
        return eVar.f47998b;
    }

    public final void c() {
        int i10 = 0;
        if (this.f48024p.isEmpty()) {
            j2.e eVar = this.f48012c;
            synchronized (eVar) {
                if (eVar.f43633a) {
                    eVar.c(0);
                }
            }
            return;
        }
        j2.e eVar2 = this.f48012c;
        Iterator it = this.f48024p.values().iterator();
        while (it.hasNext()) {
            i10 += ((e) it.next()).f47999c;
        }
        eVar2.c(i10);
    }
}
