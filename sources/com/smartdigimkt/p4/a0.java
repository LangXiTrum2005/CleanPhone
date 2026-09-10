package com.smartdigimkt.p4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
final class a0 implements c {
    @Override // com.smartdigimkt.p4.c
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.smartdigimkt.p4.c
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.smartdigimkt.p4.c
    public void a(long j) {
        SystemClock.sleep(j);
    }

    @Override // com.smartdigimkt.p4.c
    public k a(Looper looper, Handler.Callback callback) {
        return new b0(new Handler(looper, callback));
    }
}
