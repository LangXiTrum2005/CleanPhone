package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1524Sk extends Thread {
    public final long A00;

    public C1524Sk(long j) {
        this.A00 = j;
        start();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0011 */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = com.facebook.ads.redexgen.core.WU.A02(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r2 = r3
        L8:
            long r0 = r2.A00     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L11
        Ld:
            com.facebook.ads.redexgen.core.C1522Si.A01()     // Catch: java.lang.Throwable -> L11
            goto L8
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.core.WU.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1524Sk.run():void");
    }
}
