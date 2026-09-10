package com.efs.sdk.memleaksdk.monitor.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ad extends ae {
    private String b;

    @Override // com.efs.sdk.memleaksdk.monitor.internal.ae
    public boolean b() {
        ah.a aVar = ah.i;
        if (aVar.e > a().getForceDumpJavaHeapMaxThreshold()) {
            this.b = "high watermark";
            g.d("UMonitor.HugeMem", "match: huge memory allocated detected, high memory watermark, force dump analysis!");
            return true;
        }
        ah.a aVar2 = ah.j;
        if (aVar2.f456a == 0 || aVar.d - aVar2.d <= ai.b.a(a().getForceDumpJavaHeapDeltaThreshold())) {
            return false;
        }
        this.b = "delta";
        g.d("UMonitor.HugeMem", "match: huge memory allocated detected, over the delta threshold!");
        return true;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.ae
    public String d() {
        return "reason_huge_memory_" + this.b;
    }
}
