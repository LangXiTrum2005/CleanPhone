package com.facebook.bolts;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "TResult", "run"}, k = 3, mv = {1, 5, 1})
final class Task$Companion$call$1 implements Runnable {
    /* JADX WARN: Bottom block not found for handler: all -> 0x0009 */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r1 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L9 java.lang.Exception -> Lb
        L9:
            r0 = move-exception
            goto Lc
        Lb:
            throw r0     // Catch: java.lang.Throwable -> L9
        Lc:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bolts.Task$Companion$call$1.run():void");
    }
}
