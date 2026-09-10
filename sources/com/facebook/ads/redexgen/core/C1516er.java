package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1516er extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ PM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516er(PM pm, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = pm;
        this.A00 = conditionVariable;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001a */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = com.facebook.ads.redexgen.core.BQ.A02(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r2 = r3
            com.facebook.ads.redexgen.X.PM r1 = r2.A01     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1d
            android.os.ConditionVariable r0 = r2.A00     // Catch: java.lang.Throwable -> L17
            r0.open()     // Catch: java.lang.Throwable -> L17
            com.facebook.ads.redexgen.X.PM r0 = r2.A01     // Catch: java.lang.Throwable -> L17
            com.facebook.ads.redexgen.core.PM.A0B(r0)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r0 = move-exception
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L18
        L1c:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = move-exception
            com.facebook.ads.redexgen.core.BQ.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1516er.run():void");
    }
}
