package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class CallableC05307o implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C05357t A01;

    public CallableC05307o(C05357t c05357t, C05317p c05317p) {
        this.A01 = c05357t;
        new Handler(Looper.getMainLooper()).post(new C1831k4(this, c05357t, c05317p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C05317p c05317p) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        J7 j7A01 = J7.A01(this.A01.A04.A02());
        Uri uriA00 = C5.A00(c05317p.A08);
        long jA0R = c05317p.A00;
        if (jA0R == -1) {
            jA0R = C05789m.A0R(this.A01.A04);
        }
        j7A01.A0I(uriA00, new C1830k3(this, c05317p, jA0R, jCurrentTimeMillis), jA0R);
    }
}
