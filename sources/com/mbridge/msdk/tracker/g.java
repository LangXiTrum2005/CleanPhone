package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f36859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f36860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f36861c = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long[] f36862d = new long[2];

    public g(c cVar, s sVar) {
        this.f36859a = cVar;
        this.f36860b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f36861c.incrementAndGet();
            this.f36862d[0] = System.currentTimeMillis();
            this.f36862d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f36859a.a(iVar);
            this.f36860b.l();
            this.f36860b.e();
            this.f36860b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f36862d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
