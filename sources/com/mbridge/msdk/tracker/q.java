package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f37054a;

    public q(g gVar) {
        this.f37054a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f37054a)) {
            return;
        }
        this.f37054a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f37054a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f37054a.b(eVar);
        } catch (Exception e10) {
            if (a.f36843a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f37054a)) {
            return new long[]{0, 0};
        }
        return this.f37054a.a();
    }
}
