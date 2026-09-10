package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC1701Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1706Sx A01;

    public CallableC1701Ss(C1706Sx c1706Sx, C1702St c1702St) {
        this.A01 = c1706Sx;
        new Handler(Looper.getMainLooper()).post(new C2303gl(this, c1706Sx, c1702St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1702St c1702St) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2231fb c2231fbA06 = C2231fb.A06(this.A01.A04.A02());
        Uri uriA00 = XB.A00(c1702St.A08);
        long jA0S = c1702St.A00;
        if (jA0S == -1) {
            jA0S = C1750Up.A0S(this.A01.A04);
        }
        c2231fbA06.A0I(uriA00, new C2302gk(this, c1702St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
