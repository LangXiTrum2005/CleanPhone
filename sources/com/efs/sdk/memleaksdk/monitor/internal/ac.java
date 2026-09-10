package com.efs.sdk.memleaksdk.monitor.internal;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends ae {
    private float b = 0.0f;
    private int c = 0;

    @Override // com.efs.sdk.memleaksdk.monitor.internal.ae
    public boolean b() {
        float f = ah.i.e;
        if (f <= a().getHeapThreshold() || f < this.b - 0.05f) {
            c();
        } else {
            int i = this.c + 1;
            this.c = i;
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(i);
            Float fValueOf = Float.valueOf(f);
            ai aiVar = ai.f459a;
            g.c("UMonitor.Heap", String.format(locale, "match overThresholdCount: %d, heapRatio: %f, used: %fMB, max: %fMB", numValueOf, fValueOf, Float.valueOf(aiVar.b(ah.i.d)), Float.valueOf(aiVar.b(ah.i.f456a))));
        }
        this.b = f;
        return this.c >= a().getMaxOverThresholdCount();
    }

    public void c() {
        this.b = 0.0f;
        this.c = 0;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.internal.ae
    public String d() {
        return "reason_heap_memory";
    }
}
